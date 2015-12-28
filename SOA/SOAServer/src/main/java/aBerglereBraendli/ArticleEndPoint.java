package aBerglereBraendli;


import dezsys07.GetQueryRequest;
import dezsys07.GetQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


/**
 * Created by fusions on 14.12.15.
 */

@Endpoint
public class ArticleEndPoint {
    private static final String NAMESPACE_URI = "dezsys07";

    private ArticleRepo articleRepository;

    @Autowired
    public ArticleEndPoint(ArticleRepo articleRepo) {
        this.articleRepository = articleRepo;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getQueryRequest")
    @ResponsePayload
    public GetQueryResponse getQuery(@RequestPayload GetQueryRequest request) {
        GetQueryResponse response = new GetQueryResponse();
        //response.

        response.setArticle(articleRepository.findArticle(request.getName()));

        return response;
    }
}
