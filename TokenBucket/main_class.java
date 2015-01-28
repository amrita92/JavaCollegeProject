package TokenBucket;


public class main_class 
{
	public static void main(String args[])throws InterruptedException
	{
		 Queue<packet> que1=new Queue<packet>();
		 Queue<Token> token=new Queue<Token>();
		 Queue<packet> que2=new Queue<packet>();
		 
		 packet_thread P=new packet_thread(que1);
		 Token_thread T=new Token_thread(token);
		 Operation_thread O=new Operation_thread(que1,que2);
		 Server_thread S=new Server_thread(que2);    
		 
		 P.start();
		 T.start();
		 //Bucket b=new Bucket(20);
		 //System.out.println(b.count_tokens());
		 O.start();
		 S.start();
	     //d.start();
	}
}  
