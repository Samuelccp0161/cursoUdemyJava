package exercise10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Post {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date;
    String title;
    String content;
    int likes;
    int size;
    List<Post> posts = new ArrayList<>();
    private final List<Comment> comments = new ArrayList<>();

    public Post(Date date, String title, String content, int likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    public void addPosts(Post post){
        posts.add(post);
    }
    public int getSizePost(){
        return posts.size();
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void removeComment(Comment comment){
        comments.remove(comment);
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes).append(" Likes - ");
        stringBuilder.append(simpleDateFormat.format(date) + "\n");
        stringBuilder.append(content + "\n");
        stringBuilder.append("Comments: \n");
        for (Comment comment : comments)
            stringBuilder.append(comment.getText() + "\n");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return likes == post.likes && Objects.equals(date, post.date) && Objects.equals(title, post.title) && Objects.equals(content, post.content) && Objects.equals(comments, post.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, title, content, likes, comments);
    }
}
