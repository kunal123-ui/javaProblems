package String;
class RevVowInStr{
    public static boolean vow(char c){
        return c == 'a' || c== 'e' || c == 'i'
                || c== 'o' || c == 'u';
    }
    public static void main(String[] args){
        String w="hello";
        char[] a = w.toCharArray();
        for (int i = 0, j = a.length - 1; i < j; ) {
            if(!vow(a[i])){
                i++;
            }
            else if(!vow(a[j])){
                j--;
            }
            else{
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}