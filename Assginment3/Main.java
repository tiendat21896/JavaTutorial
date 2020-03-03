package Assginment3;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> student = new PersonModel<>();
        student.addPerson(new Student("01","Huyen",19));
        student.addPerson(new Student("02","Dat",17));
        student.Display();
        PersonModel<Employee> employee = new PersonModel<>();
        employee.addPerson(new Employee("01","Ngaos",690000));
        employee.addPerson(new Employee("02","Muoi",290000));
        employee.Display();
    }
}
