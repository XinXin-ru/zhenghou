package java0412.bank;

class MethodTest {
    public static void main(String[]args){
        Bank bank=new Bank();
        Object locker=new Object();
        //把A设置为wait，把B设置为notify

        //柜台 等待线程
        PersonA personA=new PersonA(bank,locker);
        Thread threadA=new Thread(personA);
        threadA.start();

        //ATM 通知线程
        PersonB personB=new PersonB(bank,locker);
        Thread threadB=new Thread(personB);
        threadB.start();
    }
}
