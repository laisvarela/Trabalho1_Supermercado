package laisvarela_trabalho1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Panel_Cliente extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    LinkedList<Supermercado> carrinho = new LinkedList<>();
    LinkedList<Float> totalList = new LinkedList<>();
    Supermercado sm = new Supermercado();

    public Panel_Cliente() {
        initComponents();
        modelo = (DefaultTableModel) tb_produtos.getModel();
        for (Produto item : Window.produtoList) {
            modelo.addRow(new Object[]{item.getNome(), item.getCodigo(), item.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                item.getValor(), false, item.getQtd()});
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
        bt_sair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pn_qtd = new javax.swing.JPanel();
        bt_qtdSubtrair = new javax.swing.JButton();
        bt_qtdSomar = new javax.swing.JButton();
        lb_qtd = new javax.swing.JLabel();
        pn_total = new javax.swing.JPanel();
        bt_confirmar = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();

        menu_delogar.setText("jMenuItem1");
        pop_deslogar.add(menu_delogar);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.jpg"))); // NOI18N
        jLabel1.setComponentPopupMenu(pop_deslogar);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
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
                "Nome", "Código", "Validade", "Preço", "Carrinho", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Boolean.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
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
        tb_produtos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tb_produtos.getTableHeader().setReorderingAllowed(false);
        tb_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setResizable(false);
            tb_produtos.getColumnModel().getColumn(1).setResizable(false);
            tb_produtos.getColumnModel().getColumn(2).setResizable(false);
            tb_produtos.getColumnModel().getColumn(3).setResizable(false);
            tb_produtos.getColumnModel().getColumn(4).setResizable(false);
            tb_produtos.getColumnModel().getColumn(5).setResizable(false);
        }

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        pn_qtd.setBackground(new java.awt.Color(255, 255, 255));

        bt_qtdSubtrair.setBackground(new java.awt.Color(255, 255, 255));
        bt_qtdSubtrair.setText("-");
        bt_qtdSubtrair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_qtdSubtrair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_qtdSubtrairMouseClicked(evt);
            }
        });

        bt_qtdSomar.setBackground(new java.awt.Color(255, 255, 255));
        bt_qtdSomar.setText("+");
        bt_qtdSomar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_qtdSomar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_qtdSomarMouseClicked(evt);
            }
        });

        lb_qtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_qtd.setText("0");

        javax.swing.GroupLayout pn_qtdLayout = new javax.swing.GroupLayout(pn_qtd);
        pn_qtd.setLayout(pn_qtdLayout);
        pn_qtdLayout.setHorizontalGroup(
            pn_qtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_qtdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_qtdSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_qtdSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        pn_qtdLayout.setVerticalGroup(
            pn_qtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_qtdLayout.createSequentialGroup()
                .addGroup(pn_qtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_qtdSubtrair)
                    .addComponent(bt_qtdSomar)
                    .addComponent(lb_qtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        bt_confirmar.setBackground(new java.awt.Color(255, 255, 255));
        bt_confirmar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_confirmar.setText("Confirmar");
        bt_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_confirmarMouseClicked(evt);
            }
        });

        bt_alterar.setBackground(new java.awt.Color(255, 255, 255));
        bt_alterar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_alterar.setText("Alterar");
        bt_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_alterarMouseClicked(evt);
            }
        });

        jLabel8.setText("jLabel8");

        jLabel7.setText("Forma de pagamento:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Total: R$");

        lb_total.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lb_total.setText("0.0");

        javax.swing.GroupLayout pn_totalLayout = new javax.swing.GroupLayout(pn_total);
        pn_total.setLayout(pn_totalLayout);
        pn_totalLayout.setHorizontalGroup(
            pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_totalLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(bt_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_confirmar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_totalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_total)
                .addContainerGap())
        );
        pn_totalLayout.setVerticalGroup(
            pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_totalLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_confirmar)
                    .addComponent(bt_alterar)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_sair)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pn_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(pn_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
    private int checarRowSelecionado(String operador) {
        int row = tb_produtos.getSelectedRow(); // obtem a linha selecionada
        Object rowProdtuo = null, rowValor = null;

        float x = 0;
        boolean check = (boolean) modelo.getValueAt(row, 4);
        if (tb_produtos.isRowSelected(row)) { // verifica se a linha está seleciodada
            rowProdtuo = modelo.getValueAt(row, 1); // obtem a string contida na linha selecionada, coluna Código
            rowValor = modelo.getValueAt(row, 3);
            int valor = (int) modelo.getValueAt(row, 5); // pega o valor contido na linha selecionada e na coluna Quantidade
            lb_qtd.setText(String.valueOf(valor)); // altera o valor da lb_qtd
            if (operador.equals("soma")) { // Verifica que o botão soma foi pressionado
                for (Produto item : Window.produtoList) {
                    if (rowProdtuo.equals(item.getCodigo())) {
                        item.setQtd(item.getQtd() + 1);
                        modelo.setValueAt(item.getQtd(), row, 5); // atualiza o da quantidade
                        valor = (int) modelo.getValueAt(row, 5);
                        lb_qtd.setText(String.valueOf(valor)); // atualiza da lb_qtd
                        if (!carrinho.isEmpty()) {
                            for (Supermercado supermercado : carrinho) {
                                if (rowProdtuo.equals(supermercado.getCodigo())) {
                                    supermercado.setQtd(supermercado.getQtd() + 1);
                                    if (rowValor.equals(supermercado.getValor()) && check == true) {
                                        sm.setTotal(sm.getTotal() + supermercado.getValor());
                                        lb_total.setText(String.valueOf(sm.getTotal()));
                                    }
                                }
                            }
                        }

                    }
                }
            } else if (operador.equals("subtrair")) {
                if (valor > 0) {
                    for (Produto item : Window.produtoList) {
                        if (rowProdtuo.equals(item.getCodigo())) {
                            item.setQtd(item.getQtd() - 1);
                            modelo.setValueAt(item.getQtd(), row, 5);
                            valor = (int) modelo.getValueAt(row, 5);
                            lb_qtd.setText(String.valueOf(valor));
                            if (!carrinho.isEmpty()) {
                                for (Supermercado supermercado : carrinho) {
                                    if (rowProdtuo.equals(supermercado.getCodigo())) {
                                        supermercado.setQtd(supermercado.getQtd() - 1);
                                        if (rowValor.equals(supermercado.getValor()) && check == true) {
                                            sm.setTotal(sm.getTotal() - supermercado.getValor());
                                            lb_total.setText(String.valueOf(sm.getTotal()));
                                        }

                                    }
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade igual a zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else if (operador.equals("checkBox")) {
                boolean adiciona = false;
                if (check == true) {
                    for (Supermercado item : carrinho) {
                        if (rowProdtuo.equals(item.getCodigo())) {
                            adiciona = true;
                        }
                    }
                    if (adiciona == false) {
                        Supermercado supermercado = new Supermercado((String) modelo.getValueAt(row, 0),
                                (String) modelo.getValueAt(row, 1), LocalDate.parse((CharSequence) modelo.getValueAt(row, 2), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                                (float) modelo.getValueAt(row, 3), (int) modelo.getValueAt(row, 5));
                        carrinho.add(supermercado);
                    }

                    if (lb_total.getText().equals("0.0")) {
                        x = total((float) modelo.getValueAt(row, 3), (int) modelo.getValueAt(row, 5));
                        sm.setTotal(x);
                        lb_total.setText(String.valueOf(sm.getTotal()));
                    } else if (adiciona == false) {
                        x = total((float) modelo.getValueAt(row, 3), (int) modelo.getValueAt(row, 5));
                        sm.setTotal(sm.getTotal() + x);
                        lb_total.setText(String.valueOf(sm.getTotal()));
                    }

                } else {
                    if (!carrinho.isEmpty()) {
                        for (Supermercado item : carrinho) {
                            if (rowValor.equals(item.getValor())) {
                                carrinho.remove(item);
                                x = total(item.getValor(), item.getQtd());
                                sm.setTotal(sm.getTotal() - x);
                                lb_total.setText(String.valueOf(sm.getTotal()));
                            }
                        }
                    }

                }
            }

        }
        return row;
    }

    private float total(float valor, int qtd) {
        return valor * qtd;
    }
    private void bt_qtdSomarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_qtdSomarMouseClicked
        checarRowSelecionado("soma");

    }//GEN-LAST:event_bt_qtdSomarMouseClicked

    private void bt_qtdSubtrairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_qtdSubtrairMouseClicked
        checarRowSelecionado("subtrair");
    }//GEN-LAST:event_bt_qtdSubtrairMouseClicked

    private void tb_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMouseClicked
        checarRowSelecionado("");
        boolean x = (boolean) modelo.getValueAt(checarRowSelecionado(""), 4);
        if (tb_produtos.isRowSelected(checarRowSelecionado("")) && (x == true || x == false)) {
            checarRowSelecionado("checkBox");
        }
    }//GEN-LAST:event_tb_produtosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JButton bt_qtdSomar;
    private javax.swing.JButton bt_qtdSubtrair;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_qtd;
    private javax.swing.JLabel lb_total;
    private javax.swing.JMenuItem menu_delogar;
    private javax.swing.JPanel pn_qtd;
    private javax.swing.JPanel pn_total;
    private javax.swing.JPopupMenu pop_deslogar;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
