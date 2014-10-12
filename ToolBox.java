package html;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ToolBox
        extends JFrame {

    String bulbul;
    String destination;
    String newdest;
    String Path_Block;
    String pass;
    String formatstring;
    String value_from_pop;
    String chammar;
    String passes;
    String s;
    String p;
    String subp;
    String repl;
    String hex;
    String ext;
    String formname;
    String cooker;
    String port;
    String[] l;
    String log = "usk says:";
    String fontpath = "\\HTML FONTS\\Fonts\\";
    String[] form_comp = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    int checksave = 0;
    int level = 1;
    int Formatkey = 1;
    int previous = 1;
    int viewmodelevel = 0;
    int font_level_set = 0;
    int fval;
    int restorelevel = 0;
    int tasklevel = 0;
    int file_level = 0;
    int pats = 0;
    int patrs = 0;
    int split;
    int supers = 0;
    int dupers = 0;
    int higure = 0;
    int popcum = 0;
    int check = 0;
    int turbo;
    int restorelevel_1 = 0;
    int pos;
    int ghatiya = 0;
    int ghapla;
    int Butt_ID;
    int cursor;
    int bin = 0;
    int[] ids = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    double x;
    double y;
    double w;
    double h;
    boolean binOP = false;
    Connection con;
    ResultSet rs;
    Statement st;
    File ghjk;
    File[] FILES;
    Point cur;
    Point datapos;
    Point listpos;
    Point ghantaal;
    DefaultListModel xsc;
    DefaultListModel dfgh;
    Color getSavecolor;
    replace las = new replace();
    FileChooser xa = new FileChooser();
    Functions faluda = new Functions();
    public JTextArea data;
    public JTextField dest;
    private JButton ADP;
    private JButton AddForm;
    private JComboBox FRMK;
    private JTextField IDs;
    private JButton Preview;
    private JTextField ScriptId;
    private JTextField ScriptId1;
    private JTextField ScriptName;
    private JTextField ScriptName1;
    private JTextField ScriptType;
    private JTextField ScriptType1;
    private JButton addScr;
    private JTextField alters;
    private JButton attach;
    private JButton attachForm;
    private JButton brIM;
    private JTextField butt_id;
    private JTextField chb_id;
    private JTextField dd_id;
    private JButton font;
    private JComboBox fontface;
    private JTextField formid;
    private JSlider fsize;
    private JButton getDataIM;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton27;
    private JButton jButton3;
    private JButton jButton5;
    private JButton jButton9;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JList jList1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel19;
    private JPanel jPanel22;
    private JPanel jPanel23;
    private JPanel jPanel24;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane4;
    private JTabbedPane jTabbedPane2;
    private JTextField leg_id;
    private JComboBox mode;
    private JTextField namankan;
    private JTextField namankit;
    private JTextField path;
    private JTextField rdb_id;
    private JButton recover;
    private JButton run;
    private JButton save;
    private JTextField sel_font;
    private JTextField tf_id;
    private JTextField tta_id;
    private JTextField xposs;
    private JTextField yposs;

    public String ArrayToString(String[] obj) {
        String arrayli = null;
        for (int i = 0; i < obj.length; i++) {
            arrayli = arrayli + "\n" + obj[i];
        }
        return arrayli;
    }

    public ToolBox() {
        initComponents();
    }

    private void initComponents() {
        this.jTabbedPane2 = new JTabbedPane();
        this.jPanel6 = new JPanel();
        this.jPanel11 = new JPanel();
        this.path = new JTextField();
        this.run = new JButton();
        this.recover = new JButton();
        this.jButton14 = new JButton();
        this.jPanel12 = new JPanel();
        this.Preview = new JButton();
        this.mode = new JComboBox();
        this.jPanel13 = new JPanel();
        this.save = new JButton();
        this.jButton15 = new JButton();
        this.jPanel5 = new JPanel();
        this.jPanel8 = new JPanel();
        this.fontface = new JComboBox();
        this.font = new JButton();
        this.jScrollPane4 = new JScrollPane();
        this.fsize = new JSlider();
        this.sel_font = new JTextField();
        this.jPanel9 = new JPanel();
        this.jButton12 = new JButton();
        this.FRMK = new JComboBox();
        this.jPanel10 = new JPanel();
        this.jButton13 = new JButton();
        this.jButton22 = new JButton();
        this.jPanel7 = new JPanel();
        this.jPanel14 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.namankan = new JTextField();
        this.xposs = new JTextField();
        this.yposs = new JTextField();
        this.attach = new JButton();
        this.jPanel15 = new JPanel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.namankit = new JTextField();
        this.alters = new JTextField();
        this.IDs = new JTextField();
        this.brIM = new JButton();
        this.getDataIM = new JButton();
        this.ADP = new JButton();
        this.jPanel16 = new JPanel();
        this.jPanel17 = new JPanel();
        this.AddForm = new JButton();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.butt_id = new JTextField();
        this.tf_id = new JTextField();
        this.leg_id = new JTextField();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.tta_id = new JTextField();
        this.chb_id = new JTextField();
        this.rdb_id = new JTextField();
        this.jLabel17 = new JLabel();
        this.formid = new JTextField();
        this.jCheckBox1 = new JCheckBox();
        this.jLabel18 = new JLabel();
        this.dd_id = new JTextField();
        this.jScrollPane2 = new JScrollPane();
        this.jList1 = new JList();
        this.jCheckBox2 = new JCheckBox();
        this.attachForm = new JButton();
        this.jPanel18 = new JPanel();
        this.jPanel19 = new JPanel();
        this.addScr = new JButton();
        this.jLabel19 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel21 = new JLabel();
        this.ScriptName = new JTextField();
        this.ScriptType = new JTextField();
        this.ScriptId = new JTextField();
        this.jPanel22 = new JPanel();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel29 = new JLabel();
        this.ScriptName1 = new JTextField();
        this.ScriptType1 = new JTextField();
        this.ScriptId1 = new JTextField();
        this.jButton20 = new JButton();
        this.jPanel23 = new JPanel();
        this.jPanel24 = new JPanel();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.jButton9 = new JButton();
        this.jButton16 = new JButton();
        this.jButton17 = new JButton();
        this.jButton18 = new JButton();
        this.jButton19 = new JButton();
        this.jButton21 = new JButton();
        this.jButton23 = new JButton();
        this.jButton25 = new JButton();
        this.jButton26 = new JButton();
        this.jButton27 = new JButton();

        setDefaultCloseOperation(3);
        setTitle("ToolBox");
        setType(Window.Type.POPUP);
        setUndecorated(true);

        this.jTabbedPane2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ToolBox.this.jTabbedPane2MouseClicked(evt);
            }
        });
        this.jPanel6.setBackground(new Color(204, 0, 51));
        this.jPanel6.setBorder(BorderFactory.createTitledBorder(null, "File", 0, 0, new Font("Tahoma", 1, 18), new Color(255, 153, 0)));

        this.jPanel11.setBackground(new Color(153, 0, 51));

        this.run.setBackground(new Color(204, 0, 102));
        this.run.setFont(new Font("Tahoma", 1, 10));
        this.run.setForeground(new Color(51, 0, 0));
        this.run.setMnemonic('R');
        this.run.setText("Run");
        this.run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.runActionPerformed(evt);
            }
        });
        this.recover.setBackground(new Color(102, 102, 102));
        this.recover.setFont(new Font("Tahoma", 1, 10));
        this.recover.setForeground(new Color(153, 255, 0));
        this.recover.setMnemonic('y');
        this.recover.setText("Recover Previous");
        this.recover.setToolTipText("Restores previous copies if correct password was provided at the start");
        this.recover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.recoverActionPerformed(evt);
            }
        });
        this.jButton14.setBackground(new Color(0, 0, 102));
        this.jButton14.setForeground(new Color(255, 255, 255));
        this.jButton14.setText("Save and Exit");
        this.jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton14ActionPerformed(evt);
            }
        });
        GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
        this.jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addComponent(this.recover).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton14, -2, 143, -2).addContainerGap(32, 32767)).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addComponent(this.run).addGap(18, 18, 18).addComponent(this.path, -2, 206, -2).addContainerGap(27, 32767))));

        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(59, 59, 59).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton14).addComponent(this.recover)).addContainerGap(-1, 32767)).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.run).addComponent(this.path, -2, -1, -2)).addContainerGap(57, 32767))));

        this.jPanel12.setBackground(new Color(153, 0, 51));

        this.Preview.setBackground(new Color(255, 204, 0));
        this.Preview.setFont(new Font("Tahoma", 1, 10));
        this.Preview.setForeground(new Color(0, 255, 51));
        this.Preview.setMnemonic('P');
        this.Preview.setText("Preview");
        this.Preview.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.PreviewActionPerformed(evt);
            }
        });
        this.mode.setBackground(new Color(102, 102, 102));
        this.mode.setFont(new Font("Tahoma", 0, 12));
        this.mode.setForeground(new Color(51, 51, 0));
        this.mode.setModel(new DefaultComboBoxModel(new String[]{"SELECT MODES", "PREDEFINED", "SELF_MADE", " "}));
        this.mode.setBorder(BorderFactory.createTitledBorder(null, "SELECT CODE MODE", 0, 0, null, new Color(255, 204, 0)));
        this.mode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.modeActionPerformed(evt);
            }
        });
        GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
        this.jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Preview, GroupLayout.Alignment.TRAILING, -2, 216, -2).addComponent(this.mode, GroupLayout.Alignment.TRAILING, 0, 221, 32767)).addContainerGap()));

        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(this.Preview).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.mode, -2, 43, -2).addContainerGap(-1, 32767)));

        this.jPanel13.setBackground(new Color(153, 0, 0));

        this.save.setBackground(new Color(204, 0, 51));
        this.save.setFont(new Font("Tahoma", 1, 14));
        this.save.setForeground(new Color(51, 0, 51));
        this.save.setMnemonic('s');
        this.save.setText("SAVE");
        this.save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.saveActionPerformed(evt);
            }
        });
        this.jButton15.setText("ADD CODE");
        this.jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton15ActionPerformed(evt);
            }
        });
        GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
        this.jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton15, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.save, GroupLayout.Alignment.LEADING, -1, 101, 32767)).addContainerGap(27, 32767)));

        jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addComponent(this.save, -2, 43, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton15).addContainerGap(50, 32767)));

        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.jPanel13, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel12, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel11, -2, -1, -2).addContainerGap(537, 32767)));

        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel13, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jPanel12, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jPanel11, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));

        this.jTabbedPane2.addTab("File options", this.jPanel6);

        this.jPanel5.setBackground(new Color(153, 153, 153));
        this.jPanel5.setBorder(BorderFactory.createTitledBorder(null, "FORMAT", 0, 0, new Font("Tahoma", 1, 18), new Color(255, 153, 0)));

        this.jPanel8.setBackground(new Color(204, 204, 204));
        this.jPanel8.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(0, Color.red, Color.orange), new LineBorder(new Color(255, 0, 204), 1, true)));
        this.jPanel8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ToolBox.this.jPanel8MouseEntered(evt);
            }
        });
        this.fontface.setBackground(new Color(0, 51, 102));
        this.fontface.setFont(new Font("Tahoma", 1, 14));
        this.fontface.setForeground(new Color(204, 255, 255));
        this.fontface.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.fontfaceActionPerformed(evt);
            }
        });
        this.font.setBackground(new Color(102, 0, 102));
        this.font.setFont(new Font("Tahoma", 1, 14));
        this.font.setForeground(new Color(255, 255, 204));
        this.font.setMnemonic('z');
        this.font.setText("F");
        this.font.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.fontActionPerformed(evt);
            }
        });
        this.fsize.setBackground(new Color(153, 153, 153));
        this.fsize.setForeground(new Color(0, 0, 0));
        this.fsize.setMajorTickSpacing(15);
        this.fsize.setMaximum(225);
        this.fsize.setMinimum(1);
        this.fsize.setMinorTickSpacing(10);
        this.fsize.setOrientation(1);
        this.fsize.setPaintLabels(true);
        this.fsize.setPaintTicks(true);
        this.fsize.setInheritsPopupMenu(true);
        this.fsize.setInverted(true);
        this.fsize.setName("fonts");
        this.fsize.setValueIsAdjusting(true);
        this.fsize.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent evt) {
                ToolBox.this.fsizeMouseMoved(evt);
            }
        });
        this.jScrollPane4.setViewportView(this.fsize);

        this.sel_font.setBackground(new Color(51, 0, 153));
        this.sel_font.setEditable(false);
        this.sel_font.setForeground(new Color(204, 204, 255));
        this.sel_font.setCaretColor(new Color(51, 153, 0));
        this.sel_font.setDisabledTextColor(new Color(255, 255, 0));
        this.sel_font.setSelectionColor(new Color(255, 153, 153));

        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.font, -2, 48, -2).addGap(14, 14, 14).addComponent(this.sel_font, -1, 177, 32767)).addComponent(this.fontface, 0, 239, 32767)).addGap(36, 36, 36).addComponent(this.jScrollPane4, -2, 75, -2).addContainerGap()));

        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(12, 12, 12).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.sel_font, -1, 58, 32767).addComponent(this.font, -2, 40, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.fontface, -2, -1, -2).addGap(26, 26, 26)).addComponent(this.jScrollPane4, -2, 0, 32767));

        this.jPanel9.setBackground(new Color(204, 204, 204));
        this.jPanel9.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(0, Color.red, Color.orange), new LineBorder(new Color(204, 0, 204), 1, true)));

        this.jButton12.setBackground(new Color(51, 0, 153));
        this.jButton12.setFont(new Font("Tahoma", 1, 10));
        this.jButton12.setForeground(new Color(255, 255, 204));
        this.jButton12.setMnemonic('f');
        this.jButton12.setText("SET STYLE");
        this.jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton12ActionPerformed(evt);
            }
        });
        this.FRMK.setBackground(new Color(102, 0, 102));
        this.FRMK.setFont(new Font("Tahoma", 1, 10));
        this.FRMK.setForeground(new Color(255, 255, 204));
        this.FRMK.setModel(new DefaultComboBoxModel(new String[]{"SELECT FORMATTING", "CAPITAL FORMATING", "NORMAL FORMATING", "SMALLER FORMATING"}));

        GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton12, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.FRMK, GroupLayout.Alignment.LEADING, 0, 141, 32767)).addContainerGap(53, 32767)));

        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jButton12, -2, 38, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.FRMK, -2, -1, -2).addGap(39, 39, 39)));

        this.jPanel10.setBackground(new Color(204, 204, 204));
        this.jPanel10.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(0, Color.red, Color.orange), new LineBorder(new Color(204, 0, 204), 1, true)));

        this.jButton13.setBackground(new Color(51, 0, 103));
        this.jButton13.setFont(new Font("Tahoma", 1, 10));
        this.jButton13.setForeground(new Color(255, 255, 204));
        this.jButton13.setText("Replace");
        this.jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton13ActionPerformed(evt);
            }
        });
        this.jButton22.setBackground(new Color(51, 0, 103));
        this.jButton22.setFont(new Font("Tahoma", 1, 10));
        this.jButton22.setForeground(new Color(255, 255, 204));
        this.jButton22.setText("Complete");
        this.jButton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton22ActionPerformed(evt);
            }
        });
        GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
        this.jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton13, -2, 111, -2).addComponent(this.jButton22, -2, 111, -2)).addContainerGap(51, 32767)));

        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton13, -2, 31, -2).addGap(18, 18, 18).addComponent(this.jButton22, -2, 31, -2).addContainerGap(-1, 32767)));

        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel9, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel8, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel10, -2, -1, -2).addContainerGap(478, 32767)));

        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel8, -1, -1, 32767).addComponent(this.jPanel9, -1, -1, 32767).addComponent(this.jPanel10, -1, -1, 32767)).addContainerGap()));

        this.jTabbedPane2.addTab("Formatting tools", this.jPanel5);

        this.jPanel7.setBackground(new Color(102, 0, 153));

        this.jPanel14.setBackground(new Color(51, 0, 153));
        this.jPanel14.setBorder(new LineBorder(new Color(204, 204, 255), 3, true));
        this.jPanel14.setForeground(new Color(255, 255, 255));

        this.jLabel5.setFont(new Font("Tahoma", 1, 12));
        this.jLabel5.setForeground(new Color(204, 204, 255));
        this.jLabel5.setText("Name:");

        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setForeground(new Color(204, 204, 255));
        this.jLabel6.setText("X-pos:");

        this.jLabel7.setFont(new Font("Tahoma", 1, 12));
        this.jLabel7.setForeground(new Color(204, 204, 255));
        this.jLabel7.setText("Y-pos:");

        this.xposs.setText("0");

        this.yposs.setText("0");

        this.attach.setText("Attach");
        this.attach.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.attachActionPerformed(evt);
            }
        });
        GroupLayout jPanel14Layout = new GroupLayout(this.jPanel14);
        this.jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addContainerGap().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jLabel6).addGap(18, 18, 18).addComponent(this.xposs, -1, 98, 32767)).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jLabel5).addGap(18, 18, 18).addComponent(this.namankan, -1, 100, 32767)).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jLabel7).addGap(18, 18, 18).addComponent(this.yposs, -1, 99, 32767))).addGap(30, 30, 30).addComponent(this.attach, -2, 91, -2).addGap(20, 20, 20)));

        jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.namankan, -2, -1, -2).addComponent(this.attach)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.xposs, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.yposs, -2, -1, -2).addComponent(this.jLabel7)).addContainerGap(49, 32767)));

        this.jPanel15.setBackground(new Color(51, 0, 153));
        this.jPanel15.setBorder(new LineBorder(new Color(204, 204, 255), 3, true));
        this.jPanel15.setForeground(new Color(255, 255, 255));

        this.jLabel8.setFont(new Font("Tahoma", 1, 12));
        this.jLabel8.setForeground(new Color(204, 204, 255));
        this.jLabel8.setText("Name:");

        this.jLabel9.setFont(new Font("Tahoma", 1, 12));
        this.jLabel9.setForeground(new Color(204, 204, 255));
        this.jLabel9.setText("Alt   :");

        this.jLabel10.setFont(new Font("Tahoma", 1, 12));
        this.jLabel10.setForeground(new Color(204, 204, 255));
        this.jLabel10.setText("Id    :");

        this.alters.setText("Image");

        this.IDs.setText("0");

        this.brIM.setText("Browse Image");
        this.brIM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.brIMActionPerformed(evt);
            }
        });
        this.getDataIM.setText("Get Data");
        this.getDataIM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.getDataIMActionPerformed(evt);
            }
        });
        this.ADP.setText("Add to Project");
        this.ADP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.ADPActionPerformed(evt);
            }
        });
        GroupLayout jPanel15Layout = new GroupLayout(this.jPanel15);
        this.jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel15Layout.createSequentialGroup().addContainerGap().addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel15Layout.createSequentialGroup().addComponent(this.jLabel9).addGap(18, 18, 18).addComponent(this.alters, -1, 103, 32767)).addGroup(jPanel15Layout.createSequentialGroup().addComponent(this.jLabel8).addGap(18, 18, 18).addComponent(this.namankit, -1, 100, 32767)).addGroup(jPanel15Layout.createSequentialGroup().addComponent(this.jLabel10).addGap(18, 18, 18).addComponent(this.IDs, -1, 104, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.brIM, -2, 121, -2).addComponent(this.getDataIM, -2, 121, -2).addComponent(this.ADP, -2, 121, -2)).addContainerGap()));

        jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel15Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.namankit, -2, -1, -2).addComponent(this.brIM)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.alters, -2, -1, -2).addComponent(this.getDataIM)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.IDs, -2, -1, -2).addComponent(this.jLabel10).addComponent(this.ADP)).addContainerGap(43, 32767)));

        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel15, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel14, -2, -1, -2).addContainerGap(636, 32767)));

        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel14, -1, -1, 32767).addComponent(this.jPanel15, -1, -1, 32767)).addContainerGap()));

        this.jTabbedPane2.addTab("Image", this.jPanel7);

        this.jPanel16.setBackground(new Color(0, 51, 153));

        this.jPanel17.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ToolBox.this.jPanel17MouseEntered(evt);
            }
        });
        this.AddForm.setText("Add Form");
        this.AddForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.AddFormActionPerformed(evt);
            }
        });
        this.jLabel11.setText("Button :");

        this.jLabel12.setText("TextField :");

        this.jLabel13.setText("Legend :");

        this.butt_id.setText("0");
        this.butt_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.butt_idKeyReleased(evt);
            }
        });
        this.tf_id.setText("0");
        this.tf_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.tf_idKeyReleased(evt);
            }
        });
        this.leg_id.setText("No_name");
        this.leg_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.leg_idKeyReleased(evt);
            }
        });
        this.jLabel14.setText("TextArea :");

        this.jLabel15.setText("Checkbox :");

        this.jLabel16.setText("Radio Button :");

        this.tta_id.setText("0");
        this.tta_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.tta_idKeyReleased(evt);
            }
        });
        this.chb_id.setText("0");
        this.chb_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.chb_idKeyReleased(evt);
            }
        });
        this.rdb_id.setText("0");
        this.rdb_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.rdb_idKeyReleased(evt);
            }
        });
        this.jLabel17.setText("Form id :");

        this.formid.setText("0");
        this.formid.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.formidKeyReleased(evt);
            }
        });
        this.jCheckBox1.setText("Field set Required");
        this.jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jCheckBox1ActionPerformed(evt);
            }
        });
        this.jLabel18.setText("Drop down :");

        this.dd_id.setText("0");
        this.dd_id.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ToolBox.this.dd_idKeyReleased(evt);
            }
        });
        this.jList1.setBackground(new Color(153, 153, 153));
        this.jList1.setBorder(new LineBorder(new Color(255, 102, 102), 5, true));
        this.jList1.setFont(new Font("Tahoma", 1, 14));
        this.jList1.setForeground(new Color(204, 204, 204));
        this.jList1.setModel(new DefaultListModel());
        this.jList1.setSelectionMode(0);
        this.jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                ToolBox.this.jList1ValueChanged(evt);
            }
        });
        this.jScrollPane2.setViewportView(this.jList1);

        this.jCheckBox2.setText("Legend Required");
        this.jCheckBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jCheckBox2ActionPerformed(evt);
            }
        });
        this.attachForm.setText("attach");
        this.attachForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.attachFormActionPerformed(evt);
            }
        });
        GroupLayout jPanel17Layout = new GroupLayout(this.jPanel17);
        this.jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jLabel13).addGap(18, 18, 18).addComponent(this.leg_id)).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel11, -1, -1, 32767).addComponent(this.jLabel12)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.tf_id).addComponent(this.butt_id, -1, 46, 32767)))).addGap(39, 39, 39).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel16, -1, -1, 32767).addComponent(this.jLabel15, -1, -1, 32767).addComponent(this.jLabel14, -1, -1, 32767)).addGap(4, 4, 4).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.rdb_id).addComponent(this.chb_id).addComponent(this.tta_id, -1, 50, 32767)).addGap(37, 37, 37).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jCheckBox2, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup().addComponent(this.jLabel18, -2, 72, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.dd_id)).addComponent(this.jCheckBox1, -1, -1, 32767)).addGap(18, 18, 18)).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.AddForm).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel17, -2, 55, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.formid, -2, 205, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.attachForm, -1, 78, 32767).addGap(2, 2, 2))).addComponent(this.jScrollPane2, -1, 375, 32767).addContainerGap()));

        jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addContainerGap().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane2, -1, 130, 32767).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.AddForm).addComponent(this.jLabel17).addComponent(this.formid, -2, -1, -2).addComponent(this.attachForm)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel11).addComponent(this.butt_id, -2, -1, -2).addComponent(this.jLabel14).addComponent(this.tta_id, -2, -1, -2).addComponent(this.jLabel18).addComponent(this.dd_id, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12).addComponent(this.tf_id, -2, -1, -2).addComponent(this.jLabel15).addComponent(this.chb_id, -2, -1, -2).addComponent(this.jCheckBox1)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel13).addComponent(this.leg_id, -2, -1, -2).addComponent(this.jLabel16).addComponent(this.rdb_id, -2, -1, -2).addComponent(this.jCheckBox2)))).addContainerGap()));

        GroupLayout jPanel16Layout = new GroupLayout(this.jPanel16);
        this.jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel17, -2, -1, -2).addContainerGap(440, 32767)));

        jPanel16Layout.setVerticalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel17, -1, -1, 32767).addContainerGap()));

        this.jTabbedPane2.addTab("Forms", this.jPanel16);

        this.jPanel18.setBackground(new Color(204, 204, 0));

        this.jPanel19.setBackground(new Color(153, 153, 0));
        this.jPanel19.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ToolBox.this.jPanel19MouseEntered(evt);
            }
        });
        this.addScr.setText("Add Content");
        this.addScr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.addScrActionPerformed(evt);
            }
        });
        this.jLabel19.setFont(new Font("Tahoma", 1, 12));
        this.jLabel19.setForeground(new Color(255, 255, 0));
        this.jLabel19.setText("name");

        this.jLabel20.setFont(new Font("Tahoma", 1, 12));
        this.jLabel20.setForeground(new Color(255, 255, 0));
        this.jLabel20.setText("type");

        this.jLabel21.setFont(new Font("Tahoma", 1, 12));
        this.jLabel21.setForeground(new Color(255, 255, 0));
        this.jLabel21.setText("ID");

        GroupLayout jPanel19Layout = new GroupLayout(this.jPanel19);
        this.jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addContainerGap().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jLabel20).addGap(14, 14, 14).addComponent(this.ScriptType, -1, 157, 32767)).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jLabel19).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ScriptName, -1, 156, 32767)).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jLabel21).addGap(28, 28, 28).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.addScr)).addComponent(this.ScriptId, -1, 157, 32767)))).addGap(20, 20, 20)));

        jPanel19Layout.setVerticalGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addContainerGap().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel19).addComponent(this.ScriptName, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel20).addComponent(this.ScriptType, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.ScriptId, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.addScr)).addComponent(this.jLabel21)).addContainerGap(-1, 32767)));

        this.jPanel22.setBackground(new Color(153, 153, 0));
        this.jPanel22.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ToolBox.this.jPanel22MouseEntered(evt);
            }
        });
        this.jLabel27.setFont(new Font("Tahoma", 1, 12));
        this.jLabel27.setForeground(new Color(255, 255, 0));
        this.jLabel27.setText("name");

        this.jLabel28.setFont(new Font("Tahoma", 1, 12));
        this.jLabel28.setForeground(new Color(255, 255, 0));
        this.jLabel28.setText("type");

        this.jLabel29.setFont(new Font("Tahoma", 1, 12));
        this.jLabel29.setForeground(new Color(255, 255, 0));
        this.jLabel29.setText("ID");

        this.jButton20.setText("Try Css");
        this.jButton20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton20ActionPerformed(evt);
            }
        });
        GroupLayout jPanel22Layout = new GroupLayout(this.jPanel22);
        this.jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addContainerGap().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel22Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jButton20, -2, 91, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup().addComponent(this.jLabel28).addGap(14, 14, 14).addComponent(this.ScriptType1, -1, 137, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup().addComponent(this.jLabel27).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ScriptName1, -1, 136, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup().addComponent(this.jLabel29).addGap(28, 28, 28).addComponent(this.ScriptId1, -1, 137, 32767))).addGap(20, 20, 20)));

        jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addContainerGap().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel27).addComponent(this.ScriptName1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel28).addComponent(this.ScriptType1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ScriptId1, -2, -1, -2).addComponent(this.jLabel29)).addGap(35, 35, 35).addComponent(this.jButton20).addContainerGap(-1, 32767)));

        GroupLayout jPanel18Layout = new GroupLayout(this.jPanel18);
        this.jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel19, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel22, -2, -1, -2).addContainerGap(822, 32767)));

        jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel22, -1, -1, 32767).addComponent(this.jPanel19, -1, -1, 32767)).addContainerGap()));

        this.jTabbedPane2.addTab("Scripts and Styles", this.jPanel18);

        this.jPanel24.setBackground(new Color(204, 204, 255));

        this.jButton3.setBackground(new Color(153, 0, 51));
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setForeground(new Color(255, 255, 204));
        this.jButton3.setText("Label");

        this.jButton5.setBackground(new Color(153, 0, 51));
        this.jButton5.setFont(new Font("Tahoma", 1, 12));
        this.jButton5.setForeground(new Color(255, 255, 204));
        this.jButton5.setText("Submit");

        this.jButton9.setBackground(new Color(153, 0, 51));
        this.jButton9.setFont(new Font("Tahoma", 1, 12));
        this.jButton9.setForeground(new Color(255, 255, 204));
        this.jButton9.setText("Reset");

        this.jButton16.setBackground(new Color(153, 0, 51));
        this.jButton16.setFont(new Font("Tahoma", 1, 12));
        this.jButton16.setForeground(new Color(255, 255, 204));
        this.jButton16.setText("Fieldset");

        this.jButton17.setBackground(new Color(153, 0, 51));
        this.jButton17.setFont(new Font("Tahoma", 1, 12));
        this.jButton17.setForeground(new Color(255, 255, 204));
        this.jButton17.setText("Canvas");

        this.jButton18.setBackground(new Color(153, 0, 51));
        this.jButton18.setFont(new Font("Tahoma", 1, 12));
        this.jButton18.setForeground(new Color(255, 255, 204));
        this.jButton18.setText("Applet");

        this.jButton19.setBackground(new Color(153, 0, 51));
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setForeground(new Color(255, 255, 204));
        this.jButton19.setText("Rule");

        this.jButton21.setBackground(new Color(153, 0, 51));
        this.jButton21.setFont(new Font("Tahoma", 1, 12));
        this.jButton21.setForeground(new Color(255, 255, 204));
        this.jButton21.setText("TextField");

        this.jButton23.setBackground(new Color(153, 0, 51));
        this.jButton23.setFont(new Font("Tahoma", 1, 12));
        this.jButton23.setForeground(new Color(255, 255, 204));
        this.jButton23.setText("TextArea");

        this.jButton25.setBackground(new Color(153, 0, 51));
        this.jButton25.setFont(new Font("Tahoma", 1, 12));
        this.jButton25.setForeground(new Color(255, 255, 204));
        this.jButton25.setText("Image");

        this.jButton26.setBackground(new Color(153, 0, 51));
        this.jButton26.setFont(new Font("Tahoma", 1, 12));
        this.jButton26.setForeground(new Color(255, 255, 204));
        this.jButton26.setText("Sticker");

        this.jButton27.setBackground(new Color(153, 0, 51));
        this.jButton27.setFont(new Font("Tahoma", 1, 12));
        this.jButton27.setForeground(new Color(255, 255, 204));
        this.jButton27.setText("Slider");
        this.jButton27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ToolBox.this.jButton27ActionPerformed(evt);
            }
        });
        GroupLayout jPanel24Layout = new GroupLayout(this.jPanel24);
        this.jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addGap(27, 27, 27).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton3, -1, -1, 32767).addComponent(this.jButton5, -1, -1, 32767).addComponent(this.jButton9, -1, -1, 32767).addComponent(this.jButton25, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton16, -1, -1, 32767).addComponent(this.jButton17, -1, -1, 32767).addComponent(this.jButton18, -1, -1, 32767).addComponent(this.jButton26, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton19, -1, -1, 32767).addComponent(this.jButton21, -1, -1, 32767).addComponent(this.jButton23, -1, -1, 32767).addComponent(this.jButton27, -1, -1, 32767)).addGap(28, 28, 28)));

        jPanel24Layout.setVerticalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addGap(19, 19, 19).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton3).addComponent(this.jButton16).addComponent(this.jButton19)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton5).addComponent(this.jButton17).addComponent(this.jButton21)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton9).addComponent(this.jButton18).addComponent(this.jButton23)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton25).addComponent(this.jButton26).addComponent(this.jButton27)).addContainerGap(15, 32767)));

        GroupLayout jPanel23Layout = new GroupLayout(this.jPanel23);
        this.jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel24, -2, -1, -2).addContainerGap(946, 32767)));

        jPanel23Layout.setVerticalGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel24, -1, -1, 32767).addContainerGap()));

        this.jTabbedPane2.addTab("Pallete", this.jPanel23);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jTabbedPane2, -2, 1281, -2).addGap(0, 0, 32767)));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jTabbedPane2).addContainerGap()));

        pack();
    }

    private void runActionPerformed(ActionEvent evt) {
        File FileFun = null;
        try {
            FileFun = new File(this.path.getText());
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(FileFun);
                Functions f = new Functions();
                setState(0);
                this.data.setText(Functions.File_Output(this.path.getText()).replace("null", ""));
            }
        } catch (Exception ex) {
            this.log = ("\n@echo :" + ex.getLocalizedMessage() + "\nusk says :File Error");
            if (Desktop.isDesktopSupported()) {
                try {
                    System.out.println(FileFun.getName() + ".html");

                    FileFun = new File(this.bulbul + "\\HTML\\" + FileFun.getName().replace(".html", "") + "\\" + this.path.getText());
                    System.out.println(this.bulbul + "\\HTML\\" + FileFun.getName().replace(".html", "") + "\\" + FileFun.getName());
                    Desktop.getDesktop().open(FileFun);
                    Functions f = new Functions();
                    setState(0);
                    this.data.setText(Functions.File_Output(this.bulbul + "\\HTML\\" + this.path.getText().replace(".html", "") + "\\" + this.path.getText()).replace("null", ""));
                } catch (Exception ex1) {
                    JOptionPane.showMessageDialog(this.rootPane, ex1 + " " + ex1.getMessage());
                    this.log = ("\n@echo :" + ex1.getLocalizedMessage() + "\nusk says :File Error");
                }
            }
        }
    }

    private void recoverActionPerformed(ActionEvent evt) {
        this.pass = "uday";
        try {
            this.s = this.data.getText();
            if (this.restorelevel == 0) {
                File pax = new File(this.bulbul + "\\HTML");
                if (!pax.exists()) {
                    pax.mkdir();
                }
                Class.forName("java.sql.DriverManager");
                this.con = DriverManager.getConnection("jdbc:mysql://localhost/ne", "root", this.pass);
                this.st = this.con.createStatement();
                String query = "use ne;";
                String query1 = "Select * from html;";
                System.out.println(query);
                this.st.execute(query);
                this.rs = this.st.executeQuery(query1);
                this.rs.last();
                this.restorelevel += 1;
                JOptionPane.showMessageDialog(this.rootPane, "There might be exclusion of some special characrers\n like',\" etc. Please check it for further use");
            }
            this.data.setText(this.rs.getString("data"));
            this.rs.previous();
        } catch (Exception ex) {
            this.restorelevel = 0;
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
        }
    }

    private void jButton14ActionPerformed(ActionEvent evt) {
        this.log = "\n@echo : <eof>";
        Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append(System.currentTimeMillis()).append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + System.currentTimeMillis() + "log.uskLOG", this);
        String datas = null;
        System.exit(0);
    }

    private void PreviewActionPerformed(ActionEvent evt) {
        File f = new File(this.newdest);
        try {
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        }
    }

    private void modeActionPerformed(ActionEvent evt) {
        if (this.mode.getSelectedItem() == "PREDEFINED") {
            this.viewmodelevel = 1;
        }
        if (this.mode.getSelectedItem() == "SELF_MADE") {
            this.viewmodelevel = 2;
        }
    }

    private void saveActionPerformed(ActionEvent evt) {
        this.checksave += 1;
        this.getSavecolor = Color.GREEN;
        this.data.setText(this.data.getText().replace("'", "\\'"));
        this.data.setText(this.data.getText().replace("\\\\'", "\\'"));
        this.pass = "uday";
        this.destination = (this.bulbul + "\\");
        try {
            this.s = this.data.getText();
            File prakash = new File(this.bulbul + "\\HTML");
            if (!prakash.exists()) {
                prakash.mkdir();
            }
            prakash = new File(this.bulbul + "\\HTML\\" + "\\");
            if (!prakash.exists()) {
                prakash.mkdir();
            }
            Class.forName("java.sql.DriverManager");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/ne", "root", this.pass);
            this.st = this.con.createStatement();
            String query = "Insert into html values('" + this.data.getText() + "');";

            System.out.println(query);
            this.st.execute(query);

            this.newdest = (this.bulbul + "\\HTML\\" + "\\" + ".html");
            File ya = new File(this.newdest);

            Functions f = new Functions();
            Functions.File_Input(this.data.getText(), this.newdest, this);

            System.out.println("File saved successfully");
            this.data.setCaretPosition(this.ghapla);
        } catch (Exception ex) {
            File del = new File(this.newdest);
            boolean ah = del.delete();
            System.out.println(ah);
            Functions f = new Functions();
            Functions.File_Input(this.data.getText(), this.newdest, this);

            System.out.println("File saved successfully");
            this.data.setCaretPosition(this.ghapla);
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        }
        this.ghjk = new File(this.bulbul + "\\HTML\\" + "\\" + ".uskp");
        if (!this.ghjk.exists()) {
            try {
                this.ghjk.createNewFile();
                this.ghjk = new File(this.bulbul + "\\HTML\\Code Block\\tags\\");
                String[] jhankaar = this.ghjk.list();
                String agnipath = null;
                for (int jhoomla = 0; jhoomla < jhankaar.length; jhoomla++) {
                    agnipath = agnipath + "\n" + jhankaar[jhoomla];
                }
                Functions.File_Input(agnipath.replace("null", ""), this.bulbul + "\\HTML\\" + "\\" + ".uskp", this);
            } catch (IOException ex) {
                this.log = ("\n@echo :" + ex.getLocalizedMessage());
                Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
            }
        }
        try {
            String size = Functions.File_Output(this.bulbul + "\\HTML\\Code Block\\File Data\\size.txt");
            float sIze = Float.parseFloat(size.replace("null", ""));
            File fp = new File(this.bulbul + "\\HTML\\" + "\\Code Block");
            if ((!fp.exists()) || (fp.getTotalSpace() == 0L) || (sIze != (float) fp.length())) {
                this.faluda.copy_all_at_once(this.bulbul + "\\HTML", this.bulbul + "\\HTML\\");
                Functions.File_Input(fp.length() + "", this.bulbul + "\\HTML\\Code Block\\File Data\\size.txt", this);
            }
        } catch (IOException ex) {
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        }
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        this.pos = this.data.getCaretPosition();
        Navi na = new Navi();
        na.setVisible(true);
        this.ghatiya = 1;
    }

    private void fontfaceActionPerformed(ActionEvent evt) {
        File fontFile = new File(this.bulbul + "\\HTML FONTS\\Fonts\\" + this.fontface.getSelectedItem());
        Font f = null;
        try {
            f = Font.createFont(0, fontFile);
        } catch (FontFormatException ex) {
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append(System.currentTimeMillis()).append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + System.currentTimeMillis() + "log.uskLOG", this);
        } catch (IOException ex) {
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        }
        this.sel_font.setText(this.fontface.getSelectedItem().toString().replace(".ttf", "") + "");
        String fontGet = this.sel_font.getText().replace(".ttf", "");
        fontGet = fontGet.replace(".TTF", " ");
        if ((fontGet.endsWith("BI")) || (fontGet.endsWith("bi")) || (fontGet.endsWith("BI ")) || (fontGet.endsWith("bi "))) {
            fontGet = fontGet.concat(" BOLD ITALIC");
        }
        if ((fontGet.endsWith("B")) || (fontGet.endsWith("b")) || (fontGet.endsWith("bd")) || (fontGet.endsWith("BD")) || (fontGet.endsWith("B ")) || (fontGet.endsWith("b ")) || (fontGet.endsWith("BD ")) || (fontGet.endsWith("bd "))) {
            fontGet = fontGet.concat(" BOLD");
        }
        if ((fontGet.endsWith("I")) || (fontGet.endsWith("i")) || (fontGet.endsWith("I ")) || (fontGet.endsWith("i "))) {
            fontGet = fontGet.concat(" ITALIC");
        }
        f = f.deriveFont(this.fsize.getValue());
        this.sel_font.setFont(f);
        this.sel_font.setText(fontGet + " " + this.fsize.getValue());
    }

    private void fontActionPerformed(ActionEvent evt) {
        Font f = null;
        Font t = null;
        File fontFile = new File(this.bulbul + this.fontpath + this.fontface.getSelectedItem());
        try {
            f = Font.createFont(0, fontFile);
            f = f.deriveFont(this.fsize.getValue());

            System.out.println(this.fsize.getValue() + " " + f.getSize());
            this.data.setFont(f);
        } catch (FontFormatException ex) {
            JOptionPane.showMessageDialog(this.rootPane, "FONT FORMAT ERROR");
            this.log = ("\n@echo :" + ex.getLocalizedMessage());
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this.rootPane, "FONT FILE CORRUPT");
            String sto = JOptionPane.showInputDialog(this.rootPane, "Enter the path for font file");
            fontFile = new File(sto);
            try {
                f = Font.createFont(0, fontFile);
                f = f.deriveFont(this.fsize.getValue());
                System.out.println(this.fsize.getValue() + " " + f.getSize());
                this.data.setFont(f);
            } catch (Exception exk) {
                this.log = ("\n@echo :" + exk.getLocalizedMessage());
                Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
            }
        }
    }

    private void fsizeMouseMoved(MouseEvent evt) {
        if (this.fval != this.fsize.getValue()) {
            this.sel_font.setText(this.fontface.getSelectedItem() + "");
            String xFont = this.sel_font.getText().replace(".ttf", "");
            xFont = xFont.replace(".TTF", " ");
            if ((xFont.endsWith("BI")) || (xFont.endsWith("bi")) || (xFont.endsWith("BI ")) || (xFont.endsWith("bi "))) {
                xFont = xFont.concat(" BOLD ITALIC");
            }
            if ((xFont.endsWith("B")) || (xFont.endsWith("b")) || (xFont.endsWith("bd")) || (xFont.endsWith("BD")) || (xFont.endsWith("B ")) || (xFont.endsWith("b ")) || (xFont.endsWith("BD ")) || (xFont.endsWith("bd "))) {
                xFont = xFont.concat(" BOLD");
            }
            if ((xFont.endsWith("I")) || (xFont.endsWith("i")) || (xFont.endsWith("I ")) || (xFont.endsWith("i "))) {
                xFont = xFont.concat(" ITALIC");
            }
            this.sel_font.setText(xFont + " " + this.fsize.getValue());
            this.fval = this.fsize.getValue();
        }
    }

    private void jPanel8MouseEntered(MouseEvent evt) {
        this.font_level_set += 1;
        File fontsa = new File(this.bulbul + this.fontpath);
        FilenameFilter filter = null;
        if ((fontsa.isDirectory()) && (this.font_level_set == 1)) {
            String[] take = fontsa.list(filter);
            System.out.println(take.length);
            this.fontface.removeAll();
            for (int o = 0; o < take.length; o++) {
                if ((take[o].startsWith(".ttf", take[o].length() - 4)) || (take[o].startsWith(".TTF", take[o].length() - 4))) {
                    this.fontface.addItem(take[o]);
                }
            }
        }
    }

    private void jButton12ActionPerformed(ActionEvent evt) {
        this.data.setText(this.data.getText().replace("head", "HEAD"));
        this.data.setText(this.data.getText().replace("html'", "HTML"));
        this.data.setText(this.data.getText().replace("body", "BODY "));
        this.data.setText(this.data.getText().replace(";", ";'"));
        this.data.setText(this.data.getText().replace(";''", ";'"));
        if (this.FRMK.getSelectedItem() == "CAPITAL FORMATING") {
            this.Formatkey = 1;
        }
        if (this.FRMK.getSelectedItem() == "SMALLER FORMATING") {
            this.Formatkey = 2;
        }
        if (this.FRMK.getSelectedItem() == "NORMAL FORMATING") {
            this.Formatkey = 3;
            this.previous = 3;
        }
        if (this.Formatkey == 3) {
            this.data.setText(this.formatstring);
        }
        if (this.Formatkey == 1) {
            this.formatstring = this.data.getText();
            this.data.setText(this.data.getText().replace(this.data.getText(), this.data.getText().toUpperCase()));
        }
        if ((this.Formatkey == 2) && (this.previous == 3)) {
            this.formatstring = this.data.getText();
            this.data.setText(this.data.getText().replace(this.data.getText(), this.data.getText().toLowerCase()));
        }
    }

    private void jButton13ActionPerformed(ActionEvent evt) {
        this.las.setVisible(true);
        if (!this.las.isActive()) {
            this.las.DATA = this.data.getText();
            this.data.setText(this.las.DATA);
            this.repl = Functions.File_Output(this.bulbul + "\\HTML\\Code Block\\Buffer.usk");
            this.data.setText(this.repl.replace("null", ""));
        } else {
            this.repl = Functions.File_Output(this.bulbul + "\\HTML\\Code Block\\Buffer.usk");
            this.data.setText(this.repl.replace("null", ""));
        }
    }

    private void jButton22ActionPerformed(ActionEvent evt) {
        this.passes = "";
        Functions.File_Input("", this.bulbul + "\\HTML\\" + "\\" + ".OBJ", this);
    }

    private void attachActionPerformed(ActionEvent evt) {
        String jhol = Functions.File_Output(this.bulbul + "\\HTML\\" + "\\filename.usk").replace("null", "");
        System.out.println(Functions.File_Output(this.bulbul + "\\HTML\\" + "\\filename.usk").replace("null", ""));
        String[] murkh = jhol.split("\n");

        File fp = new File(this.bulbul + "\\HTML\\" + "\\" + this.chammar);
        this.chammar = fp.getName();
        for (int i = 0; i <= murkh.length - 1; i++) {
            String[] mahamurkh = murkh[i].toString().split(":");
            System.out.println(murkh[i]);
            if (mahamurkh[1].equals(this.namankan.getText())) {
                this.data.setText(this.data.getText().replace("</body>", "<img src =\"" + mahamurkh[1].replace("null", "") + "\" width =" + this.xposs.getText() + " height =" + this.yposs.getText() + " coords =\"" + this.xposs.getText() + "," + this.yposs.getText() + "\" " + "></img>\n </body>"));
                System.out.println(mahamurkh[i]);
            }
        }
    }

    private void brIMActionPerformed(ActionEvent evt) {
        this.xa.setVisible(true);
        this.xa.sp = new File(this.bulbul + "\\HTML\\" + "\\");
    }

    private void getDataIMActionPerformed(ActionEvent evt) {
        String sOut = Functions.File_Output(this.bulbul + "\\HTML\\" + "\\Code Block\\buffer.usk");
        this.namankit.setText(sOut.replace("null", ""));
        this.chammar = sOut.replace("null", "");
    }

    private void ADPActionPerformed(ActionEvent evt) {
    }

    private void AddFormActionPerformed(ActionEvent evt) {
        this.formname = JOptionPane.showInputDialog("Enter the name of the form first");
        try {
            File fp = new File(this.bulbul + "\\HTML\\Code Block\\Codes\\form.usk");
            File fp1 = new File(this.bulbul + "\\HTML\\" + "\\Code Block\\" + this.formname + ".usk");

            Functions.File_Copy(fp1.getPath(), fp.getPath());
        } catch (Exception e) {
            this.log = ("\n@echo :" + e.getLocalizedMessage() + "\nusk says :File Error");
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        }
    }

    private void butt_idKeyReleased(KeyEvent evt) {
        this.form_comp[1] = ("no of buttons : " + this.butt_id.getText());

        this.dfgh.setElementAt(this.form_comp[1], 1);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void tf_idKeyReleased(KeyEvent evt) {
        this.form_comp[2] = ("no of text_fields :" + this.tf_id.getText());

        this.dfgh.setElementAt(this.form_comp[2], 2);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void leg_idKeyReleased(KeyEvent evt) {
        this.form_comp[3] = ("legend id : " + this.leg_id.getText());

        this.dfgh.setElementAt(this.form_comp[3], 3);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void tta_idKeyReleased(KeyEvent evt) {
        this.form_comp[4] = ("no of textarea :" + this.tta_id.getText());

        this.dfgh.setElementAt(this.form_comp[4], 4);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void chb_idKeyReleased(KeyEvent evt) {
        this.form_comp[5] = ("no of checkboxes : " + this.chb_id.getText());

        this.dfgh.setElementAt(this.form_comp[5], 5);

        Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
    }

    private void rdb_idKeyReleased(KeyEvent evt) {
        this.form_comp[6] = ("no of radio button :" + this.rdb_id.getText());

        this.dfgh.setElementAt(this.form_comp[6], 6);

        Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
    }

    private void formidKeyReleased(KeyEvent evt) {
        this.form_comp[0] = ("form id : " + this.formid.getText());

        this.dfgh.setElementAt(this.form_comp[0], 0);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void jCheckBox1ActionPerformed(ActionEvent evt) {
        this.form_comp[8] = ("Fieldset required : " + this.jCheckBox1.isSelected() + "");

        this.dfgh.setElementAt(this.form_comp[8], 8);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void dd_idKeyReleased(KeyEvent evt) {
        this.form_comp[7] = ("no of drop down : " + this.dd_id.getText());

        this.dfgh.setElementAt(this.form_comp[7], 7);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void jList1ValueChanged(ListSelectionEvent evt) {
    }

    private void jCheckBox2ActionPerformed(ActionEvent evt) {
        this.form_comp[9] = ("legend required : " + this.jCheckBox2.isSelected() + "");

        this.dfgh.setElementAt(this.form_comp[9], 9);
        for (int i = 0; i < 10; i++) {
            Functions.File_Input(ArrayToString(this.form_comp).replace("null", ""), this.bulbul + "\\HTML\\Code Block\\form.usk", this);
        }
    }

    private void attachFormActionPerformed(ActionEvent evt) {
        String handle = Functions.File_Output(this.bulbul + "\\HTML\\" + "Code Block\\" + this.formname + ".usk");
        String[] properties = handle.split("\n");

        String code = "<form id =>";
        String[] id = properties[1].split(":");
        String[] butt = properties[2].split(":");
        String[] tf = properties[3].split(":");
        String[] legend = properties[4].split(":");
        String[] ta = properties[5].split(":");
        String[] cb = properties[6].split(":");
        String[] rb = properties[7].split(":");
        String[] dd = properties[8].split(":");
        String[] fs = properties[9].split(":");
        String[] lr = properties[10].split(":");
        System.out.println();
    }

    private void jPanel17MouseEntered(MouseEvent evt) {
    }

    private void addScrActionPerformed(ActionEvent evt) {
        this.ext = this.faluda.give_extension(this.ScriptType.getText());
        Functions.File_Input("//Code written in Html Viewer 1.0//", this.bulbul + "\\HTML\\" + "\\Code Block\\Scripts\\" + this.ScriptName.getText() + this.ext, this);
        try {
            File fp = new File(this.bulbul + "\\HTML\\" + "\\Code Block\\Scripts\\" + this.ScriptName.getText() + this.ext);
            fp.createNewFile();
            Desktop.getDesktop().open(fp);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this.rootPane, "No suitable editor supported ");
            this.log = ("\n@echo :" + ex.getLocalizedMessage() + "\nusk says :File Error");
            Functions.File_Input(Functions.File_Output(new StringBuilder().append(this.bulbul).append("\\HTML\\").append("\\Code Block\\").append("log.uskLOG").toString()) + this.log, this.bulbul + "\\HTML\\" + "\\Code Block\\" + "log.uskLOG", this);
        }
        this.jPanel19.setToolTipText("You can open your " + this.ScriptType.getText() + "  at : " + this.bulbul + "\\HTML\\" + "\\Code Block\\Scripts\\" + this.ScriptName.getText() + this.ext);
    }

    private void jPanel19MouseEntered(MouseEvent evt) {
        this.ext = this.faluda.give_extension(this.ScriptType.getText());
        this.jPanel19.setToolTipText("Your " + this.ScriptType.getText() + " will be created at : " + this.bulbul + "\\HTML\\" + "\\Code Block\\Scripts\\" + this.ScriptName.getText() + this.ext);
    }

    private void jButton20ActionPerformed(ActionEvent evt) {
        CSS xCSS = new CSS();

        xCSS.setVisible(true);
    }

    private void jPanel22MouseEntered(MouseEvent evt) {
    }

    private void jButton27ActionPerformed(ActionEvent evt) {
        USlider u1 = null;
    }

    private void jTabbedPane2MouseClicked(MouseEvent evt) {
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
            Logger.getLogger(ToolBox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ToolBox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ToolBox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ToolBox.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToolBox().setVisible(true);
            }
        });
    }
}
