package com.company.Data;

import java.io.Serializable;

public class Obj implements Serializable {

    private String name;
    private int age;
    private double weight;

    public Obj(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Obj() {
        //System.out.println("default constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getAll(){
        System.out.println(
                getName() + " " + getAge() + " " + getWeight());
    }
}
