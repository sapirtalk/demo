package com.example.demo.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
          
      private final UUID id;
      private final String name;

      public Person(@JsonProperty("id") UUID id,
      @JsonProperty("name") String name) {
                  this.id = id;
                  this.name = name;
                  System.out.println("Person created "+ this.id + " " + this.name);
      }

      public UUID getId() {
                  return id;
      }

      public String getName() {
                  return name;
      }

          
}
