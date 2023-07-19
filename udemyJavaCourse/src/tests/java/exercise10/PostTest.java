package exercise10;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PostTest {
    @Test
    public void testPost() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

            Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
            posts[0] = post1;

        assertArrayEquals(new Post[]{new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12)}, posts);
    }
    @Test
    public void testMultiplePosts() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post post = new Post(simpleDateFormat.parse("00/00/0000 00:00:00"), "", "", 0);


        Post post1 = new Post(simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        Post post2 = new Post(simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to New York",
                "I'm going to visit this wonderful country!",
                12);

            post.addPosts(post1);
            post.addPosts(post2);

        assertEquals(2, post.posts.size());
    }

    @Test
    public void testPostDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post1.setDate(simpleDateFormat.parse("19/7/2023 12:15:35"));
        posts[0] = post1;

        assertEquals(simpleDateFormat.parse("19/7/2023 12:15:35"), post1.getDate());
    }
    @Test
    public void testPostTitle() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);
        posts[0] = post1;

        post1.setTitle("Traveling to New York");

        assertEquals("Traveling to New York", post1.getTitle());
    }
    @Test
    public void testPostContent() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post1.setContent("I'm going to visit this wonderful country with a beautiful view!");
        posts[0] = post1;


        assertEquals("I'm going to visit this wonderful country with a beautiful view!", post1.getContent());
    }
    @Test
    public void testPostLikes() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post[] posts = new Post[1];

        Post post1 = new Post(
                simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post1.setLikes(16);
        posts[0] = post1;

        assertEquals(16, post1.getLikes());
    }

}
