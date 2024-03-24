package aplication;


import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String d1 = "21/06/2018 13:05:44";

        String title = "Traveling to New Zealand";
        int likes = 12;
        String contents = "I'm going to to visit this wonderful country!";
        Post p1 = new Post(sdf.parse(d1),title,contents,likes);
        Comment c1= new Comment("Have a nice trip");
        p1.addComments(c1);
        Comment c2= new Comment("Wow that's awesome");
        p1.addComments(c2);

        System.out.println(p1.toString());
        System.out.println();

        String d2 = "21/06/2018 13:05:44";

        String title2 = "Good night guys";
        int likes2 = 5;
        String contents2 = "See you tomorrow";
        Post p2 = new Post(sdf.parse(d1),title2,contents2,likes2);
        Comment c3= new Comment("Good night");
        p2.addComments(c3);
        Comment c4= new Comment("May the force be with you");
        p2.addComments(c4);

        System.out.println(p2.toString());




    }


}
