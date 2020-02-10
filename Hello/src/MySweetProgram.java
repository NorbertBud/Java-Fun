import java.util.Scanner;

public class MySweetProgram {//class-identifier

	public static void main(String[] args) { //methods
		System.out.println("Hello, what is your name?: ");//statement
		
		//type identifier = new type();
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("hello "+name);
		
		String string = new String("Im a string");
		System.out.println(string + " :) ");
		
		int x = 5; //primitive
		Integer y = 5; //object (5 is autoboxed)
		
		System.out.println(x);
		System.out.println(y);
		
		

	}
}

//primitive types 
//objects - instance of a class(class the data type)


//statically typed = variables are given data types up front
//dynamically typed = variables do not have types


//literals - the value such as "I'm a STRING" 

//Variable - stores some value
//Expression - evaluates to a value
//operator - work on operands to produce a value
//operand - the thing(s) the operator works on ( variable ->+<- "")

//Comment
//Class - contains everything - has members
//Methods - do something 
//argument - what you pass to a method (part of calling)
//parameter - Variables to store arguments (part of definition
//statements -telling the 
//properties - store something


//access modifier (public) - Who can use?
//static - No instance of class is needed
//object - instance of a class