package TokenBucket;

public class Operation_thread extends Thread
{
	Queue<packet> que1,que2;
	Queue<Token> token;
	Token t=new Token();
	packet p=new packet();
	Bucket b =new Bucket(20);
	int j=0;
	
    Operation_thread(Queue<packet> que1, Queue<packet> que2)
    {
     this.que1=que1;
     this.que2=que2;
    }
    
    public void run()
    {
      if(p.getTokens()>b.buc_size())
      {
	   System.out.println("No. of tokens greater than bucket size.");
	   que1.dequeue();
      }
      while(que1!=null)	
      {
        que1.dequeue(p);
        if(p.getTokens()>=b.count_tokens())
        {   	   
	     for(int i=0;i<b.count_tokens();i++)
	     {
	       System.out.println("Token "+j+"is deleted:"+token.dequeue()); 
	     }	     
	     que2.enqueue(p);
	     que1.notify(); 
        }       
        else if(p.getTokens()<b.count_tokens())
        {
	     que1.enqueue(p);
        }	
      }
      
  }
}
