package com.immymemine.kevin.skillshare.model.m_class;

import java.util.List;

/**
 * Created by quf93 on 2017-12-04.
 */

public class Lessons {
    String title;
    String time;
    String reviewPercent;
    String subscriberCount;
    Tutor tutor;
    List<Video> videos;

    // for test
    public Lessons(String title,
            String time,
            String reviewPercent,
            String subscriberCount,
            Tutor tutor,
            List<Video> videos) {
        this.title = title;
        this.time = time;
        this.reviewPercent = reviewPercent;
        this.subscriberCount = subscriberCount;
        this.tutor = tutor;
        this.videos = videos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReviewPercent() {
        return reviewPercent;
    }

    public void setReviewPercent(String reviewPercent) {
        this.reviewPercent = reviewPercent;
    }

    public String getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
