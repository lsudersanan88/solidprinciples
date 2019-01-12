package ocp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class Employee {
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

        public Employee() {
        }

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public abstract int calculateBonus(int salary);


    }


  class PermanentEmployee extends Employee {
        public PermanentEmployee()
        { }

        public PermanentEmployee(int id, String name)
        { }

        @Override
        public int calculateBonus(int salary) {
            return (int) (salary*.02);
        }

    }

     class TemporaryEmployee extends Employee
    {
        public TemporaryEmployee()
        { }

        public TemporaryEmployee(int id, String name)
        { }

        @Override
        public int calculateBonus(int salary) {
            return (int) (salary*.01);
        }

    }

class Program
{
   public static void main(String[] args)
    {
        Employee empJohn = new PermanentEmployee(1, "John"  );
        Employee empJason = new TemporaryEmployee(2, "Jason" );
        System.out.println("empJohn "+empJohn.calculateBonus(100000));
        System.out.println("empJason "+empJason.calculateBonus(100000));
    }
}

