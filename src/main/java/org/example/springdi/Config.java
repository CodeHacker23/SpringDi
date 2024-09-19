package org.example.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example.springdi")
public class Config { // условно мезаник который заставляет езать машину на том или ином двс

    @Bean
    public  Engine engine1() {
        return new Engine("G4FC");
    }

    @Bean
    public Engine engine(){
        return new Engine("F16D3");

    }

    @Bean
    public Auto auto1() { // даллее содаем уже бин с интеграцией нашего бина двс (engine1)
        return new Auto("Auto1", engine1());
    }

    @Bean
    public  Auto auto2(Engine engine){ // вот так можно передавать сразу в параметр, лучше использовать сразу вот такой способ
        return  new Auto("Auto2", engine);

    }



}
