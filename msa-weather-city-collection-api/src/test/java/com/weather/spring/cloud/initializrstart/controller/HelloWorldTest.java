package com.weather.spring.cloud.initializrstart.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello()
    {
        try
        {
            mockMvc.perform(MockMvcRequestBuilders.get("/test/hello").accept(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().isOk()).andExpect(content().string(equalTo("Hello World !")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
