
    public class Employee {

        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee (String name, String position, String email, String phone, int salary, int age) {


            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void printSotrInfo() {
            System.out.println("ФИО:" + name);
            System.out.println("; Должность:" + position);
            System.out.println("; e-mail:" + email);
            System.out.println("; Телефон:" + phone);
            System.out.println("; Зарплата" + salary);
            System.out.println("; Возраст" + age);
        }

        public static void main(String[] args) {
            Employee [] persArr =  {
                new Employee("Ivanov Ivan", "Engineer", "111@mailbox.com", "89994448866", 45000, 30),
                new Employee("Ivanov Petr", "Engineer", "22@mailbox.com", "89884448866", 45000, 32),
                new Employee("Sidorov Inan", "Engineer", "33@mailbox.com", "89774448866", 45000, 35),
                new Employee("Sidorov Petr", "Engineer", "44@mailbox.com", "89664448866", 45000, 40),
                new Employee("Sidorova Anna", "Engineer", "55@mailbox.com", "89554448866", 45000, 42)
            };

            for (Employee employee : persArr){
                Employee.printSotrInfo();
            }

        }
    }











