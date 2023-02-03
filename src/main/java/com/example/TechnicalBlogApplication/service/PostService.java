package com.example.TechnicalBlogApplication.service;

import Model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public PostService(){
        System.out.println("*88***Post Service");
    }
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("Mobile Phones");
        post1.setBody("Apple, Samsung, Nokia, OnePlus");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Programming Languages");
        post2.setBody("java,javaScript,C,C++,Python");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Web Technology");
        post3.setBody("html, css, javaScript ,react, angular");
        post3.setDate(new Date());


        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }
}
