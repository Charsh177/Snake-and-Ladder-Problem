package com.snakeladder;

public class SnakeAndLadder {

    public static final int WINNING_POSITION = 100;
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake And Ladder Program");
        int startPosition = 0;
        System.out.println("Starting position of player is " + startPosition);

        int position = 0;
        int diceCount = 0;
        while (position < WINNING_POSITION) {
            ++diceCount;

            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Dice number is " + diceNumber);

            int option = (int) (Math.floor(Math.random() * 10) % 2);
            System.out.println("Player option is " + option);

            switch (option) {
                case IS_SNAKE: {
                    System.out.println("Snake for the player");
                    position = position - diceNumber;
                    if (position - diceNumber < 0)
                        position = 0;
                    System.out.println("Position of the player after snake is " + position);
                    break;
                }
                case IS_LADDER: {
                    System.out.println("Ladder for the player");
                    if (position + diceNumber > 100)
                        position = position + diceNumber;
                    System.out.println("Position of the player after ladder is " + position);
                    break;
                }
                default:
                    System.out.println("No play");
                    break;
            }
        }
        System.out.println("Total dice roll count is " + diceCount);
    }
}
