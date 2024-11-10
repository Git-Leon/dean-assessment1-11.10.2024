package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class PetTest {
    @Test
    public void testInheritance() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void testImplementation() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Animal);
    }

    @Test
    public void setOwnerTest() {
        // Given
        Pet pet = new Dog();
        PetOwner expected = new PetOwner(null, null);

        // When
        pet.setOwner(expected);
        PetOwner actual = pet.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getOwnerTest() {
        // Given
        Pet pet = new Dog();
        PetOwner expected = new PetOwner(null, pet);

        // When
        PetOwner actual = pet.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
