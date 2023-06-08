package ec.epn.edu.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


@RunWith(value = Parameterized.class)
public class CalculatorParametrerTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static List<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{3,4,7});
        return objects;
    }
    public CalculatorParametrerTest(int a, int b, int expected){
        this.a =a;
        this.b=b;
        this.expected = expected;
    }
    @Test
    public void given_parameters_when_addition_then_summation(){
        Calculator c = new Calculator();
        int actual = c.add(a,b);


    }

}
