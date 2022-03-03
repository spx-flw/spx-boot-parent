package cn.spx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.LoggerContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.URI;

/**
 * 开启定时任务
 *   @author mlmdflr
 */
@EnableScheduling
@SpringBootApplication
public class ConfigureStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigureStartApplication.class, args);
    }

}


