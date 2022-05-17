package com.snakeladder;

public class SnakeAndLadder
{
    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Starting position of player is " + startPosition);
        final int NO_PLAY = 0;
        final int IS_LADDER = 1;
        final int IS_SNAKE = 2;
        int position = 0;

        while (position < 100) {
            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Dice number is " + diceNumber);

            int option = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("Player option is " + option);

            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("Position of the player after ladder is " + position);
                    break;
                case 2:
                    position = position - diceNumber;
                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Position of the player after snake is " + position);
                    break;
                default:
                    System.out.println("No play");
            }

        }
    }
}
