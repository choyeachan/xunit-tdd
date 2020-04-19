package src.xunit;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class TestCase{

	public final String name;

	public TestCase(String name){
		this.name = name;
	}

	public void run(){
		try{
			Method method = getClass().getMethod(name);
			method.invoke(this);
		}
		catch(InvocationTargetException | IllegalAccessException | NoSuchMethodException e){
			throw new RuntimeException();
		}
	}
}
