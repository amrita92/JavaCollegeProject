package TokenBucket;
public class Operation_thread extends Thread
{
	Queue<packet> que1,que2;
	Queue<Token> token;
	Token t=new Token();
	packet p=new packet();
	Bucket b;
	
    Operation_thread(Queue<packet> que1, Queue<packet> que2,Bucket b)
    {
     this.que1=que1;
     this.que2=que2;
     this.b=b;
    }
    
    public void run()
    {
      while(true)
      {
    	try
    	{
    		
        p=que1.dequeue();       
        if(b.count_tokens()>=p.getTokens())
        {
        	
	     for(int i=0;i<=b.count_tokens();i++)
	     {
	       b.delete_tokens();
	       System.out.println("Token "+i+" is deleted:"); 
	     }
	     
	     que2.enqueue(p);
	     System.out.println("packet is added to Q2");
	     
        }
        
        else if(b.count_tokens()<p.getTokens())
        {
	     que1.enqueue(p);
	     System.out.println("packet is added back to Q1.");
        }
        
	  Thread.sleep(1000);
	} 
    	
    	 catch (InterruptedException e)
    	 {
		
	     e.printStackTrace();
	 }
      }
      
}

}
 
  }
}
