package com.example.rag4j.service;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Tool
    public String getWeather(@P("The city for which the weather forecast should be returned") String city) {
        return "The weather in " + city + " is 72 degrees and sunny.";
    }
}
