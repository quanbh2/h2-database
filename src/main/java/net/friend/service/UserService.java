package net.friend.service;

import net.friend.model.User;
import net.friend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }

    public void deleteOnId(int id){
        userRepository.deleteById(id);
    }

    public User add(User user){
        return userRepository.save(user);
    }
}
