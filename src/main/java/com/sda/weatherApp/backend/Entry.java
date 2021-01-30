package com.sda.weatherApp.backend;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Entry {
   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
   private Long id;
   private Float latitude;
   private Float longitude;
   private String city;
   private String country;
   private String region;



   public Entry(Float latitude, Float longitude, String city, String country) {
      this.latitude = latitude;
      this.longitude = longitude;
      this.city = city;
      this.country = country;
   }

   @Override
   public String toString() {
      return "Entry{" +
              "id=" + id +
              ", Latitude=" + latitude +
              ", Longitude=" + longitude +
              ", city='" + city + '\'' +
              ", country='" + country + '\'' +
              '}';
   }
}
