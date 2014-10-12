package html;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class replace
        extends JFrame {

    String DATA = "Uday is king of all dynasities!";
    String[] x = null;
    String[] y = null;
    int ch1 = 0;
    int ch2 = 0;
    private JComboBox cho;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JButton lbut;
    private JTextField linput;
    private JButton rbut;
    private JComboBox rcho;
    private JTextField rep;
    private JButton replace;

    public replace() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jPanel2 = new JPanel();
        this.jLabel3 = new JLabel();
        this.linput = new JTextField();
        this.cho = new JComboBox();
        this.lbut = new JButton();
        this.replace = new JButton();
        this.jLabel4 = new JLabel();
        this.rep = new JTextField();
        this.rcho = new JComboBox();
        this.rbut = new JButton();

        setDefaultCloseOperation(3);

        this.jPanel1.setBackground(SystemColor.textHighlight);

        this.jLabel1.setText("Replace :");

        this.jLabel2.setText("Replace with:");

        this.jLabel3.setText("Enter List one by one :");

        this.linput.setToolTipText("letters are case sensitive");

        this.cho.setBackground(new Color(51, 0, 51));
        this.cho.setFont(new Font("Times New Roman", 1, 14));
        this.cho.setForeground(new Color(255, 255, 51));
        this.cho.setModel(new DefaultComboBoxModel(new String[]{"choices here"}));

        this.lbut.setBackground(new Color(204, 204, 255));
        this.lbut.setFont(new Font("Tahoma", 1, 12));
        this.lbut.setForeground(new Color(0, 0, 102));
        this.lbut.setMnemonic('7');
        this.lbut.setText("Add Choice");
        this.lbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                replace.this.lbutActionPerformed(evt);
            }
        });
        this.replace.setText("Replace");
        this.replace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                replace.this.replaceActionPerformed(evt);
            }
        });
        this.jLabel4.setText("Enter Replacement    :");

        this.rep.setToolTipText("letters are case sensitive");

        this.rcho.setBackground(new Color(102, 0, 0));
        this.rcho.setFont(new Font("Tahoma", 1, 14));
        this.rcho.setForeground(new Color(204, 204, 0));
        this.rcho.setModel(new DefaultComboBoxModel(new String[]{"choices here"}));

        this.rbut.setBackground(new Color(204, 204, 255));
        this.rbut.setFont(new Font("Tahoma", 1, 12));
        this.rbut.setForeground(new Color(0, 0, 102));
        this.rbut.setText("Add Replacement");
        this.rbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                replace.this.rbutActionPerformed(evt);
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel3).addGap(18, 18, 18).addComponent(this.linput, -1, 236, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.cho, -2, 201, -2).addGap(18, 18, 18).addComponent(this.lbut, -1, 144, 32767))).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.replace).addGap(68, 68, 68)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel4, -2, 112, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.rep, -1, 241, 32767).addContainerGap()).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.rcho, -2, 204, -2).addGap(18, 18, 18).addComponent(this.rbut).addContainerGap()))));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.linput, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cho, -2, -1, -2).addComponent(this.lbut)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.rep, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.rcho, -2, -1, -2).addComponent(this.rbut)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.replace).addContainerGap()));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGap(41, 41, 41).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField2).addComponent(this.jTextField1, -1, 239, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -1, -1, 32767))).addContainerGap()));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(45, 45, 45).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField2, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.jPanel2, -1, -1, 32767).addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        pack();
    }

    private void lbutActionPerformed(ActionEvent evt) {
        String s = this.linput.getText();

        this.cho.removeItem("choices here");
        this.cho.addItem(s + "");
        this.ch1 += 1;
    }

    private void replaceActionPerformed(ActionEvent evt) {
        int n = this.cho.getItemCount() >= this.rcho.getItemCount() ? this.cho.getItemCount() : this.rcho.getItemCount();
        String replaces = null;
        String pre = this.DATA;
        for (int i = 0; i < 100; i++) {
            replaces = this.DATA.replace(this.cho.getItemAt(i) + "", this.rcho.getItemAt(i) + "");
            this.DATA = replaces;
            Functions d = new Functions();
            Functions.File_Input(this.DATA, "C:\\HTML\\Code Block\\buffer.usk", this.rbut);
        }
        JOptionPane.showMessageDialog(this.rootPane, pre + " \n" + this.DATA);
        dispose();
    }

    private void rbutActionPerformed(ActionEvent evt) {
        String s = this.rep.getText();

        this.rcho.removeItem("choices here");
        this.rcho.addItem(s + "");
        this.ch2 += 1;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new replace().setVisible(true);
            }
        });
    }
}
