/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.projetomat;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Leandro
 */
public class Calculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Calculos
     */
    public Calculos() {
        initComponents();
        this.setClosable(true);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spinValor = new javax.swing.JSpinner();
        cmbCalculo = new javax.swing.JComboBox<>();
        lblPassos = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblBaMaior = new javax.swing.JLabel();
        lblBAMenor = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtBAMaior = new javax.swing.JTextField();
        txtBAMenor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txMesa = new javax.swing.JTextArea();
        spinFonteTamanho = new javax.swing.JSpinner();
        lblFonte = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuModoCor = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuVersao = new javax.swing.JMenuItem();

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Escolha o tipo de cálculo:");

        spinValor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinValorStateChanged(evt);
            }
        });

        cmbCalculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCalculoItemStateChanged(evt);
            }
        });

        lblPassos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassos.setText("Passos:");

        lblAltura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltura.setText("Altura:");

        lblBaMaior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBaMaior.setText("(ABM)Área da Base Maior:");

        lblBAMenor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBAMenor.setText("(ABm)Área da Base Menor:");

        txMesa.setEditable(false);
        txMesa.setColumns(20);
        txMesa.setRows(5);
        jScrollPane1.setViewportView(txMesa);

        spinFonteTamanho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spinFonteTamanho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinFonteTamanhoStateChanged(evt);
            }
        });

        lblFonte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFonte.setText("Fonte:");

        jMenu1.setText("Opções");

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
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBAMenor)
                    .addComponent(lblBaMaior)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAltura)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBAMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBAMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addGap(65, 65, 65)
                .addComponent(lblPassos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblFonte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinFonteTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
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
                            .addComponent(txtBAMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(spinValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassos)
                    .addComponent(spinFonteTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFonte))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void areaCalculoTroncoPiramide(){
        try
        {
            spinFonteTamanho.setValue(12);
            spinValor.setEnabled(true);
            altura = Double.parseDouble(txtAltura.getText());
            bamenor = Double.parseDouble(txtBAMenor.getText());
            bamaior = Double.parseDouble(txtBAMaior.getText());
            TroncoPiramide tp = new TroncoPiramide(altura, bamaior, bamenor);
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
    private void mnuModoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModoCorActionPerformed
        if (customColorsActive) {
            // Se as cores personalizadas já estão ativas, restaure as configurações originais
            restaurarAparienciaOriginal();
        } else {
            // Caso contrário, aplique as cores personalizadas
            aplicarCoresPersonalizadas();
        }
        customColorsActive = !customColorsActive; // Alterne o estado
    }//GEN-LAST:event_mnuModoCorActionPerformed
    private void aplicarCoresPersonalizadas() {       
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
    }
    private void restaurarConfiguracoesOriginais() {
        UIManager.put("control", originalControl);
        UIManager.put("info", originalInfo);

        // Restaure outras configurações conforme necessário
    }

    // Você pode chamar esta função quando desejar restaurar as configurações originais
    private void restaurarAparienciaOriginal() {
        restaurarConfiguracoesOriginais();
        SwingUtilities.updateComponentTreeUI(this);
    }
    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVersaoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "0.1 - Tronco de Pirâmide\nCódigo: Gusta024092\nDesign e revisão: Machado-Leandro11\nUso Livre", "Versão da Aplicação", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_mnuVersaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (decisao == 1){
            areaCalculoTroncoPiramide();
        }
        else if (decisao == 2){
            volumeTroncoPiramide();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        }
        if (decisao == 1){
            TroncoPiramide tp = new TroncoPiramide(altura, bamaior, bamenor);
            String sacola = tp.mostrarCalculoArea(estado);
            txMesa.append(sacola);
        }
        else if (decisao == 2){
            TroncoPiramide tp = new TroncoPiramide(altura, bamaior, bamenor);
            String sacola = tp.mostrarCalculoVolume(estado);
            txMesa.append(sacola);
        }
    }//GEN-LAST:event_spinValorStateChanged

    private void cmbCalculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCalculoItemStateChanged
        String itemSelecionado = cmbCalculo.getSelectedItem().toString();
        if (itemSelecionado.equals("Área")){
            jButton1.setEnabled(true);
            spinValor.setEnabled(true);
            lblAltura.setText("(AL)Área Lateral:");
            decisao = 1;
            
            txtAltura.setToolTipText("Coloque o valor já multiplicado pelas faces!");
            txtBAMaior.setToolTipText("Coloque o valor o da área do poligono!");
            txtBAMenor.setToolTipText("Coloque o valor o da área do poligono!");
        }
        else if (itemSelecionado.equals("Volume")){
            jButton1.setEnabled(true);
            spinValor.setEnabled(true);
            lblAltura.setText("(h)Altura:");
            decisao = 2;
            
            txtAltura.setToolTipText(null);
            txtBAMaior.setToolTipText("Coloque o valor o da área do poligono!");
            txtBAMenor.setToolTipText("Coloque o valor o da área do poligono!");
        }
        else{
            jButton1.setEnabled(false);
            spinValor.setEnabled(false);
            decisao = 0;
        }
    }//GEN-LAST:event_cmbCalculoItemStateChanged

    private void spinFonteTamanhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinFonteTamanhoStateChanged
        tmFonte = Float.parseFloat(String.valueOf(spinFonteTamanho.getValue()));
        txMesa.setFont(txMesa.getFont().deriveFont(tmFonte));
    }//GEN-LAST:event_spinFonteTamanhoStateChanged
    private boolean customColorsActive = false;
    private Object originalControl;
    private Object originalInfo;
    private double altura;
    private double bamenor;
    private double bamaior;
    private int decisao;
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