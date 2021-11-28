package com.company;

public class Main {

    public static void main(String[] args) {
        Human a = new Human(23,"Ivan");
        Employee b = new Employee(19, "Dima", "Google");
        a.none();
        String s = b.manager();
     }
}
