package com.objevsoft.qa;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

public class WeatherAPITest {

    final static String url= "https://api.openweathermap.org/data";

    @Test
    public void testGetWeather() {
    	
    	System.out.println("The time taken to fetch the response "+given().when().get(url)
        .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
    	   
    }
}