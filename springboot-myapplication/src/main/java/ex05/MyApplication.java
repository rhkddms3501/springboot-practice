package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * Application Context가 구성된 이후, 실행할 코드(Application Context 환경에 의존)가 있으면,
 * ApplicationRunner 인터페이스의 구현 클래스 빈(HelloWorldRunner) 사용하기
 *
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		// 자원정리
		try( ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args) ){
			
		}
	}
}
