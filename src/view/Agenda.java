/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Igor Souza
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabela = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        txtAreaObservacao = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        btnAGendar = new javax.swing.JToggleButton();
        lblObservacao = new javax.swing.JLabel();
        lblServiço = new javax.swing.JLabel();
        jComboBoxServiço = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        txtHora = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAgenda = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        TableAgendamentos.setToolTipText("");
        Tabela.setViewportView(TableAgendamentos);

        getContentPane().add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 1030, 240));

        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        txtAreaObservacao.setViewportView(jTextAreaObservacao);

        getContentPane().add(txtAreaObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 550, 290));

        btnAGendar.setBackground(new java.awt.Color(0, 255, 102));
        btnAGendar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAGendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAGendar.setText("Agendar");
        btnAGendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAGendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 550, 50));

        lblObservacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblObservacao.setForeground(new java.awt.Color(255, 255, 255));
        lblObservacao.setText("Observação");
        getContentPane().add(lblObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        lblServiço.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblServiço.setForeground(new java.awt.Color(255, 255, 255));
        lblServiço.setText("Serviço");
        getContentPane().add(lblServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jComboBoxServiço.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServiçoItemStateChanged(evt);
            }
        });
        jComboBoxServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServiçoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 340, 40));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 340, 40));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 340, 40));

        lblHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 340, 40));

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor R$");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        txtValor.setText("0");
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 340, 40));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        txtID.setText("0");
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 340, 40));

        txtAgenda.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtAgenda.setForeground(new java.awt.Color(255, 255, 255));
        txtAgenda.setText("Agenda");
        getContentPane().add(txtAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServiçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServiçoActionPerformed

    private void jComboBoxServiçoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServiçoItemStateChanged
        // TODO add your handling code here:
        this.controller.atualizaValor();

    }//GEN-LAST:event_jComboBoxServiçoItemStateChanged

    private void btnAGendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGendarActionPerformed
        // TODO add your handling code here:
        this.controller.agendar();
    }//GEN-LAST:event_btnAGendarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JToggleButton btnAGendar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServiço;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblServiço;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel txtAgenda;
    private javax.swing.JScrollPane txtAreaObservacao;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        this.controller.atualizaValor();


    }

    
    //getter e setters
    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamentos) {
        this.TableAgendamentos = TableAgendamentos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServiço() {
        return jComboBoxServiço;
    }

    public void setjComboBoxServiço(JComboBox<String> jComboBoxServiço) {
        this.jComboBoxServiço = jComboBoxServiço;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextArea getjTextAreaObservacao() {
        return jTextAreaObservacao;
    }

    public void setjTextAreaObservacao(JTextArea jTextAreaObservacao) {
        this.jTextAreaObservacao = jTextAreaObservacao;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextField getTxtHora() {
        return txtHora;
    }

    public void setTxtHora(JTextField txtHora) {
        this.txtHora = txtHora;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }
   
    
    
    
    
    
    
}
