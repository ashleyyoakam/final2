package rocketBase;

import org.apache.poi.ss.formula.functions.*;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException
	{
		
		RateDAL.getAllRates();
		for (RateDomainModel Rate1:allRates){
			if (Rate1.getiMinCreditScore()<=GivenCreditScore){
				rate = Rate1.getdInterestRate();
			}
		}
		
		return rate;
		
		
	}
	
	
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
