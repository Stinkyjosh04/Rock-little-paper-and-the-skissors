/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.rpsfinal;

import java.util.Scanner;

/**
 *
 * @author josun8082
 */
public class RPSFinal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your move (rock, paper, or scissors):");
        String userMove = scanner.nextLine().toLowerCase();
        
        String[] validMoves = {"rock", "paper", "scissors"};
        String computerMove = validMoves[(int) (Math.random() * 3)];
        
        System.out.println("Computer chose: " + computerMove);
        
        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if (userMove.equals("rock")) {
            if (computerMove.equals("paper")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if (userMove.equals("paper")) {
            if (computerMove.equals("scissors")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if (userMove.equals("scissors")) {
            if (computerMove.equals("rock")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else {
            System.out.println("Invalid move. Please choose rock, paper, or scissors.");
        }
    }  
}
