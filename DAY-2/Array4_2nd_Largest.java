import java.util.Scanner;

public class Array_2nd_Largest {
  public static int Largest(int arr[], int n) {
    int largest = 0;
    int res = -1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;

      }
      if (res == -1 || arr[i] < arr[largest]) {
        res = i;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int index = Largest(arr, n);

    System.out.println("Array 2nd Largest: " + arr[index]);
  }
}