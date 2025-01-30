package com.example.test_git_flow.phouse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PHouseConfig {

    @Bean(name = "laTerza")
    public PHouse laTerza() {
        PHouse pHouse = new PHouse();
        pHouse.setId(1L);
        pHouse.setName("La Terza");
        pHouse.setLocation("Rome");
        pHouse.setOwner("Giovanni");
        pHouse.setAddress("Via Roma 1");
        return pHouse;
    }

    @Bean(name = "laQuarta")
    public PHouse laQuarta() {
        PHouse pHouse = new PHouse();
        pHouse.setId(2L);
        pHouse.setName("La Quarta");
        pHouse.setLocation("Rome");
        pHouse.setOwner("Giovanni");
        pHouse.setAddress("Via Roma 2");
        return pHouse;
    }

    @Bean(name = "laQuinta")
    public PHouse laQuinta() {
        PHouse pHouse = new PHouse();
        pHouse.setId(3L);
        pHouse.setName("La Quinta");
        pHouse.setLocation("Rome");
        pHouse.setOwner("Giovanni");
        pHouse.setAddress("Via Roma 3");
        return pHouse;
    }

}
