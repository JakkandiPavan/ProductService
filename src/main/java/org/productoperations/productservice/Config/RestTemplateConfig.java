package org.productoperations.productservice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestemplate()
    {
        // @Bean -> @Bean' not applicable to local variable
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
