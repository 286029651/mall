package com.ralph.mall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author Ralph.Chen
 * @date 2020/11/26
 */
@SpringBootApplication
public class MallApplication {

    private static final Logger logger = LoggerFactory.getLogger(MallApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MallApplication.class);
        Environment env = app.run(args).getEnvironment();
        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        logger.info(
                "\n----------------------------------------------------------\n\t"
                        + "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}\n"
                        + "----------------------------------------------------------\n",
                env.getProperty("spring.application.name"), protocol, env.getProperty("server.port"));
    }
}
