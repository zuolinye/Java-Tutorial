package object.Phone;
/*
 * �ֻ���Ĳ�����
 * */
public class PhoneDemo {
	public static void main(String[] args) {
		//��������
		Phone p = new Phone();
		
		//����Ա������ֵ
		p.brand = "����";
		p.price = 2999;
		p.color = "��ɫ";
		
		//�����Ա����ֵ
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("��ɫ:"+p.color);
		System.out.println("�۸�:"+p.price);
		System.out.println("------------");
		//��Ա����
		p.call("ŮƱ");
		p.sendMessage();
	}

}
