/**
 * 
 */
package demo2;

/**
 * @author Josehp
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TV haierTV = new TV(); 
	      haierTV.setChannel(5); //haierTV����setChannel(int m),�������m����5
	       System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
	       Family zhangSanFamily = new Family();
	       zhangSanFamily.buyTV(haierTV);//zhangSanFamily����void buyTV(TV tv)����,����haierTV���ݸ�����TV
	       System.out.println("zhangSanFamily��ʼ�����ӽ�Ŀ");
	       zhangSanFamily.seeTV();
	       int m=2; 
	       System.out.println("hangSanFamily�����Ӹ�����"+m+"Ƶ��");
	       zhangSanFamily.remoteControl(m);
	       System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
	       System.out.println("hangSanFamily�ٿ����ӽ�Ŀ");
	       zhangSanFamily.seeTV();       
	       Family lisiFamliy=new Family();
	       lisiFamliy.buyTV(haierTV);
	       lisiFamliy.seeTV();
	}

}
