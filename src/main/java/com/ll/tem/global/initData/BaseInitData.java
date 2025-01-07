package com.ll.tem.global.initData;

import com.ll.tem.domain.post.post.entity.Post;
import com.ll.tem.domain.post.post.repository.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class BaseInitData {
    private final PostService postService;

    @Autowired
    @Lazy
    private BaseInitData self;

    @Bean
    public ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {
            self.work1();
        };
    }

    @Transactional
    public void work1() {
        if (postService.count() > 0) return;

        Post post1 = postService.write("축구 하실분?", "14시 까지 서울운동장으로 모여주세요.");
        Post post2 = postService.write("배구 하실분?", "15시 까지 서울운동장으로 모여주세요.");
        Post post3 = postService.write("농구 하실분?", "16시 까지 서울운동장으로 모여주세요.");
    }
}