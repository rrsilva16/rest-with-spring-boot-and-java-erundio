package br.com.erudio.apigateway;

import lombok.Data;

@Data
public class Greeting {
    private final Long id;
    private final String content;
}
