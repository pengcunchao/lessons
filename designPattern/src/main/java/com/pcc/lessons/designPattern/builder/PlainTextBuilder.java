package com.pcc.lessons.designPattern.builder;

public class PlainTextBuilder implements ArticleBuilder {
    private Article article;

    public PlainTextBuilder() {
        this.article = new Article();
    }

    @Override
    public ArticleBuilder head(String head) {
        article.setHead(head);
        return this;
    }

    @Override
    public ArticleBuilder tail(String tail) {
        article.setTail(tail);
        return this;
    }

    @Override
    public ArticleBuilder body(String body) {
        article.setBody(body);
        return this;
    }

    @Override
    public Article build() {
        return article;
    }
}
