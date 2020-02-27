package com.company.View;

import java.util.EventObject;

public class DataTransferEvent extends Event {

    private String name;
    private String age;
    private String weight;

    public DataTransferEvent(Object source, String name,String age, String weight) {
        super(source);
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("source = " + source + ", name = " + name + ", age = " + age + ", weight = " + weight);
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }
}
