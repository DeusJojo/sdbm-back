package fr.jojo.sdbm.sdbm.controllers;

import fr.jojo.sdbm.sdbm.models.dto.ArticleDto;
import fr.jojo.sdbm.sdbm.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ArticleController {

    private ArticleService articleService;

    @GetMapping("/articles")
    public ResponseEntity<List<ArticleDto>> getAllArticles(){
        List<ArticleDto> articleDtoList = articleService.getAllArticles();
        return ResponseEntity.ok(articleDtoList);
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<?> getManagerById(@PathVariable("id") Integer articleId){
        Optional<ArticleDto> articleDto = articleService.getArticleById(articleId);
        if(articleDto.isPresent()){
            return ResponseEntity.ok(articleDto.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun article trouvé.");
        }
    }

    @GetMapping("articles/{nom}")
    public ResponseEntity<?> getArticleByNomArticle(@PathVariable("nom") String keyWord){
        Optional<List<ArticleDto>> articleDtos = articleService.getArticleByNomArticle(keyWord);
        if(articleDtos.isPresent()){
            return ResponseEntity.ok(articleDtos.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun article trouvé.");
        }
    }
}
