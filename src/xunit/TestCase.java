package src.xunit;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class TestCase{

	public final String name;

	public TestCase(String name){
		this.name = name;
	}

	public TestResult run(){
		TestResult result = new TestResult();
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
		return result; 
	}


	public void setUp(){
	}

	public void tearDown(){
	}

}
