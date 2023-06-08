package ec.epn.edu.git.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }
    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculator();
    }
    @Test
    public void given_two_integers_when_add_then_ok() {
        System.out.println("Test1");
        assertEquals(6,c.add(3,3));
    }
}