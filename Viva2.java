package viva.pkg2;

public class Viva2 {
    public static String format(int num, int width){
        String x = String.valueOf(num);
        String newString = "";
        if (width>x.length()){
            int numOfZero = width - x.length();
            for (int i = 1; i <= numOfZero; i++)
                newString += "0";
            newString += x;
        return newString;
        }
        else
            return x;
    }
    
    public static void main(String[] args) {
        String a = format(34, 4);
        String b = format(34, 5);
        String c = format(34, 1);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
