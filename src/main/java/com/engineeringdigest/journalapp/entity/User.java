package com.engineeringdigest.journalapp.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection = "users")
@Setter
@Getter
public class User {

    @Id
    private ObjectId id;
    @Indexed(unique = true)  // this will not do the indexing automatically we have to do it manually from application properties
    @NonNull
    private String userName;
    @NonNull
    private String password;

    @DBRef // this will make a refrence to journal entries collection
    private List<JournalEntry> journalEntries =new ArrayList<>();

}
