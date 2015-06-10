import java.io.Serializable;


public class KeamananRuangKelas extends IdentitasRuangKelas implements Kalkulasi, Serializable{

private String kekokohan;
private String kunciPintu;
private String kunciJendela;
private String bahaya;



private int sesuai=0;
private int tdksesuai=0;


public KeamananRuangKelas(){

}


public KeamananRuangKelas(String namaRuang, String lokasiRuang,
String Fakultas) {
super(namaRuang, lokasiRuang, Fakultas);


}




public String getKekokohan() {
return kekokohan;
}
public void setKekokohan(String kekokohan) {
this.kekokohan = kekokohan;
}
public String getKunciPintu() {
return kunciPintu;
}
public void setKunciPintu(String kunciPintu) {
this.kunciPintu = kunciPintu;
}
public String getKunciJendela() {
return kunciJendela;
}
public void setKunciJendela(String kunciJendela) {
this.kunciJendela = kunciJendela;
}
public String getBahaya() {
return bahaya;
}
public void setBahaya(String bahaya) {
this.bahaya = bahaya;
}


String analisisKekokohan(String kokoh){
if("Kokoh".equals(kokoh)){
return "sesuai";
}
else{
return "tidak sesuai";
}
}

String analisisKunciPintuJendela(String kunciPintu, String kunciJendela){
if("Ada".equals(kunciPintu)&&"Ada".equals(kunciJendela)){
return "sesuai";
}
else{
return "tidak sesuai";
}
}


String analisisKeamananRuang(String aman){
if("Aman".equals(aman)){
return "sesuai";
}
else{
return "tidak sesuai";
}
}





@Override
public String deskripsiKelas() {
if(sesuai > tdksesuai){
return "Inventaris Keamanan Memenuhi Standar";
}
else{
return "Inventaris Keamanan Kurang Memenuhi Standar";
}
}




@Override
public int hitungSesuai() {
if("sesuai".equals(analisisKekokohan(getKekokohan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKunciPintuJendela(getKunciPintu(), getKunciJendela()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(analisisKeamananRuang(getBahaya()))){
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

