import java.util.Scanner;

public class l1_ArrayCC {
    // 0. Creation
    public static void ArrayCreation() {
        // dataType arrayName[] = new dataType[size];
        int marks[] = new int[50];    // size = 0 
        int numbers[] = {1, 2, 3};    //Size automatically 3
        String fruits[] = {"Apple", "Orange", "Mango"};    //size = 3
    }
    
    //  1. Call By Reference Array Support
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //  1. Call By Reference
        int marks[] = {97, 98, 100};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
    }
}
