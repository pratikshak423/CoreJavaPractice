/*Create a Student Class
Problem Statement:
Design a Student class with the following properties:

name (String)
rollNumber (int)
marks (float)
Methods:

A constructor to initialize the properties.
A method displayDetails() to print the student's details.
In the main method:

Create three Student objects with different properties.
Call the displayDetails() method for all objects.
Expected Output:

yaml
Copy code
Student 1:
Name: Alice
Roll Number: 101
Marks: 89.5

Student 2:
Name: Bob
Roll Number: 102
Marks: 76.4

Student 3:
Name: Charlie
Roll Number: 103
Marks: 91.2 */

class Student{
    
    String name; 
    int rollNumber; 
    float marks; 

     Student( String name, int rollNumber, float marks){
        this.name=name; 
        this.rollNumber=rollNumber; 
        this.marks=marks;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
    }

}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 89.5f);
        Student s2 = new Student("Bob", 102, 76.4f);
        Student s3 = new Student("Charlie", 103, 91.2f);

        System.out.println("Student 1:");
        s1.displayDetails();
        System.out.println();
        System.out.println("Student 2:");
        s2.displayDetails();
        System.out.println();
        System.out.println("Student 3:");
        s3.displayDetails();
        
    }
    
}
