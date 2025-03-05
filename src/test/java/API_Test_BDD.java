import static io.restassured.RestAssured.*;

public class API_Test_BDD {
	public static void main(String[] args) {
		given().baseUri("https://reqres.in/api/users?page=2")
		.when()
		.get()
		.prettyPrint();
		
		
		
		
	}

}
