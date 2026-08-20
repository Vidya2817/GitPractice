package practice.testng;

import org.testng.annotations.Test;

public class InvocationCountTest {
@Test(invocationCount = 10)
public void createOrder() {
	/*for(int i=0;i<=10;i++)
	{
	System.out.println("created");
}*/
	System.out.println("created");
	}
@Test(enabled = false)
public void billingOrderTest()
{
	System.out.println("executeBilling");
}
@Test(invocationCount = 0)
public void billingOrdeTest1r()
{
	System.out.println("executeBilling test");
}

}
