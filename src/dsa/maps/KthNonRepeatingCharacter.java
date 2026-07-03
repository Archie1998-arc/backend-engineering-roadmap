package dsa.maps;

public class KthNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "archanapandit";
        int k =3;
        System.out.println(getKthNonRepeatingChar(str,k));

    }
    public static char getKthNonRepeatingChar(String str, int k){
        char res =' ';
        if(str.isBlank() || str.length() <k )  return res;
        int[] freq = new int[26];
        int count =0;
        for(int i= 0;i<str.length();i++){
            freq[str.charAt(i) -'a'] +=1;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq[ch -'a'] ==1){
                count++;
            }
            if(count ==k){
                res= ch;
                break;
            }
        }
        return res;
    }
}
