import java.util.Scanner;

public class cm {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int max = Integer.MAX_VALUE;
      int n=scan.nextInt();
      int[] ar = new int[n];
        
        for(int i = 0;i<ar.length;i++){
        ar[i]=scan.nextInt();
        if(ar[i]<max){
          max = ar[i];
        }
       
      }
      System.out.println(max);
    
    }
        
        
         
    }

