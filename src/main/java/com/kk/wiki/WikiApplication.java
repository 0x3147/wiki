package com.kk.wiki;

import ch.qos.logback.classic.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.kk.wiki.mapper")
public class WikiApplication {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址:\thttp:127.0.0.1:{}" , env.getProperty("server.port"));
    }

}
