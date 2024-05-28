package fr.jojo.sdbm.sdbm.services;

import fr.jojo.sdbm.sdbm.models.dto.ArticleDto;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<ArticleDto> getAllArticles();
//    ArticleDto getArticleById(Integer articleId);
    Optional<ArticleDto> getArticleById(Integer articleId);
}
