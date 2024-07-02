import java.util.*;
public class WorkerDetail {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]emp_id = {1,2,3,4,5};
        String[]emp_name = {"arsh","virender","bijender","david","ishaan"};
        char[]emp_code = {'e','d','k','b','c'};
        int da=0,base = 0,hra=0;
        int salary = 0;
            System.out.print("Enter employee id 1-5 : ");
            int code = sc.nextInt();
            if (code>5 || code<0) {
                System.out.println("Enter valid id!");
            }
            switch (code){
                case 1:  da = 20000; base=20000; hra=12000;
                    salary = da+hra+base;
                    printInfo(code,emp_id, emp_code,emp_name);
                    System.out.println("Emp Salary : " + salary);
                    break;
                case 2:  da = 15000; base=2030; hra=18000;
                    salary = da+hra+base;
                    printInfo(code,emp_id, emp_code,emp_name);
                    System.out.println("Emp Salary : " + salary);
                    break;
                case 3:  da = 15000; base=20000; hra=1250;
                    salary = da+hra+base;
                    printInfo(code,emp_id, emp_code,emp_name);
                    System.out.println("Emp Salary : " + salary);
                    break;
                case 4:  da = 15000; base=24500; hra=2500;
                    salary = da+hra+base;
                    printInfo(code,emp_id, emp_code,emp_name);
                    System.out.println("Emp Salary : " + salary);
                    break;
                case 5:  da = 15000; base=2505; hra=1200;
                    salary = da+hra+base;
                    printInfo(code,emp_id, emp_code,emp_name);
                    System.out.println("Emp Salary : " + salary);
                    break;
        }

    }

    static void printInfo(int code,int emp_id[],char emp_code[],String emp_name[]){
        System.out.println("Emp Id : " + emp_id[code-1]);
        System.out.println("Emp Code : " + emp_code[code-1]);
        System.out.println("Emp Name : " + emp_name[code-1]);
    }
}
