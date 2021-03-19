import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import static java.lang.System.exit;
interface employment_details{
      void add(String name,int age, String desg);
      void print();
      void setSalary(String desg,int i);
        }
public class Employee_Man_Sid extends Exception implements employment_details {
    static String [] fullname = new String[20];
    static int [] tage = new int[20];
    static String [] designation = new String[20];
    static int [] salary = new int[20];
    static int i = 0;
    Employee_Man_Sid(){ }
    Employee_Man_Sid(String str){
        super(str);
    }
    @Override
    public void setSalary(String desg,int i){
        if(desg.equals("programmer") || desg.equals("Programmer") ){
            salary[i] = 20000;
        }
        else if(desg.equals("manager") || desg.equals("Manager")){
            salary[i] = 30000;
        }
        else{
            salary[i] = 25000;
        }
    }
    @Override
    public void add(String name, int age, String desg){
        try {
            if(i<9){
                System.out.println(i);
                fullname[i] = name;
                tage[i] = age;
                designation[i] = desg;
                setSalary(desg, i);
                i++;
            }
            else {
                Employee_Man_Sid m4 = new Employee_Man_Sid("Count exceeded");
                throw  m4;
            }
        }
        catch (Employee_Man_Sid m1){
            m1.printStackTrace();
        }
    }
    @Override
    public void print(){
        System.out.println("Name\tAge\tDesignation\tSalary");
        for(int j=0; j < i; j++) {
            System.out.println(fullname[j]+"\t\t"+tage[j]+"\t\t"+designation[j]+"\t\t"+salary[j]);
        }
    }
    public static void main(String[] args) {
        while(true) {
            System.out.println("----------------------------\n" +
                    "Employee Management System\n" +
                    "1.Create Employee\n" +
                    "2.Display Employee Details\n" +
                    "3.Raise Salary\n" +
                    "4.Exit\n" +
                    "Choose from above options\n");
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            Employee_Man_Sid m = new Employee_Man_Sid();
            //StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    while (true) {
                        try {
                        System.out.print("Enter your name:");
                        String name = br.readLine();
                        int space = name.length() - name.replaceAll(" ","").length();
                       //System.out.println(space);
                            if(space>2){
                                Employee_Man_Sid m2 = new Employee_Man_Sid("Exceeding whitespace limit! Only upto 2");
                                throw  m2;
                            }
                            if(!name.matches("^[a-z A-Z]")){
                                Employee_Man_Sid m5 = new Employee_Man_Sid("Containing digits or special character! Invalid input");
                                throw m5;
                            }
                        int age;
                            System.out.println("Enter your age:");
                            age = sc.nextInt();
                            if(age<18 || age>60){
                                Employee_Man_Sid m2 = new Employee_Man_Sid("Incorrect Age! Please type correct age between 18 and 60");
                                throw m2;
                            }
                        System.out.println("Enter the designation:(Programmer/Tester/Manager)");
                        String desg = sc.next();
                            if (desg.equals("programmer") || desg.equals("tester") || desg.equals("manager")
                                    || desg.equals("Programmer") || desg.equals("Tester") || desg.equals("Manager")) {
                                m.add(name,age, desg);
                                System.out.println("If you wish not to continue please enter no");
                                String mn = sc.next();
                                //m.print();
                                if (mn.equals("no")) {
                                    break;
                                }
                            } else {
                                Employee_Man_Sid m1 = new Employee_Man_Sid("Incorrect Designation");
                                throw m1;
                                //System.out.println("Please enter the correct designation");
                            }
                        }
                        catch (Employee_Man_Sid | IOException m1){
                            m1.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    m.print();
                    break;
                case 4:
                    exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + options);
                   // continue;
            }
        }
    }
}