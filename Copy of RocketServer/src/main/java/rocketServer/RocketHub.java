package rocketServer;

import java.io.IOException;

import netgame.common.Hub;
import rocketBase.RateBLL;
import rocketData.LoanRequest;


public class RocketHub extends Hub {

	private RateBLL _RateBLL = new RateBLL();
	
	public RocketHub(int port) throws IOException {
		super(port);
	}

	@Override
	protected void messageReceived(int ClientID, Object message) {
		System.out.println("Message Received by Hub");
		
		if (message instanceof LoanRequest) {
			resetOutput();
			
			LoanRequest lq = (LoanRequest) message;
			
			try {
				double rate = RateBLL.getRate(lq.getiCreditScore());
				lq.setdRate(rate); 
				double payment = RateBLL.getPayment(lq.getdRate(), 12*lq.getiTerm(), ld.getdPayment(), lq.getdAmount()), false;
				lq.setdPayment(payment); 
			} catch (RateException e) {
				
				e.printStackTrace();
			}
			
			
			sendToAll(lq);
		}
	}
}
