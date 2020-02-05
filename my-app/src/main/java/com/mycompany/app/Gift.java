package com.mycompany.app;
import java.util.ArrayList;
class Gift 
{
	static ArrayList<Integer> weight = new ArrayList<Integer>();
	private static int total_weight=0;
	
	public Gift(int weight)
	{
		Gift.weight.add(weight);
	}
	
	public static int totalWeight()
	{
		for(int i=0;i<weight.size();i++)
		{
			total_weight = total_weight+weight.get(i);
		}
		return total_weight;
	}
}