package implementaation;

import java.util.ArrayList;
import java.util.Scanner;

public class postConnection {
	
	public void add_item(ArrayList<item>things,ArrayList<String>item_name,ArrayList<String>dates)
	{	
		Scanner input=new Scanner(System.in);
		Scanner inpu=new Scanner(System.in);
		Scanner inp=new Scanner(System.in);
		item itm=new item();
		System.out.println("enter type of lost item ");
		String t =input.nextLine();
		itm.setType(t);
		item_name.add(t);
		
		System.out.println("enter date of lost item   ");
		String d=inpu.nextLine();
		itm.setDate(d);
		dates.add(d);
		itm.setDescription(add_question());
		
		System.out.println("enter password of lost item   ");
		String p=inp.nextLine();
		itm.setfinder_phone(p);
		 

		things.add(itm);
	}
	
	public String add_question()
	{
		System.out.println("enter your description about the post ");
		Scanner input=new Scanner(System.in);
		String in=input.nextLine(); 
		return in;
	}

}