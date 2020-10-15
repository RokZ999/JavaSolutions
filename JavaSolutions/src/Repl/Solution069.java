package Repl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Solution069 {
	public static void main(final String[] args) {
		Deck deck = new Deck();
		deck.draw();
		deck.shuffle();
		deck.printAll();
		deck.shuffle2();
		deck.printAll();
		Deck deck2 = new Deck();
		deck2.printAll();
	}
}

class Card
{
	String name;
	int value;
	String suit;

	public Card(String name, int value,String suit) {
		this.name = name;
		this.value = value;
		this.suit = suit;
	}
	public Card(String name, String suit) {
		this.name = name;
		this.value = 0;
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %sof %s", name==null ? "":name,value==0 ? "" : value+" ",suit);
	}
}
class Deck{
	Card[] cards = new Card[52];
	Random rand =  new Random();
	public Deck() {
		int x=0;
		String[] clubs = {"Club","diamond","heart","spade"};
		for(int i=0;i<4;i++)
			for(int j=1;j<=13;j++)
			{
				if(j==1) cards[x++]= new Card("Ace",0,clubs[i]);
				else if(j==11) cards[x++]= new Card("Jack",0,clubs[i]);
				else if(j==12) cards[x++]= new Card("Queen",0,clubs[i]);
				else if(j==13) cards[x++]= new Card("King",0,clubs[i]);
				else cards[x++]= new Card(null,j,clubs[i]);
			}
	}
	public void draw(){
		System.out.print(cards[0]);
	}
	public void shuffle(){
		int randIndex;
       // [0,1,2,3,4,5 ]
		for(int i=0;i<52;i++)
		{
			randIndex = rand.nextInt(51)+1;
			cards[randIndex] = cards[i];
			cards[i] = cards[randIndex];
			
		}
		System.out.println("Cards were shuffled, with shuffle 1.");
	}
	public void shuffle2(){
		List<Card> cardsList = Arrays.asList(cards);
		Collections.shuffle(cardsList);
		cardsList.toArray(cards);
		System.out.println("Cards were shuffled, with shuffle 2.");
	}
	public void printAll(){
		System.out.println(Arrays.toString(cards));
		System.out.println();
	}
}