package com.ll.tem.domain.post.post.repository;

import com.ll.tem.domain.post.post.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Optional<Post> findById(long id) {
        return postRepository.findById(id);
    }

    public List<Post> findAllByOrderByIdDesc() {
        return postRepository.findAllByOrderByIdDesc();
    }

    public Post write(String title, String content) {
        Post post = Post.builder()
                .title(title)
                .content(content)
                .build();

        return postRepository.save(post);
    }

    public long count() {
        return postRepository.count();
    }
}