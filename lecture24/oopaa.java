package lecture24;
class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newschool";
    }
}
public class oopaa {
    public static void main(String[] args) {
        Student.school = "ABC";
        Student student1 = new Student();
        student1.name = "tony";
        System.out.println(student1.school);
    }
}
