/**
 * 
 */
package demo1;

/**
 * @author Josehp
 *
 */
public class User {

	/**
	 * @param args
	 */
	


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 Vehicle car1,car2;    
	     car1=new Vehicle(); //ʹ��new �������Ĭ�ϵĹ��췽����������car1
	      car2=new Vehicle(); //ʹ��new �������Ĭ�ϵĹ��췽����������car2
	      car1.setPower(128);   
	      car2.setPower(76);
	      System.out.println("car1�Ĺ����ǣ�"+car1.getPower());
	      System.out.println("car2�Ĺ����ǣ�"+car2.getPower());
	      car1.speedUp(80);  //car1����speedUp�������Լ���speed��ֵ����80
	      car2.speedUp(100); //car2����speedUp�������Լ���speed��ֵ����80
	      System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
	      System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
	      car1.speedDown(10);
	      car2.speedDown(20);
	      System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
	      System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
		  //xixi
		  //�汾2
	}

}
