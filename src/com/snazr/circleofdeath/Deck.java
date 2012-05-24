package com.snazr.circleofdeath;

import java.util.Collections;
import java.util.Stack;

public class Deck extends CircleofDeathActivity {
	private Stack<Card> thedeck = new Stack<Card>();	
	public Deck(){
		for (int i = 0; i < 13;i++){
			for (int j = 0; j < 4;j++){
				thedeck.add(new Card(i,j));
			}
		}
		Collections.shuffle(thedeck);
	}

	public Deck(int decks){
		for (int d = 0; d < decks;d++){
			for (int i = 0; i < 13;i++){
				for (int j = 0; j < 4;j++){
					thedeck.add(new Card(i,j));
				}
			}
		}
		Collections.shuffle(thedeck);
	}

	public Stack<Card> getDeck(){
		return thedeck;
	}
	public void printDeck(){
		for (int i = 0; i < thedeck.size();i++){
			System.out.println(thedeck.get(i).getRank() + thedeck.get(i).getSuit());
		}
	}
	public int getSize(){
		return thedeck.size();
	}

	public Card draw(){
		if (!thedeck.isEmpty()){
			Card card = thedeck.pop();
			CircleOfDeath.setCurrentCard(card);
			return card;
		}
		CircleOfDeath.setCurrentCard(null);
		return null;
	}
	
	public Card peek() {
		return thedeck.peek();
	}
}
