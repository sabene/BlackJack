//********************************************************************
//  LinkedStack.java       Java Foundations
//
//  Represents a linked implementation of a stack.
// Modified By: Sabene Pleasant 
// Assn. 5 Task 1
//********************************************************************

package javafoundations;

import javafoundations.exceptions.*;

public class LinkedStack<T> implements Stack<T>
{
   private int count;
   private LinearNode<T> top;

   //-----------------------------------------------------------------
   //  Creates an empty stack using the default capacity.
   //-----------------------------------------------------------------
   public LinkedStack()
   {
      count = 0;
      top = null;
   }

   //-----------------------------------------------------------------
   //  Removes the element at the top of this stack and returns a
   //  reference to it. Throws an EmptyCollectionException if the
   //  stack contains no elements.
   //-----------------------------------------------------------------
   public T pop() throws EmptyCollectionException
   {
      if (count == 0)
         throw new EmptyCollectionException ("Pop operation failed. "
            + "The stack is empty.");

      T result = top.getElement();
      top = top.getNext();
      count--;

      return result;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this stack.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "<top of stack>\n";
      LinearNode current = top;

      while (current != null)
      {
         result += current.getElement() + "\n";
         current = current.getNext();
      }

      return result + "<bottom of stack>";
   }

   //-----------------------------------------------------------------
   //  The following methods are left as Programming Projects.
   //-----------------------------------------------------------------
   
   // Add elements to linkedlist 
   public void push (T element ) { 
     // Initializes first element in linked list 
      if (top == null){
       
        top = new LinearNode<T>(element);
      }
      // All other elements are appeneded to front of linkedlist 
      else{
        
        LinearNode <T> newNode = new LinearNode<T>(element);
        
        newNode.setNext(top);
        
        top = newNode;
      }
      // Increment element count 
      count++;
     
     
   }
    
    // Peek at top element in linkedlist  
    public T peek () throws EmptyCollectionException {
      // 
      if (count == 0){
        throw new EmptyCollectionException("The stack is empty.");
      }
      return top.getElement();
    }
    
    // Returns true if no elements in linkedlist 
    public boolean isEmpty() {
      return count == 0;
    
    }
    
    public int size() { 
      return count;
    
    }
}
