package org.springtutorial.removeXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.springtutorial.removeXML")
public class JavaConfig {
    public JavaConfig() {
        System.out.println("Inside the Java Config");
    }

    @Bean
    public Hotel getHotel(){
        return new Hotel();
    }
    @Bean
    public HotelMenu getHotelMenu(){
        return new HotelMenu();
    }
}
