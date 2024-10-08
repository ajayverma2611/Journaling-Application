package com.engineeringdigest.journalapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.*;

@Document(collection = "journal_entries")
@Setter
@Getter
@NoArgsConstructor // required to convert JSON too pojo========================
public class JournalEntry {

// if you want to use all use: @Data===============================================================
     @Id
     private ObjectId id;
     private String title;
     private String content;

    private LocalDateTime date;

}
