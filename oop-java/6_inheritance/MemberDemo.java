class Member {
    String Name;
    int Age;
    long Phone_Number;
    String Address;
    long Salary;


    Member(String Name, int Age, long Phone_Number, String Address, long Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
        this.Salary = Salary;
    }

    void print() {
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Phone Number : " + Phone_Number);
        System.out.println("Address : " + Address);
    }

    void printSalary() {
        System.out.println("salary : " + Salary);
    }
}

class Employee extends Member {

    String specialization;


    Employee(String Name, int Age, long Phone_Number, String Address, long Salary, String specialization) {
        super(Name, Age, Phone_Number, Address, Salary);
        this.specialization = specialization;
    }

    void displayEmployeeDetails() {
        System.out.println("Details Of Employee");
        print();
        System.out.println("specialization = "+specialization);
        System.out.println();
    }

}

class Manager extends Member {
    String department;

    Manager(String Name, int Age, long Phone_Number, String Address, long Salary,String department){
        super(Name, Age, Phone_Number, Address, Salary);
        this.department=department;
    }

    void displayManagerDetails(){
        System.out.println("Details Of Manager");
        print();
        System.out.println("department = "+department);
        System.out.println();
    }
}


public class MemberDemo {
    public static void main(String[] args) {
            Employee e1 = new Employee("Yash",17,942829,"du",10,"core java");
            Manager m1 = new Manager("Yash",17,942829,"mu",100000,"soe");
            e1.displayEmployeeDetails();
            m1.displayManagerDetails();

    }
}