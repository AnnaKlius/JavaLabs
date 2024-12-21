package LabWork7;

import java.util.ArrayList;
import java.util.List;

class VideoBlog {
    private String blogger;
    private List<Video> videos;

    public VideoBlog(String blogger) {
        this.blogger = blogger;
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Video> getVideos() {
        return videos;
    }

    public String getBlogger() {
        return blogger;
    }
}
