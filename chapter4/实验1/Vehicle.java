public class Vehicle {
    double speed; //����double�ͱ���speed,�̻��ٶ�
    int power; //����int�ͱ���power,�̻�����
    void speedUp(int s) {      
       speed =speed+s;   //������s��ֵ���Ա����speed�ĺ͸�ֵ����Ա����speed
    } 
    void speedDown(int d) {   
       speed=speed-d;  //����Ա����speed�����d�Ĳֵ����Ա����speed
    } 
    void setPower(int p) {
       power=p;       //������p��ֵ��ֵ����Ա����power
    }
    int getPower() {
       return power;  //���س�Ա����power��ֵ
    }
    double getSpeed() {
       return speed;
    }
}

