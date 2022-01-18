package com.test.liquitest.model.article;

import com.test.liquitest.model.user.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "articles")
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "article_title")
    String title;

    @Column(name = "article_text")
    String text;

    @ManyToOne
    User author;

}
