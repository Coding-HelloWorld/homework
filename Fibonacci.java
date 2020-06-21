public class Fibonacci {
    private int val;

    public static int of (int val){
        int result = 0;
        if(val == 1 || val ==2){
            result = 1;
        }
        if(val > 2){
            result = of(val-1)+of(val-2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("200以内的Fibonacci数列项分别是");
        for(int i=1; i<=200; i++){
            of(i);
            if(of(i) < 200 || of(i) == 200){
                System.out.print(" "+of(i));
            }else{
                System.exit(0);
            }
        }
    }
}
