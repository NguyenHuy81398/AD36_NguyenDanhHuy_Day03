package com.example.ad36_nguyendanhhuy_day03;

public class Contact {
    String name;
    String number;
    Boolean icon;

    public Contact(String name, String number, Boolean icon) {
        this.name = name;
        this.number = number;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isIcon() {
        return icon;
    }

    public void setIcon(Boolean icon) {
        this.icon = icon;
    }
}
