package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] config = new String[]{"appConfig.xml"};
		//스프링 컨테이너 생성
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Test2 t = (Test2) context.getBean("t2");
		System.out.println(t);
		
		Test2 t2 = (Test2) context.getBean("t3");
		System.out.println(t2);
		
/*		Test t = (Test) context.getBean("t");
		System.out.println("str:" + t.str);
		System.out.println("num:" + t.num);
		
		Test t2 = (Test) context.getBean("t2");
		System.out.println("str:" + t2.str);
		System.out.println("num:" + t2.num);
		
		Test t3 = (Test) context.getBean("t3");
		System.out.println("str:" + t3.str);
		System.out.println("num:" + t3.num);
		
		Test t4 = (Test) context.getBean("t4");
		System.out.println("str:" + t4.str);
		System.out.println("num:" + t4.num);*/
	}

}
