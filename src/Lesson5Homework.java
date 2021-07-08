public class Lesson5Homework {
    public static void main(String[] args) {
        //Home work #5
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Петр", "Петров", "младший инженер", "petr.petrov@abc.com","223322", 200, 20);
        employees[1] = new Employee("Иван", "Иванов", "старший инженер", "ivan.ivanov@abc.com","223322", 300, 30);
        employees[2] = new Employee("Андрей", "Кузнецов", "ведущий инженер", "andrey.kuznetsov@abc.com","223322", 400, 35);
        employees[3] = new Employee("Дмитрий", "Сидоров", "главный инженер", "dmitry.sidirov@abc.com","223322", 500, 45);
        employees[4] = new Employee("Леонид", "Марков", "начальник отдела", "leonid.markov@abc.com","223322", 600, 50);

        for (int i = 0; i < 5; i++) {
            if (employees[i].age > 0) {
                employees[i].print();
            }
        }
    }
}
