import java.util.Scanner;

public class l5_ArrayPairs {

    public static void Pairs(int numbers[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("("+numbers[i]+","+numbers[j]+")");
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
        Pairs(numbers, n);
    }
}