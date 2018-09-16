package com.retail.core;

import java.util.ArrayList;
import java.util.List;

public class Bill {
	double amt = 0.0;
	/*public Bill(List<LineItems> lineItemsList)
	{
		for(LineItems l:lineItems)
		{
			if(l.getCategory() != null && !l.getCategory().equalsIgnoreCase("grocery")
			{
				double amt = amt + l.getCostInCents();
			}
		}
	}*/	
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    double billAmt =0.0;
    double billDiscAmt = 0.0;
    double billNoDiscAmt = 0.0;
    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }
    public void removeLineItem(LineItem lineItem) {
        lineItems.remove(lineItem);
    }
    public double getCost(List<LineItem> lineItemsList) {
    	
    	//return lineItems.stream().mapToDouble(item -> item.getCost()).sum();
    	for(LineItem l:lineItemsList)
    	{
    		billAmt = billAmt + l.getCost();
    	}
    	return billAmt;
    }
    
    public double getBillDiscAmt(List<LineItem> lineItemsList)
    {
    	for(LineItem l : lineItemsList) {
    		if(l.getCategory() != null && !l.getCategory().equalsIgnoreCase("grocery")) {
    			//billDiscAmt = lineItems.stream().mapToDouble(item -> item.getCost()).sum();
    			billDiscAmt = billDiscAmt + l.getCost();
    		}
    	}
    	return billDiscAmt;
    }
    
    public double getBillNoDiscAmt(List<LineItem> lineItemsList)
    {
    	for(LineItem l : lineItemsList) {
    		if(l.getCategory() != null && l.getCategory().equalsIgnoreCase("grocery")) {
    			//billNoDiscAmt = lineItems.stream().mapToDouble(item -> item.getCost()).sum();
    			billNoDiscAmt = billNoDiscAmt + l.getCost();
    		}
    	}
    	return billNoDiscAmt;
    }
    public void calcNetAmt(UserType user){
        user.calcNetAmt(getCost(lineItems),getBillDiscAmt(lineItems),getBillNoDiscAmt(lineItems));
    }
}
