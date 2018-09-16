package com.retail.core;

public class CustomerNoDisc implements UserType
{

	
	public void calcNetAmt(Double billAmt,Double discAmt,Double noDiscAmt)
	{
		Double generalDisc = billAmt * 0.05;
		Double netBllAmt = noDiscAmt + (discAmt-(generalDisc));
		System.out.println("Net Bill amount is ::"+netBllAmt);

	}

}