package week4;

import java.util.Scanner;

public class Week4 {
    public static int max2Int(int a, int b) {
        int max;
        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI;
        String result;
        BMI = weight /(height * height);
        if (BMI >= 25) {
            result = "Béo phì";
        } else if (BMI <= 24.9 && BMI >= 23) {
            result = "Thừa cân";
        } else if (BMI <= 22.9 && BMI >= 18.5) {
            result = "Bình thường";
        } else {
            result = "Thiếu cân";
        }
        return result;
    }
    
    public static void main(String[] args) {
        
    }
}
