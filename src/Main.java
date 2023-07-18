import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string: ");
        String s=scanner.nextLine();
        int n=s.length();
        String res="";
        for(int i=n-1;i>=0;i--)
        {
            res+=s.charAt(i);
        }
        System.out.println(res);
    }
}