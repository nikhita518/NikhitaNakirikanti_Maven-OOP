package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Choclates choclate_object1 = new Choclates(001,100,20);
        Choclates choclate_object2 = new Choclates(002,150,30);
        Choclates choclate_object3 = new Choclates(001,500,100);
        Choclates choclate_object4 = new Choclates(001,250,35);
        Choclates choclate_object5 = new Choclates(001,750,60);
        
        System.out.println("Sorting order of choclates by weight:"+choclate_object5.sortByWeight());
        
        Sweets sweets_object1 = new Sweets(001,150,50);
        Sweets sweets_object2 = new Sweets(002,500,250);
        Sweets sweets_object3 = new Sweets(003,250,125);
        Sweets sweets_object4 = new Sweets(004,200,75);
        Sweets sweets_object5 = new Sweets(005,450,450);
        Sweets sweets_object6 = new Sweets(006,150,50);
        
        int total_weight = sweets_object6.totalWeight();
        System.out.println("Total Weight of children's gift is:"+total_weight+"grams");
        
        int candies = choclate_object5.candies();
        System.out.println("Candies in the predetermined range is:"+candies);
        
    }
}
