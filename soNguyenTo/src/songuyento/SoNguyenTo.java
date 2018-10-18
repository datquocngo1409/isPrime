package songuyento;

public class SoNguyenTo {

    static boolean isPrime(int x){
        if(x==2 || x==3) return true;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        if(isPrime(number)) System.out.println(number + " is Prime");
        else System.out.println(number+" not is prime");
    }
    
}
