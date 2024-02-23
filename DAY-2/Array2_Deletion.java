import java.util.Scanner;

public class Array_Deletion {
  public static int Delete(int arr[], int x, int n) {
    int i = 0;
    for (i = 0; i < n; i++) {
      if (arr[i] == x) {
        break;
      }
    }

    if (i == n) {
      return n; // If the element is not found, return the original size
    }

    for (int j = i; j < n - 1; j++) {
      arr[j] = arr[j + 1];
    }

    return n - 1;
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

    System.out.println("Enter the element to be Deleted:");
    int x = sc.nextInt();

    n = Delete(arr, x, n);

    System.out.println("Array after Deletion:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
