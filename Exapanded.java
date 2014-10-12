package html;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class Exapanded
        extends JFrame {

    String bulbul;
    int[] ids = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    replace las = new replace();
    FileChooser xa = new FileChooser();
    int checksave = 0;
    Functions faluda = new Functions();
    String pass;
    String formatstring;
    Connection con;
    ResultSet rs;
    Statement st;
    String destination;
    String newdest;
    String Path_Block;
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
    double x;
    double y;
    double w;
    double h;
    String s;
    String p;
    String subp;
    File[] FILES;
    Point cur;
    int ghatiya = 0;
    String repl;
    String hex;
    String[] l;
    private String port;
    DefaultListModel xsc;
    DefaultListModel dfgh;
    private int pos;
    private int turbo;
    String value_from_pop;
    private Color getSavecolor;
    String cooker;
    private int ghapla;
    private String chammar;
    private File ghjk;
    private Point ghantaal;
    private String passes;
    private int Butt_ID;
    private int restorelevel_1 = 0;
    String[] form_comp = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    String get;
    String gets;
    private int checkmaker = 0;
    private JTextArea data;
    private JLabel dest;
    private JTextField hidden;
    private JButton jButton9;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JList pop;
    private JButton save;
    private JButton save1;

    public Exapanded() {
        initComponents();
        this.dest.setText(this.get);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.data = new JTextArea();
        this.hidden = new JTextField();
        this.dest = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.pop = new JList();
        this.save = new JButton();
        this.save1 = new JButton();
        this.jButton9 = new JButton();
        this.jLabel1 = new JLabel();

        setDefaultCloseOperation(2);
        setBounds(new Rectangle(0, 100, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new GridBagLayout());

        this.jPanel1.setOpaque(false);

        this.jPanel2.setBorder(new LineBorder(new Color(0, 51, 204), 5, true));
        this.jPanel2.setOpaque(false);
        this.jPanel2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                Exapanded.this.jPanel2MouseEntered(evt);
            }
        });
        this.data.setBackground(new Color(204, 255, 255));
        this.data.setColumns(20);
        this.data.setFont(new Font("Monospaced", 1, 18));
        this.data.setForeground(new Color(153, 153, 255));
        this.data.setRows(5);
        this.data.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Exapanded.this.dataKeyReleased(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.data);

        this.dest.setText("Path");

        this.pop.setBackground(new Color(153, 204, 255));
        this.pop.setFont(new Font("Tahoma", 1, 14));
        this.pop.setForeground(new Color(0, 0, 204));
        this.pop.setModel(new DefaultListModel());
        this.pop.setSelectionMode(0);
        this.pop.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Exapanded.this.popMouseClicked(evt);
            }
        });
        this.pop.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Exapanded.this.popKeyReleased(evt);
            }
        });
        this.jScrollPane2.setViewportView(this.pop);

        this.save.setBackground(new Color(153, 204, 255));
        this.save.setFont(new Font("Tahoma", 1, 14));
        this.save.setForeground(new Color(51, 0, 204));
        this.save.setMnemonic('s');
        this.save.setText("SAVE");
        this.save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Exapanded.this.saveActionPerformed(evt);
            }
        });
        this.save1.setBackground(new Color(153, 204, 255));
        this.save1.setFont(new Font("Tahoma", 1, 14));
        this.save1.setForeground(new Color(51, 0, 204));
        this.save1.setMnemonic('x');
        this.save1.setText("Exit");
        this.save1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Exapanded.this.save1ActionPerformed(evt);
            }
        });
        this.jButton9.setBackground(new Color(204, 255, 255));
        this.jButton9.setFont(new Font("Tahoma", 1, 10));
        this.jButton9.setForeground(new Color(51, 51, 255));
        this.jButton9.setMnemonic('p');
        this.jButton9.setText("Preview");
        this.jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Exapanded.this.jButton9ActionPerformed(evt);
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.hidden, -1, 755, 32767)).addComponent(this.jScrollPane1, -1, 765, 32767).addGroup(jPanel2Layout.createSequentialGroup().addGap(33, 33, 33).addComponent(this.dest, -2, 352, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jButton9, -2, 124, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.save).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.save1))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 198, -2).addContainerGap()));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.dest, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton9, -2, 25, -2).addComponent(this.save).addComponent(this.save1)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.hidden, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jScrollPane2).addComponent(this.jScrollPane1, -1, 529, 32767))));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -1, -1, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 1;
        getContentPane().add(this.jPanel1, gridBagConstraints);

        this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/html/theme.png")));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 1;
        getContentPane().add(this.jLabel1, gridBagConstraints);

        pack();
    }

    private void dataKeyReleased(KeyEvent evt) {
        int s = 0;
        this.xsc = ((DefaultListModel) this.pop.getModel());
        this.xsc.removeAllElements();
        this.port = "";

        int x = this.data.getX();
        int y = this.data.getY();
        this.p = null;
        String[] key = null;
        Functions f = new Functions();
        File j = new File(this.bulbul + "\\HTML\\" + this.dest.getText().replace("null", "") + "\\Code Block\\buffer.usk");
        this.ghapla = this.data.getCaretPosition();
        this.port = f.last_word(this.data.getText().substring(0, this.data.getCaretPosition()));
        this.value_from_pop = this.port.replace(">", "").replace("<", "");
        System.out.println("Usk says:" + this.value_from_pop);
        if (!j.exists()) {
            try {
                System.out.println(key);

                j.createNewFile();
                Functions.File_Input("", this.bulbul + "\\HTML\\" + this.dest.getText().replace("null", "") + "\\Code Block\\buffer.usk", this);
            } catch (Exception ex) {
            }
        }
        try {
            if (this.data.getText().charAt(this.data.getText().length() - 1) == '\n') {
                this.data.append(" ");
            }
            this.hidden.setText(this.port);
            Functions.File_Input(this.port.replace("null", ""), this.bulbul + "\\HTML\\" + this.dest.getText().replace("null", "") + "\\Code Block\\buffer.usk", this);
            this.p = Functions.File_Output(this.bulbul + "\\HTML\\" + this.dest.getText().replace("null", "") + "\\Code Block\\" + "buffer.usk");
            System.out.println(this.p.replace("null", ""));
            key = Functions.File_Output_array(this.bulbul + "\\HTML\\" + this.dest.getText().replace("null", "") + "\\Code Block\\tags\\" + this.p.replace(" ", "").replace("null", "").replace("<", "") + ".txt");
            this.pats += 1;
            if ((!this.hidden.getText().startsWith("/")) || (!this.hidden.getText().startsWith("</"))) {
                if (this.pats == 1) {
                    this.pop.removeAll();
                    for (s = 0; s <= key.length - 1; s++) {
                        System.out.println(key[s]);
                        this.xsc.addElement(key[s].replace("null", "").replace(" ", ""));
                    }
                    this.xsc.addElement(">");
                    this.turbo = (this.xsc.getSize() - 1);
                    this.pop.setLocation(this.jScrollPane1.getViewport().getViewRect().x, this.jScrollPane1.getViewport().getViewRect().y);

                    System.out.println("value of pop  = " + this.value_from_pop);
                    this.cooker = this.hidden.getText().replace("<", "");

                    this.pats = 0;
                } else {
                    this.xsc.removeAllElements();
                    this.xsc.addElement(">");
                }
            }
        } catch (Exception e) {
        }
        this.jScrollPane1.setBackground(this.getSavecolor);
    }

    private void jPanel2MouseEntered(MouseEvent evt) {
        if (this.checkmaker == 0) {
            this.dest.setText(this.get);
            this.data.setText(this.gets);
            this.checkmaker += 1;
        }
    }

    private void popMouseClicked(MouseEvent evt) {
        Functions d = new Functions();
        if (this.pop.getSelectedValue() != ">") {
            String last = this.hidden.getText();

            String previous = this.data.getText().replace(last, "");
            this.data.insert(" " + this.pop.getSelectedValue().toString().replace("null", "") + " = \"\" ", this.ghapla);
            this.value_from_pop = ((String) this.pop.getSelectedValue());
            this.hidden.setText("\"\"");
        } else {
            this.data.insert(">", this.ghapla);
            if (!this.hidden.getText().startsWith("<")) {
                String previous = this.data.getText().replace(d.last_word(this.data.getText()), "");
                String last = this.hidden.getText().replace(this.hidden.getText(), "<" + this.hidden.getText());
                this.data.setText(previous + last);
                this.value_from_pop = ((String) this.pop.getSelectedValue());
            }
        }
        Point asp = this.data.getLocation();
        this.data.setLocation(this.pop.getLocation());
        this.pop.setLocation(asp);
        this.data.transferFocus();
        this.xsc.removeAllElements();
        this.pop.setLocation(this.ghantaal);
    }

    private void popKeyReleased(KeyEvent evt) {
        if (this.pop.getSelectedValue() != null) {
            Point asp = this.data.getLocation();
            if (this.check == this.xsc.size()) {
                this.data.setLocation(this.pop.getLocation());
                this.pop.setLocation(asp);
            }
        } else {
            this.data.transferFocus();
        }
        this.check += 1;
    }

    private void saveActionPerformed(ActionEvent evt) {
        this.checksave += 1;
        this.getSavecolor = this.jScrollPane1.getBackground();
        this.jScrollPane1.setBackground(Color.GREEN);
        this.data.setText(this.data.getText().replace("'", "\\'"));
        this.data.setText(this.data.getText().replace("\\\\'", "\\'"));
        this.pass = "uday";
        this.destination = (this.bulbul + "\\" + this.dest.getText().replace(".html", ""));
        try {
            this.s = this.data.getText();
            File xa = new File(this.bulbul + "\\HTML");
            if (!xa.exists()) {
                xa.mkdir();
            }
            xa = new File(this.bulbul + "\\HTML\\" + this.dest.getText().replace(".html", "") + "\\");
            if (!xa.exists()) {
                xa.mkdir();
            }
            Class.forName("java.sql.DriverManager");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/ne", "root", this.pass);
            this.st = this.con.createStatement();
            String query = "Insert into html values('" + this.data.getText() + "');";

            System.out.println(query);
            this.st.execute(query);

            this.newdest = (this.bulbul + "\\HTML\\" + this.dest.getText() + "\\" + this.dest.getText() + ".html");
            File ya = new File(this.newdest);

            Functions f = new Functions();
            Functions.File_Input(this.data.getText(), this.newdest, this);
            JOptionPane.showMessageDialog(this.rootPane, "File saved successfully");
            this.data.setCaretPosition(this.ghapla);
        } catch (Exception ex) {
            File del = new File(this.newdest);
            boolean ah = del.delete();
            System.out.println(ah);
            Functions f = new Functions();
            Functions.File_Input(this.data.getText(), this.newdest, this);
            JOptionPane.showMessageDialog(this.rootPane, "File saved successfully");
            this.data.setCaretPosition(this.ghapla);
        }
        this.ghjk = new File(this.bulbul + "\\HTML\\" + this.dest.getText() + "\\" + this.dest.getText() + ".uskp");
        if (!this.ghjk.exists()) {
            try {
                this.ghjk.createNewFile();
                this.ghjk = new File(this.bulbul + "\\HTML\\Code Block\\tags\\");

                String[] jhankaar = this.ghjk.list();
                String agnipath = null;
                for (int jhoomla = 0; jhoomla < jhankaar.length; jhoomla++) {
                    agnipath = agnipath + "\n" + jhankaar[jhoomla];
                }
                Functions.File_Input(agnipath.replace("null", ""), this.bulbul + "\\HTML\\" + this.dest.getText() + "\\" + this.dest.getText() + ".uskp", this);
            } catch (IOException ex) {
                Logger.getLogger(create.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            String size = Functions.File_Output(this.bulbul + "\\HTML\\Code Block\\File Data\\size.txt");
            float sIze = Float.parseFloat(size.replace("null", ""));
            File fp = new File(this.bulbul + "\\HTML\\" + this.dest.getText() + "\\Code Block");
            if ((!fp.exists()) || (fp.getTotalSpace() == 0L) || (sIze != (float) fp.length())) {
                this.faluda.copy_all_at_once(this.bulbul + "\\HTML", this.bulbul + "\\HTML\\" + this.dest.getText());
                Functions.File_Input(fp.length() + "", this.bulbul + "\\HTML\\Code Block\\File Data\\size.txt", this);
            }
        } catch (IOException ex) {
        }
    }

    private void save1ActionPerformed(ActionEvent evt) {
        dispose();
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
        File f = new File(this.newdest);
        try {
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            Logger.getLogger(create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exapanded().setVisible(true);
            }
        });
    }
}
