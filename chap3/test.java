import java.util.LinkedList;
import java.util.List;

public class test{
    public static void main(String args[]){
        List<Integer> lst = new LinkedList<Integer>();
        makeList1(lst, 10);
        for(Integer x:lst)
            System.out.println(x);
        
    }

    // 末端添加一些项目来构造一个List
    public static void makeList1(List<Integer> lst, int N){
        lst.clear();
        for(int i = 0; i < N; i++)
            lst.add(i);
    }

    // 
}