package lsp;

import java.util.ArrayList;
import java.util.List;


interface Employee
{
    int getMinimumSalary();
}

interface EmployeeBonus
{
    int calculateBonus(int salary);
}
 abstract class Employees implements Employee,EmployeeBonus{
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employees() {
    }

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract int calculateBonus(int salary);
    public abstract int getMinimumSalary();

}

 class PermanentEmployee extends Employees {
    public PermanentEmployee()
    { }

    public PermanentEmployee(int id, String name)
    { }

    @Override
    public int calculateBonus(int salary) {
        return (int) (salary*.02);
    }

    @Override
    public int getMinimumSalary() {
        return 10000;
    }
}

  class TemporaryEmployee extends Employees
{
    public TemporaryEmployee()
    { }

    public TemporaryEmployee(int id, String name)
    { }

    @Override
    public int calculateBonus(int salary) {
        return (int) (salary*.01);
    }

    @Override
    public int getMinimumSalary() {
        return 2000;
    }
}

 class ContractEmployee implements Employee {
     public ContractEmployee() {
     }

     public ContractEmployee(int id, String name) {
     }

     @Override
     public int getMinimumSalary() {
         return 1000;
     }
 }
public class lspdemo {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new PermanentEmployee(1, "John"));
        employees.add(new TemporaryEmployee(2, "Jason"));
        //Un Comment to see the error
        //employees.Add(new ContractEmployee(3, "Mike"));


        for (Employees employee : employees) {
            System.out.println(employee.calculateBonus(100000));
            System.out.println(employee.getMinimumSalary());
        }


        List<Employee> employeesOnly = new ArrayList<>();

        employeesOnly.add(new PermanentEmployee(1, "John"));
        employeesOnly.add(new TemporaryEmployee(2, "Jason"));
        employeesOnly.add(new ContractEmployee(3, "Mike"));

        for (Employee employee : employees) {
            System.out.println(employee.getMinimumSalary());
        }


    }
}