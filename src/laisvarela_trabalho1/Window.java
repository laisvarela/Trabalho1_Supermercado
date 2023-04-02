package laisvarela_trabalho1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.LinkedList;

public class Window extends javax.swing.JFrame {

    static Panel_Cadastro cadastro;
    static Panel_Login login;
    static Panel_InicioADM inicioADM;
    static Panel_InicioClient inicioClient;
    static protected String loginADM = "login1234";
    static protected String senhaADM = "1234";
    static protected String emailADM = "adm@gmail.com";
    static protected LinkedList<Client> clientList = new LinkedList<>();
    static protected ArrayList<Produto> produtoList = new ArrayList<>();

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
