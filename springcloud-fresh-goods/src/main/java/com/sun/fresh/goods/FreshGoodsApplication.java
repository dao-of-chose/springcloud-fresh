package com.sun.fresh.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@MapperScan("com.sun.fresh.goods.mapper")
@SpringBootApplication
@EnableEurekaClient			//将应用注册到eureka服务
@EnableRedisHttpSession    //将session缓存到redis中
public class FreshGoodsApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreshGoodsApplication.class, args);
	}
}
