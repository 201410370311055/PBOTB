import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
//import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.Canvas;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;







import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;



public class InventarisKebersihan extends JFrame{

private JTextField textFieldPencahayaan;
private JTextField textFieldSuhu;

private KebersihanRuangKelas bersih;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
InventarisKebersihan window = new InventarisKebersihan();
window.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public InventarisKebersihan() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
setResizable(false);
setBounds(100, 100, 797, 477);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panelatas = new JPanel();
panelatas.setBackground(new Color(153, 0, 0));
getContentPane().add(panelatas, BorderLayout.NORTH);

JLabel lblInventarisKebersihan = new JLabel("Inventaris Kebersihan");
lblInventarisKebersihan.setForeground(Color.WHITE);
lblInventarisKebersihan.setFont(new Font("Algerian", Font.BOLD, 12));
panelatas.add(lblInventarisKebersihan);

JPanel panelbawah = new JPanel();
getContentPane().add(panelbawah, BorderLayout.SOUTH);
panelbawah.setLayout(new BorderLayout(0, 0));

JPanel panelutama = new JPanel();
getContentPane().add(panelutama, BorderLayout.CENTER);
panelutama.setLayout(null);

JTextPane txtpnAspek = new JTextPane();
txtpnAspek.setForeground(Color.WHITE);
txtpnAspek.setEditable(false);
txtpnAspek.setFont(new Font("Times New Roman", Font.BOLD, 12));
txtpnAspek.setBackground(new Color(0, 0, 102));
txtpnAspek.setText("Aspek Lingkungan");
txtpnAspek.setBounds(10, 0, 127, 20);
panelutama.add(txtpnAspek);

JTextPane txtpnKondisi = new JTextPane();
txtpnKondisi.setForeground(Color.WHITE);
txtpnKondisi.setEditable(false);
txtpnKondisi.setText("Kondisi");
txtpnKondisi.setFont(new Font("Times New Roman", Font.BOLD, 12));
txtpnKondisi.setBackground(new Color(0, 0, 102));
txtpnKondisi.setBounds(135, 0, 149, 20);
panelutama.add(txtpnKondisi);

JTextPane txtpnLantai = new JTextPane();
txtpnLantai.setEditable(false);
txtpnLantai.setBackground(new Color(255, 204, 0));
txtpnLantai.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnLantai.setText("Lantai");
txtpnLantai.setBounds(16, 28, 98, 20);
panelutama.add(txtpnLantai);

JTextPane txtpnDinding = new JTextPane();
txtpnDinding.setEditable(false);
txtpnDinding.setText("Dinding");
txtpnDinding.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnDinding.setBackground(new Color(255, 204, 0));
txtpnDinding.setBounds(16, 59, 98, 20);
panelutama.add(txtpnDinding);

JTextPane txtpnAtap = new JTextPane();
txtpnAtap.setEditable(false);
txtpnAtap.setText("Atap");
txtpnAtap.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnAtap.setBackground(new Color(255, 204, 0));
txtpnAtap.setBounds(16, 90, 98, 20);
panelutama.add(txtpnAtap);

JTextPane txtpnPintu = new JTextPane();
txtpnPintu.setEditable(false);
txtpnPintu.setText("Pintu");
txtpnPintu.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnPintu.setBackground(new Color(255, 204, 0));
txtpnPintu.setBounds(16, 121, 98, 20);
panelutama.add(txtpnPintu);

JTextPane txtpnJendela = new JTextPane();
txtpnJendela.setEditable(false);
txtpnJendela.setText("Jendela");
txtpnJendela.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnJendela.setBackground(new Color(255, 204, 0));
txtpnJendela.setBounds(16, 152, 98, 20);
panelutama.add(txtpnJendela);

JComboBox comboBoxKondisiLantai = new JComboBox();
comboBoxKondisiLantai.setForeground(Color.WHITE);
comboBoxKondisiLantai.setBackground(Color.GRAY);
comboBoxKondisiLantai.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiLantai.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
comboBoxKondisiLantai.setBounds(130, 28, 141, 20);
panelutama.add(comboBoxKondisiLantai);

JComboBox comboBoxKondisiDinding = new JComboBox();
comboBoxKondisiDinding.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
comboBoxKondisiDinding.setForeground(Color.WHITE);
comboBoxKondisiDinding.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiDinding.setBackground(Color.GRAY);
comboBoxKondisiDinding.setBounds(130, 59, 141, 20);
panelutama.add(comboBoxKondisiDinding);

JComboBox comboBoxKondisiAtap = new JComboBox();
comboBoxKondisiAtap.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
comboBoxKondisiAtap.setForeground(Color.WHITE);
comboBoxKondisiAtap.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiAtap.setBackground(Color.GRAY);
comboBoxKondisiAtap.setBounds(130, 90, 141, 20);
panelutama.add(comboBoxKondisiAtap);

JComboBox comboBoxKondisiPintu = new JComboBox();
comboBoxKondisiPintu.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
comboBoxKondisiPintu.setForeground(Color.WHITE);
comboBoxKondisiPintu.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiPintu.setBackground(Color.GRAY);
comboBoxKondisiPintu.setBounds(130, 121, 141, 20);
panelutama.add(comboBoxKondisiPintu);

JComboBox comboBoxKondisiJendela = new JComboBox();
comboBoxKondisiJendela.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Kotor", "Berantakan"}));
comboBoxKondisiJendela.setForeground(Color.WHITE);
comboBoxKondisiJendela.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiJendela.setBackground(Color.GRAY);
comboBoxKondisiJendela.setBounds(130, 152, 141, 20);
panelutama.add(comboBoxKondisiJendela);

JTextPane txtpnAspekKebersihan = new JTextPane();
txtpnAspekKebersihan.setText("Aspek Kebersihan");
txtpnAspekKebersihan.setForeground(Color.WHITE);
txtpnAspekKebersihan.setFont(new Font("Times New Roman", Font.BOLD, 12));
txtpnAspekKebersihan.setEditable(false);
txtpnAspekKebersihan.setBackground(new Color(0, 0, 102));
txtpnAspekKebersihan.setBounds(10, 183, 127, 20);
panelutama.add(txtpnAspekKebersihan);

JTextPane textPane_1 = new JTextPane();
textPane_1.setText("Kondisi");
textPane_1.setForeground(Color.WHITE);
textPane_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
textPane_1.setEditable(false);
textPane_1.setBackground(new Color(0, 0, 102));
textPane_1.setBounds(135, 183, 149, 20);
panelutama.add(textPane_1);

JTextPane txtpnSirkulasiUdara = new JTextPane();
txtpnSirkulasiUdara.setEditable(false);
txtpnSirkulasiUdara.setText("Sirkulasi Udara");
txtpnSirkulasiUdara.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnSirkulasiUdara.setBackground(new Color(255, 204, 0));
txtpnSirkulasiUdara.setBounds(16, 209, 98, 20);
panelutama.add(txtpnSirkulasiUdara);

JTextPane txtpnPencahayaan = new JTextPane();
txtpnPencahayaan.setEditable(false);
txtpnPencahayaan.setText("Pencahayaan");
txtpnPencahayaan.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnPencahayaan.setBackground(new Color(255, 204, 0));
txtpnPencahayaan.setBounds(16, 240, 98, 20);
panelutama.add(txtpnPencahayaan);

JTextPane txtpnKelembaban = new JTextPane();
txtpnKelembaban.setEditable(false);
txtpnKelembaban.setText("Kelembapan");
txtpnKelembaban.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnKelembaban.setBackground(new Color(255, 204, 0));
txtpnKelembaban.setBounds(16, 271, 98, 20);
panelutama.add(txtpnKelembaban);

JTextPane txtpnSuhu = new JTextPane();
txtpnSuhu.setEditable(false);
txtpnSuhu.setText("Suhu");
txtpnSuhu.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnSuhu.setBackground(new Color(255, 204, 0));
txtpnSuhu.setBounds(16, 302, 98, 20);
panelutama.add(txtpnSuhu);

JComboBox comboBoxSirkulasiUdara = new JComboBox();
comboBoxSirkulasiUdara.setModel(new DefaultComboBoxModel(new String[] {"KurangLancar", "Lancar"}));
comboBoxSirkulasiUdara.setForeground(Color.WHITE);
comboBoxSirkulasiUdara.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxSirkulasiUdara.setBackground(Color.GRAY);
comboBoxSirkulasiUdara.setBounds(130, 209, 141, 20);
panelutama.add(comboBoxSirkulasiUdara);

textFieldPencahayaan = new JTextField();
textFieldPencahayaan.setBackground(Color.GRAY);
textFieldPencahayaan.setBounds(130, 240, 86, 20);
panelutama.add(textFieldPencahayaan);
textFieldPencahayaan.setColumns(10);

JLabel lblangka = new JLabel("(NUMBER)");
lblangka.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblangka.setForeground(new Color(0, 0, 102));
lblangka.setBounds(222, 243, 62, 14);
panelutama.add(lblangka);

JLabel label = new JLabel("%");
label.setForeground(new Color(0, 0, 102));
label.setFont(new Font("Times New Roman", Font.BOLD, 12));
label.setBounds(222, 274, 62, 14);
panelutama.add(label);

JComboBox comboBoxKelembapan = new JComboBox();
comboBoxKelembapan.setModel(new DefaultComboBoxModel(new String[] {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100"}));
comboBoxKelembapan.setForeground(Color.WHITE);
comboBoxKelembapan.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKelembapan.setBackground(Color.GRAY);
comboBoxKelembapan.setBounds(130, 271, 86, 20);
panelutama.add(comboBoxKelembapan);

textFieldSuhu = new JTextField();
textFieldSuhu.setBackground(Color.GRAY);
textFieldSuhu.setColumns(10);
textFieldSuhu.setBounds(130, 302, 86, 20);
panelutama.add(textFieldSuhu);

JLabel lblCelcius = new JLabel("Celcius");
lblCelcius.setForeground(new Color(0, 0, 102));
lblCelcius.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblCelcius.setBounds(222, 305, 62, 14);
panelutama.add(lblCelcius);

Canvas canvas = new Canvas();
canvas.setBackground(new Color(0, 0, 102));
canvas.setBounds(120, 0, 5, 330);
panelutama.add(canvas);

JTextPane txtpnAspekKenyamanan = new JTextPane();
txtpnAspekKenyamanan.setText("Aspek Kenyamanan");
txtpnAspekKenyamanan.setForeground(Color.WHITE);
txtpnAspekKenyamanan.setFont(new Font("Times New Roman", Font.BOLD, 12));
txtpnAspekKenyamanan.setEditable(false);
txtpnAspekKenyamanan.setBackground(new Color(0, 0, 102));
txtpnAspekKenyamanan.setBounds(340, 99, 127, 20);
panelutama.add(txtpnAspekKenyamanan);

JTextPane textPane_2 = new JTextPane();
textPane_2.setText("Kondisi");
textPane_2.setForeground(Color.WHITE);
textPane_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
textPane_2.setEditable(false);
textPane_2.setBackground(new Color(0, 0, 102));
textPane_2.setBounds(465, 99, 149, 20);
panelutama.add(textPane_2);

JTextPane txtpnKebisingan = new JTextPane();
txtpnKebisingan.setEditable(false);
txtpnKebisingan.setText("Kebisingan");
txtpnKebisingan.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnKebisingan.setBackground(new Color(255, 204, 0));
txtpnKebisingan.setBounds(346, 127, 98, 20);
panelutama.add(txtpnKebisingan);

JTextPane txtpnBau = new JTextPane();
txtpnBau.setEditable(false);
txtpnBau.setText("Bau");
txtpnBau.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnBau.setBackground(new Color(255, 204, 0));
txtpnBau.setBounds(346, 156, 98, 20);
panelutama.add(txtpnBau);

JTextPane txtpnKebocoran = new JTextPane();
txtpnKebocoran.setEditable(false);
txtpnKebocoran.setText("Kebocoran");
txtpnKebocoran.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnKebocoran.setBackground(new Color(255, 204, 0));
txtpnKebocoran.setBounds(346, 189, 98, 20);
panelutama.add(txtpnKebocoran);

JTextPane txtpnKerusakan = new JTextPane();
txtpnKerusakan.setEditable(false);
txtpnKerusakan.setText("Kerusakan");
txtpnKerusakan.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnKerusakan.setBackground(new Color(255, 204, 0));
txtpnKerusakan.setBounds(346, 220, 98, 20);
panelutama.add(txtpnKerusakan);

JTextPane txtpnKeausan = new JTextPane();
txtpnKeausan.setEditable(false);
txtpnKeausan.setText("Keausan");
txtpnKeausan.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnKeausan.setBackground(new Color(255, 204, 0));
txtpnKeausan.setBounds(346, 251, 98, 20);
panelutama.add(txtpnKeausan);

JComboBox comboBoxKebisingan = new JComboBox();
comboBoxKebisingan.setModel(new DefaultComboBoxModel(new String[] {"Tidak Bising", "Bising"}));
comboBoxKebisingan.setForeground(Color.WHITE);
comboBoxKebisingan.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKebisingan.setBackground(Color.GRAY);
comboBoxKebisingan.setBounds(465, 125, 141, 20);
panelutama.add(comboBoxKebisingan);

JComboBox comboBoxBau = new JComboBox();
comboBoxBau.setModel(new DefaultComboBoxModel(new String[] {"Bau", "Tidak Bau"}));
comboBoxBau.setForeground(Color.WHITE);
comboBoxBau.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxBau.setBackground(Color.GRAY);
comboBoxBau.setBounds(465, 156, 141, 20);
panelutama.add(comboBoxBau);

JComboBox comboBoxKebocoran = new JComboBox();
comboBoxKebocoran.setModel(new DefaultComboBoxModel(new String[] {"Bocor", "Tidak Bocor"}));
comboBoxKebocoran.setForeground(Color.WHITE);
comboBoxKebocoran.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKebocoran.setBackground(Color.GRAY);
comboBoxKebocoran.setBounds(465, 187, 141, 20);
panelutama.add(comboBoxKebocoran);

JComboBox comboBoxKerusakan = new JComboBox();
comboBoxKerusakan.setModel(new DefaultComboBoxModel(new String[] {"Tidak Rusak", "Rusak"}));
comboBoxKerusakan.setForeground(Color.WHITE);
comboBoxKerusakan.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKerusakan.setBackground(Color.GRAY);
comboBoxKerusakan.setBounds(465, 218, 141, 20);
panelutama.add(comboBoxKerusakan);

JComboBox comboBoxKeausan = new JComboBox();
comboBoxKeausan.setModel(new DefaultComboBoxModel(new String[] {"Aus", "Tidak Aus"}));
comboBoxKeausan.setForeground(Color.WHITE);
comboBoxKeausan.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKeausan.setBackground(Color.GRAY);
comboBoxKeausan.setBounds(465, 251, 141, 20);
panelutama.add(comboBoxKeausan);

JTextPane txtpnNamaruang = new JTextPane();
txtpnNamaruang.setEditable(false);
txtpnNamaruang.setText(ReadWrite.bacaKondisi().getNamaRuang());
txtpnNamaruang.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnNamaruang.setBackground(new Color(255, 204, 0));
txtpnNamaruang.setBounds(474, 0, 122, 20);
panelutama.add(txtpnNamaruang);

JTextPane txtpnFakultas = new JTextPane();
txtpnFakultas.setEditable(false);
txtpnFakultas.setText(ReadWrite.bacaKondisi().getFakultas());
txtpnFakultas.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnFakultas.setBackground(new Color(255, 204, 0));
txtpnFakultas.setBounds(474, 31, 122, 20);
panelutama.add(txtpnFakultas);

JTextPane txtpnLokasi = new JTextPane();
txtpnLokasi.setEditable(false);
txtpnLokasi.setText(ReadWrite.bacaKondisi().getLokasiRuang());
txtpnLokasi.setFont(new Font("Times New Roman", Font.BOLD, 11));
txtpnLokasi.setBackground(new Color(255, 204, 0));
txtpnLokasi.setBounds(474, 62, 122, 20);
panelutama.add(txtpnLokasi);

JLabel lblNamaRuang = new JLabel("Nama Ruang");
lblNamaRuang.setForeground(new Color(0, 0, 102));
lblNamaRuang.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblNamaRuang.setBounds(346, 3, 93, 14);
panelutama.add(lblNamaRuang);

JLabel lblFakultas = new JLabel("Fakultas");
lblFakultas.setForeground(new Color(0, 0, 102));
lblFakultas.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblFakultas.setBounds(346, 31, 93, 14);
panelutama.add(lblFakultas);

JLabel lblLokasi = new JLabel("Lokasi");
lblLokasi.setForeground(new Color(0, 0, 102));
lblLokasi.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblLokasi.setBounds(346, 59, 93, 14);
panelutama.add(lblLokasi);

Canvas canvas_1 = new Canvas();
canvas_1.setBackground(new Color(0, 0, 102));
canvas_1.setBounds(450, 99, 5, 207);
panelutama.add(canvas_1);

JLabel lblBG = new JLabel("");
//lblBG.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
lblBG.setBounds(-40, -12, 781, 419);
panelutama.add(lblBG);

JButton button = new JButton("");
//button.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
GUI gu = new GUI();
gu.setVisible(true);
dispose();
}
});
getContentPane().add(button, BorderLayout.WEST);
button.setFont(new Font("Tahoma", Font.BOLD, 12));
button.setForeground(Color.WHITE);
button.setBackground(new Color(153, 0, 0));

JButton button_1 = new JButton("");
//button_1.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("/as/left-28998_641.png")));
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
InventarisKeamanan invam = new InventarisKeamanan();
invam.setVisible(true);
dispose();
}
});
button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
button_1.setForeground(Color.WHITE);
button_1.setBackground(new Color(153, 0, 0));
getContentPane().add(button_1, BorderLayout.EAST);

JButton btnAnalisis = new JButton("Analisis");
//btnAnalisis.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
btnAnalisis.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
bersih = new KebersihanRuangKelas();

bersih.setKondisiLantai(comboBoxKondisiLantai.getSelectedItem().toString());
bersih.setKondisiDinding(comboBoxKondisiDinding.getSelectedItem().toString());
bersih.setKondisiAtap(comboBoxKondisiAtap.getSelectedItem().toString());
bersih.setKondisiPintu(comboBoxKondisiPintu.getSelectedItem()+"");
bersih.setKondisiJendela(comboBoxKondisiJendela.getSelectedItem()+"");

bersih.setSirkulasiUdara(comboBoxSirkulasiUdara.getSelectedItem()+"");
bersih.setNilaiPencahayaan(Integer.parseInt(textFieldPencahayaan.getText()));
bersih.setInputKelembapan(Integer.parseInt(comboBoxKelembapan.getSelectedItem()+""));
bersih.setInputSuhu(Integer.parseInt(textFieldSuhu.getText()));

bersih.setKebisingan(comboBoxKebisingan.getSelectedIndex());
bersih.setBau(comboBoxBau.getSelectedIndex());
bersih.setKebocoran(comboBoxKebocoran.getSelectedIndex());
bersih.setKerusakan(comboBoxKerusakan.getSelectedIndex());
bersih.setKeausan(comboBoxKeausan.getSelectedIndex());

ReadWrite.simpanBersih(bersih);
AnalisisBersih ber = new AnalisisBersih();
ber.setVisible(true);
new Diagram(bersih.hitungSesuai(),bersih.hitungTdkSesuai());


} catch (Exception e) {
JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
}

}
});
btnAnalisis.setForeground(Color.WHITE);
btnAnalisis.setFont(new Font("Tahoma", Font.BOLD, 12));
btnAnalisis.setBackground(new Color(153, 0, 0));
panelbawah.add(btnAnalisis);

JButton btnLoad = new JButton("Load");
//btnLoad.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
btnLoad.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
bersih = ReadWrite.bacaBersih();
comboBoxKondisiLantai.setSelectedItem(bersih.getKondisiLantai());
comboBoxKondisiDinding.setSelectedItem(bersih.getKondisiDinding());
comboBoxKondisiAtap.setSelectedItem(bersih.getKondisiAtap());
comboBoxKondisiPintu.setSelectedItem(bersih.getKondisiPintu());
comboBoxKondisiJendela.setSelectedItem(bersih.getKondisiJendela());

comboBoxSirkulasiUdara.setSelectedItem(bersih.getSirkulasiUdara());
textFieldPencahayaan.setText(bersih.getNilaiPencahayaan()+"");
comboBoxKelembapan.setSelectedItem(bersih.getInputKelembapan()+"");
textFieldSuhu.setText(bersih.getInputSuhu()+"");
comboBoxKebisingan.setSelectedIndex(bersih.getKebisingan());
comboBoxBau.setSelectedIndex(bersih.getBau());
comboBoxKebocoran.setSelectedIndex(bersih.getKebocoran());
comboBoxKerusakan.setSelectedIndex(bersih.getKerusakan());
comboBoxKeausan.setSelectedIndex(bersih.getKeausan());
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "File Tidak Ada / Tidak Lengkap", "Error", JOptionPane.ERROR_MESSAGE);
}


}
});
btnLoad.setForeground(Color.WHITE);
btnLoad.setFont(new Font("Tahoma", Font.BOLD, 12));
btnLoad.setBackground(new Color(153, 0, 0));
panelbawah.add(btnLoad, BorderLayout.EAST);

JButton button_2 = new JButton("Create PDF");
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
KebersihanRuangKelas bersih = InventarisKebersihan.this.bersih;
String kata ="Data Kebersihan Ruang Kelas\n" 
+"Kebersihan "+bersih.analisisKebersihan(bersih.getKondisiLantai(), bersih.getKondisiDinding(), bersih.getKondisiAtap(), bersih.getKondisiPintu(), bersih.getKondisiJendela())+"\n"
+"analisis sirkulasi udara "+bersih.analisisSirkulasiUdara(bersih.getSirkulasiUdara())+"\n"
+"analisis pencahayaan "+bersih.analisisPencahayaan(bersih.getNilaiPencahayaan())+"\n"
+"analisis kelembapan "+bersih.analisisKelembapan(bersih.getInputKelembapan())+"\n"
+"analisis suhu "+bersih.analisisSuhu(bersih.getInputSuhu())+"\n"
+"analisis kebisingan "+bersih.analisisKebisingan(bersih.getKebisingan())+"\n"
+"analisis bau "+bersih.analisisBau(bersih.getBau())+"\n"
+"analisis kebocoran "+bersih.analisisKebocoran(bersih.getKebocoran())+"\n"
+"analisis kerusakan "+bersih.analisisKerusakan(bersih.getKerusakan())+"\n"
+"analisis keausan "+bersih.analisisKeausan(bersih.getKeausan())+"\n" 
+ "\n"
+ "Inventaris Tentang Keamanan yang sesuai : "+bersih.hitungSesuai()+"\n"
+ "Inventaris Tentang Keamanan yang Tidak Sesuai : "+bersih.hitungTdkSesuai()+"\n"
+ "Deskripsi Kelas : "+bersih.deskripsiKelas();

JOptionPane.showMessageDialog(null, "Berhasil Membuat PDF", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

//new Pdf(kata, "DATA KEBERSIHAN RUANGAN.pdf");
Desktop.getDesktop().open(new File(""));
}catch (Exception er) {
JOptionPane.showMessageDialog(null, "Gagal Membuat PDF", "Error", JOptionPane.ERROR_MESSAGE);
}
}
});
//button_2.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
button_2.setForeground(Color.WHITE);
button_2.setBackground(new Color(153, 0, 0));
panelbawah.add(button_2, BorderLayout.WEST);

JMenuBar menuBar = new JMenuBar();
menuBar.setBackground(new Color(204, 0, 0));
setJMenuBar(menuBar);

JMenu mnFile = new JMenu("File");
//mnFile.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mnFile.setFont(new Font("Segoe UI", Font.BOLD, 12));
mnFile.setForeground(Color.WHITE);
menuBar.add(mnFile);

JMenuItem mntmLogout = new JMenuItem("LogOut");
//mntmLogout.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mntmLogout.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
dispose();
Login log = new Login();

}
});
mnFile.add(mntmLogout);

JMenuItem mntmExit = new JMenuItem("Exit");
//mntmExit.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mntmExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
dispose();
}
});
mnFile.addSeparator();
mnFile.add(mntmExit);

JMenu mnAuthors = new JMenu("Authors");
//mnAuthors.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mnAuthors.setForeground(Color.WHITE);
menuBar.add(mnAuthors);

JMenuItem mntmNewMenuItem = new JMenuItem("Kelasb");
//mntmNewMenuItem.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mntmNewMenuItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
try{
Desktop.getDesktop().browse(new URL("https://www.facebook.com/").toURI());

}catch(Exception ex){
JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
}
}

});
mnAuthors.add(mntmNewMenuItem);

JMenuItem mntmFaridRamadan = new JMenuItem("Farid Ramadan");
//mntmFaridRamadan.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mntmFaridRamadan.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {

try {
Desktop.getDesktop().browse(new URL("https://www.facebook.com/").toURI());
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
}

}
});
mnAuthors.add(mntmFaridRamadan);

JMenuItem mntmCoba = new JMenuItem("kelasb");
//mntmCoba.setIcon(new ImageIcon(InventarisKebersihan.class.getResource("")));
mntmCoba.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
try {
Desktop.getDesktop().browse(new URL("https://www.facebook.com/").toURI());
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
}
}
});
mnAuthors.add(mntmCoba);

JButton buttn = new JButton("Menghapus Data yang Telah Tersimpan");
//buttn.setIcon(new ImageIcon(GUI.class.getResource("")));
buttn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
ReadWrite.deleteObject("databersih.dat");

comboBoxKondisiLantai.setSelectedIndex(0);
comboBoxKondisiDinding.setSelectedIndex(0);
comboBoxKondisiAtap.setSelectedIndex(0);
comboBoxKondisiPintu.setSelectedIndex(0);
comboBoxKondisiJendela.setSelectedIndex(0);

comboBoxSirkulasiUdara.setSelectedIndex(0);
textFieldPencahayaan.setText("");
comboBoxKelembapan.setSelectedIndex(0);
textFieldSuhu.setText("");
comboBoxKebisingan.setSelectedIndex(0);
comboBoxBau.setSelectedIndex(0);
comboBoxKebocoran.setSelectedIndex(0);
comboBoxKerusakan.setSelectedIndex(0);
comboBoxKeausan.setSelectedIndex(0);

JOptionPane.showMessageDialog(null, "Berhasil Delete","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "Gagal Menghapus", "Error", JOptionPane.ERROR_MESSAGE);
}

}
});
buttn.setForeground(Color.WHITE);
buttn.setFont(new Font("Tahoma", Font.BOLD, 11));
buttn.setBackground(Color.RED);
panelbawah.add(buttn, BorderLayout.SOUTH);

}
}

