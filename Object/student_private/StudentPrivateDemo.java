package object.student_private;
/*
 * ѧ��������
 * */
public class StudentPrivateDemo {
	public static void main(String[] args) {
		// ��������
		StudentPrivate s = new StudentPrivate();
		System.out.println("������"+s.getName()+"----"+"���䣺"+s.getAge());
		//��ֵ
		s.setName("����");
		s.setAge(28);
		System.out.println("������"+s.getName()+"----"+"���䣺"+s.getAge());
	}

}
