package LabWork8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Video {
    private String title;
    private String url;
    private int views;
    private int likes;
    private int dislikes;
    private Set<Comment> comments;

    public Video(String title, String url, int views, int likes, int dislikes) {
        this.title = title;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = new HashSet<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(title, video.title) && Objects.equals(url, video.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, url);
    }
}