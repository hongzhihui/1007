/**
 * 
 */
package demo1;

/**
 * @author Josehp
 *
 */
public class Vehicle {
    double speed;//����double�ͱ���speed,�̻��ٶ�
    int power;//����int�ͱ���power,�̻�����
    void speedUp(int s) {  
       speed=s+speed;   //������s��ֵ���Ա����speed�ĺ͸�ֵ����Ա����speed
       if(speed>200)
       {  System.out.println("error");
       speed=speed-s;}
    } 
    void speedDown(int d) {   
       speed=speed-d; //����Ա����speed�����d�Ĳֵ����Ա����speed
       if(speed<0)
       {  System.out.println("error");
       speed=speed+d;}
    } 
    void setPower(int p) {
       power=p;//������p��ֵ��ֵ����Ա����power
    }
    void brake(){
    	speed=0;
    }
    int getPower() {
       return power; //���س�Ա����power��ֵ
    }
    double getSpeed() {
       return speed;
    }
}
