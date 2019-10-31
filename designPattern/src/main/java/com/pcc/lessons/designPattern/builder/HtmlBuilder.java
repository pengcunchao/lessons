package com.pcc.lessons.designPattern.builder;

public class HtmlBuilder implements ArticleBuilder {
    private Article article;

    public HtmlBuilder() {
        this.article = new Article();
    }

    @Override
    public ArticleBuilder head(String head) {
        head = "<head>" + head + "</head>";
        article.setHead(head);
        return this;
    }

    @Override
    public ArticleBuilder tail(String tail) {
        tail = "<tail>" + tail + "</tail>";
        article.setTail(tail);
        return this;
    }

    @Override
    public ArticleBuilder body(String body) {
        body = "<body>" + body + "</body>";
        article.setBody(body);
        return this;
    }

    @Override
    public Article build() {
        return article;
    }
}
