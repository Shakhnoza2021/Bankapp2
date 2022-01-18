package ru.company.bank.staff;

public class Staff {
    private int id;
    private String name;
    private String lastName;
    private String position;

    public Staff(String name, String lastName, String position) {
        id++;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }
}
