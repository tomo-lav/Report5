package jp.ac.uryukyu.ie.e165709;

public class Main {

    public static void main (String[] args){
        try {
        String str = null ;
        System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("Warning: Exception detected");
            e.printStackTrace();

        }
    }
}
