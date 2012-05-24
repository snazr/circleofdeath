package com.snazr.circleofdeath;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CircleofDeathActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final Deck deck = CircleOfDeath.getDeck();
		//final Button drawButton = (Button) findViewById(R.id.drawButton);
		final TextView cardName = (TextView) findViewById(R.id.cardName);
		final TextView cardDescription = (TextView) findViewById(R.id.cardDescription);
		final ImageView cardImage = (ImageView) findViewById(R.id.cardImage);
		final Resources res = getResources();
		final String[] ruleSet = res.getStringArray(R.array.cardEvents);
		final String[] ruleSetDescriptions = res.getStringArray(R.array.cardEventsDescriptions);

		if (CircleOfDeath.isGameStarted()){
			Card card = CircleOfDeath.getCurrentCard();
			if (card != null){ //we are still playing the game
				cardImage.setImageResource(card.getCardResourceID());
				cardName.setText(ruleSet[card.getRankInt()]);
				cardDescription.setText(ruleSetDescriptions[card.getRankInt()]);
			}
			else{ //last draw() returned null, game is over
				cardImage.setImageResource(R.drawable.cardback);
				cardName.setText(R.string.gameover);
				cardDescription.setText(R.string.gameover);
//				drawButton.setText(R.string.quit);			
			}
		}
		cardImage.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				CircleOfDeath.setGameStarted(true);
				Card card = deck.draw();
				if (card != null){
					cardImage.setImageResource(card.getCardResourceID());
					cardName.setText(ruleSet[card.getRankInt()]);
					cardDescription.setText(ruleSetDescriptions[card.getRankInt()]);
				}
				else{
					cardImage.setImageResource(R.drawable.cardback);
					cardName.setText(R.string.gameover);
					cardDescription.setText(R.string.gameover);
					//drawButton.setText(R.string.quit);
				}
			}
		});
	}
}