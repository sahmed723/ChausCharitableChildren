package edu.gatech.oad.antlab.person;
/**
 *  A simple class for person 3
 *  returns their name and a
<<<<<<< HEAD
 *  reversed string 
 *  
 *  @author  Bob
 *  @version 1.1
 */
public class Person3 {
   /** Holds the persons real name */  
	private String name;
	
=======
 *  reversed string
 *
 *  @author  Shafay Ahmed
 *  @version 1.1
 */
public class Person3 {
   /** Holds the persons real name */
	private String name;

>>>>>>> master
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person3(String pname){
	  name = pname;
	}
<<<<<<< HEAD
	
=======

>>>>>>> master
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
<<<<<<< HEAD
	 * @return the string representing the 
=======
	 * @return the string representing the
>>>>>>> master
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
<<<<<<< HEAD
	
=======

>>>>>>> master
	/**
	 * This method should take the string
	 * input and return its reverse.
	 * given "gtg123b" it should return
	 * b321gtg.
	 *
	 * @param input the string to be reversed
	 * @return the reversed string
	 */
	private String calc(String input) {
	  //Person 3 put your implementation here
<<<<<<< HEAD
=======
		int size = input.length();
		String revString = "";
		for (int i = 0;i < size;i++) {
			revString = input.charat(size);
			size--;
		}
>>>>>>> master
	  return null;
	}
}
