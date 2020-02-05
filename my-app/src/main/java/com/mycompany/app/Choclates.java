package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;

public class Choclates extends Gift
{
	
	private static ArrayList<Integer> choclate_weight = new ArrayList<Integer>();
	private static ArrayList<Integer> choclate_id = new ArrayList<Integer>();
	private static ArrayList<Integer> choclate_price = new ArrayList<Integer>();
	
	public Choclates(int id,int weight, int price) 
	{
		super(weight);
		// TODO Auto-generated constructor stub
		choclate_weight.add(weight);
		choclate_id.add(id);
		choclate_price.add(price);
	}
	
	public static ArrayList<Integer> sortByWeight()
	{
		Collections.sort(choclate_weight);
		return choclate_weight;
	}
	
	public ArrayList<Integer> sortByPrice()
	{
		Collections.sort(choclate_price);
		return choclate_price;
	}
	
	public static int candies(int min_range,int max_range)
	{
		int count_candies = 0;
		for (int i=0;i<choclate_weight.size();i++)
		{
			if (choclate_weight.get(i)>=min_range && choclate_weight.get(i)<=max_range)
				count_candies++;
		}
		return count_candies;
				
	}
}
