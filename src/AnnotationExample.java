import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
/*
program to test user defined annotation
 */

/**
 * Creating annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestAnnotation {
    int value();
}

/**
 * class to test above defined annotation
 */
class TestAnnotationClass {
    /**
     * method to test above defined annotation
     */
    @TestAnnotation(value = 10)
    public void sayHello() {
        System.out.println("Hello annotation");
    }
}

/**
 * Accessing annotation
 */
public class AnnotationExample {
    public static void main(String[] args) throws Exception {

//        object to test above created annotation.
        TestAnnotationClass testAnnotationVariable = new TestAnnotationClass();
        Method m = testAnnotationVariable.getClass().getMethod("sayHello");

//        object to get teh value of MyAnnotation.
        TestAnnotation ta = m.getAnnotation(TestAnnotation.class);
        System.out.println("value is: " + ta.value());
    }
}
