import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedasAPI {
    public Moneda buscaMoneda(String base_code, String target_code, double amount){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d4f5c3ebe83990e62d09e279/pair/"+base_code+"/"+ target_code + "/" +amount);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

    try {
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Moneda.class);
    } catch (Exception e){
        throw new RuntimeException("No se puede realizar la conversion");
    }
    }
}
