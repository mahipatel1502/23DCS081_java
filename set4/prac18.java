// class member{
//     String name;
//     int age;
//     int phone_number;
//     float salary;
//     String address;
//     member(){}
    
//     // public member(String name , int age , int phone_number, float salary, String address){
//     //     this.name=name;
//     //     this.age=age;
//     //     this.phone_number=phone_number;
//     //     this.salary=salary;
//     //     this.address=address;
//     // }

//     void printSalary(float salary)
//     {
//         System.out.println("salary is :" + salary);
//     }

// }

// class employee extends member{
//     String specialization;
//     employee(){}

//     // public employee(String name , int age , int phone_number, float salary, String address, String sp){
//     //     super(name, age, phone_number, salary, address);
//     //     this.specialization=sp;
//     // }

//     void print_employee(String name , int age , int phone_number,  String address,String sp)
//     {
//         System.out.println("name : " + name);
//         System.out.println("age : " + age);
//         System.out.println("phone number : "+phone_number);
//         System.out.println("address : " + address);
//         System.out.println("specialization : " + sp);
//         printSalary(20000);
//     }
// }


// class manager extends member{
//     String department;
//     manager(){}

//     // public manager(String name , int age , int phone_number, float salary, String address, String dep){
//     //     super(name, age, phone_number, salary, address);
//     //     this.department=dep;
//     // }

//     void print_manager(String name , int age , int phone_number, String address,String dep)
//     {
//         System.out.println("name : " + name);
//         System.out.println("age : " + age);
//         System.out.println("phone number : "+phone_number);
//         System.out.println("address : " + address);
//         System.out.println("department : " + dep);
//         printSalary(400000);

//     }

// }

// public class prac18 {
//     public static void main(String[] args){

//         employee e1 = new employee();
//         e1.print_employee("mahi", 18, 999999, "gujarat", "AIML");

//         manager m1 = new manager();
//         m1.print_manager("madhavi", 30, 77777777, "hadkkhdk", "CSE");

//     }

// }

import java.util.Scanner;

class Member {
    String Name;
    int age;
    long number;
    String address;
    int salary;
    Scanner sc = new Scanner(System.in);
    public void printSalary() {
        System.out.println("the Salary is :" + salary);
    }
    void getdata() {
       
        System.out.print("Enter Name:");
        Name = sc.nextLine();
        System.out.print("Enter Age:");
        age = sc.nextInt();
        System.out.print("Enter Mobile Number:");
        number = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Address:");
        address = sc.nextLine();
        System.out.print("Enter Salary : ");
        salary = sc.nextInt();
        sc.nextLine();

    }
    void putdata() {

        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + number);
        System.out.println("Address: " + address);
    }
}

class Employee extends Member {

    String specialization;

    void getsp() {
        System.out.print("Enter Specialzation : ");
        specialization = sc.nextLine();
    }

    void putsp() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {

    String department;

    void getdepartment() {

        System.out.print("Enter Department:");
        department = sc.nextLine();
    }

    void putdepartment() {

        System.out.println("Department: " + department);
    }
}

public class prac18 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Manager M1 = new Manager();

        System.out.println("enter Employee Details: ");
        e1.getdata();
        e1.getsp();
        System.out.println("Enter Manager Details: ");
        M1.getdata();
        M1.getdepartment();

        System.out.println("Given details are:");
        System.out.println("employee details -->");
        e1.putdata();
        e1.printSalary();
        e1.putsp();
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("Manager details -->");
        M1.putdata();
        M1.printSalary();
        M1.putdepartment();
        System.out.println("-------------------------");

        System.out.println("23DCS081 Mahi Patel");
    }
}
