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
    
        public void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public class oops1 {
        public static void main(String[] args) {
           Student s1 = new Student("aman", 24);
           s1.printInfo();
        }
    }
    

