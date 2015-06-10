import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jcp.xml.dsig.internal.MacOutputStream;
import org.jcp.xml.dsig.internal.DigesterOutputStream;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.jcp.xml.dsig.internal.MacOutputStream;


public class Diagram extends JFrame {


public Diagram (int sesuai, int tidaksesuai) {
DefaultPieDataset dpd = new DefaultPieDataset();
dpd.setValue("sesuai", sesuai);
dpd.setValue("tidak sesuai", tidaksesuai);
JPanel freeChart = createPieChart("Hasil Menganalisis",dpd,true,true, false); //String title,PieDatasheet datasheet,boolean legends,boolean tooltips,boolean url 
ChartFrame cf = new ChartFrame("Data Analisis ",freeChart);
cf.setSize(600,600);
cf.setVisible(true);
cf.setLocationRelativeTo(null);
cf.setBackground(Color.BLUE);
cf.setForeground(Color.BLUE);

}

    private JPanel createPieChart(String hasil_Menganalisis, DefaultPieDataset dpd, boolean b, boolean b0, boolean b1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

