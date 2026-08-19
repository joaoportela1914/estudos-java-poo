package comp_application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import comp_entities.Comment;
import comp_entities.Post;

public class CompMainPost {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow thats awesone");
		Post p1 = new Post(LocalDate.parse("21/06/2018", fmt1), 
										   "Traveling to new Zeland", 
										   "I m going to visit this wonderful country!", 
										   12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
}
