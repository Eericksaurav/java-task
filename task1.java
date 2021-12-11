// program to show the class declaration 
// Class Declaration 

public class Student
{
    // Instance Variables
    String name;
    String address;
    int roll_no;
    double phone_no;
   
    // Constructor Declaration of Class
    public Student(String name, int roll_no, String address, double phone_no)
    {
        this.name = name;
        this.roll_no = roll_no;
        this.address = address;
        this.phone_no = phone_no;
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
    public String getAdderss()
    {
        return address;
    }
    public double getPhone_no()
    {
        return phone_no;
    }
  
    public static void main(String[] args)
    {
        // creating object using new operator i.e constructor
        Student s1 = new Student("John",2,"KTM", 987654321);
        Student s2 = new Student("Sam",3,"BRT",987642211);
        
        System.out.println(s1.getName());
        System.out.println(s1.getRoll_no());
        System.out.println(s1.getAdderss());
        System.out.println(s1.getPhone_no());
        System.out.println(s2.getName());
        System.out.println(s2.getRoll_no());
        System.out.println(s2.getAdderss());
        System.out.println(s2.getPhone_no());
    }
}