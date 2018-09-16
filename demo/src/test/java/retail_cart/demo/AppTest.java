package retail_cart.demo;

import com.retail.core.Bill;
import com.retail.core.LineItem;
import com.retail.core.UserTypeFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        //assertTrue( true );
    	System.out.println( "Net Amount Calculation for Employee" );
        Bill bill = new Bill();
        bill.addLineItem(new LineItem("Milk", 200,"dairy"));
        bill.addLineItem(new LineItem("Bread", 150,"bakery"));
        bill.addLineItem(new LineItem("potato", 150,"vegetable"));
        bill.addLineItem(new LineItem("potato", 150,"grocery"));
        bill.calcNetAmt(UserTypeFactory.getUserType("employee"));
        //assertEquals(467.5,true);
        //bill.calcNetAmt(UserTypeFactory.getUserType("affiliate"));
    }
    
    public void testApp1()
    {
        //assertTrue( true );
    	System.out.println( "Net Amount Calculation for Affiliate" );
        Bill bill = new Bill();
        bill.addLineItem(new LineItem("Milk", 200,"dairy"));
        bill.addLineItem(new LineItem("Bread", 150,"bakery"));
        bill.addLineItem(new LineItem("potato", 150,"vegetable"));
        bill.addLineItem(new LineItem("potato", 150,"grocery"));       
        bill.calcNetAmt(UserTypeFactory.getUserType("affiliate"));
    }
    
    public void testApp2()
    {
        //assertTrue( true );
    	System.out.println( "Net Amount Calculation for Customer Greater than 2 Yrs" );
        Bill bill = new Bill();
        bill.addLineItem(new LineItem("Milk", 200,"dairy"));
        bill.addLineItem(new LineItem("Bread", 150,"bakery"));
        bill.addLineItem(new LineItem("potato", 150,"vegetable"));
        bill.addLineItem(new LineItem("potato", 150,"grocery"));       
        bill.calcNetAmt(UserTypeFactory.getUserType("custGtTwoYrs"));
    }
    
    public void testApp3()
    {
        //assertTrue( true );
    	System.out.println( "Net Amount Calculation for New Customer" );
        Bill bill = new Bill();
        bill.addLineItem(new LineItem("Milk", 200,"dairy"));
        bill.addLineItem(new LineItem("Bread", 150,"bakery"));
        bill.addLineItem(new LineItem("potato", 150,"vegetable"));
        bill.addLineItem(new LineItem("potato", 150,"grocery"));       
        bill.calcNetAmt(UserTypeFactory.getUserType("custNoDisc"));
    }
}
