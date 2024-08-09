import java.util.Scanner;

public class palinstring {
    public static void main(String[] args) {
        String r="";
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        int l = n.length();

        for(int i = l-1;i>=0;i--)
        {
             r = r + n.charAt(i);
             
        }
        if(n.equals(r))
            {
                System.out.println("pallindrome");

            }
            else{
                System.out.println("Not palindrome");
            }

        System.out.println(r);

    }
}
