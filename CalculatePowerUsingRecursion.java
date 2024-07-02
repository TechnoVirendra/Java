package CodingNinjas;
import java.util.*;
public class CalculatePowerUsingRecursion {
	public static int powerfun(int x , int n) {
		if(n==0)
			return 1;
		else if(x==0)
			return 1;
		return x*powerfun(x,n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(powerfun(x,p));
	}

}
