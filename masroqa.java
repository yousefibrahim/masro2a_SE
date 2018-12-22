package implementaation;

import java.util.ArrayList;
import java.util.Scanner;

public class masroqa {
	public static  ArrayList<String> usernames=new ArrayList<String>();
	
	public static ArrayList<item>things=new ArrayList<item>();
	public static ArrayList<String>dates=new ArrayList<>();
	public static ArrayList<String>item_name=new ArrayList<>();
	public static void main(String[] args) 
	{
		boolean bool=false ;
		Scanner inp=new Scanner(System.in);
		Scanner input=new Scanner(System.in);
		while(true){
			int z=1;
		if(bool)
		{
			System.out.println("enter 0 to exit ");
			System.out.println("enter any thing  to to contune ");
				
			z=input.nextInt(); 
		}
		if(!bool)
		{
		System.out.println("enter 1 for login  ");
		System.out.println("enter 2 for sign-up  ");
		System.out.println("enter 0 to exit");
		
		int value=inp.nextInt(); 
		
		verification verfy=new verification();
		if(value==1)
		{
			if(verfy.login(usernames))
			{
				bool=true;
				System.out.println("you logged in successfully");
			}
			else
			{
				System.out.println("your data is wrong try again ");
			}
			
		}
		else if(value==2)
		{
			
			verfy.register(usernames);
			int l=usernames.size();
			bool=true;
			System.out.println("welcome :"+usernames.get(l-1));	
		}
		else if(value==0)
		{
			System.out.println("good bey");
			break;
		}
		else
		{
			System.out.println("you entered wrong choice try again ");
		continue;
		}

	   }
	     if(z==0)
		{
			System.out.println("good bey");
			break;
		}
		
		if(bool)
		{
			System.out.println("enter 1 if you want to post");
			System.out.println("enter 2 if you want to search");
			Scanner in=new Scanner(System.in);
			int cho=in.nextInt();
			if(cho==1)
			{
				postController obj=new postController();
				obj.receive_request(things, item_name, dates);
			}
			else if(cho==2)	
			{
				serachControler obj=new serachControler();
				obj.receive_request(things, item_name, dates);
			}
			else
			{
				System.out.println("you enterd wrong value ");
			}
		}

	}

}
}