package Day1;

public class Question7 {
    public static void main(String[] args) {
        findSubStrings("hello");
    }

    public static void findSubStrings(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
