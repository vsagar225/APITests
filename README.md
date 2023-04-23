# APITests
API Test to check the time taken to fetch the response for an API

Explanation of the code:

The first line imports the Test annotation from the TestNG library, which is used for testing Java code.<BR>
The second line imports the given() method from the RestAssured library, which is used for writing API tests.<BR>
The third line imports the TimeUnit class from the Java standard library, which is used for working with time intervals.<BR>
The next line defines a public class called WeatherAPITest, which contains the test method.<BR>
The next line defines a constant String called url, which holds the base URL for the OpenWeatherMap API.<BR>
The next line defines the test method called testGetWeather, which is annotated with @Test. <BR>
<BR>
Inside the testGetWeather method,
<BR> the println statement prints out the time taken to fetch the response by making an API request to the OpenWeatherMap API using the given() method and the get() method. 
<BR> The timeIn() method is then used to specify the time unit in which the response time should be measured, 
<BR> which is milliseconds in this case.

Overall, this code is a simple API test that measures the time it takes to fetch the response from the OpenWeatherMap API using RestAssured library.
