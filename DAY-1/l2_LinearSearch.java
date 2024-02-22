import java.util.Scanner;
public class l2_LinearSearch {
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of n :");
        int n = sc.nextInt();
        int numbers[] = new int[10];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter The Key : ");
        int key = sc.nextInt();
    
        // int numbers[] = {0,1,2,3,4,5,6,7,8,9,10};
        // int key = 10;
        int Index = LinearSearch(numbers, key);

        if (Index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.print("at Index " + Index );
        }    

    }
}
