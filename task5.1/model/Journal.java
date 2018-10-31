package epam.java.model;

import epam.java.model.entity.RecordInJournal;

import java.util.*;

public class Journal {
    private List<RecordInJournal> records = new ArrayList<>();

   public void addRecord(RecordInJournal record){
       records.add(record);
   }

    public List<RecordInJournal> getRecords() {
        return records;
    }
}
