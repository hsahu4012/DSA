import java.util.Scanner;

public class l6_SubArray {
    public static void SubArray(int numbers[], int n) {
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i+1; j < n; j++) {
                int end = j;
                for (int j2 = start; j2 <= end; j2++) {
                    System.out.print(numbers[j2]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
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
