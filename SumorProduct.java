
package codingninjas;
import java.util.Scanner;
public class SumorProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int s=0,p =1;
        if(c == 1){
            for(int i = 1;i<=n;i++){
                s += i;
            }
            System.out.println(s);
        }
        else if(c == 2){
            for(int i = 1;i<=n;i++){
                p *= i;
            }
            System.out.println(p);
        }
        else{
            System.out.println("-1");
        }
	}

}
