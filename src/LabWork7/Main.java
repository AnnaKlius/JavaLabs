package LabWork7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample Data
        VideoBlog blog = new VideoBlog("Tech Guru");

        Video video1 = new Video("Java Basics", "http://example.com/java-basics", 1500, 300, 20);
        video1.addComment(new Comment("Great tutorial!", 100, 2));
        video1.addComment(new Comment("Very helpful!", 50, 1));

        Video video2 = new Video("Advanced Java", "http://example.com/advanced-java", 1000, 200, 30);
        video2.addComment(new Comment("Too fast!", 250, 10));
        video2.addComment(new Comment("Good explanation.", 150, 5));

        blog.addVideo(video1);
        blog.addVideo(video2);

        // Task 1: Total views using a typed iterator
        int totalViews = 0;
        Iterator<Video> videoIterator = blog.getVideos().iterator();
        while (videoIterator.hasNext()) {
            totalViews += videoIterator.next().getViews();
        }
        System.out.println("Total Views: " + totalViews);

        // Task 2: Check if any comment has more likes than the video using an untyped iterator
        boolean hasPopularComment = false;
        Iterator untypedVideoIterator = blog.getVideos().iterator();
        while (untypedVideoIterator.hasNext()) {
            Video video = (Video) untypedVideoIterator.next();
            for (Comment comment : video.getComments()) {
                if (comment.getLikes() > video.getLikes()) {
                    hasPopularComment = true;
                    break;
                }
            }
        }
        System.out.println("Is there a comment with more likes than its video? " + hasPopularComment);

        // Task 3: Video(s) with the most dislikes using a for-each loop
        int maxDislikes = 0;
        List<Video> mostDislikedVideos = new ArrayList<>();
        for (Video video : blog.getVideos()) {
            if (video.getDislikes() > maxDislikes) {
                maxDislikes = video.getDislikes();
                mostDislikedVideos.clear();
                mostDislikedVideos.add(video);
            } else if (video.getDislikes() == maxDislikes) {
                mostDislikedVideos.add(video);
            }
        }

        System.out.println("Video(s) with the most dislikes:");
        for (Video video : mostDislikedVideos) {
            System.out.println(video.getTitle() + " (Dislikes: " + video.getDislikes() + ")");
        }
    }
}