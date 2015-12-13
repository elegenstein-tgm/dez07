package aberglerEbraendli;

import aberglerEbraendli.dbConnection.DbCon;
import aberglerEbraendli.entities.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by fusions on 13.12.15.
 */

@RestController
public class ArticleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private DbCon db = new DbCon();
/*
    @RequestMapping("/greeting")
    public Article greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Article(counter.incrementAndGet(),
                String.format(template, name));
    }
*/
    @RequestMapping("/articles")
    public List<Article> search(@RequestParam(value = "words", defaultValue = "Test") String words){
        //String sql = "Select * from article where title like '"+words+"'";
        return db.searchArticles(words);
    }

}
