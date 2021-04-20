package java0415;

public class Calculator {
    //加法
    @CheckError
    public double add(int x,int y){
        return x+y;
    }
    //除法
    @CheckError
    public double div(int x,int y){
        return  x/y;
    }
    //减法
    public  double sub(int x,int y){
        return x-y;
    }
}
