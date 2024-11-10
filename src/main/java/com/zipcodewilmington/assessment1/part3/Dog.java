package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.name = "Dog name";
        this.age = Integer.MAX_VALUE;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = "Name of Dog";
        this.age = 0;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.owner = null;
        this.name = "Dog name";
        this.age = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
