package com.example.demo.restcontrollers;

import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity>find(){
        return userService.find();
    }

    @PostMapping
    public UserEntity save(@RequestBody UserEntity userEntity){
        return userService.save(userEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }


    @PutMapping("/{id}")
    public UserEntity update(@PathVariable("id")Integer id, @RequestBody UserEntity userEntity){
        return userService.update(id, userEntity);
    }
}
