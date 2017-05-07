  /**
   * Hand will hold the methods that the Player class and the Computer class have in common, 
   * acting as a parent class. Its methods are: hit(), stay(), bust(), twentyOne(), totalValue() and aceDetermination() 
   * to decide whether an ace should be evaluated at 1 or 11. It will also hold a hand of cards in a vector 
   * so that the size of the hand can be dynamic. 
   */
import java.util.*;
import javafoundations.*;

public class Hand {
  
  Vector<Card> cardHand = new Vector<Card>();
  Deck deck = new Deck();
  
  public Hand(){
    
  }
  // one hit 
  public void hit(){
    if(deck.size() > 0){
      cardHand.add(deck.removeOneCard());
    }
    else{
      deck.newDeck();
    }
  }
  // Draw 2 cards for first turn 
  public void draw(){
    hit();
    hit();
  }
  // 
  
  
  
}