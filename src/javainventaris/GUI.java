import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.Panel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.UIManager;
import java.awt.Color;

//import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;
import java.awt.color.CMMException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import org.omg.CORBA.ExceptionList;


public class GUI extends JFrame implements Serializable {

private JTextField textFieldNamaRuang;
private JTextField textFieldPanjang;
private JTextField textFieldLebar;
private JTextField textFieldJumlahKursi;
private JTextField textFieldJumlahPintu;
private JTextField textFieldJumlahJendela;


private JumlahKondisidanPosisiSarana kondisi;
private ReadWrite bacatulis;

private JTable table;
private JTextField textFieldJumlahSteker;
private JTextField textFieldJumlahLcd;
private JTextField textFieldJumlahLampu;
private JTextField textFieldJumlahKipasAngin;
private JTextField textFieldJumlahAC;
private JTextField textFieldJumlahCCTV;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GUI window = new GUI();
window.setVisible(true);
window.setResizable(false);

} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public GUI() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
setBounds(100, 100, 797, 477);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setLayout(new BorderLayout(0, 0));

JPanel panel = new JPanel();
getContentPane().add(panel, BorderLayout.CENTER);
panel.setLayout(null);

JLabel lblLokasiRuang = new JLabel("Lokasi Ruangan");
lblLokasiRuang.setFont(new Font("Tahoma", Font.ITALIC, 12));
lblLokasiRuang.setForeground(Color.BLUE);
lblLokasiRuang.setBounds(12, 59, 138, 14);
panel.add(lblLokasiRuang);

JLabel lblNamaRuangan = new JLabel("Nama Ruangan");
lblNamaRuangan.setFont(new Font("Tahoma", Font.ITALIC, 12));
lblNamaRuangan.setForeground(Color.BLUE);
lblNamaRuangan.setBounds(12, 34, 149, 14);
panel.add(lblNamaRuangan);

JLabel labelFakultas = new JLabel("Fakultas");
labelFakultas.setForeground(Color.BLUE);
labelFakultas.setFont(new Font("Times New Roman", Font.ITALIC, 12));
labelFakultas.setBounds(12, 84, 138, 14);
panel.add(labelFakultas);

textFieldNamaRuang = new JTextField();
textFieldNamaRuang.setBackground(new Color(255, 204, 51));
textFieldNamaRuang.setBounds(138, 28, 173, 20);
panel.add(textFieldNamaRuang);
textFieldNamaRuang.setColumns(10);

JComboBox comboBoxLokasi = new JComboBox();
comboBoxLokasi.setBackground(new Color(255, 204, 51));
comboBoxLokasi.setModel(new DefaultComboBoxModel(new String[] {"GKB I", "GKB II", "GKB III"}));
comboBoxLokasi.setBounds(138, 56, 173, 20);
panel.add(comboBoxLokasi);

JComboBox comboBoxFakultas = new JComboBox();
comboBoxFakultas.setBackground(new Color(255, 204, 51));
comboBoxFakultas.setModel(new DefaultComboBoxModel(new String[] {"Teknik", "FEB", "FPP", "FAI", "FK", "FIKES", "Hukum", "FISIP", "FKIP", "Psikologi"}));
comboBoxFakultas.setBounds(138, 81, 173, 20);
panel.add(comboBoxFakultas);

JLabel lblPanjang = new JLabel("Panjang (meter)");
lblPanjang.setForeground(Color.BLUE);
lblPanjang.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblPanjang.setBounds(10, 124, 113, 14);
panel.add(lblPanjang);

JLabel lblLebar = new JLabel("Lebar (meter)");
lblLebar.setForeground(Color.BLUE);
lblLebar.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblLebar.setBounds(12, 170, 85, 14);
panel.add(lblLebar);

Canvas canvas = new Canvas();
canvas.setBackground(new Color(0, 0, 102));
canvas.setBounds(317, 0, 5, 400);
panel.add(canvas);

textFieldPanjang = new JTextField();
textFieldPanjang.setBackground(new Color(255, 204, 51));
textFieldPanjang.setBounds(12, 142, 138, 20);
panel.add(textFieldPanjang);
textFieldPanjang.setColumns(10);

textFieldLebar = new JTextField();
textFieldLebar.setBackground(new Color(255, 204, 51));
textFieldLebar.setColumns(10);
textFieldLebar.setBounds(12, 188, 138, 20);
panel.add(textFieldLebar);

JLabel labelJumlahKursi = new JLabel("Jumlah Kursi");
labelJumlahKursi.setForeground(Color.BLUE);
labelJumlahKursi.setFont(new Font("Times New Roman", Font.BOLD, 12));
labelJumlahKursi.setBounds(10, 219, 113, 14);
panel.add(labelJumlahKursi);

textFieldJumlahKursi = new JTextField();
textFieldJumlahKursi.setBackground(new Color(255, 204, 51));
textFieldJumlahKursi.setBounds(10, 238, 140, 20);
panel.add(textFieldJumlahKursi);
textFieldJumlahKursi.setColumns(10);

JLabel labelJumlahPintu = new JLabel("Jumlah Pintu");
labelJumlahPintu.setForeground(Color.BLUE);
labelJumlahPintu.setFont(new Font("Times New Roman", Font.BOLD, 12));
labelJumlahPintu.setBounds(8, 267, 101, 14);
panel.add(labelJumlahPintu);

JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
lblJumlahJendela.setForeground(Color.BLUE);
lblJumlahJendela.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblJumlahJendela.setBounds(8, 315, 101, 14);
panel.add(lblJumlahJendela);

textFieldJumlahPintu = new JTextField();
textFieldJumlahPintu.setBackground(new Color(255, 204, 51));
textFieldJumlahPintu.setColumns(10);
textFieldJumlahPintu.setBounds(8, 284, 142, 20);
panel.add(textFieldJumlahPintu);

textFieldJumlahJendela = new JTextField();
textFieldJumlahJendela.setBackground(new Color(255, 204, 51));
textFieldJumlahJendela.setColumns(10);
textFieldJumlahJendela.setBounds(10, 340, 140, 20);
panel.add(textFieldJumlahJendela);

JTextPane txtpnSteker = new JTextPane();
txtpnSteker.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnSteker.setEditable(false);
txtpnSteker.setForeground(Color.WHITE);
txtpnSteker.setBackground(new Color(0, 0, 153));
txtpnSteker.setText("Steker");
txtpnSteker.setBounds(325, 61, 85, 20);
panel.add(txtpnSteker);

JTextPane textPaneLCD = new JTextPane();
textPaneLCD.setText("Kabel LCD");
textPaneLCD.setForeground(Color.WHITE);
textPaneLCD.setFont(new Font("Tahoma", Font.BOLD, 11));
textPaneLCD.setEditable(false);
textPaneLCD.setBackground(new Color(0, 0, 153));
textPaneLCD.setBounds(325, 92, 85, 20);
panel.add(textPaneLCD);

JTextPane txtpnLampu = new JTextPane();
txtpnLampu.setText("Lampu");
txtpnLampu.setForeground(Color.WHITE);
txtpnLampu.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnLampu.setEditable(false);
txtpnLampu.setBackground(new Color(0, 0, 153));
txtpnLampu.setBounds(325, 124, 85, 20);
panel.add(txtpnLampu);

JTextPane txtpnKipasAngin = new JTextPane();
txtpnKipasAngin.setText("Kipas Angin");
txtpnKipasAngin.setForeground(Color.WHITE);
txtpnKipasAngin.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnKipasAngin.setEditable(false);
txtpnKipasAngin.setBackground(new Color(0, 0, 153));
txtpnKipasAngin.setBounds(325, 157, 85, 20);
panel.add(txtpnKipasAngin);

JTextPane txtpnAc = new JTextPane();
txtpnAc.setText("AC");
txtpnAc.setForeground(Color.WHITE);
txtpnAc.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnAc.setEditable(false);
txtpnAc.setBackground(new Color(0, 0, 153));
txtpnAc.setBounds(325, 188, 85, 20);
panel.add(txtpnAc);

JTextPane txtpnHotspot = new JTextPane();
txtpnHotspot.setText("Hotspot");
txtpnHotspot.setForeground(Color.WHITE);
txtpnHotspot.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnHotspot.setEditable(false);
txtpnHotspot.setBackground(new Color(0, 0, 153));
txtpnHotspot.setBounds(325, 278, 85, 20);
panel.add(txtpnHotspot);

JTextPane txtpnCctv = new JTextPane();
txtpnCctv.setText("CCTV");
txtpnCctv.setForeground(Color.WHITE);
txtpnCctv.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnCctv.setEditable(false);
txtpnCctv.setBackground(new Color(0, 0, 153));
txtpnCctv.setBounds(325, 219, 85, 20);
panel.add(txtpnCctv);

JTextPane txtpnPrasarana = new JTextPane();
txtpnPrasarana.setText("Prasarana");
txtpnPrasarana.setForeground(Color.WHITE);
txtpnPrasarana.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnPrasarana.setEditable(false);
txtpnPrasarana.setBackground(new Color(204, 0, 0));
txtpnPrasarana.setBounds(325, 28, 96, 20);
panel.add(txtpnPrasarana);

Canvas canvas_1 = new Canvas();
canvas_1.setBackground(new Color(204, 0, 0));
canvas_1.setBounds(416, 28, 5, 275);
panel.add(canvas_1);

Canvas canvas_2 = new Canvas();
canvas_2.setBackground(new Color(204, 0, 0));
canvas_2.setBounds(487, 28, 5, 242);
panel.add(canvas_2);

JTextPane txtpnJumlah = new JTextPane();
txtpnJumlah.setText("Jumlah");
txtpnJumlah.setForeground(Color.WHITE);
txtpnJumlah.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnJumlah.setEditable(false);
txtpnJumlah.setBackground(new Color(204, 0, 0));
txtpnJumlah.setBounds(417, 28, 72, 20);
panel.add(txtpnJumlah);

JTextPane txtpnKondisi = new JTextPane();
txtpnKondisi.setText("Kondisi");
txtpnKondisi.setForeground(Color.WHITE);
txtpnKondisi.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnKondisi.setEditable(false);
txtpnKondisi.setBackground(new Color(204, 0, 0));
txtpnKondisi.setBounds(492, 28, 133, 20);
panel.add(txtpnKondisi);

JTextPane txtpnPosisi = new JTextPane();
txtpnPosisi.setText("Posisi");
txtpnPosisi.setForeground(Color.WHITE);
txtpnPosisi.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnPosisi.setEditable(false);
txtpnPosisi.setBackground(new Color(204, 0, 0));
txtpnPosisi.setBounds(625, 28, 105, 20);
panel.add(txtpnPosisi);

Canvas canvas_3 = new Canvas();
canvas_3.setBackground(new Color(204, 0, 0));
canvas_3.setBounds(596, 29, 5, 275);
panel.add(canvas_3);

textFieldJumlahSteker = new JTextField();
textFieldJumlahSteker.setColumns(10);
textFieldJumlahSteker.setBackground(new Color(255, 204, 51));
textFieldJumlahSteker.setBounds(430, 61, 51, 20);
panel.add(textFieldJumlahSteker);

textFieldJumlahLcd = new JTextField();
textFieldJumlahLcd.setColumns(10);
textFieldJumlahLcd.setBackground(new Color(255, 204, 51));
textFieldJumlahLcd.setBounds(430, 92, 51, 20);
panel.add(textFieldJumlahLcd);

textFieldJumlahLampu = new JTextField();
textFieldJumlahLampu.setColumns(10);
textFieldJumlahLampu.setBackground(new Color(255, 204, 51));
textFieldJumlahLampu.setBounds(430, 121, 51, 20);
panel.add(textFieldJumlahLampu);

textFieldJumlahKipasAngin = new JTextField();
textFieldJumlahKipasAngin.setColumns(10);
textFieldJumlahKipasAngin.setBackground(new Color(255, 204, 51));
textFieldJumlahKipasAngin.setBounds(430, 157, 51, 20);
panel.add(textFieldJumlahKipasAngin);

textFieldJumlahAC = new JTextField();
textFieldJumlahAC.setColumns(10);
textFieldJumlahAC.setBackground(new Color(255, 204, 51));
textFieldJumlahAC.setBounds(430, 188, 51, 20);
panel.add(textFieldJumlahAC);

textFieldJumlahCCTV = new JTextField();
textFieldJumlahCCTV.setColumns(10);
textFieldJumlahCCTV.setBackground(new Color(255, 204, 51));
textFieldJumlahCCTV.setBounds(430, 216, 51, 20);
panel.add(textFieldJumlahCCTV);

JTextPane txtpnKoneksi = new JTextPane();
txtpnKoneksi.setText("Koneksi");
txtpnKoneksi.setForeground(Color.WHITE);
txtpnKoneksi.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnKoneksi.setEditable(false);
txtpnKoneksi.setBackground(new Color(204, 0, 0));
txtpnKoneksi.setBounds(629, 250, 101, 20);
panel.add(txtpnKoneksi);

JComboBox comboBoxKondisiSteker = new JComboBox();
comboBoxKondisiSteker.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Rusak", "Kurang Baik"}));
comboBoxKondisiSteker.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiSteker.setBackground(Color.WHITE);
comboBoxKondisiSteker.setBounds(495, 59, 95, 20);
panel.add(comboBoxKondisiSteker);

JComboBox comboBoxKondisiLcd = new JComboBox();
comboBoxKondisiLcd.setModel(new DefaultComboBoxModel(new String[] {"Berfungsi", "Rusak"}));
comboBoxKondisiLcd.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiLcd.setBackground(Color.WHITE);
comboBoxKondisiLcd.setBounds(495, 92, 95, 20);
panel.add(comboBoxKondisiLcd);

JComboBox comboBoxKondisiLampu = new JComboBox();
comboBoxKondisiLampu.setModel(new DefaultComboBoxModel(new String[] {"Baik 14", "Baik 18", "Baik 5"}));
comboBoxKondisiLampu.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiLampu.setBackground(Color.WHITE);
comboBoxKondisiLampu.setBounds(495, 121, 95, 20);
panel.add(comboBoxKondisiLampu);

JComboBox comboBoxKondisiKipasAngin = new JComboBox();
comboBoxKondisiKipasAngin.setModel(new DefaultComboBoxModel(new String[] {"Rusak Semua", "Baik 1", "Baik 2"}));
comboBoxKondisiKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiKipasAngin.setBackground(Color.WHITE);
comboBoxKondisiKipasAngin.setBounds(495, 157, 95, 20);
panel.add(comboBoxKondisiKipasAngin);

JComboBox comboBoxKondisiAc = new JComboBox();
comboBoxKondisiAc.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Rusak"}));
comboBoxKondisiAc.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiAc.setBackground(Color.WHITE);
comboBoxKondisiAc.setBounds(495, 188, 95, 20);
panel.add(comboBoxKondisiAc);

JComboBox comboBoxKondisiCCTV = new JComboBox();
comboBoxKondisiCCTV.setModel(new DefaultComboBoxModel(new String[] {"Rusak Semua", "Baik 2", "Baik 1"}));
comboBoxKondisiCCTV.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxKondisiCCTV.setBackground(Color.WHITE);
comboBoxKondisiCCTV.setBounds(495, 216, 95, 20);
panel.add(comboBoxKondisiCCTV);

JComboBox comboBoxHotspot = new JComboBox();
comboBoxHotspot.setModel(new DefaultComboBoxModel(new String[] {"UMM Hotspot", "UMM Hotspot Premiun", "Coro", "Speedy@instan"}));
comboBoxHotspot.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxHotspot.setBackground(Color.WHITE);
comboBoxHotspot.setBounds(430, 278, 160, 20);
panel.add(comboBoxHotspot);

JTextPane txtpnSsid = new JTextPane();
txtpnSsid.setText("SSID");
txtpnSsid.setForeground(Color.WHITE);
txtpnSsid.setFont(new Font("Tahoma", Font.BOLD, 11));
txtpnSsid.setEditable(false);
txtpnSsid.setBackground(new Color(204, 0, 0));
txtpnSsid.setBounds(419, 250, 213, 20);
panel.add(txtpnSsid);

JComboBox comboBoxLoginHotspot = new JComboBox();
comboBoxLoginHotspot.setModel(new DefaultComboBoxModel(new String[] {"Tdk Bisa", "Bisa"}));
comboBoxLoginHotspot.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxLoginHotspot.setBackground(Color.WHITE);
comboBoxLoginHotspot.setBounds(607, 278, 123, 20);
panel.add(comboBoxLoginHotspot);

JComboBox comboBoxPosisiSteker = new JComboBox();
comboBoxPosisiSteker.setModel(new DefaultComboBoxModel(new String[] {"Pojok&DekatDosen", "DitengahRuang", "DekatPintu"}));
comboBoxPosisiSteker.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxPosisiSteker.setBackground(Color.WHITE);
comboBoxPosisiSteker.setBounds(609, 59, 121, 20);
panel.add(comboBoxPosisiSteker);

JComboBox comboBoxPosisiKabelLcd = new JComboBox();
comboBoxPosisiKabelLcd.setModel(new DefaultComboBoxModel(new String[] {"DekatPintu", "DekatDosen", "DitengahRuang"}));
comboBoxPosisiKabelLcd.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxPosisiKabelLcd.setBackground(Color.WHITE);
comboBoxPosisiKabelLcd.setBounds(609, 92, 121, 20);
panel.add(comboBoxPosisiKabelLcd);

JComboBox comboBoxPosisiLampu = new JComboBox();
comboBoxPosisiLampu.setModel(new DefaultComboBoxModel(new String[] {"AtapRuangan", "DindingRuangan"}));
comboBoxPosisiLampu.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxPosisiLampu.setBackground(Color.WHITE);
comboBoxPosisiLampu.setBounds(609, 121, 121, 20);
panel.add(comboBoxPosisiLampu);

JComboBox comboBoxPosisiKipasAngin = new JComboBox();
comboBoxPosisiKipasAngin.setModel(new DefaultComboBoxModel(new String[] {"DindingRuangan", "AtapRuangan"}));
comboBoxPosisiKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxPosisiKipasAngin.setBackground(Color.WHITE);
comboBoxPosisiKipasAngin.setBounds(607, 157, 121, 20);
panel.add(comboBoxPosisiKipasAngin);

JComboBox comboBoxPosisiAC = new JComboBox();
comboBoxPosisiAC.setModel(new DefaultComboBoxModel(new String[] {"Ditengah", "Dibelakang/Disamping"}));
comboBoxPosisiAC.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxPosisiAC.setBackground(Color.WHITE);
comboBoxPosisiAC.setBounds(607, 188, 121, 20);
panel.add(comboBoxPosisiAC);

JComboBox comboBoxPosisiCCTV = new JComboBox();
comboBoxPosisiCCTV.setModel(new DefaultComboBoxModel(new String[] {"Depan&Belakang", "Kiri&Kanan"}));
comboBoxPosisiCCTV.setFont(new Font("Times New Roman", Font.BOLD, 11));
comboBoxPosisiCCTV.setBackground(Color.WHITE);
comboBoxPosisiCCTV.setBounds(609, 216, 121, 20);
panel.add(comboBoxPosisiCCTV);


JLabel lblImage = new JLabel("");
//lblImage.setIcon(new ImageIcon(GUI.class.getResource("/as/Picture1.png")));
lblImage.setBounds(0, 0, 781, 410);
panel.add(lblImage);

JPanel panel_1 = new JPanel();
getContentPane().add(panel_1, BorderLayout.SOUTH);

JButton btnLoad = new JButton("Load");
btnLoad.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
kondisi = ReadWrite.bacaKondisi();
textFieldNamaRuang.setText(kondisi.getNamaRuang());
comboBoxLokasi.setSelectedItem(kondisi.getLokasiRuang());
comboBoxFakultas.setSelectedItem(kondisi.getFakultas());
textFieldPanjang.setText(kondisi.getPanjangRuang()+"");
textFieldLebar.setText(kondisi.getLebarRuang()+"");
textFieldJumlahKursi.setText(kondisi.getJumlahKursi()+"");
textFieldJumlahPintu.setText(kondisi.getJumlahPintu()+"");
textFieldJumlahJendela.setText(kondisi.getJumlahJendela()+"");
textFieldJumlahSteker.setText(kondisi.getJumlahStopkontak()+"");
comboBoxKondisiSteker.setSelectedIndex(kondisi.getKondisiStopKontak());
comboBoxPosisiSteker.setSelectedIndex(kondisi.getPosisiStopKontak());
textFieldJumlahLcd.setText(kondisi.getJumlahKabelLcd()+"");
comboBoxKondisiLcd.setSelectedIndex(kondisi.getKondisiKabelLcd());
comboBoxPosisiKabelLcd.setSelectedIndex(kondisi.getPosisiKabelLcd());
textFieldJumlahLampu.setText(kondisi.getJumlahLampu()+"");
comboBoxKondisiLampu.setSelectedIndex(kondisi.getKondisiLampu());
comboBoxPosisiLampu.setSelectedIndex(kondisi.getPosisiLampu());
textFieldJumlahKipasAngin.setText(kondisi.getJumlahKipasAngin()+"");
comboBoxKondisiKipasAngin.setSelectedIndex(kondisi.getKondisiKipasAngin());
comboBoxPosisiKipasAngin.setSelectedIndex(kondisi.getPosisiKipasAngin());
textFieldJumlahAC.setText(kondisi.getJumlahAc()+"");
comboBoxKondisiAc.setSelectedIndex(kondisi.getKondisiAc());
comboBoxPosisiAC.setSelectedIndex(kondisi.getPosisiAc());
comboBoxHotspot.setSelectedIndex(kondisi.getSSID());
comboBoxLoginHotspot.setSelectedIndex(kondisi.getInputBandwidth());
textFieldJumlahCCTV.setText(kondisi.getJumlahCctv()+"");
comboBoxKondisiCCTV.setSelectedIndex(kondisi.getKondisiCctv());
comboBoxPosisiCCTV.setSelectedIndex(kondisi.getPosisiCctv());
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "File Tidak Ada / Tidak Lengkap", "Error", JOptionPane.ERROR_MESSAGE);
}



}
});
btnLoad.setForeground(Color.WHITE);
btnLoad.setBackground(new Color(0, 0, 102));
panel_1.setLayout(new BorderLayout(0, 0));
panel_1.add(btnLoad, BorderLayout.EAST);

JButton buttonAnalisis = new JButton("Analisis");
buttonAnalisis.setForeground(Color.WHITE);
buttonAnalisis.setBackground(new Color(0, 0, 102));
buttonAnalisis.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
kondisi = new JumlahKondisidanPosisiSarana();
kondisi.setNamaRuang(textFieldNamaRuang.getText());
kondisi.setLokasiRuang(comboBoxLokasi.getSelectedItem()+"");
kondisi.setFakultas(comboBoxFakultas.getSelectedItem()+"");
kondisi.setPanjangRuang(Integer.parseInt(textFieldPanjang.getText()));
kondisi.setLebarRuang(Integer.parseInt(textFieldLebar.getText()));
kondisi.setJumlahKursi(Integer.parseInt(textFieldJumlahKursi.getText()));
kondisi.setJumlahPintu(Integer.parseInt(textFieldJumlahPintu.getText()));
kondisi.setJumlahJendela(Integer.parseInt(textFieldJumlahJendela.getText()));

kondisi.setJumlahStopkontak(Integer.parseInt(textFieldJumlahSteker.getText()));
kondisi.setKondisiStopKontak(comboBoxKondisiSteker.getSelectedIndex());
kondisi.setPosisiStopKontak(comboBoxPosisiSteker.getSelectedIndex());

kondisi.setJumlahKabelLcd(Integer.parseInt(textFieldJumlahLcd.getText()));
kondisi.setKondisiKabelLcd(comboBoxKondisiLcd.getSelectedIndex());
kondisi.setPosisiKabelLcd(comboBoxPosisiKabelLcd.getSelectedIndex());

kondisi.setJumlahLampu(Integer.parseInt(textFieldJumlahLampu.getText()));
kondisi.setKondisiLampu(comboBoxKondisiLampu.getSelectedIndex());
kondisi.setPosisiLampu(comboBoxPosisiLampu.getSelectedIndex());

kondisi.setJumlahKipasAngin(Integer.parseInt(textFieldJumlahKipasAngin.getText()));
kondisi.setKondisiKipasAngin(comboBoxKondisiKipasAngin.getSelectedIndex());
kondisi.setPosisiKipasAngin(comboBoxPosisiKipasAngin.getSelectedIndex());

kondisi.setJumlahAc(Integer.parseInt(textFieldJumlahAC.getText()));
kondisi.setKondisiAc(comboBoxKondisiAc.getSelectedIndex());
kondisi.setPosisiAc(comboBoxPosisiAC.getSelectedIndex());

kondisi.setSSID(comboBoxHotspot.getSelectedIndex());
kondisi.setInputBandwidth(comboBoxLoginHotspot.getSelectedIndex());

kondisi.setJumlahCctv(Integer.parseInt(textFieldJumlahCCTV.getText()));
kondisi.setKondisiCctv(comboBoxKondisiCCTV.getSelectedIndex());
kondisi.setPosisiCctv(comboBoxPosisiCCTV.getSelectedIndex());

ReadWrite.simpanKondisi(kondisi);

AnalisisKondisi an = new AnalisisKondisi();
an.setVisible(true);

} catch (Exception e) {
JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
}


}
});
panel_1.add(buttonAnalisis, BorderLayout.CENTER);

JButton button_1 = new JButton(">");
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
InventarisKebersihan invber = new InventarisKebersihan();
invber.setVisible(true);
dispose();
}
});
button_1.setForeground(Color.WHITE);
button_1.setBackground(new Color(0, 0, 102));
button_1.setToolTipText("Next");
getContentPane().add(button_1, BorderLayout.EAST);

Panel panel_2 = new Panel();
panel_2.setBackground(new Color(0, 0, 102));
getContentPane().add(panel_2, BorderLayout.NORTH);

JLabel lblInventarisKelas = new JLabel("Inventaris Kondisi");
lblInventarisKelas.setForeground(Color.WHITE);
lblInventarisKelas.setBackground(new Color(0, 0, 153));
lblInventarisKelas.setIcon(null);
panel_2.add(lblInventarisKelas);
lblInventarisKelas.setFont(new Font("Algerian", Font.BOLD, 13));
}
}

