/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectppdb;

import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Deddy
 */
public class MenuSiswa extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    Jadwal j;
    Login l;
    Cetakkrtu c;
    Daftar d;
    Formulirpndftrn fp1;
    Formulirpndftran2 fp2;
    Formulirpndftrn3 fp3;
    Biodataa b;
    Pengumuman p;

    /**
     * Creates new form Awal
     */
    public MenuSiswa() {
        initComponents();
        setLocationRelativeTo(this);
        p = new Pengumuman();
        j = new Jadwal();
        l = new Login();
        c = new Cetakkrtu();
        d = new Daftar();
        fp1 = new Formulirpndftrn();
        fp2 = new Formulirpndftran2();
        fp3 = new Formulirpndftrn3();
        b = new Biodataa();
        fp1.addNextListener(new nextListener());
        fp2.addNextListener(new nextfp2Listener());
        fp2.addBackListener(new backListener());
        fp3.addBackListener(new backfp3Listener());
        fp3.addSaveListener(new saveListener());
        b.addEditListener(new editListener());
        
        

        Panelan.setLayout(layout);
        Panelan.add(j);
        Panelan.add(l);
        Panelan.add(c);
        Panelan.add(d);
        Panelan.add(p);
        Panelan.add(fp1);
        Panelan.add(fp2);
        Panelan.add(fp3);
        Panelan.add(b);
               

        l.setVisible(true);
        j.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        fp1.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(false);
        fp3.setVisible(false);
        b.setVisible(false);

    }

    private class nextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            fp2.setVisible(true);
            fp1.setVisible(false);
        }

    }
    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            fp2.setVisible(false);
            fp1.setVisible(true);
        }

    }
    
    private class nextfp2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            fp3.setVisible(true);
            fp2.setVisible(false);
        }

    }
    
    private class backfp3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            fp2.setVisible(true);
            fp3.setVisible(false);
        }

    }
    private class saveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            fp3.setVisible(false);
            b.setVisible(true);
        }

    }
    
    private class editListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            b.setVisible(false);
            fp1.setVisible(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fp = new javax.swing.JButton();
        ckp = new javax.swing.JButton();
        jdwl = new javax.swing.JButton();
        login = new javax.swing.JButton();
        Dftr = new javax.swing.JButton();
        Pngmn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Panelan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fp.setBorderPainted(false);
        fp.setContentAreaFilled(false);
        fp.setDefaultCapable(false);
        fp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpActionPerformed(evt);
            }
        });
        getContentPane().add(fp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        ckp.setBorderPainted(false);
        ckp.setContentAreaFilled(false);
        ckp.setDefaultCapable(false);
        ckp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckpActionPerformed(evt);
            }
        });
        getContentPane().add(ckp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 270, 50));

        jdwl.setBorderPainted(false);
        jdwl.setContentAreaFilled(false);
        jdwl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdwlActionPerformed(evt);
            }
        });
        getContentPane().add(jdwl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 90, 50));

        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 60, 50));

        Dftr.setBorderPainted(false);
        Dftr.setContentAreaFilled(false);
        Dftr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DftrActionPerformed(evt);
            }
        });
        getContentPane().add(Dftr, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 80, 50));

        Pngmn.setBorderPainted(false);
        Pngmn.setContentAreaFilled(false);
        Pngmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PngmnActionPerformed(evt);
            }
        });
        getContentPane().add(Pngmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 240, 160, 50));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 140));

        javax.swing.GroupLayout PanelanLayout = new javax.swing.GroupLayout(Panelan);
        Panelan.setLayout(PanelanLayout);
        PanelanLayout.setHorizontalGroup(
            PanelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        PanelanLayout.setVerticalGroup(
            PanelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(Panelan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1280, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Revisi New Born 3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdwlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdwlActionPerformed
        j.setVisible(true);
        l.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        fp1.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(false);
        p.setVisible(false);
        fp3.setVisible(false);
        b.setVisible(false);
    }//GEN-LAST:event_jdwlActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        l.setVisible(true);
        j.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        fp1.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(false);
        fp3.setVisible(false);
        b.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void ckpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckpActionPerformed
        c.setVisible(true);
        j.setVisible(false);
        l.setVisible(false);
        d.setVisible(false);
        fp1.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(false);
        fp3.setVisible(false);
        b.setVisible(false);
    }//GEN-LAST:event_ckpActionPerformed

    private void fpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpActionPerformed
        fp1.setVisible(true);
        j.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        l.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(false);
        fp3.setVisible(false);
        b.setVisible(false);
    }//GEN-LAST:event_fpActionPerformed

    private void DftrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DftrActionPerformed
        d.setVisible(true);
        j.setVisible(false);
        c.setVisible(false);
        l.setVisible(false);
        fp1.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(false);
        fp3.setVisible(false);
        b.setVisible(false);
    }//GEN-LAST:event_DftrActionPerformed

    private void PngmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PngmnActionPerformed
        d.setVisible(false);
        j.setVisible(false);
        c.setVisible(false);
        l.setVisible(false);
        fp1.setVisible(false);
        fp2.setVisible(false);
        p.setVisible(true);
        fp3.setVisible(false);
        b.setVisible(false);
    }//GEN-LAST:event_PngmnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dftr;
    private javax.swing.JPanel Panelan;
    private javax.swing.JButton Pngmn;
    private javax.swing.JButton ckp;
    private javax.swing.JButton fp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jdwl;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
