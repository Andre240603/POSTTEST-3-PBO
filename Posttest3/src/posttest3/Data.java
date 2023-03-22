package posttest3;


class Data { // digunakan untuk menyimpan informasi tentang objek-objek yang dibuat dalam program.
    private String name; // atribut yang hanya bisa diakses di class yang sama
    private String tanggalBrg;
    private String StokMasuk;


    public Data(String name, String tanggalBrg,String StokMasuk) {
        this.name = name; // untuk menginisialisasi atribut "name"
        this.tanggalBrg = tanggalBrg;
        this.StokMasuk = StokMasuk;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tanggalBrg
     */
    public String getTanggalBrg() {
        return tanggalBrg;
    }

    /**
     * @param tanggalBrg the tanggalBrg to set
     */
    public void setTanggalBrg(String tanggalBrg) {
        this.tanggalBrg = tanggalBrg;
    }
    
     /**
     * @return the StokMasuk
     */
    public String getStokMasuk() {
        return StokMasuk;
    }

    /**
     * @param StokMasuk the StokMasuk to set
     */
    public void setStokMasuk(String StokMasuk) {
        this.StokMasuk = StokMasuk;
    }
    
}
