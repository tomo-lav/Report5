package jp.ac.uryukyu.ie.e165709;

public class Main {

    public static void main (String[] args){
        String str = "3．14" ;
        try {
        System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("Warning: Exception detected");
            e.printStackTrace();

        }
        double value = Double.parseDouble(str);
    }
}
