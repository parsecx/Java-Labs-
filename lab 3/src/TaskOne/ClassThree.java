package TaskOne;

import java.lang.reflect.Type;
import java.util.Objects;

public class ClassThree {
    public void MainMethod(int a, int b) {
        ClassOne objOne = new ClassOne();
        int resMul = objOne.Mul(a, b);
        int resSum = objOne.Sum(a, b);

        ClassTwo objTwo = new ClassTwo();
        int resDiv = objTwo.Div(a, b);
        int resMin = objTwo.Min(a, b);

        System.out.println("Method Mul was called from " + objOne.getClass().toString() + " and result is " + resMul);
        System.out.println("Method Sum was called from " + objOne.getClass().toString() + " and result is " + resSum);
        System.out.println("Method Div was called from " + objTwo.getClass().toString() + " and result is " + resDiv);
        System.out.println("Method Min was called from " + objTwo.getClass().toString() + " and result is " + resMin);
    }
}
