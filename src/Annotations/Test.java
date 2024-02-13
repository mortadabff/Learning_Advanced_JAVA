package Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		///1 : uses of an annotation that don't contain any attribute or values : "Important"
		// in this example ; we see which class of the two : Dog and Point is marked as important 
		Dog mydog= new Dog("bob","dog");
		Point p1= new Point(200,260);
		if(p1.getClass().isAnnotationPresent(Important.class)) {
			System.out.println("Point is import ");

		}
		else if (mydog.getClass().isAnnotationPresent(Important.class)){
			System.out.println("Dog is important ");
		}
		else {
			
			System.out.println(" the two classes are not important ");

		}
	///2 : uses of an annotation that  contains  attributes or values : "RunMethod"
		// here we get the method declared on the Animals class , we see which contains the annotation "RunMethod" and we execute it on the Animals object by "invoke()"
		Animals dog= new Animals("dog","bob");
		for (Method method :dog.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(RunMethod.class)) {
				RunMethod annotation =method.getAnnotation(RunMethod.class);
						for(int i=0;i<annotation.times();i++) {
							method.invoke(dog);
					}			
			}
			if(method.isAnnotationPresent(Important.class)) {
					method.invoke(dog);
							
		}

		}
	}
	

}
