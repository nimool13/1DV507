# 1DV507
# Assignment 1 Requirements.
1DV507 , Programming and Data Structures, Spring 2020
Assignment 1: Inheritance and Simple Data Structures
Problems?
Do not hesitate to ask your teaching assistant at the practical meetings (or your teacher at the lectures) if you have any problems. You can also post a question in the assignment forum in Moodle.

Prepare Eclipse/IntelliJ for course 1DV507 and Assignment 1
Start by creating a new Java project named 1DV507. Then create a new package with the name YourLnuUserName_assign1 inside the Java project 1DV507 and save all program files for this assignment inside that package. Later on, when submitting your assignment, you should submit a zipped version of this folder/package.

General Assignment Rules
Use English! All documentation, names of variables, methods, classes, and user instructions, should be in English.
Each exercise involving more than one class should be in a separate package with a suitable (English!) name. For example, in Exercise 1, create a new sub package named shape inside your package YourLnuUserName_assign1 and save all .java files related to that exercise inside this package.
All programs asking the user to provide some input should check that the user input is correct and take appropriate actions if it is not.
Submission
We are only interested in your .java files and please notice that the VG exercises 6 is not mandatory. You should always submit everything needed to compile and run your code. That is, apart from .java files, figures that might be used in the JavaFX exercises (assignment 2 and 3) and maybe some external libraries (.jar files).
Each student submit their assignments by creating a git release (one for each assignment) in their repository at the time of the deadline. Instructions related to GitLab will be published in Moodle.
Lecture 1 and 2 - Inheritance, Interfaces and Abstract Classes
Exercise 1
The is an inheritance exercise involving four classes: Shape, Rectangle, Square, and Circle. The abstract superclass Shape is specified below, the design of the other three classes is up to you to decide. Requirements:
Class Shape is an abstract class that looks like this:
public abstract class Shape {
	protected String name;
	
	public Shape(String shapeName) { name = shapeName; }
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override 
	public String toString() {
		DecimalFormat f = new DecimalFormat("##.00");
		String a = f.format( getArea() );
		String p = f.format( getPerimeter() );
		return name+", Area = "+a+", Perimeter = "+p;
	}	
}
Class Rectangle and Circle inherit from Shape, class Square inherits from Rectangle.
A simple demo program ShapeMain
public class ShapeMain {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add( new Rectangle("R1",2,3) );  // base=2, height=3
		shapes.add( new Rectangle("R2",3,4) ); 
		shapes.add( new Square("S1",3) );       // side=3
		shapes.add( new Square("S2",5) );
		shapes.add( new Circle("C1",1) );       // radius=1
		shapes.add( new Circle("C2",2) );
		
		for (Shape s :shapes)  // Print all shapes
			System.out.println(s);
	}
}
should give an output like
R1, Area = 6.00, Perimeter = 10.00
R2, Area = 12.00, Perimeter = 14.00
S1, Area = 9.00, Perimeter = 12.00
S2, Area = 25.00, Perimeter = 20.00
C1, Area = 3.14, Perimeter = 6.28
C2, Area = 12.57, Perimeter = 12.57
Make sure that all classes are properly encapsulated. The short user scenario above uses only a few methods, feel free to add additional methods that you think are appropriate in a more general user scenario.
Exercise 2
A stack is a LiFo (Last-in, first-out) data structure with three basic operations: push, pop and peek. push is putting an element on the top of the stack, pop removes (and returns) the top element, and peek returns (without removing) the top element. Think of a stack as a pile of plates that can be found in sime restaurants. You can only add and remove the top-most plate. You can not remove any plates in the middle of the pile (without first removing all plates above it). Your task is to implement the following stack interface:
public interface StringStack {
   int size(); 			// Current stack size
   boolean isEmpty(); 		// true if stack is empty
   void push(String element); 	// Add element at top of stack
   String pop(); 		// Return and remove top element,
				// exception if stack is empty
   String peek(); 		// Return (without removing) top element,
				// exception if stack is empty.
}

Illegal operations on an empty stack (e.g., pop() and peek()) should generate an exception. The stack should be able to handle an arbitrary number of elements. You should also present a test program StackMain.java that demonstrates how each method can be used. Notice: You are not allowed to use any of the data structures in the Java library. However, you can use arrays.
Exercise 3
In the following exercise you should create a number of classes to solve a problem. The exercise description is rather vague, more of a sketchy scenario than a concrete problem specification. Your task is to create the necessary classes to simulate this scenario. All classes should be properly documented and encapsulated.
Your task is to create a programming system for a ferry. The ferry transports passengers and vehicles (cars, busses, lorries and bicycles). The ferry has space for 200 passengers and 40 cars. A lorry needs as much space as two busses or 8 cars. A car needs as much space as 5 bicycles. There are different fees for different vehicles and an extra fee might be added for passengers. Use the following fees:

Passenger without vehicle, 25 kr.
Bicycle 40 kr (passenger included).
Car 100 kr + 20 kr/passenger (maximum 4 passengers).
Bus 200 kr + 15 kr/ passenger (maximum 20 passengers).
Lorry 300 kr + 20 kr/ passenger (maximum 2 passengers).
Each type of vehicle (car, bus, lorry, bicycle) will inherit from the class Vehicle. The functionality of the ferry is given by the interface Ferry :
public interface Ferry  {
   int countPassengers();             // Number of passengers on board
   int countVehicleSpace();           // Correctly rounded off vehicle space. One car is 1
   int countMoney();                  // Earned money
   Vehicle[] getAllVehicles();        // An array containing all embarked vehicles   
   void embark(Vehicle v);            // Embark vehicle, exception if not enough space
   void embark(Passenger p);          // Embark passenger, exception if not enough room
   void disembark();                  // Clear (empty) ferry. The money earned remains, 
                                      // i.e., is not reset to zero 
   boolean hasSpaceFor(Vehicle v);    // true if we can embark vehicle v
   boolean hasRoomFor(Passenger p);   // true if we can embark passenger p
   String toString();                 // Nice looking ferry status print out

}
A vehicle cannot leave the ferry until the ferry has been disembarked and the same vehicle cannot embark twice. Also write a program FerryMain.java embarking a number of vehicles and passengers, showing the functionality of the methods.
Lecture 3 - Simple Data Structures
Exercise 4
The zipped directory int_collection.zip contains an abstract class AbstractIntCollection and two interfaces IntList and IntStack. The abtract class contains support for developing array-based data structures. The two interfaces define the functionality of an integer list and an integer stack. Your task is to implement the two interfaces by inheriting the support provided by the abstract class and by adding the code required for each individual data structure. That is, provide two classes ArrayIntList and ArrayIntStack with the following signatures.
public class ArrayIntList extends AbstractIntCollection implements IntList

public class ArrayIntStack extends AbstractIntCollection implements IntStack
Additionally, write a program CollectionMain that demonstrates how the two classes can be used.
Notice: The two classes must make use of the abstract class and you are not allowed to make any changes (not a single character) in either the abstract class or the two interfaces apart from changing the package name.
Exercise 5

A Queue is a FIFO (first in, first out) data structure. Consider the following queue interface:
public interface IntQueue extends Iterable<Integer> {  
   public int size();                     // current queue size 
   public boolean isEmpty();              // true if queue is empty 
   public void enqueue(int element);   // add element at end of queue 
   public int dequeue();               // return and remove first element. 
   public int first();                 // return (without removing) first element 
   public int last();                  // return (without removing) last element 
   public String toString();              // return a string representation of the queue content

}
The iterator iterates over all elements of the queue. Operations not allowed on an empty queue shall generate an unchecked exception.

Tasks:
Create a linked implementation LinkedQueue.java of the interface Queue. Use the head-and-tail approach.
Write also a program QueueMain.java showing how all methods work.
Create Javadoc comments in the code and generate good-looking and extensive HTML documentation for the interface and the class. All public class members shall be documented.
Notice:
The implementation shall be linked, i.e. a sequence of linked nodes where each node represents an element.
You are not allowed to use any of the predefined collection classes in the Java library.
In the report, the HTML pages generated by the classes IntQueue and LinkedQueue shall be attached. Attach no other HTML pages!
Exercise 6 (VG Task)
A straight forward array based implementation of the Queue interface above would use an int array (that grows on demand) and two indices first and last to keep track of the array positions where to remove an element on dequeue (return and increase position first), and where to add an element on enqueue (insert at and increase position last). The problem with this approach is that after (say) 100 dequeue we will have that first = 100 and 100 non-used elements (positions 0 to 99) that never will be used again. That is, a waste of memory.
Your task is to provide an array based Queue implementation (ArrayQueue) that avoids this problem by treating the array like a circular structure in which array indices larger than the array size "wrap around'' to the beginning of the array. That is,

When, after a number of enqueues, index last reaches array.length, you should move last to position 0 and start to reuse the first part of the array.
Later on, after an even larger number of dequeues, you will reach the point where index first reaches array.length. Then, move first to position 0 (and you have returned to the initial configuration where all the queue elements are stored between first and last).
Finally, the array is full when last, after one or more "wrap arounds'', reaches first. In that case you should resize the array and restore the order such that first equals 0.



