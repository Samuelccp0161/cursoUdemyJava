package exercise10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date;
    String title;
    String content;
    int likes;
    private final List<Comment> comments = new ArrayList<>();

    public Post(Date date, String title, String content, int likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
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
}
