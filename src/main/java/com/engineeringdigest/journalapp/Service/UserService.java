package com.engineeringdigest.journalapp.Service;
import ch.qos.logback.classic.Logger;
import com.engineeringdigest.journalapp.Repository.UserRepository;
import com.engineeringdigest.journalapp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
   @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        try {
            userRepository.save(user);
        }catch (Exception e){
            Logger log = null;
            log.error("Exception ",e);
        }
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
