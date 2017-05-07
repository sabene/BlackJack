// NOTES:  10-jack, 11- queen, 12- king,  0-Ace, 1-2, 2-3, etc. 
import java.util.*;
import javafoundations.*;
public class Card {
  private int faceValue; 
  private String suit;
  private boolean isBlack;
  public Card(int fv, String s){
    faceValue = fv;
    isBlack = false;
    suit = s;
  }
  public int getFaceValue(){
    return faceValue;
  }
  public String getSuit(){
    return suit;
  }
  public boolean getIsBlack(){
    return isBlack;
  }
  public void setIsBlack(boolean b){
    isBlack = b;
  }
  public void setFaceValue(int val){
    faceValue = val;
  }
  public void setSuit(String s){
    suit = s;
  }
  @Override
  public String toString(){
    String color = "Black";
    if(isBlack) color = "Red";
    return ("Value: " + faceValue + "\nSuit: " + suit+ "\nColor: " + color);
  }
  public static void main(String[] args){
    Card s = new Card(10, "Hearts");
    System.out.println(s);
    
  }
} 
