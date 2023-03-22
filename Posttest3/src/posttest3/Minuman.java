/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author User
 */
public class Minuman extends Data {
    private String Ukuran;
    private String Topping;
    
    public Minuman(String name, String tanggalBrg, int StokMasuk1, String StokMasuk, String Topping1) {
        super(name, tanggalBrg, StokMasuk);
        this.Ukuran = Ukuran;
        this.Topping = Topping;
    }
    
    
    
    
     public void notif() {
        System.out.println("Berhasil ditambahkan dikategori Anak - anak. ");
    }

    /**
     * @return the Ukuran
     */
    public String getUkuran() {
        return Ukuran;
    }

    /**
     * @param Ukuran the Ukuran to set
     */
    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    /**
     * @return the Topping
     */
    public String getTopping() {
        return Topping;
    }

    /**
     * @param Topping the NamaKepalaKeluarga to set
     */
    public void setTopping(String Topping) {
        this.Topping = Topping;
    }
}
