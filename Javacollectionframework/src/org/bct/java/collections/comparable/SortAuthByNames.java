package org.bct.java.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;


class Author implements Comparable<Author>{
	
	String firstname;
	String lastname;
	String bookname;
	
	Author(String firstname, String lastname, String bookname){
		// in order to initialize --- store the values, we wil use this
		this.firstname=firstname;
		this.lastname=lastname;
		this.bookname=bookname;
	}
	
	/*
	 * This is where we write the logic to sort. This method sorts automatically by the
	 * first name in case that last is name is same. 
	 */
	
	public int compareTo(Author au) {
		int last=this.lastname.compareTo(au.lastname);
		// sorting by firstname if last name is same. 
		
		return last==0 ? this.firstname.compareTo(au.firstname) : last;
	}
}

public class SortAuthByNames {

	public static void main(String[] args) {
		
		//Create an Array List
		ArrayList<Author> al=new ArrayList<Author>();
		// Data has been sent to the constructor and applied sort.
		al.add(new Author("Sachin","Sachin","Java Programming"));
		al.add(new Author("Henry","Miller","Song's of Ice and Fire"));
		al.add(new Author("Deborah","Hopkinson","Sky boys"));
		al.add(new Author("Chetan","Bhagat","Half Girlfriend"));
		al.add(new Author("Sachin","Anil","Python Programming"));
		
		// Sort
		Collections.sort(al);
		for(Author result:al) {
			System.out.println(result.firstname+ " " + result.lastname + " " + result.bookname);
		}
	}
}