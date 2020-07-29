package com.company;

public abstract class Animal implements AnimalsFeature{
    private int ageOld;
    private String name;
    private String type;

    public void lucky(){
        System.out.println("I am lucky " + getName());
    }

    public void showInfo(){
        lucky();
        voice();
    }

    public void voice(){
        System.out.println("My voice");
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getAgeOld(){
        return ageOld;
    }

    public void setName(String name){
        this.name = name;
    }
}
