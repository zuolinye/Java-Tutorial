package object.student_private;
/*
 * ͨ������ֱ�ӷ��ʳ�Ա��������������ݰ�ȫ����
 * ���ʱ�����Ǿ����ܲ��ܲ������Ķ���ֱ�ӷ��ʳ�Ա������?
 * �ܡ�
 * ���ʵ����?
 * 		private�ؼ���
 * 
 * private:
 * 		��һ�����η�
 * 		�������γ�Ա������Ҳ�������γ�Ա����
 * 		��private���εĳ�Աֻ���ڱ����б�����
 * 
 * ���private���εĳ�Ա���������ǻ���Ӧ���ṩgetXxx()��setXxx()���ڻ�ȡ�����ó�Ա������ֵ,������public����
 * ѧ����
 * */
public class StudentPrivate {
	private String name;
	private int age;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age =a;
	}
	
	public int getAge(){
		return age;
	}

}
