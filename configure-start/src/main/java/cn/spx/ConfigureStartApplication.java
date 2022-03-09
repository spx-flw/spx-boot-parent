package cn.spx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 开启定时任务
 *
 * @author mlmdflr
 */
@EnableScheduling
@SpringBootApplication
@ComponentScans({
        @ComponentScan("api"),
        @ComponentScan("config")
})
public class ConfigureStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigureStartApplication.class, args);
    }

}


