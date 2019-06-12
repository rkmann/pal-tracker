package io.pivotal.pal.tracker;

import io.pivotal.pal.tracker.entity.TimeEntry;
import io.pivotal.pal.tracker.repository.TimeEntryRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {

    private TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    public ResponseEntity<TimeEntry> create(TimeEntry timeEntry){
        return null;
    }

    public ResponseEntity<TimeEntry> read(Long timeEntryId){
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list(){
        return null;
    }

    public ResponseEntity update(Long timeEntryId, TimeEntry timeEntry){
        return null;
    }

    public ResponseEntity delete(Long timeEntryId){
        return null;
    }
}
