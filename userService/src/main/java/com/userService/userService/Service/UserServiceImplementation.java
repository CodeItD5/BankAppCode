package com.userService.userService.Service;
import java.util.ArrayList;
import java.util.List;

import com.userService.userService.ExceptionHandler.UserNotFound;
import com.userService.userService.Util.UserRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.userService.userService.domain.User;
import com.userService.userService.Repository.UserRepository;

@Service
public class UserServiceImplementation  implements UserServiceInterface{

    @Autowired
    UserRepository userRepos;

    @Override
    public UserRes createNewUser(User user) {
        return setUserResponse(userRepos.save(user));
    }

    @Override
    public List<UserRes> returnUser(Integer page, Integer pageSize) {
        Pageable pageable= PageRequest.of(page,pageSize);
        List<User> userList = userRepos.findAll(pageable).toList();
        List<UserRes> userResponseList=new ArrayList<>();
        for(User u:userList){
            userResponseList.add(setUserResponse(u));
        }
        return userResponseList;
    }

    @Override
    public UserRes getUserByID(int UserId) {
        User user=userRepos.getReferenceById((long) UserId);
        return setUserResponse(user);
    }


    @Override
    public UserRes updateUser(int userId, User user) throws UserNotFound {
        User updateUser = userRepos.findById((long) userId).orElseThrow(()-> new UserNotFound("User Not Found"));
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setMiddleName(user.getMiddleName());
        updateUser.setPhoneNumber(user.getPhoneNumber());
        updateUser.setEmail(user.getEmail());
        updateUser.setAddress(user.getAddress());
        updateUser.setDateOfBirth(user.getDateOfBirth());
        updateUser.setGender(user.getGender());
        return setUserResponse(userRepos.save(updateUser));
    }

    @Override
    public String deleteUser(int userId) {
        userRepos.deleteById((long) userId);
        return "User Successfully Deleted";
    }

    @Override
    public UserRes getUserDetailsByEmail(String email) {
        User user = userRepos.findByEmail(email);
        return setUserResponse(user);
    }

    @Override
    public UserRes setUserResponse(User user) {
        return new UserRes(user.getId(), user.getFirstName(), user.getLastName(),
                user.getMiddleName(), user.getPhoneNumber(), user.getEmail(), user.getAddress(),
                user.getDateOfBirth(), user.getGender());
    }
}
