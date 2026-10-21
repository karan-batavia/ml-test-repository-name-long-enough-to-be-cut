package com.mltest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class PaymentClient5 {
    private final RestTemplate restTemplate = new RestTemplate();

    public String charge5(String creditCardNumber, String cvv) {
        Map<String, String> body = new HashMap<>();
        body.put("credit_card_number", creditCardNumber);
        body.put("cvv", cvv);
        return restTemplate.postForObject("https://api.stripe.com/v1/charges", body, String.class);
    }
}
