package codingninjas;
import java.util.*;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int f1 = 0,f2=1;
        int sum = 0;
        if(n==1){
            sum = 1;
        }
        
        for(int i = 2;i<=n;i++){
            sum = f1+f2;
            f1=f2;
            f2=sum;
        }
        System.out.println(sum);

	}

}
