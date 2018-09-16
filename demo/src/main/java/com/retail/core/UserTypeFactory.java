package com.retail.core;

public class UserTypeFactory{

	public static UserType getUserType(String type){
	
	switch (type) {
	case "employee":
		return createEmpDiscount();
	case "affiliate":
		return createAffDiscount();
	case "custGtTwoYrs":
		return createCustDiscount();
	case "custNoDisc":
		return createCustNoDiscount();
	}

	throw new IllegalArgumentException();

	}

	public static Employee createEmpDiscount()
	{
		return new Employee();
	}

	public static Affiliate createAffDiscount()
	{
		return new Affiliate();
	}
	public static CustomerToGe5Disc createCustDiscount()
	{
		return new CustomerToGe5Disc();
	}
	public static CustomerNoDisc createCustNoDiscount()
	{
		return new CustomerNoDisc();
	}

}
