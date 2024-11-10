package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     * k = flagHeight, j = jumpHeight
     */
    public int jumps(int k, int j) {
        int minJumpHeight = (k / j) + k % j;
        return minJumpHeight;
    }
}
