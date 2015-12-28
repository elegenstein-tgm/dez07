package aBergler.eBraendli;

import aBergler.eBraendli.wsdl.GetQueryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by fusions on 18.12.15.
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    CommandLineRunner lookup(QueryClient queryClient) {
        return args -> {
            String articleSearch = "def";

            if (args.length > 0) {
                articleSearch = args[0];
            }
            GetQueryResponse response = queryClient.getQueryResponse(articleSearch);
        };
    }
}
