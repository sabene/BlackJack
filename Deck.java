// i made this a vector bc im on my phone and dont //have linkedQueue/any queue implementations
import java.util.*;
import javafoundations.*;
public class Deck {
  LinkedQueue <Card> deck;
  private final int DECK_SIZE = 52;
  private String [] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
  
  public Deck() {
    deck = new LinkedQueue<Card>();
    newDeck();
  
    //System.out.println(deck);
  }
  public void newDeck(){
    if(deck.size() > 0){
      deck = new LinkedQueue<Card>();
    }
      for (int i =0; i < DECK_SIZE/4; i++){
      for(int j=0; j < suits.length; j++){
        if(suits[j].equals("Diamonds") || suits[j].equals("Spades")){
          Card tmp = new Card(i,suits[j]);
          tmp.setIsBlack(true);
          deck.enqueue(tmp);
        }
        else{
        deck.enqueue(new Card(i, suits[j]));
        }
      }
    }
    shuffleDeck();
  }
  public Card removeOneCard(){
    return deck.dequeue();
  }
  public int size(){
    return deck.size();
  }
  private void shuffleDeck(){
    ArrayList <Card> cards = new ArrayList<Card>(); 
    int count = deck.size();
    for(int i =0; i < count; i++){
      cards.add(deck.dequeue());
    }
    Collections.shuffle(cards);
    int count2 = cards.size();
    for(int i = count2-1; i >= 0 ; i--){
      deck.enqueue(cards.remove(i));
    }
    
  }
  public String toString(){
    return deck.toString();
  }
// hi Testing Testing Testing 
  public static void main(String[] args){
    Deck s = new Deck();
    System.out.println(s);
  }
  
}


