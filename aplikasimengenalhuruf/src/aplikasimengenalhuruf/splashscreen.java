/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasimengenalhuruf;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class splashscreen extends javax.swing.JFrame {

    /**
     * Creates new form splashscreen
     */
    public splashscreen() {
        initComponents();
        this.setExtendedState(splashscreen.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProgressBar1 = new javax.swing.JProgressBar();
        LoadingBar = new javax.swing.JLabel();
        nolpersen = new javax.swing.JLabel();
        Gambaranak = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 900));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(ProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 1240, 10));

        LoadingBar.setText("Loading...");
        jPanel1.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, -1));

        nolpersen.setText("0%");
        jPanel1.add(nolpersen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 640, 40, 20));

        Gambaranak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasimengenalhuruf/gambar/20210702_095737_0000.png"))); // NOI18N
        jPanel1.add(Gambaranak, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 560, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    splashscreen sp =new splashscreen();
    sp.setVisible(true);
        try{
         for(int i= 0;i<=100;i++){
        Thread.sleep(30);
        sp.nolpersen.setText( i + "%");{
        if (i==10){
        sp.LoadingBar.setText("Mau Belajar Kan?...");}
        
        if (i==30){
        sp.LoadingBar.setText("Sabar Ya Masih Proses ...");}
        
        if (i==60){
        sp.LoadingBar.setText("Udah Ngaak Sabar ya Mau Belajar?...");}
        
        if (i==80){
        sp.LoadingBar.setText("Yuk Dikit lagi!!!...");}
        
        if (i==99){ 
        sp.LoadingBar.setText("Yeey! Akhirnya Selesai Juga. Skuyyyyyy Kita Belajar!...");}
        
        sp.ProgressBar1.setValue(i);
        
        if(i==100){
            Menu mn = new Menu();
            mn.setVisible(true);
            sp.setVisible(false);
        } 
         }
         }}
    
         catch (Exception e){
    }
              
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gambaranak;
    private javax.swing.JLabel LoadingBar;
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nolpersen;
    // End of variables declaration//GEN-END:variables

}