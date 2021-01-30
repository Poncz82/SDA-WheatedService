package com.sda.weatherApp.backend;

import java.time.Instant;
import java.util.List;

public class EntryService {

    private final EntryRepository entryRepository;


    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;

    }

    public Entry createNewEntry(Float longitude, Float latitude,String city, String country) {
        if (latitude == null) {
            throw new RuntimeException("Tytuł nie może być pusty");
        }
        if (longitude == null) {
            throw new RuntimeException("Zawartość nie może być pusta");
        }
        if (city == null) {
            throw new RuntimeException("Zawartość nie może być pusta");
        }
        if (country == null) {
            throw new RuntimeException("Zawartość nie może być pusta");
        }

        Entry entry = new Entry(latitude, longitude, city, country);

        return entryRepository.saveEntry(entry);
    }

    public List<Entry> readAllEntries() {
        return entryRepository.readAllEntries();
    }
}
