package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;

public class Sweets extends Gift
{
	private static ArrayList<Integer> sweet_weight = new ArrayList<Integer>();
	private static ArrayList<Integer> sweet_id = new ArrayList<Integer>();
	private static ArrayList<Integer> sweet_price = new ArrayList<Integer>();
	
	public Sweets(int id,int weight, int price) 
	{
		super(weight);
		// TODO Auto-generated constructor stub
		sweet_weight.add(weight);
		sweet_id.add(id);
		sweet_price.add(price);
	}
	
	public Sweets(int id,float weight,int price)
	{
		super((int)weight*1000);
		sweet_weight.add((int)weight*1000);
		sweet_id.add(id);
		sweet_price.add(price);
	}
	
	public ArrayList<Integer> sortByWeight()
	{
		Collections.sort(sweet_weight);
		return sweet_weight;
	}
	
	public ArrayList<Integer> sortByPrice()
	{
		Collections.sort(sweet_price);
		return sweet_price;
	}
}
