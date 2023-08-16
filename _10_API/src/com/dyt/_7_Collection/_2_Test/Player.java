package com.dyt._7_Collection._2_Test;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Card> cards = new ArrayList<>();
	private boolean Landlord = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public boolean isLandlord() {
		return Landlord;
	}

	public void setLandlord(boolean landlord) {
		Landlord = landlord;
	}
}
