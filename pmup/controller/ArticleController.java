package com.pae.pmup.controller;

import com.pae.pmup.model.Article;
import com.pae.pmup.service.article.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    // Endpoint para buscar artigos por palavra-chave
    @GetMapping("/search")
    public List<Article> searchArticles(@RequestParam("keyword") String keyword) {
        return articleService.searchArticles(keyword);
    }
}
