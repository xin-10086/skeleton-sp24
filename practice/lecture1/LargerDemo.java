package lecture1;

public class LargerDemo {
    public static int larger(int x,int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(larger(-5,10));
    }
}
/*
1.函数必须是类的一部分
2.函数的定义与c++相比要加上 public static
3.类型必须明确
*/
