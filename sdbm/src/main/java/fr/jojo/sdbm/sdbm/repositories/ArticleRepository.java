package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

//    @Query("SELECT a FROM Article a WHERE " +
//            "LOWER(a.nomArticle) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "CAST(a.prixAchat AS string) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "CAST(a.volume AS string) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "CAST(a.titrage AS string) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(a.idMarque.nomMarque) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(a.idCouleur.nomCouleur) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
//            "LOWER(a.idType.nomType) LIKE LOWER(CONCAT('%', :keyword, '%'))")
//    List<Article> searchByKeyword(@Param("keyword") String keyword);

    List<Article> getArticleByNomArticle(String keyword);

}