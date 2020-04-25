package src.xunit;

import java.util.ArrayList;
import java.util.List;
import src.xunit.annotation.AnnotationUtil;

public class TestSuite implements Test {

	List<Test> tests = new ArrayList<>();

	public TestSuite(Class<? extends Test> testClass) {
		AnnotationUtil.getMethodsAnnotatedWith(testClass, src.xunit.annotation.Test.class)
			.stream()
			.forEach(m -> {
				try {
					add(testClass.getConstructor(String.class).newInstance(m.getName()));
				}catch(Exception e){
					new RuntimeException(e);
				}
					
			});

	}

	public TestSuite(){
	}

	public void add(Test test){
		tests.add(test);
	}

	public void run(TestResult result){
		tests.forEach(t->{
			t.run(result);
		});
	}
}
