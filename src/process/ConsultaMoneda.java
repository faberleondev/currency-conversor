package process;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private final String URI_BASE = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = "YOUR-API-KEY";

    public MonedaAPI buscaMoneda(String monedaBase, String monedaSecundaria, double cantidad){

        URI direccion = URI.create( URI_BASE + API_KEY + "/pair/" + monedaBase + "/" + monedaSecundaria + "/" + cantidad);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MonedaAPI.class);

        } catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }

    }

}