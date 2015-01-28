package TokenBucket;

public class Bucket
{
  Queue<Token> token;
  private int bucket_size=0;
  private int count=0;
  
  Bucket(int size)
  {
	  bucket_size=size;
  }
  
  public int buc_size()
  {
	return bucket_size; 
  }
  
  public void add_tokens_to_bucket()
  {
	  Token t1=new Token();
	  token.enqueue(t1);
  }
  
  public  int count_tokens()
  {
	 return token.numOfElements(); 
  }
  
}
