/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizar;

import carros.DAO;
import carros.Veiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Giova
 */
public class AlterarCarro extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCarros
     */
    Veiculos veiculos = new Veiculos();
    DAO dao;

    public AlterarCarro(DAO dao1) {
        this.dao = dao1;
        initComponents();
        alimentaComboBox();
    }

    private AlterarCarro() {
    }

    private void alimentaComboBox() {
        ArrayList<Veiculos> list = dao.getArrayList();
        for (Veiculos item : list) {
            String cod = String.valueOf(item.getCodVeiculo());
            CaixaCD.addItem(cod);
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

        jPanel1 = new javax.swing.JPanel();
        lblCD = new javax.swing.JLabel();
        CaixaCD = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        lblNV1 = new javax.swing.JLabel();
        NomeVeiculo = new javax.swing.JTextField();
        MarcaVeiculo = new javax.swing.JTextField();
        jlbMV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TipoVeiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ValorVeiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AnoVeiculo = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carros");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar informa????es do ve??culo ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 3, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setLayout(null);

        lblCD.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        lblCD.setText("C??digo do Ve??culo:");
        jPanel1.add(lblCD);
        lblCD.setBounds(20, 70, 140, 30);

        CaixaCD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<C??digo do Ve??culo>" }));
        CaixaCD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CaixaCDItemStateChanged(evt);
            }
        });
        CaixaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaCDActionPerformed(evt);
            }
        });
        jPanel1.add(CaixaCD);
        CaixaCD.setBounds(180, 70, 230, 40);

        btnPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setAlignmentX(0.3F);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(420, 70, 120, 30);

        lblNV1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        lblNV1.setText("Nome do ve??culo:");
        jPanel1.add(lblNV1);
        lblNV1.setBounds(20, 120, 130, 30);

        NomeVeiculo.setEditable(false);
        NomeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(NomeVeiculo);
        NomeVeiculo.setBounds(180, 120, 230, 30);

        MarcaVeiculo.setEditable(false);
        jPanel1.add(MarcaVeiculo);
        MarcaVeiculo.setBounds(180, 160, 230, 30);

        jlbMV.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jlbMV.setText("Marca do ve??culo:");
        jPanel1.add(jlbMV);
        jlbMV.setBounds(20, 160, 130, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Tipo do ve??culo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 200, 120, 30);

        TipoVeiculo.setEditable(false);
        jPanel1.add(TipoVeiculo);
        TipoVeiculo.setBounds(180, 200, 230, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Valor do ve??culo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 240, 120, 30);

        ValorVeiculo.setEditable(false);
        jPanel1.add(ValorVeiculo);
        ValorVeiculo.setBounds(180, 240, 230, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Ano do ve??culo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 280, 130, 30);

        AnoVeiculo.setEditable(false);
        jPanel1.add(AnoVeiculo);
        AnoVeiculo.setBounds(180, 280, 230, 30);

        btnAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setAlignmentX(0.3F);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(300, 330, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 550, 400);
        jPanel1.getAccessibleContext().setAccessibleName("Cadastrar Carros");

        setBounds(0, 0, 604, 477);
    }// </editor-fold>//GEN-END:initComponents
     //ArrayList


    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        if (CaixaCD.getSelectedItem().equals("<C??digo do Ve??culo>")) {
            JOptionPane.showMessageDialog(null, "Op????o Errada, escolha uma das op????es abaixo !", null, WIDTH);
        } else {
            veiculos = dao.pesquisarVeiculo(CaixaCD.getSelectedIndex() - 1);
            NomeVeiculo.setText(veiculos.getNomeVeiculo());
            TipoVeiculo.setText(veiculos.getTipoVeiculo());
            MarcaVeiculo.setText(veiculos.getMarcaVeiculo());
            ValorVeiculo.setText(String.valueOf(veiculos.getValorVeiculo()));
            AnoVeiculo.setText(String.valueOf(veiculos.getAnoVeiculo()));

            NomeVeiculo.setEditable(true);
            TipoVeiculo.setEditable(true);
            MarcaVeiculo.setEditable(true);
            ValorVeiculo.setEditable(true);
            AnoVeiculo.setEditable(true);

        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void CaixaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaCDActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_CaixaCDActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

        if (CaixaCD.getSelectedItem().equals("<C??digo do Ve??culo>")) {
            JOptionPane.showMessageDialog(null, "Op????o Errada, escolha uma das op????es abaixo !", null, WIDTH);
        } else {
            veiculos = new Veiculos();
            veiculos.setNomeVeiculo(NomeVeiculo.getText());
            veiculos.setTipoVeiculo(TipoVeiculo.getText());
            veiculos.setMarcaVeiculo(MarcaVeiculo.getText());
            veiculos.setValorVeiculo(Double.parseDouble(ValorVeiculo.getText()));
            veiculos.setAnoVeiculo(Integer.parseInt(AnoVeiculo.getText()));
            dao.alterarVeiculo(CaixaCD.getSelectedIndex() - 1, veiculos);

    }//GEN-LAST:event_btnAlterarActionPerformed
    }
    private void NomeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeVeiculoActionPerformed

    private void CaixaCDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CaixaCDItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaCDItemStateChanged

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
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoVeiculo;
    private javax.swing.JComboBox<String> CaixaCD;
    private javax.swing.JTextField MarcaVeiculo;
    private javax.swing.JTextField NomeVeiculo;
    private javax.swing.JTextField TipoVeiculo;
    private javax.swing.JTextField ValorVeiculo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbMV;
    private javax.swing.JLabel lblCD;
    private javax.swing.JLabel lblNV1;
    // End of variables declaration//GEN-END:variables
}
