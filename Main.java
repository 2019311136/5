package ʵ��5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        FileUtils fu = new FileUtils();
	        PoetryUtils pu = new PoetryUtils();

	        String sno = "";
	        String name = "";
	        int age = 0;
	        String classes = "";

	        boolean validate = false;
	        while (!validate) {
	            try {
	                System.out.println("������ѧ��ѧ�ţ�");
	                sno = input.nextLine();
	                System.out.println("������ѧ��������");
	                name = input.nextLine();
	                System.out.println("������ѧ�����䣺");
	                String ages = input.nextLine();
	                age = Integer.parseInt(ages);
	                System.out.println("������ѧ�����");
	                classes = input.nextLine();
	                validate = true;
	            } catch (Exception e) {
	                System.out.println("������Ϣ�������������룡");
	                input = new Scanner(System.in);
	            }
	        }

	        Student student = new Student(sno,name,age,classes);
	        if (fu.saveStuMsg(student))
	            System.out.println("�洢ѧ����Ϣ�ɹ���");

	        String poetry = pu.processPoetry(fu.readB());
	        if (fu.saveStrMsg(poetry))
	            System.out.println("�洢��ʫ��Ϣ�ɹ���");
	    }
		// TODO Auto-generated method stub

	}


