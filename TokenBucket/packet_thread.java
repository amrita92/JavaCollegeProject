package TokenBucket;

public class packet_thread extends Thread
	{ 
		int i=0;
		Queue<packet> que = new Queue<packet>();
		packet p=new packet();	
		packet_thread(Queue<packet> que)
		{
			this.que=que;
		}
	
	    	public void run() 
	  	    {
	       	while(true)
	    	{
	        p.setTokens(5);
	    	que.enqueue(p);
	    	System.out.println("Packet is added in queue_one:"+p.getId());
	    	try 
	    	{
				sleep(1000);
	        }
	    	catch (InterruptedException e)
	    	{
				e.printStackTrace();
		}
	    	}
	    }
	  
	}
