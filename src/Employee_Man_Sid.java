import java.util.*;
import static java.lang.System.exit;
interface employment_details{
      void add(String name,int age, String desg);
      void print();
      void setSalary(String desg,int i);
        }
public class Employee_Man_Sid implements employment_details {
    static String [] fullname = new String[20];
    static int [] tage = new int[20];
    static String [] designation = new String[20];
    static int [] salary = new int[20];
    static int i =0;
    @Override
    public void setSalary(String desg,int i){
        if(desg.equals("p")){
            salary[i] = 20000;
        }
        else if(desg.equals("m")){
            salary[i] = 30000;
        }
        else{
            salary[i] = 25000;
        }
    }
    @Override
    public void add(String name, int age, String desg){
        fullname[i]=name;
        tage[i]=age;
        designation[i]=desg;
        setSalary(desg,i);
        i++;
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
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    while (true) {
                        System.out.println("Enter your name:");
                        String name = sc.next();
                        System.out.println("Enter your age:");
                        int age = sc.nextInt();
                        System.out.println("Enter the designation:(p/t/m)");
                        String desg = sc.next();
                        if(desg.equals("p")||desg.equals("t")||desg.equals("m")){
                            m.add(name, age,desg);
                            System.out.println("If you wish not to continue please enter no");
                            String mn = sc.next();
                            //m.print();
                            if(mn.equals("no")){
                                break;
                            }
                        }
                        else{
                            System.out.println("Please enter the correct designation");
                        }
                    }
                    break;
                case 2:
                    m.print();
                    break;
                case 4:
                    exit(0);
                default:
                    System.out.println("Unexpected Value: " + options + "Please type the correct input");
                   // continue;
            }
        }
    }
}