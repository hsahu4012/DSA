import java.util.Scanner;
public class l3_BinarySearch {

    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
            
        while(start <= end) {
            int mid = (start + end)/2;
            // Comparison
            if (numbers[mid] == key) {
                return mid;
            } else if(numbers[mid] < key) {
                start = mid + 1;
            } else{
                end = mid - 1;
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
        // Sorting An Array
        // int temp = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j < n; j++) {
        //         if (numbers[i] > numbers[j]) {
        //             temp = numbers[i];
        //             numbers[i] = numbers[j];
        //             numbers[j] = temp;
        //         }
        //     }
        // }
         
        
        int Index = BinarySearch(numbers, key);
        if (Index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.print("at Index " + Index );
        }
    }
}