import java.io.Serializable;


public abstract class KondisiRuangKelas extends IdentitasRuangKelas implements Serializable{
private int panjangRuang;
private int lebarRuang;
private int jumlahKursi;
private int jumlahPintu;
private int jumlahJendela;


public KondisiRuangKelas(){

}

public KondisiRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas) {
super(namaRuang, lokasiRuang, Fakultas);

}



public KondisiRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, int panjangRuang, int lebarRuang, int jumlahKursi,
int jumlahPintu, int jumlahJendela) {
super(namaRuang, lokasiRuang, Fakultas);
this.panjangRuang = panjangRuang;
this.lebarRuang = lebarRuang;
this.jumlahKursi = jumlahKursi;
this.jumlahPintu = jumlahPintu;
this.jumlahJendela = jumlahJendela;
}




public int getPanjangRuang() {
return panjangRuang;
}
public void setPanjangRuang(int panjangRuang) {
this.panjangRuang = panjangRuang;
}
public int getLebarRuang() {
return lebarRuang;
}
public void setLebarRuang(int lebarRuang) {
this.lebarRuang = lebarRuang;
}
public int getJumlahKursi() {
return jumlahKursi;
}
public void setJumlahKursi(int jumlahKursi) {
this.jumlahKursi = jumlahKursi;
}
public int getJumlahPintu() {
return jumlahPintu;
}
public void setJumlahPintu(int jumlahPintu) {
this.jumlahPintu = jumlahPintu;
}
public int getJumlahJendela() {
return jumlahJendela;
}
public void setJumlahJendela(int jumlahJendela) {
this.jumlahJendela = jumlahJendela;
}


public int hitungLuasRuang(int panjang, int lebar){
return panjang*lebar;
}

public String hitungBentukRuang(int panjang, int lebar){
if(panjang!=lebar){
return "sesuai";
}
else{
return "tidak sesuai";
}
}


public String hitungRasioLuas(int luas, int kursi){
if((luas/kursi)>=0.5){
return "sesuai";
}
else{
return "tidak sesuai";
}

}



public String analisisPintuJendela(int pintu, int jendela){
if(pintu>=1&&jendela>=2){
return "sesuai";
}
else{
return "tidak sesuai";
}
}




}

