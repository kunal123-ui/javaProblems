package String;

class RepEvenToZero{
    public static void main(String[]args){
        String n="123456789";
        String res=n.replaceAll("[02468]","0");
        System.out.print(res);
    }
}