package implementaation;

import java.util.ArrayList;
import java.util.Scanner;

public class verification {
	public person user=new person();
	public boolean login(ArrayList<String>usernames)
	{ 
		Scanner input=new Scanner(System.in);
		System.out.println("enter username");
		 String n=input.nextLine();
		 user.setName(n);
		System.out.println("enter passowred");
		String p=input.nextLine();
		user.setPassword(p);
		System.out.println("enter phone");
		int num=input.nextInt();
		user.setPhone(num);
		if(usernames.contains(user.getUsername()))
		{
			return true;
		}
		return false;
	}
	
	public boolean register(ArrayList<String>usernames)
	{
		Scanner input=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		System.out.println("enter name");
		String name=input.nextLine();
		user.setName(name);
		System.out.println("enter passowred");
		String p=input.nextLine();
		user.setPassword(p);
		System.out.println("enter phone");
		int num=input.nextInt();
		user.setPhone(num);
		System.out.println("enter username");
		String n=in.nextLine();
		user.setUsername(n);
		
		usernames.add(user.getUsername());	
		
		return true;
	}

}
