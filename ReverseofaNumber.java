package codingninjas;
import java.util.*;
public class ReverseofaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0,m;
        while(n !=0){
            m = n%10;
            r = (r*10)+m;
            n /= 10;
        }
        System.out.println(r);


	}

}
