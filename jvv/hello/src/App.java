import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int i;
         int num;
         int count;
          int k=scan.nextInt();
        for(num=1;num<=k;num++){
            count=0;
            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                    count++;
                    break;
                }
            }
            if(count==0 && num!=1){
                System.out.println(num);
            }
            
        }
    }
}
