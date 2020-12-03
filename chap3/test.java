public class test{
    public static void main(String args[]){
        int [ ] arr = new int[ 10 ];
        int [ ] newArr = new int[ arr.length * 2];
        for( int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
            System.out.println(arr[i]);
        }
        arr = newArr;

    }
}