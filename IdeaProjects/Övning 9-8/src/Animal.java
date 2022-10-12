package com.martin;

public class Animal {
    String name;
    int age;
    String type;
    boolean isHungry;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", isHungry=" + isHungry +
                '}';
    }
}
