package com.pcc.lessons.designPattern.builder;

public interface ArticleBuilder {
    ArticleBuilder head(String head);
    ArticleBuilder tail(String tail);
    ArticleBuilder body(String body);
    Article build();
}
