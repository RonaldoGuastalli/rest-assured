package br.com.rjguastalli.rest.core;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.BeforeClass;


public class BaseTest implements Constante {

    private BaseTest() {
    }

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = APP_BASE_URL;
        RestAssured.port = APP_PORTA;
        RestAssured.basePath = APP_BASE_PATH;
        RestAssured.requestSpecification = requestSpecBuilder();
        RestAssured.responseSpecification = responseSpecBuilder();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    private static RequestSpecification requestSpecBuilder() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType(APP_CONTENT_TYPE);
        return requestSpecBuilder.build();
    }

    private static ResponseSpecification responseSpecBuilder() {
        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));

        return null;
    }
}

