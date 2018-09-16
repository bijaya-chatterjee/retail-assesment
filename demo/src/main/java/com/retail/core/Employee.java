package com.retail.core;

public class Employee implements UserType
{
	public void calcNetAmt(Double billAmt,Double discAmt,Double noDiscAmt)
	{
		Double empDiscAmt= discAmt * 0.3;
		Double generalDisc = billAmt * 0.05;
		Double netBllAmt = noDiscAmt + (discAmt-(empDiscAmt+generalDisc));
		System.out.println("Net Bill amount is ::"+netBllAmt);
		
		

	}
}
