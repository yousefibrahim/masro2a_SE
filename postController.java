package implementaation;

import java.util.ArrayList;
import java.util.Scanner;

public class postController {
	public void receive_request(ArrayList<item>things,ArrayList<String>item_name,ArrayList<String>dates)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("please enter 1 to add item ");
		int choice=input.nextInt();
		
		
		if (choice ==1)
		{
			
			respond_to_request(things, item_name, dates);
			
		}
		else 
			System.out.println("Wrong choice ");
			return;
	
		
	}
	
	public void respond_to_request(ArrayList<item>things,ArrayList<String>item_name,ArrayList<String>dates)
	{
		postConnection obj=new postConnection();
		obj.add_item(things, item_name, dates);
		System.out.println("your post is added successfuly ");
		
	}

}
