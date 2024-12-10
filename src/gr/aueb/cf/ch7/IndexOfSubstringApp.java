package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); // 1
        int positionOfSecondo = cf.indexOf("o" , 2); //11
        int lastPositionOfo = cf.lastIndexOf("o"); //11

        String cf2 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1,3); //"od"
    }
}
