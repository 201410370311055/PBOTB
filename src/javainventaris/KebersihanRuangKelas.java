import java.io.Serializable;

public class KebersihanRuangKelas extends KenyamananRuangKelas implements Kalkulasi, Serializable{

private String sirkulasiUdara;
private int nilaiPencahayaan;
private int inputKelembapan;
private int inputSuhu;



private int sesuai=0;
private int tdksesuai=0;

public KebersihanRuangKelas(){

}

public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, int kebisingan, int bau, int kebocoran,
int kerusakan, int keausan) {
super(namaRuang, lokasiRuang, Fakultas, kebisingan, bau, kebocoran, kerusakan,
keausan);
// TODO Auto-generated constructor stub
}
public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, String kondisiLantai, String kondisiDinding,
String kondisiAtap, String kondisiPintu, String kondisiJendela) {
super(namaRuang, lokasiRuang, Fakultas, kondisiLantai, kondisiDinding,
kondisiAtap, kondisiPintu, kondisiJendela);
// TODO Auto-generated constructor stub
}
public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas) {
super(namaRuang, lokasiRuang, Fakultas);
// TODO Auto-generated constructor stub
}
public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas, String kondisiLantai, String kondisiDinding,
String kondisiAtap, String kondisiPintu, String kondisiJendela,
String sirkulasiUdara, int nilaiPencahayaan, int inputKelembapan,
int inputSuhu) {
super(namaRuang, lokasiRuang, Fakultas, kondisiLantai, kondisiDinding,
kondisiAtap, kondisiPintu, kondisiJendela);
this.sirkulasiUdara = sirkulasiUdara;
this.nilaiPencahayaan = nilaiPencahayaan;
this.inputKelembapan = inputKelembapan;
this.inputSuhu = inputSuhu;
}
public String getSirkulasiUdara() {
return sirkulasiUdara;
}
public void setSirkulasiUdara(String sirkulasiUdara) {
this.sirkulasiUdara = sirkulasiUdara;
}
public int getNilaiPencahayaan() {
return nilaiPencahayaan;
}
public void setNilaiPencahayaan(int nilaiPencahayaan) {
this.nilaiPencahayaan = nilaiPencahayaan;
}
public int getInputKelembapan() {
return inputKelembapan;
}
public void setInputKelembapan(int inputKelembapan) {
this.inputKelembapan = inputKelembapan;
}
public int getInputSuhu() {
return inputSuhu;
}
public void setInputSuhu(int inputSuhu) {
this.inputSuhu = inputSuhu;
}

String analisisSirkulasiUdara(String sirkulasi){
if("Lancar".equals(sirkulasi)){
return "sesuai";
}
else{
return "tidak sesuai";
}
}

String analisisPencahayaan(int cahaya){
if(cahaya >= 250 && cahaya <= 350){
return "sesuai";
}
else{
return "tidak sesuai";
}
}

String analisisKelembapan(int lembab){
if(lembab >= 70 && lembab <= 80){
return "sesuai";
}
else{
return "tidak sesuai";
}
}

String analisisSuhu(int suhu){
if(suhu >= 25 && suhu <= 35){
return "sesuai";
}
else{
return "tidak sesuai";
}
}
@Override
public String deskripsiKelas() {
if(sesuai > tdksesuai){
return "Inventaris Kenyamanan Memenuhi Standar";
}
else{
return "Inventaris Kenyamanan Kurang Memenuhi Standar";
}
}
@Override
public int hitungSesuai() {
if("sesuai".equals(analisisKebersihan(getKondisiLantai(), getKondisiDinding(), getKondisiAtap(), getKondisiPintu(), getKondisiJendela()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisSirkulasiUdara(getSirkulasiUdara()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisPencahayaan(getNilaiPencahayaan()))){
++sesuai; 
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKelembapan(getInputKelembapan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisSuhu(getInputSuhu()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKebisingan(getKebisingan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisBau(getBau()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKebocoran(getKebocoran()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKerusakan(getKerusakan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKeausan(getKeausan()))){
++sesuai;
}else{
++tdksesuai;
}
return sesuai;
}
@Override
public int hitungTdkSesuai() {
// TODO Auto-generated method stub
return tdksesuai;
}





}

