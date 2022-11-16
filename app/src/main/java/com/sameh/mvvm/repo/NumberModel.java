package com.sameh.mvvm.repo;

public class NumberModel {

    private int firstNumber, secondNumber;

    public NumberModel(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }


    public int getSecondNumber() {
        return secondNumber;
    }

}
