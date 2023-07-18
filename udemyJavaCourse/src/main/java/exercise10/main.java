package exercise10;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) throws ParseException {
        System.out.println("---------------POST AND COMMENT-------------------");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(
                simpleDateFormat.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);

    }
}
