package TokenBucket;

public class Token_thread extends Thread
{
	Token t=new Token();
	Bucket b=new Bucket(20);
	Queue<Token> token_queue;

	Token_thread(Queue<Token> token_queue)
	{
		this.token_queue=token_queue;
	}
	public void run()
 	{
	 while(true)
	 {
		if(b.buc_size()>t.get_count())           
		{		
		  token_queue.enqueue(t);
		  System.out.println("Token added:"+t.get_id());
		  try
		  {
			sleep(2000);
		  } 
		  catch (InterruptedException e)
		  {
			e.printStackTrace();
		  }		 	  
		}
		else
		{
			System.out.println("The bucket is full.");
		}
	 }
	 
	}
}
