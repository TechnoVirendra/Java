package CodingNinjas;
import java.util.*;
public class PrintNumbersusingrecursion {
	public static void print(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);

	}

}
