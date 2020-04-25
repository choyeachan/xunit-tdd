package src.xunit.annotation;


import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.*;
import java.lang.annotation.*;

public class AnnotationUtil {

	public static List<Method> getMethodsAnnotatedWith(final Class<?> type, final Class<? extends Annotation> annotation) {
		final List<Method> methods = new ArrayList<Method>();
		Class<?> klass = type;
		while (klass != Object.class) { 
			for (final Method method : klass.getDeclaredMethods()) {
				if (method.isAnnotationPresent(annotation)) { 
					methods.add(method);
				}
			}
			klass = klass.getSuperclass();
		}
		return methods;
	}

}

