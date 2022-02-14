/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.CRUD;
import controller.Metodos;
import model.Dados;

/**
 *
 * @author Fernando e Luís
 */
public class CadastroCliente extends javax.swing.JFrame {

    Metodos m = new Metodos();
    GUI t = new GUI();

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFundo = new javax.swing.JPanel();
        labelCadastroMotorista = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        labelHoraEntrada = new javax.swing.JLabel();
        txtHoraEntrada = new javax.swing.JTextField();
        labelCadastroVeiculo = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        labelCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        labelVaga = new javax.swing.JLabel();
        txtVaga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/carro-icon.png")).getImage());
        setResizable(false);

        labelFundo.setBackground(new java.awt.Color(0, 0, 51));

        labelCadastroMotorista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCadastroMotorista.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroMotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastroMotorista.png"))); // NOI18N
        labelCadastroMotorista.setText("Cadastro motorista:");

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome:");

        labelRG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRG.setForeground(new java.awt.Color(255, 255, 255));
        labelRG.setText("RG:");

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telefone.png"))); // NOI18N
        labelTelefone.setText("Telefone:");

        labelHoraEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelHoraEntrada.setForeground(new java.awt.Color(255, 255, 255));
        labelHoraEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hora.png"))); // NOI18N
        labelHoraEntrada.setText("Hora de entrada:");

        txtHoraEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelCadastroVeiculo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCadastroVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastroCarro.png"))); // NOI18N
        labelCadastroVeiculo.setText("Cadastro veículo:");

        labelPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(255, 255, 255));
        labelPlaca.setText("Placa:");

        labelMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(255, 255, 255));
        labelMarca.setText("Marca:");

        labelModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(255, 255, 255));
        labelModelo.setText("Modelo:");

        labelCor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCor.setForeground(new java.awt.Color(255, 255, 255));
        labelCor.setText("Cor:");

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastrar.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        labelVaga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVaga.setForeground(new java.awt.Color(255, 255, 255));
        labelVaga.setText("Nº Vaga:");

        javax.swing.GroupLayout labelFundoLayout = new javax.swing.GroupLayout(labelFundo);
        labelFundo.setLayout(labelFundoLayout);
        labelFundoLayout.setHorizontalGroup(
            labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelFundoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCadastroMotorista)
                    .addGroup(labelFundoLayout.createSequentialGroup()
                        .addComponent(labelTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone))
                    .addGroup(labelFundoLayout.createSequentialGroup()
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelRG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(labelFundoLayout.createSequentialGroup()
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelVaga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVaga))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(labelFundoLayout.createSequentialGroup()
                        .addComponent(labelHoraEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(txtHoraEntrada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastroVeiculo)
                    .addGroup(labelFundoLayout.createSequentialGroup()
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(labelFundoLayout.createSequentialGroup()
                                        .addComponent(labelPlaca)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelFundoLayout.createSequentialGroup()
                                        .addComponent(labelMarca)
                                        .addGap(23, 23, 23)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelFundoLayout.createSequentialGroup()
                                    .addComponent(labelModelo)
                                    .addGap(14, 14, 14)))
                            .addGroup(labelFundoLayout.createSequentialGroup()
                                .addComponent(labelCor)
                                .addGap(39, 39, 39)))
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(txtCor))))
                .addGap(46, 46, 46))
            .addGroup(labelFundoLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnConfirmar)
                .addGap(46, 46, 46)
                .addComponent(btnLimpar)
                .addGap(49, 49, 49)
                .addComponent(btnVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        labelFundoLayout.setVerticalGroup(
            labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelFundoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelFundoLayout.createSequentialGroup()
                        .addComponent(labelCadastroVeiculo)
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(labelFundoLayout.createSequentialGroup()
                        .addComponent(labelCadastroMotorista)
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRG)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVaga)
                            .addComponent(txtVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHoraEntrada)
                            .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(labelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        FramePrincipal f = new FramePrincipal();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //Objetos locais
        Dados d = new Dados();
        CRUD c = new CRUD();
        GUI telas = new GUI();
        FramePrincipal f = new FramePrincipal();
        //Atributos locais
        int vetor[] = new int[30];
        boolean cond = true;

        //Envia os valores dos campos para as variáveis em Dados()
        d.setNome(txtNome.getText());
        d.setRg(txtRG.getText());
        d.setTelefone(txtTelefone.getText());
        d.setPlaca(txtPlaca.getText());
        d.setMarca(txtMarca.getText());
        d.setModelo(txtModelo.getText());
        d.setCor(txtCor.getText());

        try {
            //testa se já foi escolhido
            for (int i = 0; i < c.read().size(); i++) {
                vetor[i] = c.readSituacaoVaga().get(i).getVaga();
                if (m.stringToInt(txtVaga.getText()) == vetor[i]) {
                    telas.criarMensagem("Vaga já escolhida!\nEscolha outro número!", "Erro", 0);
                    cond = false;
                    break;
                }
            }//fim do for 
            //testa se é um valor válido
            if (m.stringToInt(txtVaga.getText()) < 1 || m.stringToInt(txtVaga.getText()) > 30) {
                telas.criarMensagem("O número da vaga não pode ser menor que 1 nem maior que 30!\nEscolha outro número!", "Erro", 0);
                cond = false;
            }

            //se ainda for válido é feito o cadastro
            if (cond) {
                d.setVaga(m.stringToInt(txtVaga.getText()));
                int hora = m.stringToInt(txtHoraEntrada.getText());

                if (hora < 6 || hora > 23) {
                    t.criarMensagem("O horário de entrada não pode ser anterior que 6 nem posterior a 23 horas.\nDigite um horário válido", "Atenção", 2);
                } else {
                    d.setHora(hora);
                    //Envia os valores de Dados() para CRUD() fazer os inserts no BD
                    c.createCadastro(d);

                    //manda o número da vaga para ser setado como ocupado
                    f.setarOcupado(m.stringToInt(txtVaga.getText()));
                    //torna frameprincipal visível
                    f.setVisible(true);
                    //torna frame atual invisível
                    dispose();
                }

            }

        } catch (Exception e) {
            telas.criarMensagem("Erro: " + e, "Erro", 0);
        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void limparCampos() {
        // Limpa os campos do formulário
        txtNome.setText("");
        txtRG.setText("");
        txtTelefone.setText("");
        txtHoraEntrada.setText("");
        txtPlaca.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCor.setText("");
        txtVaga.setText("");
    }

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel labelCadastroMotorista;
    private javax.swing.JLabel labelCadastroVeiculo;
    private javax.swing.JLabel labelCor;
    private javax.swing.JPanel labelFundo;
    private javax.swing.JLabel labelHoraEntrada;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelVaga;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtVaga;
    // End of variables declaration//GEN-END:variables
}