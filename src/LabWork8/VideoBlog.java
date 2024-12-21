package LabWork8;

import java.util.HashSet;
import java.util.Set;

class VideoBlog {
    private String blogger;
    private Set<Video> videos;

    public VideoBlog(String blogger) {
        this.blogger = blogger;
        this.videos = new HashSet<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public Set<Video> getVideos() {
        return videos;
    }

    public String getBlogger() {
        return blogger;
    }
}
