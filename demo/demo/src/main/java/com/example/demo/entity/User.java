package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    private int id;
    private String name;
    private String address;


}


//    The @NoArgsConstructor and @AllArgsConstructor are annotations provided by the Lombok library in Java to automatically generate constructors in your classes.
//
//@NoArgsConstructor: This annotation will generate a constructor with no parameters. For example, if you have a class User, using this annotation would generate the following constructor:
//
//        Java
//        This code is AI-generated. Review and use carefully. Visit our FAQ for more information.
//
//public User() {
//        }
//@AllArgsConstructor: This annotation will generate a constructor with one parameter for each field in your class. For example, if you have a class User with fields id and name, using this annotation would generate the following constructor:
//
//        Java
//        This code is AI-generated. Review and use carefully. Visit our FAQ for more information.
//
//public User(int id, String name) {
//        this.id = id;
//        this.name = name;
//        }
//        These annotations can help to reduce boilerplate code in your Java classes. However, please note that Lombok may not work as expected with some configurations (e.g., fields marked as final, or fields with certain annotations), so it’s always a good idea to verify the generated code.