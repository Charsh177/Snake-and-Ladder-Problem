package com.snakeladder;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int NO_PLAY = 0;
        int IS_LADDER = 1;
        int IS_SNAKE = 2;
        int position = 0;

        while(position < 100) {
            int diceNumber = (int)(Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Dice number is " + diceNumber);

            int option = (int)(Math.floor(Math.random() * 10) % 3);
            System.out.println("Player option is " + option);

            switch(option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("Position of the player after ladder is " + position);
                    break;
                case 2:
                    if (diceNumber + position <= 100) {
                        position = position + diceNumber;
                        System.out.println("Position of the player is " + position);
                        break;
                    }
                default:
                    System.out.println("No play");
            }

        }
    }
}
