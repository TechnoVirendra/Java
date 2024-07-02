package codingninjas;
import java.util.*;
public class CheckNumbersequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pr = sc.nextInt();
        int cnt = 2, cur;
        boolean isdec=true;
        while(cnt <=n){
            cur = sc.nextInt();
            cnt++;
            if(cur == pr){
                System.out.println("false");
                return;
            }
            else if(cur<pr){
                if(isdec == false){
                    System.out.println("false");
                	return;
                }
            }
            else{
                if(isdec == true){
                    isdec = false;
                }
            }
            pr = cur;
        }
        System.out.println("true");

	}

}
