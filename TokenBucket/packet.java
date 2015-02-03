package TokenBucket;
import java.util.Date;
public class packet 
{ 
	private int id=0;	
	Date created,moved;
	private int tokens_required;
	
	packet()
	{
		created=new Date();
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

