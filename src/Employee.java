public class Employee {
    String firstName;
    String lastName;
    String title;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String firstName, String lastName, String title, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void  print() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Должность: " + title);
        System.out.println("email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
