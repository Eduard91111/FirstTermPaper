public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("ФИО", 1, 31000f);
        empl[1] = new Employee("ФИО", 2, 32500f);
        empl[2] = new Employee("ФИО", 3, 25000f);
        empl[3] = new Employee("ФИО", 4, 29000f);
        empl[4] = new Employee("ФИО", 5, 50000f);
        empl[5] = new Employee("ФИО", 6, 80000f);
        empl[6] = new Employee("ФИО", 7, 120000f);
        empl[7] = new Employee("ФИО", 8, 20000f);
        empl[8] = new Employee("ФИО", 9, 48000f);
        empl[9] = new Employee("ФИО", 10, 52000f);
        for (Employee e : empl) {
            System.out.println(e);
        }
    }
}