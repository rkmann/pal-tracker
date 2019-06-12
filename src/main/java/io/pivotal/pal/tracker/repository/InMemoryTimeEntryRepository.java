package io.pivotal.pal.tracker.repository;

import io.pivotal.pal.tracker.entity.TimeEntry;

import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    public TimeEntry create(TimeEntry timeEntry){
        return new TimeEntry();
    }

    public TimeEntry find(Long timeEntryId){
        return new TimeEntry();
    }

    public List<TimeEntry> list(){
        return null;
    }

    public TimeEntry update(Long timeEntryId, TimeEntry timeEntry){
        return  new TimeEntry();
    }

    public void delete(Long timeEntryId){
        return;
    }
}
