package com.userService.userService.Service;

import com.userService.userService.ExceptionHandler.UserNotFound;
import com.userService.userService.Util.UserRes;
import com.userService.userService.domain.User;

import java.util.List;

public interface UserServiceInterface {
    UserRes createNewUser(User user);

    List<UserRes> returnUser(Integer page, Integer pageSize);

    UserRes getUserByID(int UserId);

    UserRes updateUser(int userId, User user) throws UserNotFound;

    String deleteUser(int userId);

    UserRes getUserDetailsByEmail(String email);

    UserRes setUserResponse(User user);
}
