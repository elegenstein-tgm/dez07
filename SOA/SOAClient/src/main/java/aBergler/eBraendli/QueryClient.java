package aBergler.eBraendli;


import aBergler.eBraendli.wsdl.GetQueryRequest;
import aBergler.eBraendli.wsdl.GetQueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by fusions on 15.12.15.
 */
public class QueryClient extends WebServiceGatewaySupport{

    private static final Logger log = LoggerFactory.getLogger(QueryClient.class);

    public GetQueryResponse getQueryResponse(String query) {

        GetQueryRequest request = new GetQueryRequest();
        request.setName(query);

        log.info("Requesting Article with String \"" + query+"\"");




        GetQueryResponse response = (GetQueryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(
                        "http://localhost:8080/ws/articles",
                        request,
                        new SoapActionCallback("http://localhost:8080/ws/getQueryRequest"));


        printResponse(response);
        return response;
    }

    public void printResponse(GetQueryResponse response) {


        log.info("Title: " + response.getArticle().getTitle() +"\nContent: "+response.getArticle().getContent());
        /*
        if (forecastReturn.isSuccess()) {
            log.info("Forecast for " + forecastReturn.getCity() + ", " + forecastReturn.getState());

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            for (Forecast forecast : forecastReturn.getForecastResult().getForecast()) {

                Temp temperature = forecast.getTemperatures();

                log.info(String.format("%s %s %s°-%s°", format.format(forecast.getDate().toGregorianCalendar().getTime()),
                        forecast.getDesciption(), temperature.getMorningLow(), temperature.getDaytimeHigh()));
                log.info("");
            }
        } else {
            log.info("No forecast received");
        }
        */
    }

}
