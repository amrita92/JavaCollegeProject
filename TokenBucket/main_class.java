package TokenBucket;


public class main_class 
{
	public static void main(String args[])throws InterruptedException
	{
		 Queue<packet> que1=new Queue<packet>();
		 Queue<Token> token=new Queue<Token>();
		 Queue<packet> que2=new Queue<packet>();
		 
		 Bucket b=new Bucket(20);
		 packet_thread Packet=new packet_thread(que1);
		 Token_thread Token=new Token_thread(token,b);
		 Operation_thread Operation=new Operation_thread(que1,que2,b);
		 Server_thread Server=new Server_thread(que2);    
		 
		 Packet.start();
		 Token.start();
		 Operation.start();
		 Server.start();     

	}
}    
