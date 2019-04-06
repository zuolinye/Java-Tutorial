package object.student;
/*
 * Student类：
 * 成员变量：姓名、年龄...
 * 成员方法：学习、吃饭...
 * 成员变量：和变量的定义是一样的。
 * 		位置不同：类中，方法外
 * 		初始化值：不需要给初始化值
 * 成员方法：和我们前面学习过的方法的定义是一样的。
 * 		去掉static关 键字
 * */
public class Student {
	//成员变量
	//姓名
	String name;
	//年龄
	int age;
	
	//成员方法
	//学习的方法
	public void study(){
		System.out.println("好好学习、天天向上");
		
	}
	
	//吃饭的方法
	public void eat(){
		System.out.println("学习饿了，要吃饭");
	}
	


}
