package src.xunit;

public class WasRun extends TestCase{

	public boolean wasSetUp;
	public String log;

	@Override
	public void setUp(){
		log="setUp";
	}

	public WasRun(String name){
		super(name);
	}	

	public void testMethod(){
		log += " testMethod";
	}

	public void testBrokenMethod(){
		throw new AssertionError();
	}

	@Override
	public void tearDown(){
		log += " tearDown";
	}

}
