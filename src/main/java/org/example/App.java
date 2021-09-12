/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String input = scnN.next();
        // @startuml
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            System.out.print("Are the battery terminals corroded? ");
            String battery = scnN.next();
            if(battery.equalsIgnoreCase("y") || battery.equalsIgnoreCase("yes")){
                System.out.print("Clean terminals and try starting again.");
            }
            else if(battery.equalsIgnoreCase("n") || battery.equalsIgnoreCase("no")){
                System.out.print("Replace cables and try again.");
            }
        }
        else if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
            System.out.print("Does the car make a slicking noise? ");
            String slick = scnN.next();
            if(slick.equalsIgnoreCase("y") || slick.equalsIgnoreCase("yes")){
                System.out.print("Replace the battery.");
            }
            else if(slick.equalsIgnoreCase("n") || slick.equalsIgnoreCase("no")){
                System.out.print("Does the car crank up but fail to start? ");
                String crank = scnN.next();
                if(crank.equalsIgnoreCase("y") || crank.equalsIgnoreCase("yes")){
                    System.out.print("Check spark plug connections.");
                }
                else if(crank.equalsIgnoreCase("n") || crank.equalsIgnoreCase("no")){
                    System.out.print("Does the engine start and then die? ");
                    String engine = scnN.next();
                    if(engine.equalsIgnoreCase("y") || engine.equalsIgnoreCase("yes")){
                        System.out.print("Does you car have fuel injection? ");
                        String inj = scnN.next();
                        if(inj.equalsIgnoreCase("y") || inj.equalsIgnoreCase("yes")){
                            System.out.print("Get it in for service.");
                        }
                        else if(inj.equalsIgnoreCase("n") || inj.equalsIgnoreCase("no")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(engine.equalsIgnoreCase("n") || engine.equalsIgnoreCase("no")){
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}
