package pojos;
// Generated Oct 31, 2018 3:31:57 PM by Hibernate Tools 3.6.0



/**
 * Klinik generated by hbm2java
 */
public class Klinik  implements java.io.Serializable {


     private String idKlinik;
     private String nama;
     private String spesialis;

    public Klinik() {
    }

	
    public Klinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    public Klinik(String idKlinik, String nama, String spesialis) {
       this.idKlinik = idKlinik;
       this.nama = nama;
       this.spesialis = spesialis;
    }
   
    public String getIdKlinik() {
        return this.idKlinik;
    }
    
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSpesialis() {
        return this.spesialis;
    }
    
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String toJson() {
        return "{\"idKlinik\":\"" + getIdKlinik()+ "\",\"nama\":\"" + getNama()
                + "\",\"spesialis\":\"" + getSpesialis()+"\"}";
    }



}


