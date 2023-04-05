package laisvarela_trabalho1;

import java.time.format.DateTimeFormatter;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Panel_Cliente extends javax.swing.JPanel {
    
    DefaultTableModel modelo;

    public Panel_Cliente() {
        initComponents();
        modelo = (DefaultTableModel) tb_produtos.getModel();
        for (Produto item : Window.produtoList) {
            modelo.addRow(new Object[]{item.getNome(), item.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                item.getValor(), false});
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop_deslogar = new javax.swing.JPopupMenu();
        menu_delogar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_alterar = new javax.swing.JButton();
        bt_confirmar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        menu_delogar.setText("jMenuItem1");
        pop_deslogar.add(menu_delogar);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.jpg"))); // NOI18N
        jLabel1.setComponentPopupMenu(pop_deslogar);
        jLabel1.setMaximumSize(new java.awt.Dimension(41, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(41, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(41, 41));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_produtos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        tb_produtos.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Validade", "Preço", "Carrinho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_produtos.setGridColor(new java.awt.Color(51, 102, 0));
        tb_produtos.setRowSelectionAllowed(true);
        tb_produtos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tb_produtos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setResizable(false);
            tb_produtos.getColumnModel().getColumn(1).setResizable(false);
            tb_produtos.getColumnModel().getColumn(2).setResizable(false);
            tb_produtos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Total: R$");

        jLabel6.setText("jLabel6");

        jLabel7.setText("Forma de pagamento:");

        jLabel8.setText("jLabel8");

        bt_alterar.setBackground(new java.awt.Color(255, 255, 255));
        bt_alterar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_alterar.setText("Alterar");
        bt_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_alterarMouseClicked(evt);
            }
        });

        bt_confirmar.setBackground(new java.awt.Color(255, 255, 255));
        bt_confirmar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_confirmar.setText("Confirmar");
        bt_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_confirmarMouseClicked(evt);
            }
        });

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_sair)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_confirmar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(bt_alterar)
                    .addComponent(bt_confirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(bt_sair)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_alterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_alterarMouseClicked
        
    }//GEN-LAST:event_bt_alterarMouseClicked

    private void bt_confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_confirmarMouseClicked
        
    }//GEN-LAST:event_bt_confirmarMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        Object[] opcoes = {"Sair", "Deslogar"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja sair?", "Confirmação",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);
        switch (opcaoSelecionada) {
            case 0 ->
            System.exit(0);
            case 1 -> {
                Window.login = new Panel_Login();
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.remove(Window.inicioClient);
                janela.add(Window.login);
                janela.pack();
            }
        }
    }//GEN-LAST:event_bt_sairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_cancelar1;
    private javax.swing.JButton bt_cancelar2;
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JButton bt_prox;
    private javax.swing.JButton bt_prox1;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menu_delogar;
    private javax.swing.JPopupMenu pop_deslogar;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
