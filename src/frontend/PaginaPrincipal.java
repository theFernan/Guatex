
package frontend;
public class PaginaPrincipal extends javax.swing.JFrame {

    public PaginaPrincipal() {
        initComponents();
        funcionesPorGerarquia();
    }
    
    public static int gerarquia;
    
    private void funcionesPorGerarquia(){
        /*1="Administradores"
          2="Operadores"
          3="Recepcionistas"
          4="Ovnipotente"*/
        switch(gerarquia){
            case 1:
                menuOpcionesOperador.setVisible(false);
                menuOpcionesRecepcionista.setVisible(false);
                break;
            case 2:
                menuOpcionesAdministrador.setVisible(false);
                menuOpcionesRecepcionista.setVisible(false);
                break;
            case 3:
                menuOpcionesAdministrador.setVisible(false);
                menuOpcionesOperador.setVisible(false);
                break;
            case 4:
                break;
        }
    }
    
    public void setGerarquia(int gerarquia){
        this.gerarquia=gerarquia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCuenta = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuOpcionesRecepcionista = new javax.swing.JMenu();
        menuOpcionesAdministrador = new javax.swing.JMenu();
        menuOpcionesOperador = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        menuCuenta.setText("Cuenta");

        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCuenta.add(jMenuItem1);

        jMenuBar1.add(menuCuenta);

        menuOpcionesRecepcionista.setText("Opciones");
        jMenuBar1.add(menuOpcionesRecepcionista);

        menuOpcionesAdministrador.setText("Opciones");
        jMenuBar1.add(menuOpcionesAdministrador);

        menuOpcionesOperador.setText("Opciones");
        jMenuBar1.add(menuOpcionesOperador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuCuenta;
    private javax.swing.JMenu menuOpcionesAdministrador;
    private javax.swing.JMenu menuOpcionesOperador;
    private javax.swing.JMenu menuOpcionesRecepcionista;
    private javax.swing.JDesktopPane panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
