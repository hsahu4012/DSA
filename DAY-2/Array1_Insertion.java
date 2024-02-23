import java.util.Scanner;

public class Array_Insertion {
  public static int insert(int arr[], int pos, int x, int cap, int n) {
    if (n == cap) {
      System.out.println("Array is full. Cannot insert element.");
      return n;
    }

    int idx = pos - 1;
    for (int i = n - 1; i >= idx; i--) {
      arr[i + 1] = arr[i];
    }
    arr[idx] = x;
    return n + 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the capacity of the array:");
    int cap = sc.nextInt();

    int arr[] = new int[cap];

    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the position where you want to insert the element:");
    int pos = sc.nextInt();

    System.out.println("Enter the element to be inserted:");
    int x = sc.nextInt();

    n = insert(arr, pos, x, cap, n);

    System.out.println("Array after insertion:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
