package fr.jojo.sdbm.sdbm.services;

import fr.jojo.sdbm.sdbm.models.dto.ArticleDto;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<ArticleDto> getAllArticles();
    Optional<ArticleDto> getArticleById(Integer articleId);
//    Optional<List<ArticleDto>> searchByKeyword(String keyWord);
    Optional<List<ArticleDto>> getArticleByNomArticle(String keyWord);
}
