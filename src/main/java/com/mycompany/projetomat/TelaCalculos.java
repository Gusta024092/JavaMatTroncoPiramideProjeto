package com.mycompany.projetomat;

import com.sun.source.tree.BreakTree;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class TelaCalculos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculos
     */
    public TelaCalculos() {
        initComponents();
        
        spinValor.setEnabled(false);
        cmbCalculo.addItem("Nenhum");
        cmbCalculo.addItem("Área");
        cmbCalculo.addItem("Volume");
        tmFonte = 12;
        txMesa.setFont(txMesa.getFont().deriveFont(tmFonte));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbCalculo = new javax.swing.JComboBox<>();
        lblAltura = new javax.swing.JLabel();
        lblBaMaior = new javax.swing.JLabel();
        lblBAMenor = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtBAMaior = new javax.swing.JTextField();
        txtBAMenor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txMesa = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        spinValor = new javax.swing.JSpinner();
        lblPassos = new javax.swing.JLabel();
        spinFonteTamanho = new javax.swing.JSpinner();
        lblFonte = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuModoCor = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuVersao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Protótipo para Cálculo de Área de Tronco de uma Pirâmide");
        setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setText("Escolha o cálculo");

        cmbCalculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCalculoItemStateChanged(evt);
            }
        });

        lblAltura.setText("Altura:");

        lblBaMaior.setText("Área da Base Maior:");

        lblBAMenor.setText("Área da Base Menor:");

        txMesa.setEditable(false);
        txMesa.setColumns(20);
        txMesa.setRows(5);
        jScrollPane1.setViewportView(txMesa);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        spinValor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinValorStateChanged(evt);
            }
        });

        lblPassos.setText("Passos:");

        spinFonteTamanho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spinFonteTamanho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinFonteTamanhoStateChanged(evt);
            }
        });

        lblFonte.setText("Fonte:");

        jMenu1.setText("File");

        mnuModoCor.setText("Alternar Modo de Exibição");
        mnuModoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModoCorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuModoCor);

        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        mnuVersao.setText("Versão");
        mnuVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVersaoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuVersao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBaMaior)
                                        .addComponent(lblBAMenor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblAltura)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAltura)
                            .addComponent(txtBAMaior)
                            .addComponent(txtBAMenor)
                            .addComponent(cmbCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPassos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(503, 503, 503)
                .addComponent(lblFonte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinFonteTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBaMaior)
                            .addComponent(txtBAMaior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBAMenor)
                            .addComponent(txtBAMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(spinValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinFonteTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFonte)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void areaCalculoTroncoPiramide(){
        try
        {
            spinFonteTamanho.setValue(12);
            spinValor.setEnabled(true);
            baseLateral = Double.parseDouble(txtAltura.getText());
            bamenor = Double.parseDouble(txtBAMenor.getText());
            bamaior = Double.parseDouble(txtBAMaior.getText());
            TroncoPiramide tp = new TroncoPiramide(baseLateral, bamaior, bamenor, 2);
            double valor = tp.area();
            JOptionPane.showMessageDialog(null, deci.format(valor));
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
        }
        //-------------
    }
    
    private void volumeTroncoPiramide(){
        try
        {
            spinValor.setEnabled(true);
            altura = Double.parseDouble(txtAltura.getText());
            bamenor = Double.parseDouble(txtBAMenor.getText());
            bamaior = Double.parseDouble(txtBAMaior.getText());
            TroncoPiramide tp = new TroncoPiramide(altura, bamaior, bamenor);
            double valor = tp.volume();
            JOptionPane.showMessageDialog(null, deci.format(valor));
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
        }
        //-------------
    }
    private void mnuVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVersaoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "0.1 - Gusta024092\nUso Livre", "Versão da Aplicação", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_mnuVersaoActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void cmbCalculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCalculoItemStateChanged
        String itemSelecionado = cmbCalculo.getSelectedItem().toString();
        if (itemSelecionado.equals("Área")){
            jButton1.setEnabled(true);
            spinValor.setEnabled(true);
            lblAltura.setText("Área Lateral");
            decisao = 1;

        }
        else if (itemSelecionado.equals("Volume")){
            jButton1.setEnabled(true);
            spinValor.setEnabled(true);
            lblAltura.setText("Altura");
            decisao = 2;

        }
        else{
            jButton1.setEnabled(false);
            spinValor.setEnabled(false);
            decisao = 0;
        }
    }//GEN-LAST:event_cmbCalculoItemStateChanged

    private void spinValorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinValorStateChanged
        txMesa.setText("");
        String estadoStr = String.valueOf(spinValor.getValue());
        int estado = Integer.parseInt(estadoStr);
        if (estado < 0 || estado > 9){
            spinValor.setValue(0);
        }
        if (altura == 0 && bamaior == 0 && bamenor == 0 && estado != 0){
            JOptionPane.showMessageDialog(null, "Valores Inválidos", "Aviso",
                JOptionPane.ERROR_MESSAGE);
            spinValor.setValue(0);
            return;
        }
        if (decisao == 1){
            TroncoPiramide tp = new TroncoPiramide(altura, bamaior, bamenor, 2);
            String sacola = tp.mostrarCalculoArea(estado);
            txMesa.append(sacola);
        }
        else if (decisao == 2){
            TroncoPiramide tp = new TroncoPiramide(altura, bamaior, bamenor);
            String sacola = tp.mostrarCalculoVolume(estado);
            txMesa.append(sacola);
        }

    }//GEN-LAST:event_spinValorStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (decisao == 1){
            areaCalculoTroncoPiramide();
        }
        else if (decisao == 2){
            volumeTroncoPiramide();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnuModoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModoCorActionPerformed
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.put("control", new Color(128, 128, 128));
            UIManager.put("info", new Color(128, 128, 128));
            UIManager.put("nimbusBase", new Color(18, 30, 49));
            UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
            UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
            UIManager.put("nimbusFocus", new Color(115, 164, 209));
            UIManager.put("nimbusGreen", new Color(176, 179, 50));
            UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
            UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
            UIManager.put("nimbusOrange", new Color(191, 98, 4));
            UIManager.put("nimbusRed", new Color(169, 46, 34));
            UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
            UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
            UIManager.put("text", new Color(230, 230, 230));
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException exc) {
            System.err.println("Nimbus: Unsupported Look and feel!");
        }
    }//GEN-LAST:event_mnuModoCorActionPerformed

    private void spinFonteTamanhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinFonteTamanhoStateChanged
        tmFonte = Float.parseFloat(String.valueOf(spinFonteTamanho.getValue()));
        txMesa.setFont(txMesa.getFont().deriveFont(tmFonte));
    }//GEN-LAST:event_spinFonteTamanhoStateChanged
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
            java.util.logging.Logger.getLogger(TelaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculos().setVisible(true);
            }
        });
    }
    private double altura;
    private double bamenor;
    private double bamaior;
    private double baseLateral;
    private short decisao;
    private float tmFonte;
    private DecimalFormat deci = new DecimalFormat("0.00");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCalculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBAMenor;
    private javax.swing.JLabel lblBaMaior;
    private javax.swing.JLabel lblFonte;
    private javax.swing.JLabel lblPassos;
    private javax.swing.JMenuItem mnuModoCor;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuVersao;
    private javax.swing.JSpinner spinFonteTamanho;
    private javax.swing.JSpinner spinValor;
    private javax.swing.JTextArea txMesa;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBAMaior;
    private javax.swing.JTextField txtBAMenor;
    // End of variables declaration//GEN-END:variables
}