package src.xunit;

public class TestCaseTest extends TestCase {
	
	public TestCaseTest(String name){
		super(name);
	}


	public void testRunning(){
		WasRun wasRun = new WasRun("testMethod");
		Assert.assertEquals(false, wasRun.wasRun); //false
		wasRun.run();
		Assert.assertEquals(true, wasRun.wasRun); //true
	}


}
