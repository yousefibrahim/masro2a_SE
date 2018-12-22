package implementaation;
import java.util.*; 

public class searchConnection {
	
	 void getItemByName(ArrayList<item>things,ArrayList<String>item_name )
	{
		 Scanner input= new Scanner(System.in);
		 System.out.println("enter the type of lost your item ");
		  String type=input.nextLine();
		  if(item_name.contains(type))
		     {
		    	int index=item_name.indexOf(type);
		    	 things.get(index);
		    	 item obj=new item();
		    	 obj=things.get(index);
		    	 System.out.println("item type is  "+obj.type);
		    	 System.out.println("item descreption is  "+obj.description);
		    	 System.out.println("item date is  "+obj.date);
		    	 System.out.println("item finder username is  "+obj.finder_phone);
		     }
		     else
		     {
		    	 System.out.println("sorry the name didn't match try again later");
		    	 return ;
		     }
	}
	 
	 void getItemByDate(ArrayList<item>things,ArrayList<String>dates)
	{
		 Scanner input= new Scanner(System.in);
		 System.out.println("enter the date you lost your item in");
		  String date=input.nextLine();
	     if(dates.contains(date))
	     {
	    	int index=date.indexOf(date);
	    	 things.get(index);
	    	 item obj=new item();
	    	 obj=things.get(index);
	    	 System.out.println("item type is  "+obj.type);
	    	 System.out.println("item descreption is  "+obj.description);
	    	 System.out.println("item date is  "+obj.date);
	    	 System.out.println("item finder username is  "+obj.finder_phone);
	     }
	     else
	     {
	    	 System.out.println("sorry the date didn't match try again using the type of the lost_item");
	    	 return ;
	     }
	}
}
