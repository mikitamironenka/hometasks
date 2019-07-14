package by.mironenka.classes;

//Создать классы, спецификации которых приведены ниже.
//Определить конструкторы и методы setТип(), getТип(), toString().
//Определить дополнительно методы в классе, создающем массив объектов.
//Задать критерий выбора данных и вывести эти данные на консоль.
//В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.

import java.util.Date;
import java.util.Objects;

/**
 * Class describes student
 */
public class Student {

    private static int idCounter;
    private int id;
    private String surname;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;


    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * Constructor
     * @param surname
     * @param name
     * @param patronymic
     */
    public Student(String surname, String name, String patronymic) {
        this.id = createID();
        this.surname = surname;
        this.name = name;
        this.lastName = patronymic;
    }

    /**
     * Constructor
     * @param surname
     * @param name
     * @param patronymic
     * @param dateOfBirth
     * @param address
     * @param phoneNumber
     * @param faculty
     * @param course
     * @param group
     */
    public Student(String surname, String name, String patronymic, Date dateOfBirth, String address, String phoneNumber, String faculty, int course, String group) {
        this.id = createID();
        this.surname = surname;
        this.name = name;
        this.lastName = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Increment id
     * @return
     */
    private static synchronized int createID()
    {
        return idCounter++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth: " + dateOfBirth.getDay() + "." + dateOfBirth.getMonth() + "." + dateOfBirth.getYear() +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                phoneNumber == student.phoneNumber &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, lastName, phoneNumber);
    }
}
