package clientTest;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestHttpClient {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		for (int i = 0; i < 100; i++) {
			HttpGet httpGet = new HttpGet("http://localhost:9000/router");
			HttpResponse response = httpClient.execute(httpGet);
			System.out.println(EntityUtils.toString(response.getEntity()));
		}
	}
}
