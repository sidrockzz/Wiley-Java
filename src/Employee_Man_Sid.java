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
    static HashMap<Integer,String> employee = new HashMap<Integer,String>(20);
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
                //employee.put(i,name);
                //System.out.println(i);
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
    public static void main(String[] args) throws IOException {
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
            String options = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                options = sc.next();
                if (!String.valueOf(options).matches("^[0-9]") || options.equals(" ")) {
                    throw new InputMismatchException("Incorrect Options Use only numbers");
                }
            }
                catch(Exception e){
                    System.out.println("Invalid option please give correct value");
                }
            String name = "";
            boolean t = true;
                switch (options) {
                    case "1":
                        while (t) {
                            while (true) {
                                try {
                                    System.out.println("Enter your name:");
                                    name = br.readLine();
                                    if (name.matches("^\\s+.*") || name.matches("^\\s+.\\s")) {
                                        Employee_Man_Sid m7 = new Employee_Man_Sid("You have entered space at the beginning please renter the name again!");
                                        throw m7;
                                    }
                                    int wordslength = name.trim().split("\\s+").length;
                                    int space = name.length() - name.replaceAll(" ", "").length();
                                    if(wordslength ==1 && space == 3){
                                        Employee_Man_Sid m1 = new Employee_Man_Sid("You have entered one words and three spaces");
                                        throw m1;
                                    }
                                    if(wordslength == 2 && space == 3){
                                        Employee_Man_Sid m2 = new Employee_Man_Sid("You have entered two words and three spaces");
                                        throw m2;
                                    }
                                    if (wordslength == 2 && space == 2){
                                        Employee_Man_Sid m6 = new Employee_Man_Sid("You have entered two words and two spaces");
                                        throw m6;
                                    }
                                    //System.out.println(space);
                                    if (space > 2) {
                                        Employee_Man_Sid m2 = new Employee_Man_Sid("Exceeding whitespace limit! Only upto 2");
                                        throw m2;
                                    }
                                    if (name.matches("^[a-z A-Z]*")) {
                                        break;
                                    } else {
                                        Employee_Man_Sid m5 = new Employee_Man_Sid("Containing digits or special character! Invalid input");
                                        throw m5;
                                    }
                                } catch (Employee_Man_Sid | IOException | InputMismatchException m1) {
                                    m1.printStackTrace();
                                }
                            }
                            int age = 0;
                            while (true) {
                                try {
                                    System.out.println("Enter your age:");
                                    age = sc.nextInt();
                                    if (age < 18 || age > 60) {
                                        Employee_Man_Sid m2 = new Employee_Man_Sid("Incorrect Age! Please type correct age between 18 and 60");
                                        throw m2;
                                    }
                                    break;
                                } catch (Employee_Man_Sid m1) {
                                    System.out.println(m1);
                                } catch (InputMismatchException m5) {
                                    System.out.println("You have given something other than numbers! Please enter again!");
                                    sc.next();
                                }
                            }
                            String desg = "";
                            while (true) {
                                try {
                                    System.out.println("Enter the designation:(Programmer/Tester/Manager)");
                                    desg = br.readLine();
                                    if (desg.equals("programmer") || desg.equals("tester") || desg.equals("manager")
                                            || desg.equals("Programmer") || desg.equals("Tester") || desg.equals("Manager")) {
                                        m.add(name, age, desg);
                                        System.out.println("If you wish not to continue please enter no");
                                        String mn = sc.next();
                                        //m.print();
                                        if (mn.equals("no")) {
                                            t = false;
                                            break;
                                        }
                                        //System.out.println("Please enter the correct designation");
                                    } else {
                                        Employee_Man_Sid m1 = new Employee_Man_Sid("Incorrect Designation");
                                        throw m1;
                                    }break;
                                } catch (Employee_Man_Sid | InputMismatchException m1) {
                                    System.out.println(m1);
                                }
                            }
                        }break;
                    case "2":
                        m.print();
                        break;
                    case "3":

                    case "4":
                        exit(0);
                }
        }
    }
}