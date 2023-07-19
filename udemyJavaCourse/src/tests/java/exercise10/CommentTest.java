package exercise10;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CommentTest {
    @Test
    public void testCommentPost() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        posts[0] = post1;

        Comment comment1 = new Comment("very beautiful this country");

        post1.addComment(comment1);

        assertEquals(comment1, post1.getComments().get(0));
    }
    @Test
    public void testMultiplesCommentsPost() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        posts[0] = post1;

        Comment comment1 = new Comment("very beautiful this country");
        Comment comment2 = new Comment("man, this country has wonderful pizzerias");
        Comment comment3 = new Comment("the squares of this country are wonderful");

        post1.addComment(comment1);
        post1.addComment(comment2);
        post1.addComment(comment3);

        assertArrayEquals(new Comment[]{comment1, comment2, comment3}, post1.getComments().toArray());
    }
    @Test
    public void testRemoveCommentPost() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        posts[0] = post1;

        Comment comment1 = new Comment("very beautiful this country");
        Comment comment2 = new Comment("man, this country has wonderful pizzerias");
        Comment comment3 = new Comment("the squares of this country are wonderful");

        post1.addComment(comment1);
        post1.addComment(comment2);
        post1.addComment(comment3);

        post1.removeComment(comment2);

        assertArrayEquals(new Comment[]{comment1, comment3}, post1.getComments().toArray());
    }
}
