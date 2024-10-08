package com.engineeringdigest.journalapp.Repository;

import com.engineeringdigest.journalapp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}