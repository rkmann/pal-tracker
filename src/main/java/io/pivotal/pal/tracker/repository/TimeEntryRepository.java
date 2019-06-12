package io.pivotal.pal.tracker.repository;

import io.pivotal.pal.tracker.entity.TimeEntry;

import java.sql.Time;
import java.util.List;

public interface TimeEntryRepository {

    public TimeEntry create(TimeEntry timeEntry);

    public TimeEntry find(Long timeEntryId);

    public List<TimeEntry> list();

    public TimeEntry update(Long timeEntryId, TimeEntry timeEntry);

    public void delete(Long timeEntryId);
}
