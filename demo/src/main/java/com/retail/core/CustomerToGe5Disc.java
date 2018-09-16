package com.retail.core;

public class CustomerToGe5Disc implements UserType
{
	
	public void calcNetAmt(Double billAmt,Double discAmt,Double noDiscAmt)
	{
		Double affDiscAmt= discAmt * 0.05;
		Double generalDisc = billAmt * 0.05;
		Double netBllAmt = noDiscAmt + (discAmt-(affDiscAmt+generalDisc));
		System.out.println("Net Bill amount is ::"+netBllAmt);

	}

}