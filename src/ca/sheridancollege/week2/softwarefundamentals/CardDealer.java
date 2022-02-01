/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * modifier Tejus Singh Gill
 * student id : 991585556
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
       
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        //new object for card class with value of 10 of Spade
        Card tenSpade = new Card("Spade",10);
    }
}
