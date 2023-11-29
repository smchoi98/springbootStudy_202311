package com.example.demo.web;

import com.example.demo.domain.Article;

import java.time.LocalDateTime;

public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private final String content;
    private LocalDateTime createdAt;

    public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }
}
