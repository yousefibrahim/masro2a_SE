package implementaation;

import java.util.ArrayList;
import java.util.Scanner;

public class serachControler {
	public void receive_request(ArrayList<item>things,ArrayList<String>item_name,ArrayList<String>dates)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("please enter '1' to search item by type and '2' to search item by date");
		int choice=input.nextInt();
		if (choice==1)
		{ 			
			 respond_to_request(things,item_name,dates,choice);		
		}
		else if (choice ==2)
		{
			respond_to_request(things,item_name,dates,choice);		
		}
		else 
			System.out.println("you entered wrong choice");
	
	}
	
	public void respond_to_request(ArrayList<item>things,ArrayList<String>item_name,ArrayList<String>dates,int choice)
	{
	searchConnection obj=new searchConnection();
	if (choice==1)
	{ 		
		obj.getItemByName(things, item_name); 
	}
	else if (choice==2)
	{
		obj.getItemByDate(things, dates);		
	}	
	}
}
