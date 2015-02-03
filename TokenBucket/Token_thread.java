package TokenBucket;

package project;

public class Token_thread extends Thread
{
	
	Token t=new Token();
	Bucket b;
	Queue<Token> token_queue;
	Token_thread(Queue<Token> token_queue,Bucket b)
	{
		this.token_queue=token_queue;
		this.b=b;
	}
	public void run()
 	{
	 while(true)
	 {	
		  System.out.println("Token added:"+t.get_id());	
		  b.add_tokens_to_bucket();	
		  try
		  {
			Thread.sleep(500);
		  } 
		  catch (InterruptedException e)
		  {
			System.out.println("thread interrupted");
		  }	
	 }
	 }
