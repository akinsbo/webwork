package com.laveolu.webwork;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebworkApplicationTests {
        
    @Autowired
    
	@Test
	public void contextLoads() throws Exception {
            assertThat(controller).isNotNull;
	}

}
