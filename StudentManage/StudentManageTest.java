package com.itheima;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ѧ������ϵͳ����
 * 
 * ��Ҫ����
 * 	1. ����ѧ����
 * 	2. ѧ������ϵͳ������
 * 	3. ��
 * 	4. ��
 * 	5. ɾ
 * 	6. ��
 * 
 * */
public class StudentManageTest {
	public static void main(String[] args) {
		//�������϶������ڴ洢ѧ������
		ArrayList<Student> array = new ArrayList<Student>();
		
		//Ϊ���ó����ܹ��ص�������������ʹ��ѭ��
		while(true) {		
			System.out.println("--------��ӭ����ѧ������ϵͳ--------");
			System.out.println("1 �鿴����ѧ��");
			System.out.println("2 ���ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �޸�ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");
			
			// ��������¼�����
			Scanner sc = new Scanner(System.in);
			// ��������
			String choiceString = sc.nextLine();
			// �����ж�ѡ��
			switch (choiceString) {
			case "1":
				//�鿴����ѧ��
				findAllStudent(array);
				break;
			case "2":
				addStudent(array);
				//���ѧ��
				break;			
			case "3":
				//ɾ��ѧ��
				deleteStudent(array);
				break;
			case "4":
				//�޸�ѧ��
				break;
			case "5":
				//�˳�
				//System.out.println("лл���ʹ��");
				//break;
			default:
				System.out.println("лл���ʹ��");
				System.exit(0); //JVM�˳�
				break;
			}
		}
	}
	
	//ɾ��ѧ��
	public static void deleteStudent(ArrayList<Student> array) {
		//ɾ��ѧ����˼·������¼��һ��ѧ�ţ���������ȥ���ң����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о�ɾ����ѧ��
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");
		String id = sc.nextLine();
		
		/*//��������
		for(int x=0; x<array.size(); x++) {
			//��ȡ��ÿһ��ѧ������
			Student s = array.get(x);
			//�����ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if(s.getId().equals(id)) {
				array.remove(x); //��������ɾ��
				break;
			}
		}
		
		//������ʾ
		System.out.println("ɾ��ѧ���ɹ�");*/
		
		//����һ������
		int index = -1;
		
		//��������
		for(int x=0; x<array.size(); x++) {
			//��ȡ��ÿһ��ѧ������
			Student s = array.get(x);
			//�����ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if(s.getId().equals(id)) {
				index = x;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("������˼,��Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		}else {
			array.remove(index);
			System.out.println("ɾ��ѧ���ɹ�");
		}
			
	}
	
	//���ѧ��
	public static void addStudent(ArrayList<Student> array) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//Ϊ����id�ܹ������ʵ������ǾͰ�id��������ѭ��������
		String id;
		
		//Ϊ���ô����ܹ��ص������ѭ��
		while(true) {
			System.out.println("������ѧ��ѧ�ţ�");
			//String id = sc.nextLine();
			id = sc.nextLine();
			
			//�ж�ѧ����û�б���ռ��
			//������
			boolean flag = false;
			//�������ϣ��õ�ÿһ��ѧ��
			for(int x=0; x<array.size(); x++) {
				Student s = array.get(x);
				//��ȡ��ѧ����ѧ�ţ��ͼ���¼���ѧ�Ž��бȽ�
				if(s.getId().equals(id)) {
					flag = true; //˵��ѧ�ű�ռ����
					break;
				}
			}
			
			if(flag) {
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			}else {
				break; //����ѭ��
			}
		}
			
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//��ѧ��������ΪԪ����ӵ�����
		array.add(s);
		
		System.out.println("���ѧ���ɹ�");
	}
	
	//�޸�ѧ��
	public static void updateStudent(ArrayList<Student> array) {
		//�޸�ѧ����˼·������¼��һ��ѧ�ţ���������ȥ���ң����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о��޸ĸ�ѧ��
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
		String id = sc.nextLine();
		
		//����һ������
		int index = -1;
		
		//��������
		for(int x=0; x<array.size(); x++) {
			//��ȡÿһ��ѧ������
			Student s = array.get(x);
			//��ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if(s.getId().equals(id)) {
				index = x;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		}else {
			System.out.println("������ѧ����������");
			String name = sc.nextLine();
			System.out.println("������ѧ�������䣺");
			String age = sc.nextLine();
			System.out.println("������ѧ���¾�ס�أ�");
			String address = sc.nextLine();
			
			//����ѧ������
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			//�޸ļ����е�ѧ������
			array.set(index, s);
			
			//������ʾ
			System.out.println("�޸�ѧ���ɹ�");
		}
	}
	
	//�鿴����ѧ��	
	public static void findAllStudent(ArrayList<Student> array){
		//�������жϼ������Ƿ������ݣ����û�����ݣ��͸�����ʾ�����ø÷�������������ִ��
		if(array.size() == 0) {
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
			return;
		}
		
		//\t ��ʵ����һ��tab����λ��
		System.out.println("ѧ��\t\t����\t����\t��ס��");
		for(int x=0; x<array.size(); x++) {
			
			Student s = array.get(x);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
		
	}

}
