public class PolindromeNumber{
    public boolean isPolindrome(int x){
        int a,sum = 0;
        int number;
        
        number = x;
        
        while(x>0){
            a = x%10;
            sum = (sum*10)+a;
            x = x/10;
        }
        if(number == sum){
            return true;
        }else{
            return false;
        }
    }
}