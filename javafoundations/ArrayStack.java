//********************************************************************
//  ArrayStack.java       Java Foundations
//
//  Represents an array implementation of a stack. The bottom of
//  the stack is kept at array index 0. So, pushing and popping happens at the higher 
//  end of the underlying array.
//********************************************************************

package javafoundations;
import java.util.*;

import javafoundations.exceptions.*;

public class ArrayStack<T> implements Stack<T>
{
   private final int DEFAULT_CAPACITY = 10; //keep it small for testing purposes
   private int count; //num of elements in the array
   private T[] array; //array to hold the elements

   //-----------------------------------------------------------------
   //  Creates an empty stack using the default capacity.
   //-----------------------------------------------------------------
   public ArrayStack()
   {
      count = 0;
      array = (T[])(new Object[DEFAULT_CAPACITY]);
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the top of this stack, expanding
   //  the capacity of the stack array if necessary.
   //-----------------------------------------------------------------
   public void push (T element)
   {
      if (count == array.length)
         expandCapacity();

      array[count] = element;
      count++;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this stack.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "<top of stack>\n";

      for (int index=count-1; index >= 0; index--)
         result += array[index] + "\n";

      return result + "<bottom of stack>";
   }
   
   public T pop() throws EmptyCollectionException
   {
     if (count == 0)
     {
        throw new EmptyCollectionException("Can't pop here! There's nothing on the stack!");
     }
       count--;
       
       return array[count];
     
   }


   //-----------------------------------------------------------------
   //  The following methods are left as Programming Projects.
   //-----------------------------------------------------------------
   
    public T peek () throws EmptyCollectionException { 
      if (count == 0)
     {
        throw new EmptyCollectionException("Can't peek here! Empty stack!");
     }
      return array[count-1];
      }
    
    
    public boolean isEmpty() {
      return (count== 0);
    }
    
    
    
   public int size() {
     return count;
   }
   
   
   public void expandCapacity(){
     T[] newArray = (T[]) (new Object[array.length * 2]);
    for(int index = 0; index < array.length; index++)
      newArray[index] = array[index];
    
    array = newArray;
    

     
     
   }
   
   public static void main(String []args){
     

   
   
   }
   
}