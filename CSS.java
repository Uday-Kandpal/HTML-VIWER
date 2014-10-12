package html;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CSS
        extends JFrame {

    int i = 0;
    String file_name;
    String dir_name;
    String killer;
    String parallel_processor;
    String stock;
    String gateway;
    Functions f = new Functions();
    DefaultListModel dlm;
    private File ghjk;
    private int kj = 0;
    private int si;
    private int selection_start = 0;
    private Rectangle r1;
    private Rectangle r2;
    int cohesionFactor = 0;
    ToolBox t = new ToolBox();
    Rectangle rChange;
    Rectangle rc;
    private JList atts;
    private JButton bro;
    private ButtonGroup buttonGroup1;
    private JTextArea cssData;
    private JButton extract;
    private iconMenu iconMenu1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JComboBox mode;
    private JLabel obj;
    private JLabel obj1;
    private JTextField path;
    private JList tags;

    public CSS() {
        initComponents();
        this.r1 = this.jPanel3.getBounds();
        this.r2 = this.cssData.getBounds();
        this.rChange = this.t.getBounds();
        this.rc = getBounds();
    }

    private void initComponents() {
        this.iconMenu1 = new iconMenu();
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.mode = new JComboBox();
        this.jPanel2 = new JPanel();
        this.extract = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.tags = new JList();
        this.jScrollPane2 = new JScrollPane();
        this.atts = new JList();
        this.jScrollPane3 = new JScrollPane();
        this.cssData = new JTextArea();
        this.jPanel3 = new JPanel();
        this.jLabel1 = new JLabel();
        this.obj = new JLabel();
        this.jLabel2 = new JLabel();
        this.obj1 = new JLabel();
        this.jButton4 = new JButton();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jButton7 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.bro = new JButton();
        this.path = new JTextField();
        this.jButton1 = new JButton();
        this.jComboBox1 = new JComboBox();
        this.jLabel3 = new JLabel();

        GroupLayout iconMenu1Layout = new GroupLayout(this.iconMenu1.getContentPane());
        this.iconMenu1.getContentPane().setLayout(iconMenu1Layout);
        iconMenu1Layout.setHorizontalGroup(iconMenu1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 400, 32767));

        iconMenu1Layout.setVerticalGroup(iconMenu1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 300, 32767));

        setDefaultCloseOperation(2);
        setType(Window.Type.UTILITY);
        setUndecorated(true);

        this.jPanel1.setBackground(new Color(0, 51, 51));
        this.jPanel1.setForeground(new Color(51, 0, 51));
        this.jPanel1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                CSS.this.jPanel1MouseEntered(evt);
            }
        });
        this.mode.setModel(new DefaultComboBoxModel(new String[]{"auto", "custom", "predefined"}));
        this.mode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.modeActionPerformed(evt);
            }
        });
        this.jPanel2.setBackground(new Color(51, 51, 51));
        this.jPanel2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                CSS.this.jPanel2MouseEntered(evt);
            }
        });
        this.extract.setText("Extract Data");
        this.extract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.extractActionPerformed(evt);
            }
        });
        this.tags.setBackground(new Color(0, 0, 153));
        this.tags.setBorder(new LineBorder(new Color(204, 204, 255), 3, true));
        this.tags.setFont(new Font("Tahoma", 1, 14));
        this.tags.setForeground(new Color(204, 204, 255));
        this.tags.setModel(new DefaultListModel());
        this.tags.setSelectionMode(0);
        this.tags.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                CSS.this.tagsValueChanged(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.tags);

        this.atts.setBackground(new Color(0, 0, 153));
        this.atts.setBorder(new LineBorder(new Color(204, 204, 255), 3, true));
        this.atts.setFont(new Font("Tahoma", 1, 14));
        this.atts.setForeground(new Color(204, 204, 255));
        this.atts.setModel(new DefaultListModel());
        this.atts.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                CSS.this.attsValueChanged(evt);
            }
        });
        this.jScrollPane2.setViewportView(this.atts);

        this.cssData.setColumns(20);
        this.cssData.setFont(new Font("Monospaced", 1, 24));
        this.cssData.setForeground(new Color(0, 0, 153));
        this.cssData.setLineWrap(true);
        this.cssData.setRows(5);
        this.cssData.setWrapStyleWord(true);
        this.cssData.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                CSS.this.cssDataKeyPressed(evt);
            }
        });
        this.jScrollPane3.setViewportView(this.cssData);

        this.jPanel3.setBackground(new Color(51, 51, 0));
        this.jPanel3.setToolTipText("Properties");
        this.jPanel3.setAutoscrolls(true);
        this.jPanel3.setCursor(new Cursor(12));
        this.jPanel3.setDoubleBuffered(false);
        this.jPanel3.setFont(new Font("Tahoma", 1, 11));
        this.jPanel3.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                CSS.this.jPanel3FocusLost(evt);
            }
        });
        this.jLabel1.setFont(new Font("Tahoma", 1, 11));
        this.jLabel1.setForeground(new Color(255, 51, 0));
        this.jLabel1.setText(" Object :");

        this.obj.setBackground(new Color(255, 255, 255));
        this.obj.setForeground(new Color(255, 255, 0));
        this.obj.setText("none");

        this.jLabel2.setFont(new Font("Tahoma", 1, 11));
        this.jLabel2.setForeground(new Color(255, 51, 0));
        this.jLabel2.setText(" Property :");

        this.obj1.setBackground(new Color(255, 255, 255));
        this.obj1.setForeground(new Color(255, 255, 0));
        this.obj1.setText("none");

        this.jButton4.setBackground(new Color(51, 0, 0));
        this.jButton4.setForeground(new Color(255, 255, 255));
        this.jButton4.setText(" X");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton4ActionPerformed(evt);
            }
        });
        this.jLabel4.setBackground(new Color(102, 102, 0));
        this.jLabel4.setForeground(new Color(51, 0, 51));
        this.jLabel4.setText("Property Window");
        this.jLabel4.setOpaque(true);

        this.jLabel5.setFont(new Font("Tahoma", 1, 11));
        this.jLabel5.setForeground(new Color(255, 51, 0));
        this.jLabel5.setText("Source:");

        this.jLabel6.setForeground(new Color(255, 204, 51));
        this.jLabel6.setText("not linked");

        this.jButton7.setText("...");
        this.jButton7.setIconTextGap(1);
        this.jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton7ActionPerformed(evt);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(this.jLabel4, -2, 1174, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton4, -2, 51, -2)).addGroup(jPanel3Layout.createSequentialGroup().addGap(29, 29, 29).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel2, -1, -1, 32767).addComponent(this.jLabel1).addComponent(this.jLabel5, -1, -1, 32767)).addGap(33, 33, 33).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.obj1, -1, -1, 32767).addComponent(this.obj, -1, -1, 32767).addComponent(this.jLabel6, -1, 183, 32767)).addGap(18, 18, 18).addComponent(this.jButton7).addContainerGap()));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(36, 36, 36).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.obj, -2, 14, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.obj1, -2, 14, -2))).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton4).addComponent(this.jLabel4, -2, 23, -2))).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.jLabel6).addComponent(this.jButton7)).addGap(0, 107, 32767)));

        this.jButton2.setText("Add Item");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setText("Add Property");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton5.setText("Format");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton6.setText("Exit");
        this.jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton6ActionPerformed(evt);
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, -2, 189, -2).addComponent(this.extract, -2, 185, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane2, -2, 202, -2).addComponent(this.jButton2, -2, 188, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jButton3, -2, 194, -2).addGap(18, 18, 18).addComponent(this.jButton5, -2, 194, -2).addGap(18, 18, 18).addComponent(this.jButton6, -2, 140, -2)).addComponent(this.jScrollPane3, -2, 806, -2))).addComponent(this.jPanel3, -1, -1, 32767)).addContainerGap(72, 32767)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.extract).addComponent(this.jButton2).addComponent(this.jButton3).addComponent(this.jButton5).addComponent(this.jButton6)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane2).addComponent(this.jScrollPane1, GroupLayout.Alignment.TRAILING).addComponent(this.jScrollPane3, -1, 629, 32767)).addGap(11, 11, 11).addComponent(this.jPanel3, -2, -1, -2).addContainerGap()));

        this.bro.setBackground(new Color(0, 0, 0));
        this.bro.setFont(new Font("Tahoma", 1, 11));
        this.bro.setForeground(new Color(255, 255, 204));
        this.bro.setText(" Browse ");
        this.bro.setToolTipText("browse for files");
        this.bro.setBorder(new LineBorder(new Color(255, 102, 0), 1, true));
        this.bro.setEnabled(false);
        this.bro.setIconTextGap(6);
        this.bro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.broActionPerformed(evt);
            }
        });
        this.path.setBackground(new Color(0, 0, 0));
        this.path.setForeground(new Color(255, 255, 0));
        this.path.setText(" ");

        this.jButton1.setText("Save CSS");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CSS.this.jButton1ActionPerformed(evt);
            }
        });
        this.jComboBox1.setBackground(new Color(51, 51, 51));
        this.jComboBox1.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox1.setForeground(new Color(255, 255, 255));

        this.jLabel3.setBackground(new Color(204, 204, 204));
        this.jLabel3.setFont(new Font("Tahoma", 1, 36));
        this.jLabel3.setText("  HTML VIEWER 1.0 : CSS Editor");
        this.jLabel3.setOpaque(true);

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, 187, 32767).addComponent(this.mode, 0, -1, 32767)).addGap(33, 33, 33).addComponent(this.jLabel3, -1, -1, 32767).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox1, -2, 448, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.bro, -2, 73, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.path, -2, 357, -2)))).addComponent(this.jPanel2, -1, -1, 32767)).addContainerGap()));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.mode, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel3, -2, 56, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bro, -2, 26, -2).addComponent(this.path, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jComboBox1, -2, -1, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -1, -1, 32767).addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1331, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767))));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 993, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767))));

        pack();
    }

    private void broActionPerformed(ActionEvent evt) {
        Navi Navi = new Navi();
        Navi.show();
    }

    private void modeActionPerformed(ActionEvent evt) {
        if (this.mode.getSelectedItem().toString().toLowerCase().equals("auto")) {
            this.bro.setEnabled(false);
        }
        if (this.mode.getSelectedItem().toString().toLowerCase().equals("predefined")) {
            this.bro.setEnabled(true);
        }
        if (this.mode.getSelectedItem().toString().toLowerCase().equals("custom")) {
            this.bro.setEnabled(false);
        }
    }

    private void extractActionPerformed(ActionEvent evt) {
        this.dlm = ((DefaultListModel) this.tags.getModel());

        this.dlm.removeAllElements();
        System.out.println("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".uskp");
        String character;
        try {
            character = Functions.File_Output("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".uskp").replace("null", "");
        } catch (Exception ex) {
            character = JOptionPane.showInputDialog(this.cssData, "directoryname,filename");
            this.file_name = (character.contains(",") ? character.split(",")[1] : character.split(";")[1]);
            this.dir_name = (character.contains(",") ? character.split(",")[0] : character.split(";")[0]);
            character = Functions.File_Output("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".uskp").replace("null", "");
        }
        String[] suppo = character.split("\n");
        for (int i = 0; i < suppo.length; i++) {
            this.dlm.addElement(suppo[i].replace(".txt", ""));
        }
    }

    private void tagsValueChanged(ListSelectionEvent evt) {
        Functions faluda = new Functions();
        this.ghjk = new File("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".usksp");
        if (!this.ghjk.exists()) {
            try {
                this.ghjk.createNewFile();
            } catch (IOException ex) {
            }
        } else {
            this.ghjk.delete();
        }
        System.out.println(this.tags.getSelectedValue().toString());
        this.ghjk = new File("C:\\HTML\\Code Block\\attributes\\" + this.tags.getSelectedValue().toString().replace("null", "") + "\\");
        String[] jhankaar = this.ghjk.list();
        String agnipath = null;
        for (int jhoomla = 0; jhoomla < jhankaar.length; jhoomla++) {
            agnipath = agnipath + "\n" + jhankaar[jhoomla];
        }
        Functions.File_Input(agnipath.replace("null", ""), "C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".usksp", this.mode);
        System.out.println(agnipath);

        this.dlm = ((DefaultListModel) this.atts.getModel());

        this.dlm.removeAllElements();

        System.out.println("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".usksp");

        String character = Functions.File_Output("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".usksp").replace("null", "");
        String[] suppo = character.split("\n");
        for (int i = 0; i < suppo.length; i++) {
            this.dlm.addElement(suppo[i].replace(".txt", ""));
        }
        System.out.println(this.kj);
        this.kj += 1;
        if (!this.cssData.getText().contains((CharSequence) this.tags.getSelectedValue())) {
            this.cssData.append(this.tags.getSelectedValue().toString() + " { };\n");
        }
        if (this.cssData.getText().contains((CharSequence) this.tags.getSelectedValue())) {
            int p = this.cssData.getText().indexOf(this.tags.getSelectedValue().toString());
            for (this.si = p; this.cssData.getText().charAt(this.si) != '}'; this.si += 1) {
                System.out.print(this.cssData.getText().charAt(this.si));
            }
            this.cssData.transferFocus();
        }
        this.obj.setText((String) this.tags.getSelectedValue());
    }

    private void attsValueChanged(ListSelectionEvent evt) {
        if (!this.cssData.getText().contains(this.tags.getSelectedValue().toString())) {
            this.cssData.insert("" + this.tags.getSelectedValue().toString() + " {" + this.atts.getSelectedValue().toString() + ": };", this.si);
        }
        if (this.cssData.getText().contains(this.tags.getSelectedValue().toString())) {
            int si = 0;
            String kick = null;
            int p = this.cssData.getText().indexOf(this.tags.getSelectedValue().toString());
            for (si = p; this.cssData.getText().charAt(si) != '}'; si++) {
                kick = kick + this.cssData.getText().charAt(si);
                System.out.print(this.cssData.getText().charAt(si));
            }
            System.out.println("\n" + kick);
            if (!kick.contains(this.atts.getSelectedValue().toString().replace("null", ""))) {
                this.cssData.insert("" + this.atts.getSelectedValue().toString() + " : ", si);
            }
        }
        this.obj1.setText((String) this.atts.getSelectedValue());
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (this.cssData.equals(null)) {
            JOptionPane.showMessageDialog(this.rootPane, "No body of css");
        } else {
            String name = JOptionPane.showInputDialog("Enter the name of the style sheet");
            Functions.File_Input(this.cssData.getText(), "C:\\HTML\\" + this.dir_name + "\\" + name + ".css", this.cssData);
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dlm = ((DefaultListModel) this.tags.getModel());
        String item = JOptionPane.showInputDialog("Enter object name");
        this.dlm.addElement(item);

        String s = Functions.File_Output("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".uskp");
        Functions.File_Input(s + "\n" + item, "C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".uskp", this.jButton2);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.dlm = ((DefaultListModel) this.atts.getModel());
        String item = JOptionPane.showInputDialog("Enter object name");
        this.dlm.addElement(item);
        String s = Functions.File_Output("C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".usksp");
        Functions.File_Input(s + "\n" + item, "C:\\HTML\\" + this.dir_name + "\\" + this.file_name + ".usksp", this.jButton2);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.iconMenu1.show();
        System.out.println(getMousePosition());
        for (int i = 0; i < 600; i++) {
            this.jPanel3.setBounds(this.r1.x, this.r1.y + i, this.r1.width, this.r1.height - i);
            this.cssData.setBounds(this.r2.x, this.r1.y, this.r1.width, this.r1.height + i);

            this.jPanel3.setVisible(false);
        }
    }

    private void jPanel3FocusLost(FocusEvent evt) {
        System.out.println(getMousePosition());
        for (int i = 0; i < 600; i++) {
            this.jPanel3.setBounds(this.r1.x, this.r1.y + i, this.r1.width, this.r1.height - i);
            this.cssData.setBounds(this.r2.x, this.r1.y, this.r1.width, this.r1.height + i);

            this.jPanel3.setVisible(false);
        }
    }

    private void jPanel2MouseEntered(MouseEvent evt) {
    }

    private void jPanel1MouseEntered(MouseEvent evt) {
        Systems r = new Systems();
        if ((getMousePosition().y > Math.abs(r.getResolution()[1] - this.cohesionFactor)) && (!this.jPanel3.isVisible())) {
            for (int i = 0; i < 600; i++) {
                this.cssData.setBounds(this.r2.x, this.r1.y, this.r1.width, this.r1.height - i);
                this.jPanel3.setVisible(true);
                this.jPanel3.setBounds(this.r1.x, this.r1.y - i, this.r1.width, this.r1.height + i);
            }
            this.path.setVisible(true);
            this.bro.setVisible(true);
            this.jLabel3.setVisible(true);
            this.mode.setVisible(true);
            this.jComboBox1.setVisible(true);
            this.jButton1.setVisible(true);
            pack();
            this.t.hide();
            this.i = 0;
            this.cohesionFactor = 0;
            setBounds(this.rc.x, this.rc.y, this.rc.width, this.rc.height);
        }
    }

    private void cssDataKeyPressed(KeyEvent evt) {
        System.out.println(getMousePosition());
        for (int i = 0; i < 600; i++) {
            this.jPanel3.setBounds(this.r1.x, this.r1.y + i, this.r1.width, this.r1.height - i);
            this.cssData.setBounds(this.r2.x, this.r1.y, this.r1.width, this.r1.height + i);

            this.jPanel3.setVisible(false);
        }
        if (this.i == 0) {
            this.t.show();
            this.path.setVisible(false);
            this.bro.setVisible(false);
            this.jLabel3.setVisible(false);
            this.mode.setVisible(false);
            this.jComboBox1.setVisible(false);
            this.jButton1.setVisible(false);
            this.cohesionFactor = 300;
            System.out.println(this.cohesionFactor);
            setBounds(this.rc.x, this.rc.y + this.rChange.height, this.rc.width, this.rc.height);
            this.i += 1;
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        this.cssData.setText(this.cssData.getText().replace("\n", "").replace("\t", ""));

        this.cssData.setText(this.cssData.getText().replace("{", "{\n").replace("}", "\n}").replace(";", ";\n").replace(" ", "\t").trim());
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        dispose();
        this.t.dispose();
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        Navi n = new Navi();
        n.show();
        if (!n.isDisplayable()) {
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSS().setVisible(true);
            }
        });
    }
}
