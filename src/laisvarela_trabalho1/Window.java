package laisvarela_trabalho1;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.LinkedList;

public class Window extends javax.swing.JFrame {

    static Panel_Cadastro cadastro;
    static Panel_Login login;
    static Panel_ADM inicioADM;
    static Panel_Cliente inicioClient;
    static protected String loginADM = "000.000.000-00";
    static protected String senhaADM = "1234";
    static protected LinkedList<Client> clientList = new LinkedList<>();
    static protected LinkedList<Produto> produtoList = new LinkedList<>();

    public Window() {
        initComponents();
        login = new Panel_Login();
        this.setLayout(new BorderLayout());
        this.add(Window.login);
        this.pack();
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        Produto produto = new Produto("banana", "b123t4", 10f, LocalDate.of(2023, 05, 21), 1);
        produtoList.add(produto);
        produto = new Produto("abacate", "a14c65", 15f, LocalDate.of(2023, 10, 21), 3);
        produtoList.add(produto);
        Client cliente = new Client("111.111.111-11", "1");
        clientList.add(cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
