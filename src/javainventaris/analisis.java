public class analisis extends IdentitasRuangKelas implements Kalkulasi {

private int sesuai=0;
private int tdksesuai=0;

Inputan inp = new Inputan();

public analisis(){
if("sesuai".equals(inp.kelasKondisi().hitungBentukRuang(inp.kelasKondisi().getPanjangRuang(), inp.kelasKondisi().getLebarRuang()))){
++sesuai;
}else{
++tdksesuai;
} 
if("sesuai".equals(inp.kelasKondisi().hitungRasioLuas(inp.kelasKondisi().hitungLuasRuang(inp.kelasKondisi().getPanjangRuang(), inp.kelasKondisi().getLebarRuang()), inp.kelasKondisi().getJumlahKursi()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKondisi().analisisPintuJendela(inp.kelasKondisi().getJumlahPintu(), inp.kelasKondisi().getJumlahJendela()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKondisi().analisisListrik(inp.kelasKondisi().getJumlahStopkontak(), inp.kelasKondisi().getKondisiStopKontak(), inp.kelasKondisi().getPosisiStopKontak()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKondisi().analisisLampu(inp.kelasKondisi().getJumlahLampu(), inp.kelasKondisi().getKondisiLampu(), inp.kelasKondisi().getPosisiLampu()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKondisi().analisiKipasAngin(inp.kelasKondisi().getJumlahKipasAngin(), inp.kelasKondisi().getKondisiKipasAngin(), inp.kelasKondisi().getPosisiKipasAngin()))){
++sesuai;
}else{
++tdksesuai;
}
if("Sesuai".equals(inp.kelasKondisi().analisiAc(inp.kelasKondisi().getJumlahAc(), inp.kelasKondisi().getKondisiAc(), inp.kelasKondisi().getPosisiAc()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKondisi().analisiInterner(inp.kelasKondisi().getSSID(), inp.kelasKondisi().getInputBandwidth()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKondisi().analisiCctv(inp.kelasKondisi().getJumlahCctv(), inp.kelasKondisi().getKondisiCctv(), inp.kelasKondisi().getPosisiCctv()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisKebersihan(inp.kelasBersih().getKondisiLantai(), inp.kelasBersih().getKondisiDinding(), inp.kelasBersih().getKondisiAtap(), inp.kelasBersih().getKondisiPintu(), inp.kelasBersih().getKondisiJendela()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisPencahayaan(inp.kelasBersih().getNilaiPencahayaan()))){
++sesuai; 
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisKelembapan(inp.kelasBersih().getInputKelembapan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisSuhu(inp.kelasBersih().getInputSuhu()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisKebisingan(inp.kelasBersih().getKebisingan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisBau(inp.kelasBersih().getBau()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisKebocoran(inp.kelasBersih().getKebocoran()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisKerusakan(inp.kelasBersih().getKerusakan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasBersih().analisisKeausan(inp.kelasBersih().getKeausan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKeamanan().analisisKekokohan(inp.kelasKeamanan().getKekokohan()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKeamanan().analisisKunciPintuJendela(inp.kelasKeamanan().getKunciPintu(), inp.kelasKeamanan().getKunciJendela()))){
++sesuai;
}else{
++tdksesuai;
}
if("sesuai".equals(inp.kelasKeamanan().analisisKeamananRuang(inp.kelasKeamanan().getBahaya()))){
++sesuai;
}else{
++tdksesuai;
}



}

@Override
public int hitungSesuai() {

return sesuai;
}

@Override
public int hitungTdkSesuai() {

return tdksesuai;
}

@Override
public String deskripsiKelas() {
if(sesuai > tdksesuai){
return "Inventaris Kelas Memenuhi Standar";
}
else{
return "Inventaris Kelas Kurang Memenuhi Standar";
}
}


}

