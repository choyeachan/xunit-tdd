package src.xunit;

public class WasRun extends TestCase{

	public boolean wasRun = false;

	public WasRun(String name){
		super(name);
	}	

	public void testMethod(){
		this.wasRun=true;
	}

}