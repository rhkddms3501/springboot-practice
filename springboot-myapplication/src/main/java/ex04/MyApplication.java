package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication 메타 어노테이션
 * 
 *	+ @SpringBootConfiguration: 참고) ex01, ex02
 *	+ @ComponentScan : ex04 패키지를 스캐닝한다.
 *	+ @EnableAutoConfiguration :
 *		1. MVC, AOP, Security, JPA 등을 자동 "default"(**세부 설정 필수**) 으로 설정
 *		2. 발견된 Starter Dependency(Library) 기반으로 설정한다.
 *
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		// 자원정리
		try( ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args) ){}
	
		
	}
}
