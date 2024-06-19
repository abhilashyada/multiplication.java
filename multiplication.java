import java.util.Scanner;
public class  multiplication{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        for (int i= 1;i <= 10;i++) {
            System.out.println(A + (" x ") + i + (" = ") + (A*i));
        } 
    }
}