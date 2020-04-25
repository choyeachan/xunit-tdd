package src.xunit;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class TestCase implements Test{

	public final String name;

	public TestCase(String name){
		this.name = name;
	}

	public void run(TestResult result){
		result.testStarted();
		setUp();
		try{
			Method method = getClass().getMethod(name);
			method.invoke(this);
		}
		catch(Exception e){
			result.testFailed();
		}
		tearDown();
	}


	public void setUp(){
	}

	public void tearDown(){
	}

}
