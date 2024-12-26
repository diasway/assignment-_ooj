import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
       File file = new File("src/students.txt");
       Scanner scanner = new Scanner(file);
       School school = new School();
        while (scanner.hasNextLine()){
            Student student = new Student();
            student.setName(scanner.next());
            student.setSurname(scanner.next());
            student.setAge(Integer.parseInt(scanner.next()));
            student.setGender(scanner.next());
            while (scanner.hasNextInt()) {
                student.addGrade(Integer.parseInt(scanner.next()));
            }
            school.addMember(student);
        }
        file = new File("src/teachers.txt");
        Scanner tscanner = new Scanner(file);
        while (tscanner.hasNextLine()){
            Teacher teacher = new Teacher();
            teacher.setName(tscanner.next());
            teacher.setSurname(tscanner.next());
            teacher.setAge(Integer.parseInt(tscanner.next()));
            teacher.setGender(tscanner.next());
            teacher.setSubject(tscanner.next());
            teacher.setYearsOfExperience(Integer.parseInt(tscanner.next()));
            teacher.setSalary(Integer.parseInt(tscanner.next()));
            teacher.giveRaise(10);
            school.addMember(teacher);
        }
        System.out.println(school.toString());
    }
}