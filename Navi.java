package html;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

public class Navi extends JFrame {

    private JButton jButton1;
    private JFileChooser jFileChooser1;
    private JPanel jPanel1;

    public Navi() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jFileChooser1 = new JFileChooser();
        this.jButton1 = new JButton();

        setDefaultCloseOperation(2);
        setBounds(new Rectangle(200, 300, 200, 200));
        setFocusTraversalPolicyProvider(true);
        setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setType(Window.Type.UTILITY);
        setUndecorated(true);

        this.jPanel1.setBackground(new Color(204, 204, 255));
        this.jPanel1.setBorder(new LineBorder(new Color(0, 51, 102), 3, true));

        this.jFileChooser1.setApproveButtonToolTipText("");
        this.jFileChooser1.setDialogTitle("Navigator 1.0");
        this.jFileChooser1.setToolTipText("file navigator 1.0");
        this.jFileChooser1.setAutoscrolls(true);
        this.jFileChooser1.setFocusCycleRoot(true);
        this.jFileChooser1.setMultiSelectionEnabled(true);
        this.jFileChooser1.setOpaque(true);
        this.jFileChooser1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Navi.this.jFileChooser1ActionPerformed(evt);
            }
        });
        this.jButton1.setText("EXIT");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Navi.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jFileChooser1, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jButton1))).addContainerGap(-1, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jFileChooser1, -2, 376, -2)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }

    private void jFileChooser1ActionPerformed(ActionEvent evt) {
        Functions f = new Functions();
        String path = this.jFileChooser1.getSelectedFile().getPath();
        String data = Functions.File_Output(path);
        System.out.println("The path for the selected code is :" + path);
        System.out.println("The data for the selected code is :" + data.replace("null", ""));
        Functions.File_Input("\n" + this.jFileChooser1.getSelectedFile().getName() + "\nPath :" + path + "\nData :\n" + data.replace("null", "") + "\n", "C:\\HTML\\Code Block\\buffer.usk", this);
        dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        dispose();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navi().setVisible(true);
            }
        });
    }
}
