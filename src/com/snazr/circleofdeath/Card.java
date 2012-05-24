package com.snazr.circleofdeath;

public class Card {
	private int rank;
	private int suit; 	
	private final static String[] ranks = {"Ace", "King", "Queen", "Jack", "10","9","8","7", "6", "5", "4", "3", "2"}; 
	private final static String[] suits = {"Clubs","Spades", "Hearts","Diamonds"};  	

	final static int[] cardImages = new int[] { 
		/*order =  
		Clubs				Spades				Hearts				Diamonds */
		R.drawable.card01, 	R.drawable.card02, 	R.drawable.card03, 	R.drawable.card04, //aces
		R.drawable.card05, 	R.drawable.card06, 	R.drawable.card07, 	R.drawable.card08, //2
		R.drawable.card09, 	R.drawable.card10, 	R.drawable.card11, 	R.drawable.card12,	//3
		R.drawable.card13, 	R.drawable.card14, 	R.drawable.card15, 	R.drawable.card16,	//4
		R.drawable.card17, 	R.drawable.card18, 	R.drawable.card19, 	R.drawable.card20,	//5
		R.drawable.card21, 	R.drawable.card22, 	R.drawable.card23, 	R.drawable.card24, //6
		R.drawable.card25, 	R.drawable.card26, 	R.drawable.card27, 	R.drawable.card28, //7
		R.drawable.card29, 	R.drawable.card30, 	R.drawable.card31, 	R.drawable.card32,	//8
		R.drawable.card33, 	R.drawable.card34, 	R.drawable.card35, 	R.drawable.card36,	//9
		R.drawable.card37, 	R.drawable.card38, 	R.drawable.card39, 	R.drawable.card40,	//10
		R.drawable.card41, 	R.drawable.card42, 	R.drawable.card43, 	R.drawable.card44,	//j
		R.drawable.card45, 	R.drawable.card46, 	R.drawable.card47, 	R.drawable.card48,	//q
		R.drawable.card49, 	R.drawable.card50, 	R.drawable.card51, 	R.drawable.card52,	//k
		//------------------------------------------------------------------------------//
		R.drawable.card53, 	R.drawable.card54,										//jokers
	};


	public Card (int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}

	public int getRankInt(){
		return this.rank;
	}

	public int getSuitInt(){
		return this.suit;
	}	
	public String getRank(){
		return getRanks()[this.rank];
	}

	public String getSuit(){
		return suits[this.suit];
	}

	public String toString(){
		return getRanks()[this.rank] + " of " + suits[this.suit];
	}
	
	public int getCardID(){
		//magic
		return this.getRankInt()*4 + this.getSuitInt();
	}
	public int getCardResourceID(){
		return cardImages[this.getCardID()];
	}

	public static String[] getRanks() {
		return ranks;
	}
	public static String[] getSuits() {
		return suits;
	}

}
