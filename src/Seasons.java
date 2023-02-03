public class Seasons {

    public void sezon(int a) {
        if (a <= 2 && a >=1) {
            System.out.println("Zima");
        } else if (a >=3  && a <=5) {
            System.out.println("Vesna");

        } else if (a >=6 && a <= 8) {
            System.out.println("leta");
        } else if (a>=9&&a<=11) {
            System.out.println("Osen");
        }
     else if (a==12) {
            System.out.println("Zima");
        } else System.out.println(" myndai ai jok");

    }
}
