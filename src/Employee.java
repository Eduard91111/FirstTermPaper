public class Employee {
    private String FIO;
    private int Department;
    private float Salary;
    private static int Id;
    public Employee(String fio, int department, float salary) {
        this.FIO = fio;
        this.Department = department;
        this.Salary = salary;
        Id = 0;
        Id++;
    }

    public int getId() { return Id; }
    public String getFIO() { return FIO; }
    public int getDepartment() { return Department; }
    public float getSalary() { return Salary; }

    public void SetFIO(String fio) { this.FIO = fio; }
    public void SetDepartment(int department) { this.Department = department; }
    public void SetSalary(float sal) { this.Salary = sal; }

    @Override
    public String toString() {
        return Id++ + " Ф.И.О.: " + FIO + " Отдел: " + Department + " Зарплата: " + Salary;
    }
}
