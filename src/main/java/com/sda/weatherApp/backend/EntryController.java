package com.sda.weatherApp.backend;

import java.util.List;

public class EntryController {
    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    public String createNewEntry(Float longitude, Float latitude, String city, String country) {
        Entry newEntry = entryService.createNewEntry(longitude, latitude, city ,country);
        return newEntry.toString();
    }

    public String readAllEntries() {
        List<Entry> entries = entryService.readAllEntries();
        return entries.toString();
    }
}
