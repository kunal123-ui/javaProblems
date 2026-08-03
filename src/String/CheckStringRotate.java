package String;

public class CheckStringRotate {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        if (str1.length() != str2.length()) {
            System.out.println("Not Rotation");
            return;
        }
        String temp = str1 + str1;

        boolean found = false;

       for (int i=0;i<=temp.length()-str2.length();i++){
           for (int j=0;j<str2.length();j++){
               if(temp.charAt(i+j) != str2.charAt(j)){
                   break;
               }
               else if( j == str2.length()){
                   found = false;
               }
           }
       }

        if (found)
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}

/*
* public class Main {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if (str1.length() == str2.length() &&
            (str1 + str1).contains(str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}*/