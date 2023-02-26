package hw18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestRunner {

    private TestRunner(){}

    static void start(ClassTest classTest) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = classTest.getClass().getDeclaredMethods();
        List<Method> methodsBeforeSuite = new ArrayList<>();
        List<Method> methodsAfterSuite = new ArrayList<>();
        List<Method> methodsTest = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                methodsBeforeSuite.add(method);
            }
            if (method.isAnnotationPresent(AfterSuite.class)) {
                methodsAfterSuite.add(method);
            }
            if (method.isAnnotationPresent(Test.class)) {
                methodsTest.add(method);
            }
        }

        if (methodsBeforeSuite.size() > 1 || methodsAfterSuite.size() > 1) {
            throw new TwoMethodsException();
        }

        methodsBeforeSuite.get(0).invoke(classTest);

        methodsTest = sortMethods(methodsTest);
        for (Method methodTest : methodsTest) {
            methodTest.invoke(classTest);
        }

        methodsAfterSuite.get(0).invoke(classTest);
    }

    private static List<Method> sortMethods(List<Method> methodsTest) {
        return methodsTest.stream()
                .sorted(Comparator.comparing(method -> method.getDeclaredAnnotation(Test.class).priority()))
                .toList();
    }
}
