package object.Phone;
/*
 * 手机类的测试类
 * */
public class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		
		//给成员变量赋值
		p.brand = "锤子";
		p.price = 2999;
		p.color = "棕色";
		
		//输出成员变量值
		System.out.println("品牌："+p.brand);
		System.out.println("颜色:"+p.color);
		System.out.println("价格:"+p.price);
		System.out.println("------------");
		//成员方法
		p.call("女票");
		p.sendMessage();
	}

}
