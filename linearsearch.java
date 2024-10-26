import java.util.Scanner;

public class linearsearch{

    static boolean search(String str, char ch){
            if(str.length() == 0){
                return false;
            }
            for(int i = 0; i<str.length() ;i++){
                if(ch == str.charAt(i)){
                    return true;
                }                        
            }return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a word or pharase");
        String name = sc.nextLine();
        System.out.println("enter the letter to find");
        char target = sc.next().charAt(0);
        System.out.println(search(name ,target));
    }
}