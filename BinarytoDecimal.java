package codingninjas;
import java.util.*;
public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int d=0;
        int b=1;
        while(n>0){
            r = n%10;
            d = d + (r*b);
            n /=10;
            b *=2;
        }
        System.out.println(d);

	}

}
