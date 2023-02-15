package com.douzone.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * 1. 스프링 애플리케이션의 부트스트래핑 역할 : Bootstraping Class 
 * 		- ( 스프링 애플리케이션이 시작할 수 있도록 모든 준비를 하는것)
 * 2. 설정 클래스 역할 : Configuration Class
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일 ( Bootstrap )
		 * 
		 * 1. 애플리케이션 컨텍스트( Application Context, Spring Container 생성 )
		 * 2. 만약, 웹 애플리케이션이라면, 웹 애플리케이션 타입을 결정 ( SpringMVC or Rective )
		 * 3. 어노테이션 스캐닝 ( auto ) + Configuration Class를 통한 빈 생성/등록/와이어링 작업
		 * 4. 만약 웹 애플리게이켠 이고 타입이 Spring MVC이면
		 * 		- 내장(embeded) -> 서버(TOmcatEmbededServiceServletContainer) 인스턴스 생성
		 * 		- 서버 인스턴스에 웹 애플리케이션 배포
		 * 		- 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행
		 */
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
