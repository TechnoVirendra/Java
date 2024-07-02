package codingninjas;
import java.util.*;
public class DecimaltoBinary {
	static void decTobin(int n){
        int[] binarynum = new int[32];
        int m = n;
        int i = 0;
        
        while(n>0){
            binarynum[i]=n%2;
            n /= 2;
            i++;
        }
         if(m==0){
                System.out.print("0");
            }
        
        for(int j = i-1;j>=0;j--){
            System.out.print(binarynum[j]);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decTobin(n);

	}

}
