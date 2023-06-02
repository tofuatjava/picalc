package functions;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;

@QuarkusTest
public class FunctionTest {

    @Test
    public void testFunctionIntegration() {
        RestAssured.given()
                .get("/")
                .then().statusCode(200)
                .body(containsString("3.14"));
    }
}