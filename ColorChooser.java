package html;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

public class ColorChooser
        extends JFrame {

    Color fg;
    Color bg;
    private String File_name;
    String Project_name;
    Rectangle r;
    Point p;
    private JColorChooser Colors;
    private JButton Select;
    private JButton X;
    private JPanel jPanel1;
    private JButton maximise;

    public ColorChooser() {
        initComponents();
        Functions xp = new Functions();
        try {
            File fp = new File("C:\\HTML\\Code Block\\CSS\\color.usk");
            if (!fp.exists()) {
                fp.createNewFile();
            }
            this.File_name = Functions.File_Output("C:\\HTML\\Code Block\\CSS\\color.usk");
        } catch (Exception ex) {
            this.File_name = "no_component_selected";
        }
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.Colors = new JColorChooser();
        this.X = new JButton();
        this.maximise = new JButton();
        this.Select = new JButton();

        setDefaultCloseOperation(3);
        setBounds(new Rectangle(130, 100, 300, 300));
        setUndecorated(true);

        this.jPanel1.setBackground(new Color(204, 204, 255));
        this.jPanel1.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
        this.jPanel1.setForeground(new Color(204, 204, 255));
        this.jPanel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ColorChooser.this.jPanel1MouseClicked(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ColorChooser.this.jPanel1MouseReleased(evt);
            }
        });
        this.Colors.setBackground(new Color(255, 204, 255));
        this.Colors.setToolTipText("Select any Color");
        this.Colors.setAlignmentX(100.0F);
        this.Colors.setAlignmentY(100.0F);
        this.Colors.setAutoscrolls(true);
        this.Colors.setBorder(new LineBorder(new Color(102, 0, 204), 2, true));
        this.Colors.setColor(new Color(51, 51, 255));
        this.Colors.setDebugGraphicsOptions(-1);

        this.X.setBackground(new Color(204, 204, 255));
        this.X.setForeground(new Color(51, 0, 255));
        this.X.setText("X");
        this.X.setBorder(new LineBorder(new Color(102, 102, 255), 2, true));
        this.X.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ColorChooser.this.XMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                ColorChooser.this.XMouseExited(evt);
            }
        });
        this.X.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ColorChooser.this.XActionPerformed(evt);
            }
        });
        this.maximise.setBackground(new Color(204, 204, 255));
        this.maximise.setForeground(new Color(51, 0, 255));
        this.maximise.setText("[ ]");
        this.maximise.setBorder(new LineBorder(new Color(102, 102, 255), 2, true));
        this.maximise.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ColorChooser.this.maximiseMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                ColorChooser.this.maximiseMouseExited(evt);
            }
        });
        this.maximise.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ColorChooser.this.maximiseActionPerformed(evt);
            }
        });
        this.Select.setBackground(new Color(204, 204, 255));
        this.Select.setForeground(new Color(51, 0, 255));
        this.Select.setText("Select");
        this.Select.setBorder(new LineBorder(new Color(102, 102, 255), 2, true));
        this.Select.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                ColorChooser.this.SelectMouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                ColorChooser.this.SelectMouseExited(evt);
            }
        });
        this.Select.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                ColorChooser.this.SelectMouseDragged(evt);
            }
        });
        this.Select.addActionListener(ColorChooser.this::SelectActionPerformed);
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Colors, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.maximise, -2, 31, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Select, -1, 369, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.X, -2, 21, -2))).addContainerGap()));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.X).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.maximise).addComponent(this.Select)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.Colors, -2, 366, -2))).addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        pack();
    }

    private void XActionPerformed(ActionEvent evt) {
        dispose();
    }

    private void XMouseEntered(MouseEvent evt) {
        this.fg = this.X.getForeground();
        this.bg = this.X.getBackground();
        this.X.setBackground(Color.red);
        this.X.setForeground(Color.white);
    }

    private void XMouseExited(MouseEvent evt) {
        this.X.setBackground(this.bg);
        this.X.setForeground(this.fg);
    }

    private void SelectActionPerformed(ActionEvent evt) {
        File fp = new File("C:\\HTML\\Code Block\\CSS\\color.usk");
        Color c = this.Colors.getColor();
        Functions df = new Functions();
        Functions.File_Input("" + c.toString().replace("java.awt.Color", "").replace("]", "").replace("[r=", "").replace("g=", "").replace("b=", ""), "C:\\HTML\\Code Block\\CSS\\color.usk", this.Select);
        Functions.File_Input("" + c.toString().replace("java.awt.Color", "").replace("]", "").replace("[r=", "").replace("g=", "").replace("b=", ""), "C:\\HTML\\Code Block\\CSS\\color.usk", this.Select);
    }

    private void SelectMouseDragged(MouseEvent evt) {
    }

    private void jPanel1MouseClicked(MouseEvent evt) {
        setBounds(this.p.x, this.p.y, this.r.width, this.r.height);
    }

    private void jPanel1MouseReleased(MouseEvent evt) {
        this.r = getBounds();
        this.p = getMousePosition();
    }

    private void SelectMouseExited(MouseEvent evt) {
        this.Select.setBackground(this.bg);
        this.Select.setForeground(this.fg);
    }

    private void SelectMouseEntered(MouseEvent evt) {
        this.fg = this.Select.getForeground();
        this.bg = this.Select.getBackground();
        this.Select.setBackground(Color.blue);
        this.Select.setForeground(Color.white);
    }

    private void maximiseMouseEntered(MouseEvent evt) {
        this.fg = this.maximise.getForeground();
        this.bg = this.maximise.getBackground();
        this.maximise.setBackground(Color.white);
        this.maximise.setForeground(Color.magenta);
    }

    private void maximiseMouseExited(MouseEvent evt) {
        this.maximise.setBackground(this.bg);
        this.maximise.setForeground(this.fg);
    }

    private void maximiseActionPerformed(ActionEvent evt) {
        setState(6);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorChooser().setVisible(true);
            }
        });
    }
}
