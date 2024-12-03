import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
class patha{
    public static void main(String [] args){
        int [] nums1;
        int [] nums2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        nums1 = new int[m];
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        nums2 = new int[n];

        //creating the arrays
        System.out.println("Enter the values of Array 1");
        for(int i = 0; i<nums1.length; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the values of Array 2");
        for(int i = 0; i<nums2.length; i++){
            nums2[i] = sc.nextInt();
        }

        //merging the arrays
        int[] arr1 = new int[m+n];
        for(int i=0; i<nums1.length;i++){
            arr1[i] = nums1[i];
        }
        for(int i =0; i<nums2.length; i++){
            arr1[m+i] = nums2[i];
        }
        //calculating the median
        double median = 0.0;
        double median1 = 0.0;
        double result = 0;
        for(int i = 0; i<(m+n) ; i++) {
            if ((m + n) - 1 % 2 == 0) {
                median = arr1[(m+n)/2];
                System.out.println("Median: " + median);
                break;
            }
            else{
                median = arr1[(m+n)/2 - 1];
                median1 = arr1[(m+n)/2];
                result = (median + median1)/2;
                System.out.println("median: " + median);
                System.out.println("median1: " + median1);
                System.out.println("result: " + result);
                System.out.println("Median: " + result);
                System.out.println("Bhombola");

                break;

            }
        }
        
    }
}