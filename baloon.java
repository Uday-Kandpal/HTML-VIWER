package html;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

public class baloon
        extends JFrame {

    private JButton jButton1;
    private JPanel jPanel1;

    public baloon() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jButton1 = new JButton();

        setDefaultCloseOperation(3);
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent evt) {
                baloon.this.formWindowOpened(evt);
            }
        });
        this.jPanel1.setBackground(new Color(255, 255, 204));
        this.jPanel1.setBorder(new LineBorder(new Color(255, 153, 51), 1, true));

        this.jButton1.setText("jButton1");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                baloon.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(139, 139, 139).addComponent(this.jButton1).addContainerGap(186, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(105, 105, 105).addComponent(this.jButton1).addContainerGap(112, 32767)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(32, 32767)));

        pack();
    }

    private void formWindowOpened(WindowEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int x = 0;
        int y = 0;
        int h = 0;

        Rectangle r = getBounds();
        x = r.x;
        y = r.y;
        h = r.height;
        int w = r.width;
        for (int i = 0; i < 500; i++) {
            this.jPanel1.setBackground(new Color(i, i, 0));
            try {
                this.jPanel1.wait(2000L);
            } catch (InterruptedException ex) {
                Logger.getLogger(baloon.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.jPanel1.notify();
        }
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
            Logger.getLogger(baloon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(baloon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(baloon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(baloon.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new baloon().setVisible(true);
            }
        });
    }
}
