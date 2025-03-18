package gr.aueb.cf.excercises;

public class Main {

    public static void main(String[] args) {
        PointXYZ pointxyz = new PointXYZ(2,4,1);
        System.out.println(pointxyz.convertToString());
        System.out.println(pointxyz.getXYDistance());
        System.out.println(pointxyz.getXYZDistance());
        System.out.println(pointxyz.getXZDistance());
        System.out.println(pointxyz.getYZDistance());
    }


}
