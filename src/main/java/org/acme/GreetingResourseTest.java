package org.acme;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;





@QuarkusTest
public class GreetingResourseTest {

    @TestHTTPResource("/myservlet")
    URL testUrl;


    @Test
    public void testGreetingEndpoint() {

        given()
                .when().get("hello")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

    @Test
    public void testHelloEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when().get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello" + uuid));

    }
}


