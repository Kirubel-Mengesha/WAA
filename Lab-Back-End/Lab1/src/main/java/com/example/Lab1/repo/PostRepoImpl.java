package com.example.Lab1.repo;

import com.example.Lab1.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    private static List<Post> posts;

    static {
        posts = new ArrayList<Post>();
        Post p1 = new Post(111L, "WAA", "Spring", "Dr Dean");
        Post p2 = new Post(112L, "WAP", "Javascript", "Miss tina");
        Post p3 = new Post(113L, "EA", "More Spring", "Payman");
        Post p4 = new Post(114L, "ASD", "Design Pattern", "Rene");

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        posts.add(p4);

    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post getById(int id) {
        return posts.stream()
                .filter(x->x.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public void save(Post post) {
        posts.add(post);
    }
}


