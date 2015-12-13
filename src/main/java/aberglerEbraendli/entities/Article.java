package aberglerEbraendli.entities;

/**
 * Created by Erik and Adrian on 13.12.15.
 */


public class Article {

    private final long id;
    private final String content;
    private final String title;

    public Article(long id, String title, String content) {
        this.id = id;
        this.content = content;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getTitle(){
        return title;
    }
}

