import java.util.Scanner;

public class CodigoP {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, num2 = 2;

        System.out.println("Damen numero");
        num = tec.nextInt() + num2;
        num2 += num * 2;
        tec.close();

        System.out.println(num + " " + num2);
    }
}