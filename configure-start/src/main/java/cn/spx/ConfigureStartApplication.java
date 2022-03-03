package cn.spx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
/**
 * 开启定时任务
 */
@EnableScheduling
public class ConfigureStartApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir")+"configure-start\\src\\main\\resources\\log4j2.xml");
        SpringApplication.run(ConfigureStartApplication.class, args);
    }

}
