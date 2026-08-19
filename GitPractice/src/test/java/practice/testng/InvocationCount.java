package practice.testng;

import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 10)
public void createOrder() {
	/*for(int i=0;i<=10;i++)
	{
	System.out.println("created");
}*/
	System.out.println("created");
	}
@Test(enabled = false)
public void billingOrder()
{
	System.out.println("executeBilling");
}
}
