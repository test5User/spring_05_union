package by.itclass.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
//@ComponentScan(basePackages = {"by.itclass.controllers", "by.itclass.model.repositories"})
@ComponentScan("by.itclass")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        var vr = new InternalResourceViewResolver();
        vr.setPrefix("/pages/");
        vr.setSuffix(".jsp");
        return vr;
    }
}
