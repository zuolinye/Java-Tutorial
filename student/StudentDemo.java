package object.student;
/*
 * Student��һ��ѧ�����������࣬main�������ʺϷ��������档
 * 
 * ʹ��һ���࣬��ʵ����ʹ�ø���ĳ�Ա��(��Ա�����ͳ�Ա����)
 * ������Ҫ��ʹ��һ����ĳ�Ա���ͱ�������ӵ�и���Ķ���
 * �������ӵ��һ����Ķ�����?
 * 		��������Ϳ�����?
 * ������δ���������?
 * 		��ʽ������ ������ = new ����();
 * ������η��ʳ�Ա��?
 * 		��Ա������������.������
 * 		��Ա������������.������(...)
 */
public class StudentDemo {
	public static void main(String[] args) {
		//��������
		Student s = new Student();
		System.out.println("����:"+s.name);
		System.out.println("����:"+s.age);
		System.out.println("-----------");
		
		//����Ա������ֵ
		s.name = "����";
		s.age = 28;
		System.out.println("����:"+s.name);
		System.out.println("����:"+s.age);
		System.out.println("-----------");
		
		//���ó�Ա����
		s.study();
		s.eat();
		
	}

}
