package org.example;

import java.util.ArrayList;

public class Digit {
    private int number;
    public ArrayList<Integer> digits = new ArrayList<Integer>();

    public Digit(int number){
        this.number = number;
        while(number != 0) {
            this.digits.add(number % 10);
            number /= 10;
        }
    }

    public int amountOfDigits(){
        return digits.size();
    }

    public int averageAmount(){
        int amount  = amountOfDigits();
        int sum = 0;
        for(int i = 0; i < amount; i++){
            sum += digits.get(i);
        }
        return sum / amount;
    }
}
