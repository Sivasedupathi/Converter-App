package com.example.restservice.ControllerTest;


import com.example.restservice.controller.ConvertController;
import com.example.restservice.service.ConvertService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ConvertControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ConvertService convertService= new ConvertService();

    @InjectMocks
    private ConvertController convertController = new ConvertController();


    @BeforeEach
    public void setup() {
        JacksonTester.initFields(this, new ObjectMapper());
        mockMvc = MockMvcBuilders.standaloneSetup(convertController)
                .setControllerAdvice()
                .addFilters()
                .build();
    }


    @Test
    public void checkServiceCall() throws Exception {
        // given
        given(convertService.callService("2"))
                .willReturn("II");

        // when
        MockHttpServletResponse response = mockMvc.perform(MockMvcRequestBuilders.get("/convert?value=2"))
                .andReturn().getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("II");

    }

}
