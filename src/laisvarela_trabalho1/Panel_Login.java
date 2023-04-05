package laisvarela_trabalho1;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Panel_Login extends javax.swing.JPanel {

    JFrame janela = new JFrame();

    public Panel_Login() {
        initComponents();
        pn_senha.setVisible(false);
        janela.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_prox = new javax.swing.JButton();
        lb_login = new javax.swing.JLabel();
        bt_cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pn_login = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();
        bt_cadastro = new javax.swing.JButton();
        lb_semCadastro = new javax.swing.JLabel();
        txt_user = new javax.swing.JFormattedTextField();
        pn_senha = new javax.swing.JPanel();
        lb_user2 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        lb_icon2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt_prox.setBackground(new java.awt.Color(255, 255, 255));
        bt_prox.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_prox.setText("Próximo");
        bt_prox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_proxMouseClicked(evt);
            }
        });

        lb_login.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lb_login.setText("Login");

        bt_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        bt_cancelar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cancelarMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        pn_login.setBackground(new java.awt.Color(255, 255, 255));

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        lb_user.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_user.setText("CPF:");

        bt_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        bt_cadastro.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_cadastro.setText("Cadastrar");
        bt_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastroMouseClicked(evt);
            }
        });

        lb_semCadastro.setFont(new java.awt.Font("Yu Gothic UI", 3, 11)); // NOI18N
        lb_semCadastro.setText("Não tem cadastro? ");

        txt_user.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        try {
            txt_user.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pn_loginLayout = new javax.swing.GroupLayout(pn_login);
        pn_login.setLayout(pn_loginLayout);
        pn_loginLayout.setHorizontalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_loginLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lb_semCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cadastro))
                    .addComponent(lb_user)
                    .addComponent(txt_user))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_loginLayout.setVerticalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_loginLayout.createSequentialGroup()
                        .addComponent(lb_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_semCadastro)
                            .addComponent(bt_cadastro))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_senha.setBackground(new java.awt.Color(255, 255, 255));
        pn_senha.setPreferredSize(new java.awt.Dimension(278, 83));

        lb_user2.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_user2.setText("Senha:");

        txt_senha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(255, 204, 204), java.awt.Color.lightGray));
        txt_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_senhaKeyPressed(evt);
            }
        });

        lb_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        javax.swing.GroupLayout pn_senhaLayout = new javax.swing.GroupLayout(pn_senha);
        pn_senha.setLayout(pn_senhaLayout);
        pn_senhaLayout.setHorizontalGroup(
            pn_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_senhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_user2)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_senhaLayout.setVerticalGroup(
            pn_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_senhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_user2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_senhaLayout.createSequentialGroup()
                .addComponent(lb_icon2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_login)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_prox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_prox)
                    .addComponent(bt_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_senhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            proximo();
        }
    }//GEN-LAST:event_txt_senhaKeyPressed

    private void bt_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastroMouseClicked
        Window.cadastro = new Panel_Cadastro();
        janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.remove(Window.login);
        janela.add(Window.cadastro);
        janela.pack();
    }//GEN-LAST:event_bt_cadastroMouseClicked

    private void bt_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_cancelarMouseClicked

    private void bt_proxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_proxMouseClicked
        proximo();
    }//GEN-LAST:event_bt_proxMouseClicked

    private void txt_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            proximo();
        }
    }//GEN-LAST:event_txt_userKeyPressed

    private void proximo() {
        boolean x = false;
        if (!pn_senha.isVisible()) {
            if (txt_user.getText().equals(Window.loginADM)) {
                this.pn_login.setVisible(false);
                this.pn_senha.setVisible(true);
                janela.pack();
            } else {
                if (!Window.clientList.isEmpty()) {
                    for (Client item : Window.clientList) {
                        if (txt_user.getText().equals(item.getCpf())) {
                            this.pn_login.setVisible(false);
                            this.pn_senha.setVisible(true);
                            janela.pack();
                            x = true;
                        }
                    }
                    if (x == false) {
                        JOptionPane.showMessageDialog(null, "Usuário inválido! Verifique se digitou corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário inválido! Verifique se digitou corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // primeiro: verifica qual o user informado
            // segundo: verifica se a senha informada é correspondente ao user
            if (txt_user.getText().equals(Window.loginADM)) {
                if (String.valueOf(txt_senha.getPassword()).equals(Window.senhaADM)) {
                    // se corresponde, abre a tela inicial do adm
                    Window.inicioADM = new Panel_ADM();
                    janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                    janela.remove(Window.login);
                    janela.add(Window.inicioADM);
                    janela.pack();
                } else {
                    // senha não corresponde ao login
                    JOptionPane.showMessageDialog(null, "Senha incorreta!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // se user != de loginADM, pode ser um user client sendo informado
                // nesse caso, é feito a verificação através de um for each
                // apenas se a lista não estiver vazia
                if (!Window.clientList.isEmpty()) {
                    for (Client item : Window.clientList) {
                        if (txt_user.getText().equals(item.getCpf())) {
                            if ((String.valueOf(txt_senha.getPassword()).equals(item.getSenha()))) {
                                Window.inicioClient = new Panel_Cliente();
                                janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                                janela.remove(Window.login);
                                janela.add(Window.inicioClient);
                                janela.pack();
                            } else {
                                // a senha não corresponde ao usuário
                                JOptionPane.showMessageDialog(null, "Senha incorreta!", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_prox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_icon2;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_semCadastro;
    private javax.swing.JLabel lb_user;
    private javax.swing.JLabel lb_user2;
    private javax.swing.JPanel pn_login;
    private javax.swing.JPanel pn_senha;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JFormattedTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
