// to call the method  print() of class School first and then call print() method of class Student.

// This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question21{ 
    public static void main(String args[]){
// Create an object of class Student
School ob= new School() ;
// Call 'print()' method of class Student 
ob.print();
// Create an object of class School
Student obj=new Student() ;
// Call 'print()' method of class School
obj.print();
    }
}
