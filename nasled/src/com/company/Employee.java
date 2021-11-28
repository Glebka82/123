package com.company;

    class Employee extends Human{
    String company;


        Employee(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

    String manager(){
            String s = "Manager";
            return s;
    }
}
