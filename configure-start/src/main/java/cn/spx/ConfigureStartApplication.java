package cn.spx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 开启定时任务
 *
 * @author mlmdflr
 */
@EnableScheduling
@SpringBootApplication
public class ConfigureStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigureStartApplication.class, args);
    }

}


