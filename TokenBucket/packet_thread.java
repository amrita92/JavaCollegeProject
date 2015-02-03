package TokenBucket;

	public class packet_thread extends Thread
	{ 
		Queue<packet> que;
		packet p=new packet();	
		private int LAMBDA=1000;
		packet_thread(Queue<packet> que)
		{
			this.que=que;
		}
	
	    	public void run() 
	  	    {
	       	while(true)
	    	{
	        p.setTokens(2);
	    	que.enqueue(p);
	    	System.out.println("Packet is added in queue_one:"+p.getId());
	    	try 
	    	{
				sleep(LAMBDA);
			}
	    	catch (InterruptedException e)
	    	{
				e.printStackTrace();
			}
	    	}
	    }
		
	}
	
