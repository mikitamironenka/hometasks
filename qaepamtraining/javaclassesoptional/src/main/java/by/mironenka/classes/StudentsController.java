package by.mironenka.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class for printing student
 */
public class StudentsController {

    /**
     * Print student of certain faculty
     * @param faculty
     * @param students
     * @return
     */
    public static List<Student> studentsOfCertainFaculty(String faculty, Student[] students) {

        List<Student> result = new ArrayList<Student>();
        System.out.println("List of students of a faculty " + faculty);
        for(Student student : students) {
            if(student.getFaculty().toLowerCase().equals(faculty.toLowerCase())) {
                result.add(student);
                System.out.println(student);
            }
        }

        return result;
    }

    /**
     * print student of certain group
     * @param group
     * @param students
     * @return
     */
    public static List<Student> studentsOfCertainGroup(String group, Student[] students) {

        List<Student> result = new ArrayList<Student>();
        System.out.println("List of students of a group " + group);
        for(Student student : students) {
            if(student.getGroup().toLowerCase().equals(group.toLowerCase())) {
                result.add(student);
                System.out.println(student);
            }
        }

        return result;
    }

    /**
     * Print students of certain group and faculty
     * @param faculty
     * @param group
     * @param students
     * @return
     */
    public static List<Student> studentsOfTheCertainFacultyAndGroup(String faculty, String group, Student[] students) {

        List<Student> result = new ArrayList<Student>();
        System.out.println("List of students of a group " + group + " and faculty " + faculty);
        for(Student student : students) {
            if(student.getGroup().toLowerCase().equals(group.toLowerCase()) && (student.getFaculty().toLowerCase().equals(faculty.toLowerCase()))) {
                result.add(student);
                System.out.println(student);
            }
        }

        return result;
    }


    /**
     * Find students that were born after the year
     * @param year
     * @param students
     * @return
     */
    public static List<Student> studentsThatWereBornAfterYear(int year, Student[] students) {

        List<Student> result = new ArrayList<Student>();
        System.out.println("List of students that were born after " + year + " year");
        for(Student student : students) {
            if(student.getDateOfBirth().getYear() > year) {
                result.add(student);
                System.out.println(student);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Student[] students = new Student[12];

        students[0] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2012, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Radio", 1,"BR11");
        students[1] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2012, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Radio", 2,"BR11");
        students[2] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2011, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Radio", 2,"BR11");
        students[3] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2011, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Radio", 2,"BR21");
        students[4] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2011, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Electro", 3,"E31");
        students[5] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2009, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Electro", 2,"E21");
        students[6] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2008, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Electro", 4,"E41");
        students[7] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2007, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Electro", 5,"E51");
        students[8] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2007, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Electro", 5,"E51");
        students[9] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2007, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Economy", 2,"Ec21");
        students[10] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2011, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Economy", 2,"Ec21");
        students[11] = new Student("Ivanov", "Ivan", "Ivanovich", new Date(2010, 11, 25),
                "Sovetskay 120/55", "80290000001",  "Economy", 1,"Ec11");


        StudentsController.studentsOfCertainFaculty("Electro", students);
        StudentsController.studentsOfTheCertainFacultyAndGroup("Electro", "E51" , students);
        StudentsController.studentsOfCertainGroup("BR11", students);
        StudentsController.studentsThatWereBornAfterYear(2010, students);
    }
}
