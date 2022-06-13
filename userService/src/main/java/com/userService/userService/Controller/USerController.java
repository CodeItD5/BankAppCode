package com.userService.userService.Controller;

import com.userService.userService.Service.UserServiceInterface;
import com.userService.userService.Util.UserRes;
import com.userService.userService.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("users")
public class USerController {

    @Autowired
    private UserServiceInterface service;


    @GetMapping("/user/1")
    public ResponseEntity<String> displayWords(){
        return new ResponseEntity<String>("Spring Boot", HttpStatus.CREATED);
    }
//
//    @PostMapping
//    public ResponseEntity<UserRes> addNewUser(@RequestBody User user){
//        return new ResponseEntity<UserRes>(service.createNewUser(user), HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<UserRes>> showUser(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize){
//        return new ResponseEntity<List<UserRes>>(service.returnUser(page,pageSize),HttpStatus.CREATED);
//    }
//
//    public ResponseEntity<UserRes> getUsersById(@PathVariable("userId") int userId){
//        return new ResponseEntity<UserRes>(service.getUserByID(userId), HttpStatus.CREATED);
//    }
//    @PutMapping("/{userId}")
//    public ResponseEntity<UserRes> updateUsersById(@PathVariable("userId") int userId, @RequestBody  User user){
//        return new ResponseEntity<UserRes>(service.updateUser(userId, user), HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/{userId}")
//    public ResponseEntity<String> deleteUsersById(@PathVariable("userId") int userId){
//        return new ResponseEntity<String>(service.deleteUser(userId), HttpStatus.CREATED);
//    }
//
//    @GetMapping("/getUserByEmail/{email}")
//    public ResponseEntity<UserRes> getUsersByEmail(@PathVariable("email") String email){
//        return new ResponseEntity<UserRes>(service.getUserDetailsByEmail(email), HttpStatus.CREATED);
//    }

}
