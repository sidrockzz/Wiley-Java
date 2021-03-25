import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import static java.lang.System.exit;

interface employment_details{
      void add(String name,int age, String desg);
      void print();
      void setSalary(String desg);
      void setName(String name);
      void setDesignation(String desg);
      void setAge(int tage);
      boolean checkName(String name);
      void raiseSalary();
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        }
public class Employee_Man_Sid extends Exception implements employment_details {
    static Set<String> full_name = new HashSet<String>();
    static Set<String> ID = new HashSet<String>();
    static ArrayList <Integer> age = new ArrayList<Integer>();
    static Set <String> desgination = new HashSet<String>();
    static ArrayList<Double> salary = new ArrayList<Double>();
    static ArrayList<Set<String>> tempname = new ArrayList<Set<String>>();
    static String company = "wy";
    static int number = 11;
    //static String [] fullname = new String[20];
    //static int [] tage = new int[20];
    //static String [] designation = new String[20];
    //static int [] salary = new int[20];
    static int i = 0;
    Employee_Man_Sid(String str){
        super(str);
    }
    Employee_Man_Sid(){}
    @Override
    public void setSalary(String desg){
        if(desg.equals("programmer") || desg.equals("Programmer") ){
            salary.add(20000.0);
        }
        else if(desg.equals("manager") || desg.equals("Manager")){
            salary.add(30000.0);
        }
        else{
            salary.add(25000.0);
        }
    }

    @Override
    public void setName(String name) {
                full_name.add(name);
                tempname.add(full_name);
                ID.add(company + (number + ID.size()));
    }

    @Override
    public void setDesignation(String desg) {
        desgination.add(desg);
    }

    @Override
    public void setAge(int tage) {
        age.add(tage);
    }

    @Override
    public boolean checkName(String name) {
        if(full_name.contains(name)) return false;
        return true;
    }

    @Override
    public void raiseSalary() {
        String id;
        System.out.println("Enter the employee id you want to raise the salary:");
        boolean flag = true;
        while(flag){
            id = sc.next().trim();
            if(id.length()==4){
                if(id.startsWith(company)){
                    int idx = id.indexOf(id);
                    if(idx!=-1){
                        System.out.println("Chosen employee => "+tempname.get(idx));
                        System.out.println("Amount should be between 5000 to 50,000");
                        int amount;
                        while (true){
                            try{
                                amount = sc.nextInt();
                                if(amount < 5000) {
                                    System.out.println("Amount should be greater than 5000");
                                }else if(amount > 50000) {
                                    System.out.println("Amount should be less than 50,000");
                                }else {
                                    salary.set(idx, salary.get(idx)+amount);
                                    System.out.println("Salary raised to employee id = "+id);
                                    System.out.println("New salary for "+tempname.get(idx)+" = "+salary.get(idx));
                                    sc.nextLine();
                                    flag=false;
                                    break;
                                }
                            }
                            catch(InputMismatchException e) {
                                System.out.println("Please enter only integer numbers");
                                sc.nextLine();
                            }
                        }
                    }else {
                        System.out.println("Employee id not found!");
                        System.out.println("Please enter the employee id from list of employee id's:");
                    }
                }else {
                    System.out.println("Invalid Employee id!");
                    System.out.println("Please enter the valid employee id:");
                }
            }else {
                System.out.println("Employee id should have 4 characters!");
                System.out.println("Please enter the employee id:");
            }
        }
    }

    @Override
    public void add(String name, int age, String desg){
        try {
            if(i<9){
                setName(name);
                setAge(age);
                setDesignation(desg);
                setSalary(desg);
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
        if(ID.size()==0){
            System.out.println("There is no employee details in the system!");
        }else {
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.printf("%10s %30s %20s %20s %20s","Employee ID","Employee Name", "Age", "Designation", "Salary");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------");
            for(int i=ID.size()-1;i>=0;i--){
                List<String> name = new ArrayList<String>(full_name);
                List<String> desg = new ArrayList<String>(desgination);
                List<String> id = new ArrayList<String>(ID);
                System.out.format("%10s %30s %20s %20s %20s", id.get(i),name.get(i),age.get(i),desg.get(i),salary.get(i));
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
        }
        static int i1 =1;
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("----------------------------\n" +
                    "Employee Management System\n" +
                    "1.Create Employee\n" +
                    "2.Display Employee Details\n" +
                    "3.Raise Salary\n" +
                    "4.Exit\n" +
                    "Choose from above options\n");
            //Scanner sc = new Scanner(System.in).useLocale(Locale.US);
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
                                    if (m.checkName(name)) {
                                        if (name.matches("^\\s+.*") || name.matches("^\\s+.\\s")) {
                                            Employee_Man_Sid m7 = new Employee_Man_Sid("You have entered space at the beginning please renter the name again!");
                                            throw m7;
                                        }
                                        int wordslength = name.trim().split("\\s+").length;
                                        int space = name.length() - name.replaceAll(" ", "").length();
                                        if (wordslength == 1 && space == 3) {
                                            Employee_Man_Sid m1 = new Employee_Man_Sid("You have entered one words and three spaces");
                                            throw m1;
                                        }
                                        if (wordslength == 2 && space == 3) {
                                            Employee_Man_Sid m2 = new Employee_Man_Sid("You have entered two words and three spaces");
                                            throw m2;
                                        }
                                        if (wordslength == 2 && space == 2) {
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
                                    }
                                    else {
                                        Employee_Man_Sid s = new Employee_Man_Sid("You have entered a duplicate value please enter again");
                                        throw s;
                                    }
                                }catch(Employee_Man_Sid | IOException | InputMismatchException m1){
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
                        i1 =0;
                        break;
                    case "3":
                        if(i1==1){
                            m.print();
                        }
                        m.raiseSalary();
                        break;
                    case "4":
                        exit(0);
                }
        }
    }
}