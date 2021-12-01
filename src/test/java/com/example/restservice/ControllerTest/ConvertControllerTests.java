package com.example.restservice.ControllerTest;


import com.example.restservice.controller.ConvertController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ConvertController.class)
@ExtendWith(SpringExtension.class)
public class ConvertControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void checkEndPointTest() throws Exception {
        mockMvc.perform(get("/convert")).andExpect(status().is2xxSuccessful());
    }





}
