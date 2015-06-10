import java.io.Serializable;


public abstract class KenyamananRuangKelas extends LingkunganRuangKelas implements Serializable {
private int kebisingan;
private int bau;
private int kebocoran;
private int kerusakan;
private int keausan;


public KenyamananRuangKelas(){

}

public KenyamananRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, String kondisiLantai, String kondisiDinding,
String kondisiAtap, String kondisiPintu, String kondisiJendela) {
super(namaRuang, lokasiRuang, Fakultas, kondisiLantai, kondisiDinding,
kondisiAtap, kondisiPintu, kondisiJendela);
// TODO Auto-generated constructor stub
}
public KenyamananRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas) {
super(namaRuang, lokasiRuang, Fakultas);
// TODO Auto-generated constructor stub
}


public KenyamananRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, int kebisingan, int bau, int kebocoran,
int kerusakan, int keausan) {
super(namaRuang, lokasiRuang, Fakultas);
this.kebisingan = kebisingan;
this.bau = bau;
this.kebocoran = kebocoran;
this.kerusakan = kerusakan;
this.keausan = keausan;
}




public int getKebisingan() {
return kebisingan;
}
public void setKebisingan(int kebisingan) {
this.kebisingan = kebisingan;
}
public int getBau() {
return bau;
}
public void setBau(int bau) {
this.bau = bau;
}
public int getKebocoran() {
return kebocoran;
}
public void setKebocoran(int kebocoran) {
this.kebocoran = kebocoran;
}
public int getKerusakan() {
return kerusakan;
}
public void setKerusakan(int kerusakan) {
this.kerusakan = kerusakan;
}
public int getKeausan() {
return keausan;
}
public void setKeausan(int keausan) {
this.keausan = keausan;
}
String analisisKebisingan(int bising){
if(bising==0){
return "sesuai";
}
else{
return "tidak sesuai";
}
}
String analisisBau(int bau){
if(bau==1){
return "sesuai";
}
else{
return "tidak sesuai";
}
}
String analisisKebocoran(int bocor){
if(bocor==1){
return "sesuai";
}
else{
return "tidak sesuai";
}
}
String analisisKerusakan(int rusak){
if(rusak==0){
return "sesuai";
}
else{
return "tidak sesuai";
}
}
String analisisKeausan(int aus){
if(aus==1){
return "sesuai";
}
else{
return "tidak sesuai";
}
}
}

