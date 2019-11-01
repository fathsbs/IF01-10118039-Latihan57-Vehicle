/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang menampilkan informasi tentang skateboard dan bicycle  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle bc, sb;

        bc = new Bicycle();
        bc.setMyBrand("Trek Bike");
        bc.setMyModel("7.4FX");
        ((Bicycle) bc).setMyGearCount(23);
        System.out.printf("Brand\t\t: %s%n", bc.getMyBrand());
        System.out.printf("Model\t\t: %s%n", bc.getMyModel());
        System.out.printf("Jumlah Gear\t: %s%n%n", ((Bicycle) bc).getMyGearCount());

        sb = new Skateboard();
        sb.setMyBrand("Ally Skate");
        sb.setMyModel("Rocket");
        ((Skateboard) sb).setMyBoardLength(54.5);
        System.out.printf("Brand\t\t: %s%n", sb.getMyBrand());
        System.out.printf("Model\t\t: %s%n", sb.getMyModel());
        System.out.printf("Jumlah Gear\t: %s%n%n", ((Skateboard) sb).getMyBoardLength());

    }

}
