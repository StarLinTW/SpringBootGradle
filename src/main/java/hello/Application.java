package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by mars on 2016/5/4.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    // Used when deploying to a standalone servlet container
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    // Used when launching as an executable jar or war
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}