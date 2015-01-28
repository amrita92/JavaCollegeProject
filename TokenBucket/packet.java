package TokenBucket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
//packet class
public class packet 
{   
	private int id=0;
	
	private int packet_size=0;
	private int count=0;	
	Date created;
    Date moved;
	private int tokens_required;
	
	packet()
	{
		created=new Date();
		id=id+1;
	}
	public int getId()
	{
		return id++;
	}
	public int getTokens()
	{
	 return tokens_required;
	}
	public void setTokens(int tokens_required)
	{
		this.tokens_required=tokens_required;
	}
	public void packet_moved()
	{
		moved=new Date();
    }
	public Date getCreated()
	{
		return created;
	}
	public Date getMoved()
	{
		return moved;
	}
}
