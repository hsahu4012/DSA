import java.util.Scanner;

public class l7_Max_SubArray {
    public static void SubArray(int numbers[], int n) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i+1; j < n; j++) {
                int end = j;
                currSum = 0;
                for (int j2 = start; j2 <= end; j2++) {
                    currSum += numbers[j2];
                }
                System.out.println(currSum );
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("MAX SUM = " + MaxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of n :");
        int n = sc.nextInt();
        int numbers[] = new int[10];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        SubArray(numbers, n);
    }
} 