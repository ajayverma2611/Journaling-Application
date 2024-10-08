package com.engineeringdigest.journalapp.Repository;

import com.engineeringdigest.journalapp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

        User findByUserName(String userName);
}
