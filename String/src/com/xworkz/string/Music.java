package com.xworkz.string;

public class Music {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String singer="Anirudh";
		
		char value=singer.charAt(1);
		char [] value1=singer.toCharArray();
		singer=singer.concat("is a famous singer");
		int value2=singer.indexOf('h');
		String value3=singer.substring(3);
		
		boolean value5=singer.equalsIgnoreCase("Method");
		boolean value6=singer.equals("Anirudh");
		int value7=singer.compareTo("Abc");
		int value8=singer.compareToIgnoreCase("is a");
		String value9=singer.toLowerCase();
		String value10=singer.toUpperCase();
		boolean value11=singer.isEmpty();
		int value12=singer.length();
		boolean value13=singer.startsWith("An");
		String value14=singer.replace("singer", "Music player");
		String value15=singer.replaceAll("a", "S");
		
		
		
		System.out.println(value1);
		System.out.println(value);
		System.out.println(singer);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		System.out.println(value15);

	
		

	}

}
