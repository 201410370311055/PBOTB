import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Color;

//import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import java.awt.Canvas;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.io.File;
import java.net.URL;

import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class InventarisKeamanan extends JFrame {


private KeamananRuangKelas keamanan;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
InventarisKeamanan window = new InventarisKeamanan();
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
public InventarisKeamanan() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
setResizable(false);
setBounds(100, 100, 797, 493);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel = new JPanel();
getContentPane().add(panel, BorderLayout.CENTER);
panel.setLayout(null);

JTextPane txtpnAspek = new JTextPane();
txtpnAspek.setEditable(false);
txtpnAspek.setForeground(Color.WHITE);
txtpnAspek.setFont(new Font("Times New Roman", Font.BOLD, 14));
txtpnAspek.setBackground(new Color(255, 102, 0));
txtpnAspek.setText("Aspek");
txtpnAspek.setBounds(110, 126, 247, 23);
panel.add(txtpnAspek);

JTextPane txtpnKondisi = new JTextPane();
txtpnKondisi.setEditable(false);
txtpnKondisi.setText("Kondisi");
txtpnKondisi.setForeground(Color.WHITE);
txtpnKondisi.setFont(new Font("Times New Roman", Font.BOLD, 14));
txtpnKondisi.setBackground(new Color(255, 102, 0));
txtpnKondisi.setBounds(356, 126, 183, 23);
panel.add(txtpnKondisi);

Canvas canvas = new Canvas();
canvas.setBackground(new Color(255, 102, 0));
canvas.setBounds(292, 126, 5, 182);
panel.add(canvas);

JComboBox comboBoxkokoh = new JComboBox();
comboBoxkokoh.setModel(new DefaultComboBoxModel(new String[] {"Kokoh", "Tidak Kokoh"}));
comboBoxkokoh.setFont(new Font("Times New Roman", Font.BOLD, 14));
comboBoxkokoh.setForeground(Color.WHITE);
comboBoxkokoh.setBackground(new Color(0, 0, 153));
comboBoxkokoh.setBounds(303, 164, 217, 20);
panel.add(comboBoxkokoh);

JComboBox comboBoxPintu = new JComboBox();
comboBoxPintu.setModel(new DefaultComboBoxModel(new String[] {"Ada", "Tidak Ada"}));
comboBoxPintu.setFont(new Font("Times New Roman", Font.BOLD, 14));
comboBoxPintu.setForeground(Color.WHITE);
comboBoxPintu.setBackground(new Color(0, 0, 153));
comboBoxPintu.setBounds(303, 201, 217, 20);
panel.add(comboBoxPintu);

JComboBox comboBoxJendela = new JComboBox();
comboBoxJendela.setModel(new DefaultComboBoxModel(new String[] {"Ada", "Tidak Ada"}));
comboBoxJendela.setFont(new Font("Times New Roman", Font.BOLD, 14));
comboBoxJendela.setForeground(Color.WHITE);
comboBoxJendela.setBackground(new Color(0, 0, 153));
comboBoxJendela.setBounds(303, 232, 217, 20);
panel.add(comboBoxJendela);

JComboBox comboBoxBahaya = new JComboBox();
comboBoxBahaya.setModel(new DefaultComboBoxModel(new String[] {"Aman", "Kurang Aman"}));
comboBoxBahaya.setFont(new Font("Times New Roman", Font.BOLD, 14));
comboBoxBahaya.setForeground(Color.WHITE);
comboBoxBahaya.setBackground(new Color(0, 0, 153));
comboBoxBahaya.setBounds(303, 263, 217, 20);
panel.add(comboBoxBahaya);

JTextPane txtpnKekokohan = new JTextPane();
txtpnKekokohan.setText("Kekokohan");
txtpnKekokohan.setForeground(Color.WHITE);
txtpnKekokohan.setFont(new Font("Times New Roman", Font.BOLD, 14));
txtpnKekokohan.setEditable(false);
txtpnKekokohan.setBackground(new Color(204, 0, 0));
txtpnKekokohan.setBounds(126, 164, 159, 23);
panel.add(txtpnKekokohan);

JTextPane txtpnKunciPintu = new JTextPane();
txtpnKunciPintu.setText("Kunci Pintu");
txtpnKunciPintu.setForeground(Color.WHITE);
txtpnKunciPintu.setFont(new Font("Times New Roman", Font.BOLD, 14));
txtpnKunciPintu.setEditable(false);
txtpnKunciPintu.setBackground(new Color(204, 0, 0));
txtpnKunciPintu.setBounds(126, 201, 159, 23);
panel.add(txtpnKunciPintu);

JTextPane txtpnKunciJendela = new JTextPane();
txtpnKunciJendela.setText("Kunci Jendela");
txtpnKunciJendela.setForeground(Color.WHITE);
txtpnKunciJendela.setFont(new Font("Times New Roman", Font.BOLD, 14));
txtpnKunciJendela.setEditable(false);
txtpnKunciJendela.setBackground(new Color(204, 0, 0));
txtpnKunciJendela.setBounds(127, 232, 159, 23);
panel.add(txtpnKunciJendela);

JTextPane txtpnBahaya = new JTextPane();
txtpnBahaya.setText("Bahaya");
txtpnBahaya.setForeground(Color.WHITE);
txtpnBahaya.setFont(new Font("Times New Roman", Font.BOLD, 14));
txtpnBahaya.setEditable(false);
txtpnBahaya.setBackground(new Color(204, 0, 0));
txtpnBahaya.setBounds(127, 263, 159, 23);
panel.add(txtpnBahaya);

JTextPane textPaneNamaRuang = new JTextPane();
textPaneNamaRuang.setText(ReadWrite.bacaKondisi().getNamaRuang());
textPaneNamaRuang.setForeground(Color.WHITE);
textPaneNamaRuang.setFont(new Font("Times New Roman", Font.BOLD, 14));
textPaneNamaRuang.setEditable(false);
textPaneNamaRuang.setBackground(new Color(204, 0, 0));
textPaneNamaRuang.setBounds(495, 11, 159, 23);
panel.add(textPaneNamaRuang);

JTextPane textPaneFakultas = new JTextPane();
textPaneFakultas.setText(ReadWrite.bacaKondisi().getFakultas());
textPaneFakultas.setForeground(Color.WHITE);
textPaneFakultas.setFont(new Font("Times New Roman", Font.BOLD, 14));
textPaneFakultas.setEditable(false);
textPaneFakultas.setBackground(new Color(204, 0, 0));
textPaneFakultas.setBounds(495, 39, 159, 23);
panel.add(textPaneFakultas);

JTextPane textPaneLokasi = new JTextPane();
textPaneLokasi.setText(ReadWrite.bacaKondisi().getLokasiRuang());
textPaneLokasi.setForeground(Color.WHITE);
textPaneLokasi.setFont(new Font("Times New Roman", Font.BOLD, 14));
textPaneLokasi.setEditable(false);
textPaneLokasi.setBackground(new Color(204, 0, 0));
textPaneLokasi.setBounds(495, 66, 159, 23);
panel.add(textPaneLokasi);

JLabel lblNamaRuang = new JLabel("Nama Ruang");
lblNamaRuang.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblNamaRuang.setForeground(new Color(0, 0, 153));
lblNamaRuang.setBounds(356, 11, 99, 23);
panel.add(lblNamaRuang);

JLabel lblFakultas = new JLabel("Fakultas");
lblFakultas.setForeground(new Color(0, 0, 153));
lblFakultas.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblFakultas.setBounds(356, 39, 99, 23);
panel.add(lblFakultas);

JLabel lblLokasi = new JLabel("Lokasi");
lblLokasi.setForeground(new Color(0, 0, 153));
lblLokasi.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblLokasi.setBounds(355, 66, 99, 23);
panel.add(lblLokasi);

JLabel lblBg = new JLabel("");
//lblBg.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
lblBg.setBounds(-43, 0, 781, 428);
panel.add(lblBg);

JPanel panelAtas = new JPanel();
panelAtas.setBackground(new Color(255, 102, 0));
getContentPane().add(panelAtas, BorderLayout.NORTH);

JLabel lblInventarisKeamanan = new JLabel("Inventaris Keamanan");
lblInventarisKeamanan.setForeground(Color.WHITE);
lblInventarisKeamanan.setFont(new Font("Algerian", Font.BOLD, 12));
panelAtas.add(lblInventarisKeamanan);

JPanel paneBawah = new JPanel();
getContentPane().add(paneBawah, BorderLayout.SOUTH);
paneBawah.setLayout(new BorderLayout(0, 0));

JButton btnNewButton = new JButton("Analisis");
//btnNewButton.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
keamanan= new KeamananRuangKelas();
keamanan.setKekokohan(comboBoxkokoh.getSelectedItem()+"");
keamanan.setKunciPintu(comboBoxPintu.getSelectedItem()+"");
keamanan.setKunciJendela(comboBoxJendela.getSelectedItem()+"");
keamanan.setBahaya(comboBoxBahaya.getSelectedItem()+"");

ReadWrite.simpanKeamanan(keamanan);
AnalisisKeamanan aman = new AnalisisKeamanan();
aman.setVisible(true);
new Diagram(keamanan.hitungSesuai(), keamanan.hitungTdkSesuai());
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "input dengan benar : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
}


}
});

JButton button_1 = new JButton("Create PDF");
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
KeamananRuangKelas keamanan = InventarisKeamanan.this.keamanan;
String kata ="Data Keamanan Ruang Kelas\n" 
+"Kekokohan "+keamanan.analisisKekokohan(keamanan.getKekokohan())+"\n"
+"Analisis Kunci Pintu dan Jendela "+keamanan.analisisKunciPintuJendela(keamanan.getKunciPintu(), keamanan.getKunciJendela())+"\n"
+"Analisis Keamanan Ruang "+keamanan.analisisKeamananRuang(keamanan.getBahaya())+"\n" 
+ "\n"
+ "Inventaris Tentang Keamanan yang sesuai : "+keamanan.hitungSesuai()+"\n"
+ "Inventaris Tentang Keamanan yang Tidak Sesuai : "+keamanan.hitungTdkSesuai()+"\n"
+ "Deskripsi Kelas : "+keamanan.deskripsiKelas();

JOptionPane.showMessageDialog(null, "Berhasil Membuat PDF", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

//new Pdf(kata, "DATA KEAMANAN RUANGAN.pdf");
Desktop.getDesktop().open(new File("DATA KEAMANAN RUANGAN.pdf"));
}catch (Exception e) {
JOptionPane.showMessageDialog(null, "Gagal Membuat PDF", "Error", JOptionPane.ERROR_MESSAGE);
}
}
});
//button_1.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("/as/pdf-icon.png")));
paneBawah.add(button_1, BorderLayout.WEST);
button_1.setForeground(Color.WHITE);
button_1.setBackground(new Color(255, 102, 0));
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
btnNewButton.setForeground(Color.WHITE);
btnNewButton.setBackground(new Color(255, 102, 0));
paneBawah.add(btnNewButton);

JButton btnNewButton_1 = new JButton("Load");
//btnNewButton_1.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("/as/load-md.png")));
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
keamanan = ReadWrite.bacaKeamanan();
comboBoxkokoh.setSelectedItem(keamanan.getKekokohan());
comboBoxPintu.setSelectedItem(keamanan.getKunciPintu());
comboBoxJendela.setSelectedItem(keamanan.getKunciJendela());
comboBoxBahaya.setSelectedItem(keamanan.getBahaya());
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "File Tidak Ada / Tidak Lengkap", "Error", JOptionPane.ERROR_MESSAGE);
}

}
});
btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
btnNewButton_1.setForeground(Color.WHITE);
btnNewButton_1.setBackground(new Color(255, 102, 0));
paneBawah.add(btnNewButton_1, BorderLayout.EAST);

JButton button_2 = new JButton("Menghapus Data yang Telah Tersimpan");
//button_2.setIcon(new ImageIcon(GUI.class.getResource("/as/edit-delete-icon.png")));
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
try {
ReadWrite.deleteObject("datakeamanan.dat");

comboBoxkokoh.setSelectedItem(0);
comboBoxPintu.setSelectedItem(0);
comboBoxJendela.setSelectedItem(0);
comboBoxBahaya.setSelectedItem(0);

JOptionPane.showMessageDialog(null, "Berhasil Delete","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "Gagal Menghapus", "Error", JOptionPane.ERROR_MESSAGE);
}

}
});
button_2.setForeground(Color.WHITE);
button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
button_2.setBackground(Color.RED);
paneBawah.add(button_2, BorderLayout.SOUTH);

JButton button = new JButton("");
//button.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
InventarisKebersihan invber = new InventarisKebersihan();
invber.setVisible(true);
dispose();
}
});
button.setFont(new Font("Tahoma", Font.BOLD, 12));
button.setForeground(Color.WHITE);
button.setBackground(new Color(255, 102, 0));
getContentPane().add(button, BorderLayout.WEST);

JMenuBar menuBar = new JMenuBar();
menuBar.setBackground(new Color(204, 0, 0));
setJMenuBar(menuBar);

JMenu mnFile = new JMenu("File");
//mnFile.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
mnFile.setFont(new Font("Segoe UI", Font.BOLD, 12));
mnFile.setForeground(Color.WHITE);
menuBar.add(mnFile);

JMenuItem mntmLogout = new JMenuItem("LogOut");
//mntmLogout.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
mntmLogout.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
dispose();
Login log = new Login();
//log.setVisible(true);
}
});
mnFile.add(mntmLogout);

JMenuItem mntmExit = new JMenuItem("Exit");
//mntmExit.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
mntmExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
dispose();
}
});
mnFile.addSeparator();
mnFile.add(mntmExit);

JMenu mnAuthors = new JMenu("Authors");
//mnAuthors.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
mnAuthors.setForeground(Color.WHITE);
menuBar.add(mnAuthors);

JMenuItem mntmNewMenuItem = new JMenuItem("Kelasb");
//mntmNewMenuItem.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
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

JMenuItem mntmCoba = new JMenuItem("Kelasb");
//mntmCoba.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
mntmCoba.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {

try {
Desktop.getDesktop().browse(new URL("https://www.facebook.com").toURI());
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
}

}
});
mnAuthors.add(mntmCoba);

JMenuItem mntmCoba2 = new JMenuItem("kelasb");
//mntmCoba2.setIcon(new ImageIcon(InventarisKeamanan.class.getResource("")));
mntmCoba2.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
try {
Desktop.getDesktop().browse(new URL("https://www.facebook.com").toURI());
} catch (Exception e2) {
JOptionPane.showMessageDialog(null, "Gagal Membuka", "Error", JOptionPane.ERROR_MESSAGE);
}
}
});
mnAuthors.add(mntmCoba2);
}
}

