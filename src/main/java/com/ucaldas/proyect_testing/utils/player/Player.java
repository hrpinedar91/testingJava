package com.ucaldas.proyect_testing.utils.player;

public class Player {

    private Dice dice;
    private int minNumberToWind;

    public Player(Dice dice, int minNumberToWind) {
        this.dice = dice;
        this.minNumberToWind = minNumberToWind;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        if (diceNumber == minNumberToWind) {
            return false;
        }
        else {
            return diceNumber > minNumberToWind;
        }

    }
}
