package retail_cart.demo;

import com.retail.core.Bill;
import com.retail.core.LineItem;
import com.retail.core.UserTypeFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Bill bill = new Bill();
        bill.addLineItem(new LineItem("Milk", 200,"dairy"));
        bill.addLineItem(new LineItem("Bread", 150,"bakery"));
        bill.addLineItem(new LineItem("potato", 150,"vegetable"));
        bill.addLineItem(new LineItem("potato", 150,"grocery"));
       // bill.calcNetAmt(UserTypeFactory.getUserType("employee"));
        bill.calcNetAmt(UserTypeFactory.getUserType("affiliate"));
       // bill.calcNetAmt(UserTypeFactory.getUserType("custGtTwoYrs"));
       // bill.calcNetAmt(UserTypeFactory.getUserType("custNoDisc"));
    }
}
