// program to show the class declaration 
// Class Declaration 
public class Student
{
    // Instance Variables
    String name;
    int roll_no;
   
    // Constructor Declaration of Class
    public Student(String name, int roll_no)
    {
        this.name = name;
        this.age = age;
    }
   
    // method 1
    public String getName()
    {
        return name;
    }
    public int getRoll_no()
    {
        return roll_no;
    }
  
    public static void main(String[] args)
    {
        // creating object using new operator i.e constructor
        Student s1 = new Student("John",2);
        
        System.out.println(s1.getName());
        System.out.println(s1.getRoll_no());
    }
}