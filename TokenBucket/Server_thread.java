package TokenBucket;
public class Server_thread extends Thread
{
 public class Server_thread extends Thread
{
	 Queue<packet> que2;
	  packet p=new packet();
	  int i=0;
	  private final int MU=3000;
	  Server_thread(Queue<packet> que2)
	  {
		this.que2=que2;
	  }
	  public void run() 
	  {
		  if(que2==null)
	      {
		    try 
	 	    {
	    	 que2.wait();
		    } 
		    
	        catch (InterruptedException e)
	        {
		     e.printStackTrace();
		    }
	      }
		  else
		  {
			  while(que2!=null)
			  {
				  
			  System.out.println("Queue_two is getting dequeued:"+que2.dequeue());
			  try 
			  {
				Thread.sleep(MU);
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



