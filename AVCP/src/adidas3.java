import java.io.IOException;
import java.net.URISyntaxException;

public class adidas3 extends javax.swing.JFrame {

    public adidas3() {
        super("Pago");
        initComponents();
        this.setSize(500,410);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NEQUI = new javax.swing.JButton();
        DAVIPLATA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BANCOLOMBIA = new javax.swing.JButton();
        BOGOTA = new javax.swing.JButton();
        BBVA = new javax.swing.JButton();
        FALABELLA = new javax.swing.JButton();
        FIN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel1.setText("ADIDAS VELOCES COMO PUMA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 300, 27);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel2.setText("METODOS DE PAGO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 40, 170, 30);

        NEQUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nequilogo.jpg"))); // NOI18N
        NEQUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEQUIActionPerformed(evt);
            }
        });
        getContentPane().add(NEQUI);
        NEQUI.setBounds(120, 80, 130, 50);

        DAVIPLATA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/daviplatalogo.jpg"))); // NOI18N
        DAVIPLATA.setText("jButton2");
        DAVIPLATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAVIPLATAActionPerformed(evt);
            }
        });
        getContentPane().add(DAVIPLATA);
        DAVIPLATA.setBounds(250, 80, 150, 50);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel3.setText("BANCOS:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 80, 30);

        BANCOLOMBIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bancolombialogo.jpg"))); // NOI18N
        BANCOLOMBIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BANCOLOMBIAActionPerformed(evt);
            }
        });
        getContentPane().add(BANCOLOMBIA);
        BANCOLOMBIA.setBounds(110, 170, 160, 50);

        BOGOTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bogotalogo.jpg"))); // NOI18N
        BOGOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOGOTAActionPerformed(evt);
            }
        });
        getContentPane().add(BOGOTA);
        BOGOTA.setBounds(270, 170, 140, 50);

        BBVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BBVAlogo.jpg"))); // NOI18N
        BBVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBVAActionPerformed(evt);
            }
        });
        getContentPane().add(BBVA);
        BBVA.setBounds(110, 220, 160, 60);

        FALABELLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/falabellalogo.jpg"))); // NOI18N
        FALABELLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FALABELLAActionPerformed(evt);
            }
        });
        getContentPane().add(FALABELLA);
        FALABELLA.setBounds(270, 220, 140, 60);

        FIN.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        FIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EXIT.png"))); // NOI18N
        FIN.setText("FINALIZAR");
        FIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FINMouseClicked(evt);
            }
        });
        FIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINActionPerformed(evt);
            }
        });
        getContentPane().add(FIN);
        FIN.setBounds(180, 300, 180, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapatoslogo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 530, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOGOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOGOTAActionPerformed
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.bancodebogota.com/wps/portal/banco-de-bogota/bogota");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){} 
            }
        } 
    }//GEN-LAST:event_BOGOTAActionPerformed

    private void NEQUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEQUIActionPerformed
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.nequi.com.co/");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){} 
            }
        } 
    }//GEN-LAST:event_NEQUIActionPerformed

    private void FALABELLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FALABELLAActionPerformed
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.bancofalabella.com.co/");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){} 
            }
        } 
    }//GEN-LAST:event_FALABELLAActionPerformed

    private void FINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FINActionPerformed

    private void FINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FINMouseClicked
        System.exit(0);
    }//GEN-LAST:event_FINMouseClicked

    private void DAVIPLATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAVIPLATAActionPerformed
        if (java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://daviplata.com/wps/portal/daviplata/Home/QueEsDaviPlata/!ut/p/z1/hY7BDoIwEES_hQNXdgUU462gQY3R4EGhFwOmFkyhpFT4fWs8kWCc2-68mQxQSIE2eV_xXFeyyYW5M7q4BYmP28ifHWMSbTBBN9itLx5i7MP1H0CNjT9E0OTpBEIwPLvhp-DkTgKjjj1QLmTxnUuawltyoIo9mGLKeSnzLrVuu5WNNg7D4HApuWDOXdY2TkVK2WlIxyS0dYrPuegPxLLeIhg6wg!!/dz/d5/L2dBISEvZ0FBIS9nQSEh/");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){} 
            }
        }
    }//GEN-LAST:event_DAVIPLATAActionPerformed

    private void BANCOLOMBIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BANCOLOMBIAActionPerformed
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.bancolombia.com/personas");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){} 
            }
        }
    }//GEN-LAST:event_BANCOLOMBIAActionPerformed

    private void BBVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBVAActionPerformed
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.bbva.com.co/");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){} 
            }
        }
    }//GEN-LAST:event_BBVAActionPerformed

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
            java.util.logging.Logger.getLogger(adidas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adidas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adidas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adidas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adidas3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BANCOLOMBIA;
    private javax.swing.JButton BBVA;
    private javax.swing.JButton BOGOTA;
    private javax.swing.JButton DAVIPLATA;
    private javax.swing.JButton FALABELLA;
    private javax.swing.JButton FIN;
    private javax.swing.JButton NEQUI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
