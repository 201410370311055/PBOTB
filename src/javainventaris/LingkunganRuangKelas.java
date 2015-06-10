import java.io.Serializable;

public abstract class LingkunganRuangKelas extends IdentitasRuangKelas implements Serializable{



private String kondisiLantai;
private String kondisiDinding;
private String kondisiAtap;
private String kondisiPintu;
private String kondisiJendela;

public LingkunganRuangKelas(){

}

public LingkunganRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas) {
super(namaRuang, lokasiRuang, Fakultas);
}

public LingkunganRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, String kondisiLantai, String kondisiDinding,
String kondisiAtap, String kondisiPintu, String kondisiJendela) {
super(namaRuang, lokasiRuang, Fakultas);
this.kondisiLantai = kondisiLantai;
this.kondisiDinding = kondisiDinding;
this.kondisiAtap = kondisiAtap;
this.kondisiPintu = kondisiPintu;
this.kondisiJendela = kondisiJendela;
}


public String getKondisiLantai() {
return kondisiLantai;
}

public void setKondisiLantai(String kondisiLantai) {
this.kondisiLantai = kondisiLantai;
}

public String getKondisiDinding() {
return kondisiDinding;
}

public void setKondisiDinding(String kondisiDinding) {
this.kondisiDinding = kondisiDinding;
}

public String getKondisiAtap() {
return kondisiAtap;
}

public void setKondisiAtap(String kondisiAtap) {
this.kondisiAtap = kondisiAtap;
}

public String getKondisiPintu() {
return kondisiPintu;
}

public void setKondisiPintu(String kondisiPintu) {
this.kondisiPintu = kondisiPintu;
}

public String getKondisiJendela() {
return kondisiJendela;
}

public void setKondisiJendela(String kondisiJendela) {
this.kondisiJendela = kondisiJendela;
}



String analisisKebersihan(String lantai, String dinding, String atap, String pintu, String jendela){
if("Bersih".equals(lantai) && "Bersih".equals(dinding) && "Bersih".equals(jendela) && "Bersih".equals(atap) && "Bersih".equals(pintu)){
return "sesuai";
}
else{
return "tidak sesuai";
}
}

}

