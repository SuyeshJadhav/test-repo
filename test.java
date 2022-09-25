import java.util.Scanner;
class test{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.console().reader());
        System.out.print("\nEnter number: ");
        String a = s.nextLine();
        System.out.println(a);
        s.close();
    }
}