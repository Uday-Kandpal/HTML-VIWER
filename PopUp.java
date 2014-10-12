package html;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

public class popUp
        extends JFrame {

    JTextArea data = new JTextArea();
    JTextField hidden = new JTextField();
    String value_from_pop;
    DefaultListModel xsc;
    int ghapla;
    int cursor;
    Point ghantaal;
    Point listpos;
    int subjected;
    String[] key;
    int iC = 0;
    int iCp = 0;
    int iN = 0;
    Graphics2D g;
    Paint d;
    private JScrollPane fd;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JList pop;

    void arrangeOrder(int key) {
        String[] array = null;
        String[] newArray = null;
        int flag = 0;
        for (int i = 0; i < this.xsc.getSize(); i++) {
            array[i] = this.xsc.getElementAt(i).toString();
        }
        for (int i = 0; i < this.xsc.getSize(); i++) {
            for (int j = i; j < this.xsc.getSize(); j++) {
                if (array[i].compareTo(array[j]) < 0) {
                    newArray[flag] = array[j];
                    flag++;
                }
            }
        }
        this.xsc.removeAllElements();
        for (int i = 0; i < newArray.length; i++) {
            this.xsc.addElement(newArray[i]);
        }
    }

    public popUp() {
        initComponents();
        this.xsc = ((DefaultListModel) this.pop.getModel());
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.fd = new JScrollPane();
        this.pop = new JList();
        this.jLabel1 = new JLabel();

        setDefaultCloseOperation(2);
        setBackground(new Color(255, 255, 255));
        setType(Window.Type.POPUP);
        setUndecorated(true);
        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                popUp.this.formMouseEntered(evt);
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent evt) {
                popUp.this.formWindowActivated(evt);
            }
        });
        addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                popUp.this.formFocusLost(evt);
            }
        });
        addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                popUp.this.formPropertyChange(evt);
            }
        });
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jPanel1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

        this.fd.setBorder(null);
        this.fd.setNextFocusableComponent(this.pop);

        this.pop.setFont(new Font("Monospaced", 1, 14));
        this.pop.setForeground(new Color(0, 0, 102));
        this.pop.setModel(new DefaultListModel());
        this.pop.setSelectionMode(0);
        this.pop.setCursor(new Cursor(0));
        this.pop.setDoubleBuffered(true);
        this.pop.setDragEnabled(true);
        this.pop.setDropMode(DropMode.ON);
        this.pop.setFocusCycleRoot(true);
        this.pop.setFocusTraversalPolicyProvider(true);
        this.pop.setInheritsPopupMenu(true);
        this.pop.setName("pop");
        this.pop.setNextFocusableComponent(this.pop);
        this.pop.setSelectedIndex(0);
        this.pop.setSelectionBackground(new Color(102, 0, 153));
        this.pop.setSelectionForeground(new Color(204, 255, 255));
        this.pop.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                popUp.this.popMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                popUp.this.popMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                popUp.this.popMouseExited(evt);
            }
        });
        this.pop.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent evt) {
                popUp.this.popMouseMoved(evt);
            }
        });
        this.pop.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                popUp.this.popFocusGained(evt);
            }
        });
        this.pop.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                popUp.this.popKeyReleased(evt);
            }
        });
        this.fd.setViewportView(this.pop);

        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText(this.hidden.getText());
        this.jLabel1.setBorder(new LineBorder(new Color(51, 0, 102), 1, true));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.fd, -1, 466, 32767).addComponent(this.jLabel1, -1, -1, 32767)).addContainerGap()));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel1, -1, 31, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.fd, -2, 273, -2).addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        pack();
    }

    private void popMouseClicked(MouseEvent evt) {
        Functions d = new Functions();
        if (this.pop.getSelectedValue() != ">") {
            String last = this.hidden.getText();
            String previous_data = this.data.getText().replace(last, "");
            this.data.insert(" " + this.pop.getSelectedValue().toString().replace("null", "") + " = \"\" ", this.ghapla);
            this.value_from_pop = ((String) this.pop.getSelectedValue());
            this.hidden.setText("\"\"");
            dispose();
        } else {
            this.data.insert(">", this.ghapla);
            if (!this.hidden.getText().startsWith("<")) {
                String _previous = this.data.getText().replace(d.last_word(this.data.getText()), "");
                String last = this.hidden.getText().replace(this.hidden.getText(), "<" + this.hidden.getText());
                this.data.setText(_previous + last);
                this.value_from_pop = ((String) this.pop.getSelectedValue());
                dispose();
            }
        }
    }

    private void popMouseEntered(MouseEvent evt) {
    }

    private void popKeyReleased(KeyEvent evt) {
        this.jLabel1.setText(this.pop.getSelectedValue().toString());
        if (evt.getKeyChar() == '\n') {
            dispose();
        }
        if (evt.getKeyChar() == ' ') {
            this.pop.transferFocus();
            this.data.setCaretPosition(this.cursor);
            dispose();
        } else if ((evt.getKeyCode() != 37) && (evt.getKeyCode() != 38) && (evt.getKeyCode() != 39) && (evt.getKeyCode() != 40)) {
            Functions d = new Functions();
            if (this.pop.getSelectedValue() != ">") {
                String last = this.hidden.getText();
                String previous_data = this.data.getText().replace(last, "");
                this.data.insert(" " + this.pop.getSelectedValue().toString().replace("null", "") + " = \"\" ", this.ghapla);
                this.value_from_pop = ((String) this.pop.getSelectedValue());
                this.hidden.setText("\"\"");
                dispose();
            } else {
                this.data.insert(">", this.ghapla);
                if (!this.hidden.getText().startsWith("<")) {
                    String _previous = this.data.getText().replace(d.last_word(this.data.getText()), "");
                    String last = this.hidden.getText().replace(this.hidden.getText(), "<" + this.hidden.getText());
                    this.data.setText(_previous + last);
                    this.value_from_pop = ((String) this.pop.getSelectedValue());
                    dispose();
                }
            }
        }
        if (this.pop.getSelectedIndex() == this.xsc.getSize()) {
            dispose();
        }
    }

    private void formPropertyChange(PropertyChangeEvent evt) {
    }

    private void formWindowActivated(WindowEvent evt) {
    }

    private void formMouseEntered(MouseEvent evt) {
    }

    private void popMouseExited(MouseEvent evt) {
        this.pop.setBackground(Color.white);
    }

    private void popFocusGained(FocusEvent evt) {
        if (this.iCp == 0) {
            this.xsc = ((DefaultListModel) this.pop.getModel());
            for (this.subjected = 0; this.subjected <= this.key.length - 1; this.subjected += 1) {
                this.xsc.addElement(this.key[this.subjected].replace("null", "").replace(" ", ""));
                System.out.println("POP:" + this.key[this.subjected].replace("null", "").replace(" ", ""));
            }
            this.iCp += 1;
            this.xsc.addElement(">");
            arrangeOrder(0);
        }
    }

    private void popMouseMoved(MouseEvent evt) {
        this.jLabel1.setText(this.pop.getSelectedValue().toString());
    }

    private void formFocusLost(FocusEvent evt) {
        dispose();
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
            Logger.getLogger(popUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(popUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(popUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(popUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popUp().setVisible(true);
            }
        });
    }
}
