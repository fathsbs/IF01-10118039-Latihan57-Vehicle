/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang menampilkan informasi tentang skateboard dan bicycle    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Skateboard extends Vehicle {

    private double myBoardLength;

    public Skateboard() {
        System.out.println("Skateboard");
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

}
