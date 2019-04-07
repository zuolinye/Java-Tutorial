package object.student_private;
/*
 * 学生测试类
 * */
public class StudentPrivateDemo {
	public static void main(String[] args) {
		// 创建对象
		StudentPrivate s = new StudentPrivate();
		System.out.println("姓名："+s.getName()+"----"+"年龄："+s.getAge());
		//赋值
		s.setName("胡歌");
		s.setAge(28);
		System.out.println("姓名："+s.getName()+"----"+"年龄："+s.getAge());
	}

}
