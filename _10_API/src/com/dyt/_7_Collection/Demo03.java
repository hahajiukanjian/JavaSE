package com.dyt._7_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03 {
	public static void main(String[] args) {
		Collection<Movie> movies = new ArrayList<>();
		movies.add(new Movie("《肖申克的救赎》", 9.7, "罗宾斯"));
		movies.add(new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅"));
		movies.add(new Movie("《阿甘正传》", 9.5, "汤姆·汉克斯"));
		System.out.println(movies);

		for (Movie movie : movies) {
			System.out.println("电影名：" + movie.getName());
			System.out.println("评分：" + movie.getScore());
			System.out.println("主演：" + movie.getActor());
			System.out.println("================================");
		}
	}
}
