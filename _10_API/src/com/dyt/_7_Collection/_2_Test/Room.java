package com.dyt._7_Collection._2_Test;

import java.util.*;

public class Room {
	private List<Card> cards = new ArrayList<>();

	public Room() {
		// 创建一副扑克牌。54张牌 = 52张数字牌 + 2张大小王
		// 数字："3","4","5","6","7","8","9","10","J","Q","K","A","2"
		// 花色："♥️","♦️","♠️","♣️" | "🃏", "🫥"

		String[] names  = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] colors = {"♥️", "♦️", "♠️", "♣️"};

//		List<String> names  = new ArrayList<>();
//		List<String> colors = new ArrayList<>();
//		Collections.addAll(names,  "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
//		Collections.addAll(colors, "♥️", "♦️", "♠️", "♣️");
//
////		System.out.println(names);
////		System.out.println(colors);

		int size = 0;
		// 遍历数字
		for (String name : names) {
			// 遍历花色
			size++;
			for (String color : colors) {
				Card card = new Card(name, color, size);
				cards.add(card);
			}
		}

		// 将大小王也添加进来
		Card c1 = new Card("", "🃏", ++size);
		Card c2 = new Card("", "🫥", ++size);
		cards.add(c1);
		cards.add(c2);

		System.out.println("洗牌前" + cards);
	}

	public void start() {
		// 1、洗牌
		Collections.shuffle(cards);
		System.out.println("洗牌后" + cards);

		// 2、发牌。先每人发17张牌。最后指定地主拿到剩下的3张牌
		List<Card> DingYongTao = new ArrayList<>();
		List<Card> ChenJiaBin  = new ArrayList<>();
		List<Card> GaoQiHan	   = new ArrayList<>();
		// [♥️10, ♦️6, ♦️9, ♦️K, ♥️3, ♦️4, ♣️A, ♣️6, ♠️6, 🃏, ♦️7, ♦️Q, ♦️2, ♠️9, ♠️5, ♥️2, ♥️6, ♥️4, ♣️7, ♠️7, ♦️8, ♠️2, ♣️J, ♣️Q, 🫥
		//   0     1    2    3     4    5   6    7 ........  % 3
		int cardsSize = cards.size();
		for (int ii = 0; ii < cardsSize - 3; ii++) {
			if (ii % 3 == 0) {
				DingYongTao.add(cards.get(ii));
			} else if (ii % 3 == 1) {
				ChenJiaBin.add(cards.get(ii));
			} else {
				GaoQiHan.add(cards.get(ii));
			}
		}

		// 3、排序
//		DingYongTao.sort(new Comparator<Card>() {
//			@Override
//			public int compare(Card o1, Card o2) {
//				return o1.getSize() - o2.getSize();
//			}
//		});

//		DingYongTao.sort((o1, o2) -> o1.getSize() - o2.getSize());

		DingYongTao.sort(Comparator.comparingInt(Card::getSize));
		ChenJiaBin.sort(Comparator.comparingInt(Card::getSize));
		GaoQiHan.sort(Comparator.comparingInt(Card::getSize));

		// 4、看牌
		System.out.println("丁永涛：" + DingYongTao + "，牌数：" + DingYongTao.size());
		System.out.println("陈家斌：" + ChenJiaBin  + "，牌数：" + ChenJiaBin.size());
		System.out.println("高启涵：" + GaoQiHan    + "，牌数：" + GaoQiHan.size());

		List<Card> lastThreeCards = cards.subList(cardsSize - 3, cardsSize);
		System.out.println("底牌：" + lastThreeCards);
		DingYongTao.addAll(lastThreeCards);
		DingYongTao.sort(Comparator.comparingInt(Card::getSize));
		System.out.println("丁永涛：" + DingYongTao + "，牌数：" + DingYongTao.size());
	}
}
