package br.com.rjguastalli.rest.core;

import io.restassured.http.ContentType;

public interface Constante {

    String APP_BASE_URL = "https://barrigarest.wcaquino.me/";
    Integer APP_PORTA = 443; // http -> 80
    String APP_BASE_PATH = "";
    ContentType APP_CONTENT_TYPE = ContentType.JSON;
    Long MAX_TIMEOUT = 1000L;

}
