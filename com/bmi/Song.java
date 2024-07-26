package com.bmi;

public class Song {
	
	String title;
	String artist;
	int year;
	String country;
	
	public Song () {}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show () {
		System.out.println(country + ","+year+"년" + artist + "["+title+"]");
	}


	public static void main(String[] args) {
		Song s = new Song("대한민국", "홍이삭", 2024, "I Love you");
		s.show();

	}

}
