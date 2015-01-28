package TokenBucket;

public class Token 
{
  private int count=0;
  private int id=0;
  Token()
  {
	  id=id+1;
  }
  public int get_id()
  {
	  return id++;
  }
  public int get_count()
  {
	return count++;
  }
  
}
