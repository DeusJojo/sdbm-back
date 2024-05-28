package fr.jojo.sdbm.sdbm.services.impl;

import fr.jojo.sdbm.sdbm.models.dto.ArticleDto;
import fr.jojo.sdbm.sdbm.models.entities.Article;
import fr.jojo.sdbm.sdbm.repositories.ArticleRepository;
import fr.jojo.sdbm.sdbm.services.ArticleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    ArticleRepository articleRepository;

    @Override
    public List<ArticleDto> getAllArticles() {
        ModelMapper modelMapper = new ModelMapper();
        List<Article> articles = articleRepository.findAll();
        return articles.stream().map(article -> modelMapper.map(article, ArticleDto.class)).toList();
    }


    @Override
    public Optional<ArticleDto> getArticleById(Integer articleId) {
        ModelMapper modelMapper = new ModelMapper();
            Article article = articleRepository.findById(articleId)
                    .orElseThrow(() ->
                            new RuntimeException(("L'article avec l'id " + articleId + " n'existe pas.")));
            return Optional.ofNullable(modelMapper.map(article, ArticleDto.class));
    }
}
