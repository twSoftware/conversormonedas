import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTipoDeCambio {




    public MonedaExchangeRate buscaTipoDeCambio(String moneda_base, String moneda_objetivo, double cantidad_moneda){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1010050b8e70ae7810156025/pair/"+moneda_base+"/"+moneda_objetivo+"/"+cantidad_moneda);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException |InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), MonedaExchangeRate.class);
    }
}
