import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Input Data : ");
        x = in.nextInt();
        Bar(x);
    }
    public static void Bar(int Data){
        for(int x = 1; x <= Data; x++){
            System.out.println("*");
        }
       System.out.println();
    }
}
