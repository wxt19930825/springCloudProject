package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class InvokerController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping(value="/router",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String router() {
		
		String resJson = restTemplate.getForObject("http://first-ek-service-provider/person/1", String.class);
		return resJson;
	}

}
