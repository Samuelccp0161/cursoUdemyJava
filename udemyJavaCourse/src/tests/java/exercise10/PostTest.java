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

        assertArrayEquals(new Post[]{new Post(simpleDateFormat.parse("18/07/2023 08:37:20"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12)}, posts);


    }
}
