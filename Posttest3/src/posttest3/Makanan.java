/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author User
 */
public class Makanan extends Data{
    private String Rasa;
    private String Jenis;
    
    public Makanan(String name, String tanggalBrg, String StokMasuk, String Jenis, String Rasa) {
        super(name, tanggalBrg, StokMasuk);
        this.Rasa = Rasa;
        this.Jenis = Jenis;
    }

    /**
     * @return the Rasa
     */
    public String getRasa() {
        return Rasa;
    }

    /**
     * @param Rasa the statusPerkawinan to set
     */
    public void setRasa(String Rasa) {
        this.Rasa = Rasa;
    }

    /**
     * @return the Jenis
     */
    public String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    
}