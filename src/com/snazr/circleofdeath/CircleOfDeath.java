package com.snazr.circleofdeath;

import android.app.Application;

public class CircleOfDeath extends Application {
	private final static Deck deck = new Deck();
	private static boolean gameStarted = false;
	private static Card currentCard = null;
	public static Deck getDeck() {
		return deck;
	}
	public static boolean isGameStarted() {
		return gameStarted;
	}
	public static void setGameStarted(boolean b) {
		CircleOfDeath.gameStarted = b;
	}
	public static Card getCurrentCard() {
		return currentCard;
	}
	public static void setCurrentCard(Card currentCard) {
		CircleOfDeath.currentCard = currentCard;
	}
}
