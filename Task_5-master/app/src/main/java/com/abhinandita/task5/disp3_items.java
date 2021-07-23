package com.abhinandita.task5;

public class Stage3_items {
    int image,  posts, following;
    String name, profession, followers;

    public Stage3_items(String name, String profession, int image, String followers, int posts, int following)  {
        this.image = image;
        this.followers = followers;
        this.posts = posts;
        this.following = following;
        this.name = name;
        this.profession = profession;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
