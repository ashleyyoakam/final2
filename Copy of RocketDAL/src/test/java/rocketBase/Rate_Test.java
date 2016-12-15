package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	
	//TODO - RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void test() {
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
		int CREDITSCORE1 = 550;
		int CREDITSCORE2 = null;
		try {
			assert(RateDAL.getRate(CREDITSCORE1) > 0);
		} catch (RateException e) {
			e.printStackTrace();
		}
		try {
			RateDAL.getRate(CREDITSCORE2);
		} catch (RateException e) {
			e.printStackTrace();
				}

}}
