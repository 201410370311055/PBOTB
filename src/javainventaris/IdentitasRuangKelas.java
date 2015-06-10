import java.io.Serializable;

public abstract class IdentitasRuangKelas implements Serializable {
private String namaRuang;
private String lokasiRuang;
private String Fakultas;

public IdentitasRuangKelas(){

}

public IdentitasRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas) {

this.namaRuang = namaRuang;
this.lokasiRuang = lokasiRuang;
this.Fakultas = Fakultas;
}


public void setNamaRuang(String namaRuang) {
this.namaRuang = namaRuang;
}

public void setLokasiRuang(String lokasiRuang) {
this.lokasiRuang = lokasiRuang;
}

public void setFakultas(String fakultas) {
Fakultas = fakultas;
}

public String getNamaRuang() {
return namaRuang;
}
public String getLokasiRuang() {
return lokasiRuang;
}
public String getFakultas() {
return Fakultas;
}


abstract public String deskripsiKelas();




}

