package com.sda.weatherApp.frontend; // todo change package path com.sda.weather

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.weatherApp.backend.EntryController;
import com.sda.weatherApp.backend.EntryRepository;
import com.sda.weatherApp.backend.EntryService;

import java.util.Scanner;

public class UserInterface {


    private static final EntryController entryController;

    static {
        EntryRepository entryRepository = new EntryRepository();
        //ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //TimeClient timeClient = new TimeClient(objectMapper);
        EntryService entryService = new EntryService(entryRepository);
        entryController = new EntryController(entryService);
    }


    public static void main(String[] args) {
        System.out.println("Hello in weather app!\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose by enter one of the nbr:");
            System.out.println("1. Add new localization");
            System.out.println("2. Read old entry");

            System.out.println("3. Obtain a weather forecast");

            System.out.println("4. Close App\n");

            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    System.out.println("AddLocalizatiom\n");
                    addNewEntry();
                    break;
                case 2:
                    readAllEntries();
                    break;
                case 3:
                    System.out.println("nr 3\n");
                    break;
                case 4:
                    System.out.println("Bye :P");
                    return;
                default:
                    System.out.println("chose one of given option..\n");
                    break;
            }
        }
    }


    private static void readAllEntries() {
        String response = entryController.readAllEntries();
        System.out.println("Your location's: "+ response);
    }

    private static void addNewEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add longitude(-90 - 90):");
        Float longitude = scanner.nextFloat();
        System.out.println("Add latitude(-180 - 180):");
        Float latitude = scanner.nextFloat();

        System.out.println("City you looking for:");
        //scanner.reset();
        String city = scanner.next();
        System.out.println("Your country:");
        String country = scanner.next();
        String response = entryController.createNewEntry(longitude,latitude,city,country);
        System.out.println("New localization has been added: " + response);
    }
}