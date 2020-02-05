package com.mycompany.app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	//ArrayList<Choclates> choclates = new ArrayList<Choclates>();
    	System.out.println("Enter the number of choclate gift boxes");
    	int number_choclates = scan.nextInt();
    	for (int i = 0;i<number_choclates;i++)
    	{
    		System.out.println("Enter the id of choclates");
    		int id = scan.nextInt();
    		System.out.println("Enter the weight of choclates");
    		int weight = scan.nextInt();
    		System.out.println("Enter the price of choclates");
    		int price = scan.nextInt();
    		new Choclates(id,weight,price);
    	}
    	
    	System.out.println("Enter the number of sweet gift boxes");
    	int number_sweets = scan.nextInt();
    	
    	for (int i=0;i<number_sweets;i++)
    	{
    		System.out.println("Enter the id of sweets");
    		int id = scan.nextInt();
    		System.out.println("Enter the weight of sweets");
    		int weight = scan.nextInt();
    		System.out.println("Enter the price of sweets");
    		int price = scan.nextInt();
    		new Sweets(id,weight,price);
    	}
        //Choclates choclate_object1 = new Choclates(001,100,20);
        //Choclates choclate_object2 = new Choclates(002,150,30);
        //Choclates choclate_object3 = new Choclates(001,500,100);
        //Choclates choclate_object4 = new Choclates(001,250,35);
        //Choclates choclate_object5 = new Choclates(001,750,60);
        
        System.out.println("Sorting order of choclates by weight:"+Choclates.sortByWeight());
        
        System.out.println("Total Weight of Gifts is:"+Gift.totalWeight());
        
        System.out.println("Enter the minimum_range ");
        
        int min_range = scan.nextInt();
        
        System.out.println("Enter the maximum range");
        
        int max_range = scan.nextInt();
        
        //Sweets sweets_object1 = new Sweets(001,150,50);
        //Sweets sweets_object2 = new Sweets(002,500,250);
        //Sweets sweets_object3 = new Sweets(003,250,125);
        //Sweets sweets_object4 = new Sweets(004,200,75);
        //Sweets sweets_object5 = new Sweets(005,450,450);
        //Sweets sweets_object6 = new Sweets(006,150,50);
        
        //int total_weight = sweets_object6.totalWeight();
        //System.out.println("Total Weight of children's gift is:"+total_weight+"grams");
        
        int candies = Choclates.candies(min_range,max_range);
        System.out.println("Candies in the predetermined range is:"+candies);
        
    }
}
