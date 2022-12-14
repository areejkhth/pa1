/***** DO NOT ATTEMPT To CHANGE ANY CODE LINES ****/

package uqu.edu.sa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void test1ComputeProduct() {
        assertEquals(6.0, App.computeProduct(1.0, 2.0, 3.0), 0.01);
    }

    @Test
    public void test2ComputeProduct() {
        assertEquals(-6.0, App.computeProduct(-1.0, 2.0, 3.0), 0.01);
    }

    @Test
    public void test3ComputeProduct() {
        assertEquals(0.0, App.computeProduct(-1.0, 0.0, 3.0), 0.01);
    }

    @Test
    public void test4ComputeProduct() {
        assertEquals(6.0, App.computeProduct(-1.0, -2.0, 3.0), 0.01);
    }


    @Test
    public void test5ComputeSum() {
        assertEquals(0, App.computeSum(0, 0, 0));
    }

    @Test
    public void test6ComputeSum() {
        assertEquals(6, App.computeSum(1, 2, 3));
    }

    @Test
    public void test7ComputeSum() {
        assertEquals(4, App.computeSum(-1, 2, 3));
    }

    @Test
    public void test8ComputeSum() {
        assertEquals(2, App.computeSum(-1, 0, 3));
    }

    @Test
    public void test9ComputeAverage() {
        assertEquals(5.66, App.computeAverage(2, 10, 5), 0.01);
    }

    @Test
    public void test10ComputeAverage() {
        assertEquals(-1.0, App.computeAverage(-10, 2, 5), 0.01);
    }

    @Test
    public void test11ComputeAverage() {
        assertEquals(-66.66, App.computeAverage(-10, -200, 10), 0.01);
    }

    @Test
    public void test12ComputeAverage() {
        assertEquals(0, App.computeAverage(0, 11, -11), 0.01);
    }

    @Test
    public void test13CompareDate() {
        assertEquals(true, App.compareDate(2021,12,12));
    }

    @Test
    public void test14CompareDate() {
        assertEquals(false, App.compareDate(2022,12,12));
    }

    @Test
    public void test15CompareDate() {
        assertEquals(false, App.compareDate(2023,12,12));
    }

    @Test
    public void test16CompareChar() {
        assertEquals(false, App.compareChar('Z','z'));
    }

    @Test
    public void test17CompareChar() {
        assertEquals(false, App.compareChar('A','Z'));
    }

    @Test
    public void test18CompareChar() {
        assertEquals(true, App.compareChar('z','z'));
    }

    @Test
    public void test19CompareChar() {
        assertEquals(true, App.compareChar('Z','Z'));
    }

    @Test
    public void test20ConvertCharToAscii() {
        assertEquals(65, App.convertCharToAscii('A'));
    }

    @Test
    public void test21ConvertCharToAscii() {
        assertEquals(48, App.convertCharToAscii('0'));
    }

}