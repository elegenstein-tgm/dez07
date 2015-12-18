package aBerglereBraendli;

import dezsys07.Article;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class ArticleRepo {
    //private static final List<Country> countries = new ArrayList<Country>();


    public Article findArticle(String name) {
        Assert.notNull(name);

        Article result = null;

        result = new Article();
        result.setContent("Test");
        result.setTitle("Settings ArticleRepo");
        /**
         * Doing a REST req to RESTService
         */

        /*
        for (Article country : articles {
            if (name.equals(country.getName())) {
                result = country;
            }
        }
        */
        return result;
    }
}