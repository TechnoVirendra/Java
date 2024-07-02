package college1;
import java.util.*;
public class SI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		double r = sc.nextDouble();
		double t = sc.nextDouble();
		double total;
		total =(double) p*(r/100)*t;
		System.out.println(total);
	}

}
