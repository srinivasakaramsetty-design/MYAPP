package Test;

public class ParallelExecution
{
	@org.testng.annotations.Test
	public void testMethod1() throws InterruptedException 
	{
		System.out.println("Test Method 1 started");
		Thread.sleep(2000); // Simulate some work
		System.out.println("Test Method 1 completed");
	}

	@org.testng.annotations.Test
	public void testMethod2() throws InterruptedException 
	{
		System.out.println("Test Method 2 started");
		Thread.sleep(2000); // Simulate some work
		System.out.println("Test Method 2 completed");
	}

	@org.testng.annotations.Test
	public void testMethod3() throws InterruptedException 
	{
		System.out.println("Test Method 3 started");
		Thread.sleep(2000); // Simulate some work
		System.out.println("Test Method 3 completed");
	}

}
