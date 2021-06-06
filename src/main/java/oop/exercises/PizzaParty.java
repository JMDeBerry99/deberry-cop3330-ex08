/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class PizzaParty
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //read and convert inputs
        System.out.print("How many people? ");
        String input = in.nextLine();
        int numPeople = Integer.parseInt(input);
        System.out.print("How many pizzas do you have? ");
        input = in.nextLine();
        int numPizzas = Integer.parseInt(input);
        System.out.print("How many slices per pizza? ");
        input = in.nextLine();
        int numSlices = Integer.parseInt(input);

        //calculations
        int totalSlices = numPizzas * numSlices;
        int piecesEach = totalSlices / numPeople;
        int leftover = totalSlices % numPeople;

        //outputs
        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", piecesEach);
        System.out.printf("There are %d leftover pieces.", leftover);

    }
}
