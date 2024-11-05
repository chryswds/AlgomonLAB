package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        //Array list storing player choices
        ArrayList<Algomon> player1Choices = new ArrayList<Algomon>();
        ArrayList<Algomon> player2Choices = new ArrayList<Algomon>();


        //Scanner for user input
        Scanner myKB = new Scanner(System.in);

        System.out.println("Player 1 choose your 4 algomons: ");


        //for loop to get user choice
        for(int i = 0; i < 4; i++){
            System.out.println("Choose your algomons " + (i + 1) + ":");
            System.out.println("1.Firezard - FireType");
            System.out.println("2.Dragonoid - FireType");
            System.out.println("3.Blastion - WaterType");
            System.out.println("4.Squeezie - WaterType");
            System.out.println("5.Rockamon - EarthType");
            System.out.println("6.MoonCrawler - MoonType");
            System.out.println("7.StarLight - StarType");
            System.out.println("8.SunnyCorn - SunType");

            int choice = myKB.nextInt();


            //storing user choices in the array
            switch(choice){
                case 1:
                    player1Choices.add(new FireZard());
                    break;
                case 2:
                    player1Choices.add(new Dragonoid());
                    break;
                case 3:
                    player1Choices.add(new Blastion());
                    break;
                case 4:
                    player1Choices.add(new Squeezie());
                    break;
                case 5:
                    player1Choices.add(new Rockamon());
                    break;
                case 6:
                    player1Choices.add(new MoonCrawler());
                    break;
                case 7:
                    player1Choices.add(new StarLight());
                    break;
                case 8:
                    player1Choices.add(new SunnyCorn());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }


        }


        System.out.println("Player 2 choose your 4 algomons: ");


        //for loop to get user choice
        for(int i = 0; i < 4; i++){
            System.out.println("Choose your algomons " + (i + 1) + ":");
            System.out.println("1.Firezard - FireType");
            System.out.println("2.Dragonoid - FireType");
            System.out.println("3.Blastion - WaterType");
            System.out.println("4.Squeezie - WaterType");
            System.out.println("5.Rockamon - EarthType");
            System.out.println("6.MoonCrawler - MoonType");
            System.out.println("7.StarLight - StarType");
            System.out.println("8.SunnyCorn - SunType");

            int choice = myKB.nextInt();


            //storing choices into the arraylist
            switch(choice){
                case 1:
                    player2Choices.add(new FireZard());
                    break;
                case 2:
                    player2Choices.add(new Dragonoid());
                    break;
                case 3:
                    player2Choices.add(new Blastion());
                    break;
                case 4:
                    player2Choices.add(new Squeezie());
                    break;
                case 5:
                    player2Choices.add(new Rockamon());
                    break;
                case 6:
                    player2Choices.add(new MoonCrawler());
                    break;
                case 7:
                    player2Choices.add(new StarLight());
                    break;
                case 8:
                    player2Choices.add(new SunnyCorn());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }


        }

        myKB.close();


        //printing player choices
        System.out.println("player 1 choices:");

        for(int i = 0; i < player1Choices.size(); i++) {
            System.out.print(player1Choices.get(i).getName()+ "\n ");
        }

        System.out.println("\nplayer 2 choices:");

        for(int i = 0; i < player2Choices.size(); i++) {
            System.out.print(player2Choices.get(i).getName() + "\n ");
        }













    }





}
