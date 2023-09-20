package lecture24;
 class Pen{
        String color;
        String type;
    
        public void write() {
            System.out.println("writing something");
    
        }
        public void printColor() {
            System.out.println(this.color); // this is used for which function has called it
        }
    }
    
    class Student {
        String name;
        int age;
    
        public void printInfo(String name) {
           System.out.println(name);
        }

        public void printInfo(int age) {
            System.out.println(age);
        }

        public void printInfo(String name, int age) {
            System.out.println(name + " " + age);
        }
        
    }
public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
    s1.name = "aman";
    s1.age = 24;

    s1.printInfo(s1.age);
    }
}
