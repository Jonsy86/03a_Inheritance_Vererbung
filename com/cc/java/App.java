package com.cc.java;

public class App {  // Klasse
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);

        output(cat.getStringAttributes("#name")); // Methode
        output(cat.getStringAttributes("#color"));

        output(cat.getAge()); 
        output(cat.getAge()); 
        output(cat.getAge()); 
        output(cat.getAge());  
       

        output("-------------------------");

        Tomcat tomcat = new Tomcat("Alonzo", "grey", 35); // Objekterzeugung

        output(tomcat.getStringAttributes("#name"));
        output(tomcat.getStringAttributes("#color"));

        output(tomcat.getAge()); 

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

