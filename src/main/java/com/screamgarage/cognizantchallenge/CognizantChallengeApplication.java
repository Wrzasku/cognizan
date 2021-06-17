package com.screamgarage.cognizantchallenge;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CognizantChallengeApplication {

    public static void main(final String... args) {

        new SpringApplicationBuilder(CognizantChallengeApplication.class)
                .headless(true)
                .run(args);
    }

}
