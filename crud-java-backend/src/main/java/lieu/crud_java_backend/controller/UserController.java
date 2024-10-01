package lieu.crud_java_backend.controller;

import lieu.crud_java_backend.dto.request.UserCreateRequest;
import lieu.crud_java_backend.dto.request.UserUpdateRequest;
import lieu.crud_java_backend.entity.User;
import lieu.crud_java_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreateRequest request){
        return userService.createUser(request);
    }
    @GetMapping
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{userId}")
    User getUserbyId(@PathVariable String userId) {
        return userService.getUserById(userId);
    }
    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }
    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User deleted";
    }
    }


