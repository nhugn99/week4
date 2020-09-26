package week4;

import org.junit.Test;
import static org.junit.Assert.*;
import static week4.Week4.calculateBMI;
import static week4.Week4.max2Int;
import static week4.Week4.minArray;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(max2Int(4, 7), 7);
    }

    @Test
    public void testMax2Int2(){
        assertEquals(max2Int(89, 3), 89);
    }

    @Test
    public void testMax2Int3(){
        assertEquals(max2Int(940, 23), 940);
    }

    @Test
    public void testMax2Int4(){
        assertEquals(max2Int(29, 1234), 1234);
    }

    @Test
    public void testMax2Int5(){
        assertEquals(max2Int(2, 60), 60);
    }
    
    @Test
    public void testMinArray1(){
        int[] arr = {3, 4, 5, 7, 2};
        assertEquals(minArray(arr), 2);
    }

    @Test
    public void testMinArray2(){
        int[] arr = {31, 14, 5, 137, 23};
        assertEquals(minArray(arr), 5);
    }

    @Test
    public void testMinArray3(){
        int[] arr = {13, 43, 522, 71, 24};
        assertEquals(minArray(arr), 13);
    }

    @Test
    public void testMinArray4(){
        int[] arr = {44, 24, 15, 7, 233};
        assertEquals(minArray(arr), 7);
    }

    @Test
    public void testMinArray5(){
        int[] arr = {113, 4222, 533, 742, 255};
        assertEquals(minArray(arr), 113);
    }
    
    @Test
    public void testCalculateBMI1(){
        assertEquals(calculateBMI(54, 1.62), "Bình thường");
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals(calculateBMI(89, 1.75), "Béo phì");
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals(calculateBMI(45, 1.54), "Bình thường");
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals(calculateBMI(60, 1.59), "Thừa cân");
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals(calculateBMI(40, 1.52), "Thiếu cân");
    }
}
