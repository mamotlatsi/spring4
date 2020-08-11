package com.laynkulan;

public class User {
    private final long id;
    private final String name;
    private final String surname;

    User(long id, String name , String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
