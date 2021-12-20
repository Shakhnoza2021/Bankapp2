package ru.company.bank.staff;

public class Staff {
    private int id;
    private String name;
    private String lastName;
    private String department;

    public Staff(String name, String lastName, String department) {
        id++;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }
}
