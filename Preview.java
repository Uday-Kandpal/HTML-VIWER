package html;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Preview extends JFrame {

    String type = "";
    int InOut = 1;
    Rectangle r;
    int text = 1;
    int button = 1;
    int Label = 1;
    int check = 1;
    int radio = 1;
    private JLabel dropper;
    private Box.Filler filler1;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton27;
    private JButton jButton28;
    private JButton jButton29;
    private JButton jButton3;
    private JButton jButton30;
    private JButton jButton31;
    private JButton jButton32;
    private JButton jButton33;
    private JButton jButton34;
    private JButton jButton35;
    private JButton jButton36;
    private JButton jButton37;
    private JButton jButton38;
    private JButton jButton39;
    private JButton jButton4;
    private JButton jButton40;
    private JButton jButton41;
    private JButton jButton42;
    private JButton jButton43;
    private JButton jButton44;
    private JButton jButton45;
    private JButton jButton46;
    private JButton jButton47;
    private JButton jButton48;
    private JButton jButton49;
    private JButton jButton5;
    private JButton jButton50;
    private JButton jButton51;
    private JButton jButton52;
    private JButton jButton53;
    private JButton jButton54;
    private JButton jButton55;
    private JButton jButton56;
    private JButton jButton57;
    private JButton jButton58;
    private JButton jButton59;
    private JButton jButton6;
    private JButton jButton60;
    private JButton jButton61;
    private JButton jButton62;
    private JButton jButton63;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;

    public Preview() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jPanel1 = new JPanel();
        this.dropper = new JLabel();
        this.jPanel4 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jPanel2 = new JPanel();
        this.jButton15 = new JButton();
        this.jButton16 = new JButton();
        this.jButton17 = new JButton();
        this.jButton18 = new JButton();
        this.jButton19 = new JButton();
        this.jButton20 = new JButton();
        this.jButton21 = new JButton();
        this.jButton22 = new JButton();
        this.jButton23 = new JButton();
        this.jButton24 = new JButton();
        this.jButton25 = new JButton();
        this.jButton26 = new JButton();
        this.jButton27 = new JButton();
        this.jButton28 = new JButton();
        this.jButton29 = new JButton();
        this.jButton30 = new JButton();
        this.jButton31 = new JButton();
        this.jButton32 = new JButton();
        this.jButton33 = new JButton();
        this.jButton34 = new JButton();
        this.jButton35 = new JButton();
        this.jButton36 = new JButton();
        this.jButton37 = new JButton();
        this.jButton38 = new JButton();
        this.jButton39 = new JButton();
        this.jButton40 = new JButton();
        this.jButton41 = new JButton();
        this.jButton42 = new JButton();
        this.jButton43 = new JButton();
        this.jButton44 = new JButton();
        this.jButton45 = new JButton();
        this.jButton46 = new JButton();
        this.jButton47 = new JButton();
        this.jButton48 = new JButton();
        this.jButton49 = new JButton();
        this.jButton50 = new JButton();
        this.jButton51 = new JButton();
        this.jButton52 = new JButton();
        this.jButton53 = new JButton();
        this.jButton54 = new JButton();
        this.jButton55 = new JButton();
        this.jButton56 = new JButton();
        this.jButton58 = new JButton();
        this.jButton59 = new JButton();
        this.jButton60 = new JButton();
        this.jButton61 = new JButton();
        this.jButton62 = new JButton();
        this.jButton63 = new JButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.jButton8 = new JButton();
        this.jButton7 = new JButton();
        this.jButton9 = new JButton();
        this.jButton10 = new JButton();
        this.jButton11 = new JButton();
        this.jButton12 = new JButton();
        this.jButton14 = new JButton();
        this.jButton13 = new JButton();
        this.jButton57 = new JButton();
        this.filler1 = new Box.Filler(new Dimension(0, 4000), new Dimension(0, 4000), new Dimension(32767, 4000));

        this.jLabel1.setText("jLabel1");

        setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(51, 51, 0));
        this.jPanel1.setBorder(BorderFactory.createBevelBorder(0));
        this.jPanel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Preview.this.jPanel1MouseClicked(evt);
            }
        });
        this.jPanel1.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                Preview.this.jPanel1MouseDragged(evt);
            }

            public void mouseMoved(MouseEvent evt) {
                Preview.this.jPanel1MouseMoved(evt);
            }
        });
        this.jScrollPane1.setBackground(new Color(102, 102, 102));
        this.jScrollPane1.setHorizontalScrollBarPolicy(32);
        this.jScrollPane1.setVerticalScrollBarPolicy(22);

        this.jPanel2.setBackground(new Color(51, 51, 51));
        this.jPanel2.setCursor(new Cursor(12));
        this.jPanel2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Preview.this.jPanel2MouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                Preview.this.jPanel2MouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                Preview.this.jPanel2MouseExited(evt);
            }
        });
        this.jPanel2.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent evt) {
                Preview.this.jPanel2MouseMoved(evt);
            }
        });
        this.jButton15.setText("B");

        this.jButton16.setText("B");

        this.jButton17.setText("B");

        this.jButton18.setText("B");

        this.jButton19.setText("B");

        this.jButton20.setText("B");

        this.jButton21.setText("B");

        this.jButton22.setText("B");

        this.jButton23.setText("B");

        this.jButton24.setText("B");

        this.jButton25.setText("B");

        this.jButton26.setText("B");

        this.jButton27.setText("B");

        this.jButton28.setText("B");

        this.jButton29.setText("B");

        this.jButton30.setText("B");

        this.jButton31.setText("B");

        this.jButton32.setText("B");

        this.jButton33.setText("B");

        this.jButton34.setText("B");

        this.jButton35.setText("B");

        this.jButton36.setText("B");

        this.jButton37.setText("B");

        this.jButton38.setText("B");

        this.jButton39.setText("B");

        this.jButton40.setText("B");

        this.jButton41.setText("B");

        this.jButton42.setText("B");

        this.jButton43.setText("B");

        this.jButton44.setText("B");

        this.jButton45.setText("B");

        this.jButton46.setText("B");

        this.jButton47.setText("B");

        this.jButton48.setText("B");

        this.jButton49.setText("B");

        this.jButton50.setText("B");

        this.jButton51.setText("B");

        this.jButton52.setText("B");

        this.jButton53.setText("B");

        this.jButton54.setText("B");

        this.jButton55.setText("B");

        this.jButton56.setText("B");

        this.jButton58.setText("B");

        this.jButton59.setText("B");

        this.jButton60.setText("B");

        this.jButton61.setText("B");

        this.jButton62.setText("B");

        this.jButton63.setText("B");

        this.jButton1.setIcon(new ImageIcon(getClass().getResource("/html/design/uText.PNG")));
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Preview.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(getClass().getResource("/html/design/uLabel.PNG")));
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Preview.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(getClass().getResource("/html/design/uButton.PNG")));
        this.jButton3.setText(" ");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Preview.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setIcon(new ImageIcon(getClass().getResource("/html/design/uRadioInactive.PNG")));
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Preview.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton5.setIcon(new ImageIcon(getClass().getResource("/html/design/uCheckActive.PNG")));
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Preview.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton6.setText("B");

        this.jButton8.setText("B");

        this.jButton7.setText("B");

        this.jButton9.setText("B");

        this.jButton10.setText("B");

        this.jButton11.setText("B");

        this.jButton12.setText("B");

        this.jButton14.setText("B");

        this.jButton13.setText("B");

        this.jButton57.setText("B");
        this.jButton57.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Preview.this.jButton57ActionPerformed(evt);
            }
        });
        this.filler1.setBackground(new Color(153, 153, 153));
        this.filler1.setForeground(new Color(102, 102, 102));
        this.filler1.setOpaque(true);

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton3, -1, -1, 32767).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jButton4, -1, -1, 32767).addComponent(this.jButton5, -1, -1, 32767).addComponent(this.jButton6, -1, -1, 32767).addComponent(this.jButton8, -1, -1, 32767).addComponent(this.jButton7, -1, -1, 32767).addComponent(this.jButton9, -1, -1, 32767).addComponent(this.jButton10, -1, -1, 32767).addComponent(this.jButton11, -1, -1, 32767).addComponent(this.jButton12, -1, -1, 32767).addComponent(this.jButton14, -1, -1, 32767).addComponent(this.jButton13, -1, -1, 32767).addComponent(this.jButton57, -2, 169, -2)).addGap(18, 18, 18).addComponent(this.filler1, -2, 0, -2).addGap(51, 51, 51).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton15).addComponent(this.jButton16).addComponent(this.jButton17).addComponent(this.jButton18).addComponent(this.jButton19).addComponent(this.jButton20).addComponent(this.jButton22).addComponent(this.jButton21).addComponent(this.jButton23).addComponent(this.jButton24).addComponent(this.jButton25).addComponent(this.jButton26).addComponent(this.jButton28).addComponent(this.jButton27).addComponent(this.jButton58)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton59).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton29).addComponent(this.jButton30).addComponent(this.jButton31).addComponent(this.jButton32).addComponent(this.jButton33).addComponent(this.jButton34).addComponent(this.jButton36).addComponent(this.jButton35).addComponent(this.jButton37).addComponent(this.jButton38).addComponent(this.jButton39).addComponent(this.jButton40).addComponent(this.jButton42).addComponent(this.jButton41)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton43).addComponent(this.jButton44).addComponent(this.jButton45).addComponent(this.jButton46).addComponent(this.jButton47).addComponent(this.jButton48).addComponent(this.jButton50).addComponent(this.jButton49).addComponent(this.jButton51).addComponent(this.jButton52).addComponent(this.jButton53).addComponent(this.jButton54).addComponent(this.jButton56).addComponent(this.jButton55).addComponent(this.jButton60))))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jButton61).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton62).addGroup(jPanel2Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(this.jButton63))))).addContainerGap(274, 32767)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jButton1).addGap(25, 25, 25).addComponent(this.jButton2).addGap(25, 25, 25).addComponent(this.jButton3).addGap(25, 25, 25).addComponent(this.jButton4).addGap(25, 25, 25).addComponent(this.jButton5).addGap(25, 25, 25).addComponent(this.jButton6).addGap(25, 25, 25).addComponent(this.jButton8).addGap(25, 25, 25).addComponent(this.jButton7).addGap(25, 25, 25).addComponent(this.jButton9).addGap(25, 25, 25).addComponent(this.jButton10).addGap(25, 25, 25).addComponent(this.jButton11).addGap(25, 25, 25).addComponent(this.jButton12).addGap(25, 25, 25).addComponent(this.jButton14).addGap(25, 25, 25).addComponent(this.jButton13).addGap(18, 18, 18).addComponent(this.jButton57)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jButton43).addGap(25, 25, 25).addComponent(this.jButton44).addGap(25, 25, 25).addComponent(this.jButton45).addGap(25, 25, 25).addComponent(this.jButton46).addGap(25, 25, 25).addComponent(this.jButton47).addGap(25, 25, 25).addComponent(this.jButton48).addGap(25, 25, 25).addComponent(this.jButton49).addGap(25, 25, 25).addComponent(this.jButton50).addGap(25, 25, 25).addComponent(this.jButton51).addGap(25, 25, 25).addComponent(this.jButton52).addGap(25, 25, 25).addComponent(this.jButton53).addGap(25, 25, 25).addComponent(this.jButton54).addGap(25, 25, 25).addComponent(this.jButton55).addGap(25, 25, 25).addComponent(this.jButton56)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jButton15).addGap(25, 25, 25).addComponent(this.jButton16).addGap(25, 25, 25).addComponent(this.jButton17).addGap(25, 25, 25).addComponent(this.jButton18).addGap(25, 25, 25).addComponent(this.jButton19).addGap(25, 25, 25).addComponent(this.jButton20).addGap(25, 25, 25).addComponent(this.jButton21).addGap(25, 25, 25).addComponent(this.jButton22).addGap(25, 25, 25).addComponent(this.jButton23).addGap(25, 25, 25).addComponent(this.jButton24).addGap(25, 25, 25).addComponent(this.jButton25).addGap(25, 25, 25).addComponent(this.jButton26).addGap(25, 25, 25).addComponent(this.jButton27).addGap(25, 25, 25).addComponent(this.jButton28)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jButton29).addGap(25, 25, 25).addComponent(this.jButton30).addGap(25, 25, 25).addComponent(this.jButton31).addGap(25, 25, 25).addComponent(this.jButton32).addGap(25, 25, 25).addComponent(this.jButton33).addGap(25, 25, 25).addComponent(this.jButton34).addGap(25, 25, 25).addComponent(this.jButton35).addGap(25, 25, 25).addComponent(this.jButton36).addGap(25, 25, 25).addComponent(this.jButton37).addGap(25, 25, 25).addComponent(this.jButton38).addGap(25, 25, 25).addComponent(this.jButton39).addGap(25, 25, 25).addComponent(this.jButton40).addGap(25, 25, 25).addComponent(this.jButton41).addGap(25, 25, 25).addComponent(this.jButton42))).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton58).addComponent(this.jButton59).addComponent(this.jButton60)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton61).addComponent(this.jButton62).addComponent(this.jButton63))))).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.filler1, -2, 757, -2)));

        this.jScrollPane1.setViewportView(this.jPanel2);

        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 690, -2).addContainerGap(-1, 32767)));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1).addContainerGap()));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(965, 32767).addComponent(this.dropper, -2, 202, -2).addGap(110, 110, 110).addComponent(this.jPanel4, -2, 277, -2)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.dropper, -2, 41, -2).addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, -1, 32767).addGap(22, 22, 22)));

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.type = "text";
        this.dropper.setIcon(new ImageIcon(getClass().getResource("/html/design/uText.png")));
    }

    private void jPanel1MouseDragged(MouseEvent evt) {
        this.dropper.setBounds(getMousePosition().x, getMousePosition().y - 50, this.dropper.getBounds().width, this.dropper.getBounds().height);
    }

    private void jPanel1MouseClicked(MouseEvent evt) {
        if (this.type.matches("text")) {
            JTextField j = new JTextField();
            j.setName("uTextField" + this.text);
            this.text += 1;
            System.out.println(j.getName());
            j.setBounds(this.dropper.getBounds());
            j.setText(j.getName());
            this.jPanel1.add(j);
        }
        if (this.type.matches("label")) {
            JLabel k = new JLabel();
            k.setName("uLabel" + this.Label);
            this.Label += 1;
            System.out.println(k.getName());
            k.setBorder(BorderFactory.createBevelBorder(0));

            k.setOpaque(true);
            k.setText(k.getName());
            this.jPanel1.add(k);
        }
        if (this.type.matches("button")) {
            JButton l = new JButton();
            l.setName("uButton" + this.button);
            this.button += 1;
            this.jPanel1.add(l);
        }
        if (this.type.matches("radio")) {
            JRadioButton j = new JRadioButton();
            j.setName("uRadioButton" + this.radio);
            this.radio += 1;
            this.jPanel1.add(j);
        }
        if (this.type.matches("check")) {
            JCheckBox j = new JCheckBox();
            j.setName("uCheckBox" + this.check);
            this.check += 1;
            this.jPanel1.add(j);
        }
        this.jPanel1.validate();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.type = "label";
        this.dropper.setIcon(new ImageIcon(getClass().getResource("/html/design/uLabel.png")));
    }

    private void jPanel2MouseMoved(MouseEvent evt) {
        this.dropper.setBounds(getMousePosition().x, getMousePosition().y - 50, this.dropper.getBounds().width, this.dropper.getBounds().height);
    }

    private void jPanel1MouseMoved(MouseEvent evt) {
        this.dropper.setBounds(getMousePosition().x, getMousePosition().y - 50, this.dropper.getBounds().width, this.dropper.getBounds().height);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.type = "button";
        this.dropper.setIcon(new ImageIcon(getClass().getResource("/html/design/uButton.png")));
    }

    private void jPanel2MouseEntered(MouseEvent evt) {
    }

    private void jPanel2MouseExited(MouseEvent evt) {
    }

    private void jPanel2MouseClicked(MouseEvent evt) {
    }

    private void jButton57ActionPerformed(ActionEvent evt) {
        switch (this.InOut) {
            case 2:
                for (int i = 0; i <= 20; i++) {
                    this.jPanel4.setBounds(this.jPanel4.getBounds().x + i, this.jPanel4.getBounds().y, this.jPanel4.getBounds().width - i, this.jPanel4.getBounds().height);
                }
                this.InOut = 1;
                break;
            case 1:
                for (int i = 0; i <= 20; i++) {
                    this.jPanel4.setBounds(this.jPanel4.getBounds().x - i, this.jPanel4.getBounds().y, this.jPanel4.getBounds().width + i, this.jPanel4.getBounds().height);
                }
                this.InOut = 2;
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.type = "radio";
        this.dropper.setIcon(new ImageIcon(getClass().getResource("/html/design/uRadioInactive.png")));
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        this.type = "check";
        this.dropper.setIcon(new ImageIcon(getClass().getResource("/html/design/uCheckActive.png")));
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Preview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Preview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Preview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Preview.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preview().setVisible(true);
            }
        });
    }
}
