package implementaation;

public class item {
public String type;
public String finder_phone;
public String date;
public String description;

public void setType(String name)
{
	this.type=name;
}

public void setDate(String date )
{
	this.date=date;
}

public void setfinder_phone(String pass )
{
	this.finder_phone=pass;
}

public void setDescription(String desc)
{
	this.description=desc;
}

public String getType()
{
	return type;
}

public String getfinder_phone()
{
	return finder_phone;
	
}

public String getDescription()
{
	return description;
	
}


public String getDate()
{
	return date;
}





}
