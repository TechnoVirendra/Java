package codingninjas;
import java.util.*;
public class TermsofAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 2 , ap = 0;
        for(int i=1;i<=n;i++){
            if(i==1){
                ap = 5;
            }
            else{
            	ap = 3*s+5;
                if(ap%4==0){
                    i--;
                    s++;
                    continue;
                }
                s++;
            }
            System.out.print(ap +" ");
        }

	}

}
