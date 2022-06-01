import java.util.*;
import java.io.*;
public class arraytest {

    public static void main (String[] args){
        int res = sumNum(1,3);
        System.out.println(res);

        int[] array1 = {1, 5, 8, 9};
        int[] array2 = {2, 4, 8, 1};


        int sun_array [] = sumArray(array1,array2);
        System.out.println(Arrays.toString(sun_array));
//由于在Java编程若是直接输出数组，会发现得到的是一些地址；如@67b64c45



    }

    public static int sumNum (int num1, int num2) {
        int sumint = num1 +num2;
        return sumint;

    }


    public static int[] sumArray (int a[], int b[]){
//create a new array with size
        int sumArray[] = new int[a.length];

        for (int i=0;i<a.length;i++){
            System.out.println(i);
            sumArray[i] = a[i]+b[i];
        }
        System.out.println(sumArray);
        return sumArray;


    }
}
