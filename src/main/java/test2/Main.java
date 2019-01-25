package test2;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] config = new String[]{"appConfig.xml"};
		//스프링 컨테이너 생성
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		Menu menu = (Menu) context.getBean("menu");
		Scanner sc = new Scanner(System.in);
		menu.run(sc);
	}

}
