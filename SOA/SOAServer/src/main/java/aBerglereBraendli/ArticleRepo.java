package aBerglereBraendli;

import dezsys07.Article;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ArticleRepo {
    //private static final List<Country> countries = new ArrayList<Country>();


    public Article findArticle(String name) {
        Assert.notNull(name);

        Article result = null;

        result = new Article();
        result.setContent("Test");
        result.setTitle("Settings ArticleRepo");

        RestTemplate restTemplate = new RestTemplate();

/*
        Article[] a = restTemplate.getForObject("http://localhost:3000/articles.json?search="+name,Article[].class);

        List<Article> arL = Arrays.asList(a);

*/
        Article[] a = restTemplate.getForObject("http://localhost:3000/articles.json?search="+name, Article[].class);

        Article aa = a[0];
        return aa;
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
        //return result;
    }
}