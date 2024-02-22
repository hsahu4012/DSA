import java.util.Scanner;
public class l4_ReverseArray {

    public static void ReverseArray(int numbers[], int size) {
        int j = 0;
        int n = size-1;
        while (j < n) {
            int temp = numbers[n];
            numbers[n] = numbers[j];
            numbers[j] = temp;
            j++;
            n--;
        }
        // For Palindrome
        // for (int i = 0; i < size; i++) {
        //     numbers[i] = numbers[size-i-1];
        // }
        
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
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
        ReverseArray(numbers, n);
    }
}
