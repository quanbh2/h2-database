package net.friend.controller;

import net.friend.model.User;
import net.friend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("/add")
    public User add(){
        User user = new User();
        user.setId(4);
        user.setFirstName("Vladimir");
        user.setLastName("Hejax");
        user.setCareer("aodiusadaoid");
        return userService.add(user);
    }

    @GetMapping("/del/{id}")
    public void delete(@PathVariable("id") int id){
        userService.deleteOnId(id);
    }
}
