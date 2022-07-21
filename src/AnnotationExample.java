import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Creating annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestAnnotation{
    int value();
}

/**
 * Applying annotation
 */
class Test{
    @TestAnnotation(value=10)
    public void sayHello(){
        System.out.println("Hello annotation");
    }
}

/**
 * Accessing annotation
 */
public class AnnotationExample {
    public static void main(String[] args)throws Exception {

        Test t=new Test();
        Method m = t.getClass().getMethod("sayHello");

        TestAnnotation ta = m.getAnnotation(TestAnnotation.class);
        System.out.println("value is: "+ ta.value());
    }
}
