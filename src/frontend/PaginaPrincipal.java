
package frontend;

import guatex.Guatex;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PaginaPrincipal extends javax.swing.JFrame {

    public PaginaPrincipal() {
        initComponents();
        funcionesPorGerarquia();
    }
    
    public static int gerarquia;
    private static String codigoUsuario;
    private static String codigoDestino;
    private static String numeroRuta;
    
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

        internalFrameCrudUsuarios = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldCodigoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldContraseñaUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioButtonRecepcionistas = new javax.swing.JRadioButton();
        radioButtonOperadores = new javax.swing.JRadioButton();
        radioButtonAdministrador = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        buttonActualizarInfo = new javax.swing.JButton();
        buttonCrearUsuario = new javax.swing.JButton();
        radioButtonEstadoActivo = new javax.swing.JRadioButton();
        radioButtonEstadoInactivo = new javax.swing.JRadioButton();
        buttonGroupGerarquiaUsuario = new javax.swing.ButtonGroup();
        buttonGroupEstadoUsuario = new javax.swing.ButtonGroup();
        internalFrameCRUDDestinos = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        textFieldCodigoDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textFieldPais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textFieldCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        buttonActualizarDestino = new javax.swing.JButton();
        buttonCrearDestino = new javax.swing.JButton();
        internalFrameCrudRutas = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textFieldNumeroRuta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textFieldDestino_ruta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        labelPressEnter = new javax.swing.JLabel();
        buttonActualizarRuta = new javax.swing.JButton();
        buttonCrearRuta = new javax.swing.JButton();
        radioButtonRutaActiva = new javax.swing.JRadioButton();
        radioButtonRutaInactiva = new javax.swing.JRadioButton();
        buttonGroupEstadoRuta = new javax.swing.ButtonGroup();
        internalFramePtosCtrol = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        textFieldNumeroPtoCtrl = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textFieldDestino_PtoCtrl = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        labelPressEnter1 = new javax.swing.JLabel();
        buttonActualizarPunto = new javax.swing.JButton();
        buttonCrearPunto = new javax.swing.JButton();
        radioButtonPuntoActivo = new javax.swing.JRadioButton();
        radioButtonPuntoInactivo = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        textFieldNumeroRuta_PtoCtrl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        radioButtonTarfiaGlobal = new javax.swing.JRadioButton();
        radioButtonTarfiaPropia = new javax.swing.JRadioButton();
        textFieldLocalizacionPunto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        buttonGroupTarifaPtoCtrl = new javax.swing.ButtonGroup();
        buttonGroupEstadoPunto = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCuenta = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuOpcionesRecepcionista = new javax.swing.JMenu();
        menuOpcionesAdministrador = new javax.swing.JMenu();
        menuCrud = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuListados = new javax.swing.JMenu();
        menuOpcionesOperador = new javax.swing.JMenu();

        internalFrameCrudUsuarios.setClosable(true);
        internalFrameCrudUsuarios.setIconifiable(true);
        internalFrameCrudUsuarios.setMaximizable(true);
        internalFrameCrudUsuarios.setResizable(true);
        internalFrameCrudUsuarios.setPreferredSize(new java.awt.Dimension(461, 325));
        internalFrameCrudUsuarios.setVisible(true);

        jLabel1.setText("Codigo Usuario:");

        textFieldCodigoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCodigoUsuarioKeyPressed(evt);
            }
        });

        jLabel2.setText("Nombre Usuario:");

        jLabel3.setText("Estado Usuario:");

        jLabel4.setText("Contraseña Usuario:");

        jLabel5.setText("Jerarquia Usuario:");

        buttonGroupGerarquiaUsuario.add(radioButtonRecepcionistas);
        radioButtonRecepcionistas.setText("Recepcionista");

        buttonGroupGerarquiaUsuario.add(radioButtonOperadores);
        radioButtonOperadores.setText("Operador");
        radioButtonOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonOperadoresActionPerformed(evt);
            }
        });

        buttonGroupGerarquiaUsuario.add(radioButtonAdministrador);
        radioButtonAdministrador.setText("Administrador");

        jLabel6.setText("Press Enter");

        buttonActualizarInfo.setText("Actualizar Datos");
        buttonActualizarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarInfoActionPerformed(evt);
            }
        });

        buttonCrearUsuario.setText("Crear");
        buttonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearUsuarioActionPerformed(evt);
            }
        });

        buttonGroupEstadoUsuario.add(radioButtonEstadoActivo);
        radioButtonEstadoActivo.setText("Activo");

        buttonGroupEstadoUsuario.add(radioButtonEstadoInactivo);
        radioButtonEstadoInactivo.setText("Inactivo");
        radioButtonEstadoInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonEstadoInactivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(radioButtonEstadoActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButtonEstadoInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buttonCrearUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonActualizarInfo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonRecepcionistas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonOperadores)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButtonAdministrador))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioButtonEstadoActivo)
                        .addComponent(radioButtonEstadoInactivo))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textFieldContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioButtonRecepcionistas)
                    .addComponent(radioButtonOperadores)
                    .addComponent(radioButtonAdministrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActualizarInfo)
                    .addComponent(buttonCrearUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout internalFrameCrudUsuariosLayout = new javax.swing.GroupLayout(internalFrameCrudUsuarios.getContentPane());
        internalFrameCrudUsuarios.getContentPane().setLayout(internalFrameCrudUsuariosLayout);
        internalFrameCrudUsuariosLayout.setHorizontalGroup(
            internalFrameCrudUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        internalFrameCrudUsuariosLayout.setVerticalGroup(
            internalFrameCrudUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameCrudUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        internalFrameCRUDDestinos.setClosable(true);
        internalFrameCRUDDestinos.setIconifiable(true);
        internalFrameCRUDDestinos.setMaximizable(true);
        internalFrameCRUDDestinos.setResizable(true);
        internalFrameCRUDDestinos.setPreferredSize(new java.awt.Dimension(461, 325));
        internalFrameCRUDDestinos.setVisible(true);

        jLabel7.setText("Codigo Destino:");

        textFieldCodigoDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCodigoDestinoKeyPressed(evt);
            }
        });

        jLabel8.setText("Pais:");

        jLabel9.setText("Ciudad:");

        jLabel12.setText("Press Enter");

        buttonActualizarDestino.setText("Actualizar Datos");
        buttonActualizarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarDestinoActionPerformed(evt);
            }
        });

        buttonCrearDestino.setText("Crear");
        buttonCrearDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(textFieldCodigoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonCrearDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonActualizarDestino)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textFieldCodigoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(textFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCrearDestino)
                    .addComponent(buttonActualizarDestino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout internalFrameCRUDDestinosLayout = new javax.swing.GroupLayout(internalFrameCRUDDestinos.getContentPane());
        internalFrameCRUDDestinos.getContentPane().setLayout(internalFrameCRUDDestinosLayout);
        internalFrameCRUDDestinosLayout.setHorizontalGroup(
            internalFrameCRUDDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameCRUDDestinosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        internalFrameCRUDDestinosLayout.setVerticalGroup(
            internalFrameCRUDDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameCRUDDestinosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        internalFrameCrudRutas.setClosable(true);
        internalFrameCrudRutas.setIconifiable(true);
        internalFrameCrudRutas.setMaximizable(true);
        internalFrameCrudRutas.setResizable(true);
        internalFrameCrudRutas.setVisible(true);

        jPanel3.setPreferredSize(new java.awt.Dimension(450, 325));

        jLabel10.setText("Codigo Destino:");

        textFieldNumeroRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldNumeroRutaKeyPressed(evt);
            }
        });

        jLabel11.setText("Numero De Ruta:");

        jLabel13.setText("Estado:");

        labelPressEnter.setText("Press Enter");

        buttonActualizarRuta.setText("Actualizar Datos");
        buttonActualizarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarRutaActionPerformed(evt);
            }
        });

        buttonCrearRuta.setText("Crear");
        buttonCrearRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearRutaActionPerformed(evt);
            }
        });

        buttonGroupEstadoRuta.add(radioButtonRutaActiva);
        radioButtonRutaActiva.setText("Activa");

        buttonGroupEstadoRuta.add(radioButtonRutaInactiva);
        radioButtonRutaInactiva.setText("Inactiva");
        radioButtonRutaInactiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonRutaInactivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPressEnter)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldDestino_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioButtonRutaActiva)
                                    .addComponent(textFieldNumeroRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButtonRutaInactiva))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonCrearRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonActualizarRuta)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(textFieldDestino_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelPressEnter)
                    .addComponent(textFieldNumeroRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtonRutaActiva)
                            .addComponent(radioButtonRutaInactiva))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonActualizarRuta)
                            .addComponent(buttonCrearRuta))))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout internalFrameCrudRutasLayout = new javax.swing.GroupLayout(internalFrameCrudRutas.getContentPane());
        internalFrameCrudRutas.getContentPane().setLayout(internalFrameCrudRutasLayout);
        internalFrameCrudRutasLayout.setHorizontalGroup(
            internalFrameCrudRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        internalFrameCrudRutasLayout.setVerticalGroup(
            internalFrameCrudRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalFrameCrudRutasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        internalFramePtosCtrol.setClosable(true);
        internalFramePtosCtrol.setIconifiable(true);
        internalFramePtosCtrol.setMaximizable(true);
        internalFramePtosCtrol.setResizable(true);
        internalFramePtosCtrol.setVisible(true);

        jPanel4.setPreferredSize(new java.awt.Dimension(450, 325));

        jLabel14.setText("Codigo Destino:");

        textFieldNumeroPtoCtrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldNumeroPtoCtrlKeyPressed(evt);
            }
        });

        jLabel15.setText("Numero De Ruta:");

        jLabel16.setText("Estado:");

        labelPressEnter1.setText("Press Enter");

        buttonActualizarPunto.setText("Actualizar Datos");
        buttonActualizarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarPuntoActionPerformed(evt);
            }
        });

        buttonCrearPunto.setText("Crear");
        buttonCrearPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearPuntoActionPerformed(evt);
            }
        });

        buttonGroupEstadoPunto.add(radioButtonPuntoActivo);
        radioButtonPuntoActivo.setText("Activa");

        buttonGroupEstadoPunto.add(radioButtonPuntoInactivo);
        radioButtonPuntoInactivo.setText("Inactiva");
        radioButtonPuntoInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPuntoInactivoActionPerformed(evt);
            }
        });

        jLabel17.setText("Numero De Pto. De Ctrl.:");

        textFieldNumeroRuta_PtoCtrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldNumeroRuta_PtoCtrlKeyPressed(evt);
            }
        });

        jLabel18.setText("Tipo De Tarifa:");

        buttonGroupTarifaPtoCtrl.add(radioButtonTarfiaGlobal);
        radioButtonTarfiaGlobal.setText("Global");

        buttonGroupTarifaPtoCtrl.add(radioButtonTarfiaPropia);
        radioButtonTarfiaPropia.setText("Propia");
        radioButtonTarfiaPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonTarfiaPropiaActionPerformed(evt);
            }
        });

        jLabel19.setText("Localizacion:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(textFieldNumeroPtoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelPressEnter1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldNumeroRuta_PtoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textFieldDestino_PtoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                        .addGap(123, 123, 123)
                                                        .addComponent(radioButtonTarfiaPropia))
                                                    .addComponent(radioButtonTarfiaGlobal)))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(radioButtonPuntoActivo)
                                        .addGap(56, 56, 56)
                                        .addComponent(radioButtonPuntoInactivo))
                                    .addComponent(textFieldLocalizacionPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buttonCrearPunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonActualizarPunto)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(textFieldDestino_PtoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textFieldNumeroRuta_PtoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPressEnter1)
                    .addComponent(jLabel17)
                    .addComponent(textFieldNumeroPtoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(radioButtonTarfiaPropia)
                    .addComponent(radioButtonTarfiaGlobal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonPuntoActivo)
                    .addComponent(jLabel16)
                    .addComponent(radioButtonPuntoInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(textFieldLocalizacionPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCrearPunto)
                    .addComponent(buttonActualizarPunto))
                .addContainerGap())
        );

        javax.swing.GroupLayout internalFramePtosCtrolLayout = new javax.swing.GroupLayout(internalFramePtosCtrol.getContentPane());
        internalFramePtosCtrol.getContentPane().setLayout(internalFramePtosCtrolLayout);
        internalFramePtosCtrolLayout.setHorizontalGroup(
            internalFramePtosCtrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        internalFramePtosCtrolLayout.setVerticalGroup(
            internalFramePtosCtrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalFramePtosCtrolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        menuCrud.setText("CRUD´s");

        jMenuItem2.setText("Usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCrud.add(jMenuItem2);

        jMenuItem3.setText("Destinos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCrud.add(jMenuItem3);

        jMenuItem4.setText("Rutas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuCrud.add(jMenuItem4);

        jMenuItem5.setText("Ptos. De Ctrl.");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuCrud.add(jMenuItem5);

        menuOpcionesAdministrador.add(menuCrud);

        menuListados.setText("Listados");
        menuOpcionesAdministrador.add(menuListados);

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

    void limpiarDatosUsuario(){
        textFieldCodigoUsuario.setText("");
        textFieldContraseñaUsuario.setText("");
        textFieldNombreUsuario.setText("");
        buttonGroupEstadoUsuario.clearSelection();
        buttonGroupGerarquiaUsuario.clearSelection();
        buttonActualizarInfo.setVisible(false);
        buttonCrearUsuario.setVisible(false);
    }
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        limpiarDatosUsuario();
        panelPrincipal.add(internalFrameCrudUsuarios);
        internalFrameCrudUsuarios.pack();
        internalFrameCrudUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void radioButtonOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonOperadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonOperadoresActionPerformed

    private void buttonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearUsuarioActionPerformed
        String nombre;
        String codigo;
        int estado=0;
        String contraseña;
        int gerarquia=0;
        PreparedStatement insertar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldCodigoUsuario.getText().equals("")&&!textFieldNombreUsuario.getText().equals("")&&!textFieldContraseñaUsuario.getText().equals("")
                    &&(radioButtonEstadoActivo.isSelected()||radioButtonEstadoInactivo.isSelected())
                    &&!textFieldContraseñaUsuario.getText().equals("")&&(radioButtonRecepcionistas.isSelected()
                    ||radioButtonOperadores.isSelected()||radioButtonAdministrador.isSelected())){
                
                nombre=textFieldNombreUsuario.getText();
                codigo= textFieldCodigoUsuario.getText();
                if(radioButtonEstadoActivo.isSelected()){
                    estado= 1;
                }else if(radioButtonEstadoInactivo.isSelected()){
                    estado= 0;
                }
                contraseña=textFieldContraseñaUsuario.getText();
                if(radioButtonAdministrador.isSelected()){
                    gerarquia= 1;
                }else if(radioButtonOperadores.isSelected()){
                    gerarquia= 2;
                }else if(radioButtonRecepcionistas.isSelected()){
                    gerarquia= 3;
                }
                insertar=guatex.getConnection().prepareStatement("INSERT INTO USUARIOS VALUES ( ? , ? , ? , ? , ?)");
                insertar.setString(1, nombre);
                insertar.setString(2, codigo);
                insertar.setInt(3, estado);
                insertar.setString(4, contraseña);
                insertar.setInt(5, gerarquia);
                insertar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Creacion Realizada");
                limpiarDatosUsuario();
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
    }//GEN-LAST:event_buttonCrearUsuarioActionPerformed

    private void buttonActualizarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarInfoActionPerformed
        codigoUsuario=textFieldCodigoUsuario.getText();
        String nombre;
        String codigo;
        int estado=0;
        String contraseña;
        int gerarquia=0;
        Statement actualizar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldCodigoUsuario.getText().equals("")&&!textFieldNombreUsuario.getText().equals("")&&!textFieldContraseñaUsuario.getText().equals("")
                    &&(radioButtonEstadoActivo.isSelected()||radioButtonEstadoInactivo.isSelected())
                    &&!textFieldContraseñaUsuario.getText().equals("")&&(radioButtonRecepcionistas.isSelected()
                    ||radioButtonOperadores.isSelected()||radioButtonAdministrador.isSelected())){
                actualizar = guatex.getConnection().
                        createStatement();
                nombre=textFieldNombreUsuario.getText();
                codigo= textFieldCodigoUsuario.getText();
                if(radioButtonEstadoActivo.isSelected()){
                    estado= 1;
                }else if(radioButtonEstadoInactivo.isSelected()){
                    estado= 0;
                }
                contraseña=textFieldContraseñaUsuario.getText();
                if(radioButtonAdministrador.isSelected()){
                    gerarquia= 1;
                }else if(radioButtonOperadores.isSelected()){
                    gerarquia= 2;
                }else if(radioButtonRecepcionistas.isSelected()){
                    gerarquia= 3;
                }
                actualizar.executeUpdate("UPDATE USUARIOS SET NOMBRE='"+nombre+"', CODIGO='"+codigo+"', " +
"                                ESTADO='"+estado+"', CONTRASEÑA='"+contraseña+"', JERARQUIA='"+gerarquia+"' WHERE" +
"                                CODIGO='"+codigoUsuario+"'");
                JOptionPane.showMessageDialog(null, "Actualizacion Realizada");
                limpiarDatosUsuario();
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
    }//GEN-LAST:event_buttonActualizarInfoActionPerformed

    private void textFieldCodigoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCodigoUsuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            boolean existe=false;
            Guatex guatex = new Guatex();
            PreparedStatement consulta;
            try {
                consulta = guatex.getConnection().prepareStatement("SELECT * FROM USUARIOS WHERE CODIGO= ? ");
                consulta.setString(1, textFieldCodigoUsuario.getText());
                ResultSet resultado=consulta.executeQuery();         
                while (resultado.next()){
                    if(resultado!=null){ 
                        existe=true;
                        textFieldNombreUsuario.setText(resultado.getString("NOMBRE"));
                        if(resultado.getString("ESTADO").equals("1")){
                            radioButtonEstadoActivo.setSelected(true);
                        }else{
                            radioButtonEstadoInactivo.setSelected(true);
                        }
                        textFieldContraseñaUsuario.setText(resultado.getString("CONTRASEÑA"));
                        switch(resultado.getString("JERARQUIA")){
                             case "1":
                                radioButtonAdministrador.setSelected(true);                                
                                break;
                            case "2":
                                radioButtonOperadores.setSelected(true);                                
                                break;    
                            case "3":
                                radioButtonRecepcionistas.setSelected(true);                                
                            break;    
                        }
                        buttonActualizarInfo.setVisible(true);
                        buttonCrearUsuario.setVisible(false);
                        codigoUsuario=textFieldCodigoUsuario.getText();
                    }
                }
                if(existe==false){
                    JOptionPane.showMessageDialog(null, "Usuario No Encontrado, Debe Crearlo");
                    buttonCrearUsuario.setVisible(true);
                    buttonActualizarInfo.setVisible(false);
                    textFieldNombreUsuario.setText("");
                    textFieldContraseñaUsuario.setText("");
                    buttonGroupEstadoUsuario.clearSelection();
                    buttonGroupGerarquiaUsuario.clearSelection();
                }
            } catch (SQLException ex) {
                
            }
        
        }
    }//GEN-LAST:event_textFieldCodigoUsuarioKeyPressed

    private void radioButtonEstadoInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonEstadoInactivoActionPerformed
        
    }//GEN-LAST:event_radioButtonEstadoInactivoActionPerformed

    private void textFieldCodigoDestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCodigoDestinoKeyPressed
        codigoDestino=textFieldCodigoUsuario.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            boolean existe=false;
            Guatex guatex = new Guatex();
            PreparedStatement consulta;
            try {
                consulta = guatex.getConnection().prepareStatement("SELECT * FROM DESTINO WHERE CODIGO= ? ");
                consulta.setString(1, textFieldCodigoDestino.getText());
                ResultSet resultado=consulta.executeQuery();         
                while (resultado.next()){
                    if(resultado!=null){ 
                        existe=true;
                        textFieldPais.setText(resultado.getString("PAIS"));
                        textFieldCiudad.setText(resultado.getString("CIUDAD"));
                        buttonActualizarDestino.setVisible(true);
                        buttonCrearDestino.setVisible(false);
                    }
                }
                if(existe==false){
                    JOptionPane.showMessageDialog(null, "Destino No Encontrado, Debe Crearlo");
                    buttonCrearDestino.setVisible(true);
                    buttonActualizarDestino.setVisible(false);
                    textFieldPais.setText("");
                    textFieldCiudad.setText("");
                }
            } catch (SQLException ex) {
                
            }
        }
    }//GEN-LAST:event_textFieldCodigoDestinoKeyPressed

    private void buttonActualizarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarDestinoActionPerformed
        codigoDestino=textFieldCodigoDestino.getText();
        PreparedStatement actualizar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldCodigoDestino.getText().equals("")&&!textFieldPais.getText().equals("")&&!textFieldCiudad.getText().equals("")){
                actualizar = guatex.getConnection().prepareStatement("UPDATE DESTINO SET CODIGO= ? , CIUDAD= ? , PAIS= ? WHERE"
                        + "CODIGO= ? ");
                actualizar.setString(1, textFieldCodigoDestino.getText());
                actualizar.setString(2, textFieldCiudad.getText());
                actualizar.setString(3, textFieldPais.getText());
                actualizar.setString(4, codigoDestino);
                actualizar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizacion Realizada");
                textFieldCodigoDestino.setText("");
                textFieldPais.setText("");
                textFieldCiudad.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
    }//GEN-LAST:event_buttonActualizarDestinoActionPerformed

    private void buttonCrearDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearDestinoActionPerformed
        PreparedStatement insertar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldCodigoDestino.getText().equals("")&&!textFieldCiudad.getText().equals("")
                    &&!textFieldPais.getText().equals("")){                
                insertar=guatex.getConnection().prepareStatement("INSERT INTO DESTINO VALUES ( ? , ? , ? )");
                insertar.setString(1, textFieldCodigoDestino.getText());
                insertar.setString(2, textFieldPais.getText());
                insertar.setString(3, textFieldCiudad.getText());
                insertar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Creacion Realizada");
                textFieldCodigoDestino.setText("");
                textFieldPais.setText("");
                textFieldCiudad.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
    }//GEN-LAST:event_buttonCrearDestinoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        panelPrincipal.add(internalFrameCRUDDestinos);
        internalFrameCRUDDestinos.pack();
        internalFrameCRUDDestinos.setVisible(true);
        textFieldCodigoDestino.setText("");
        textFieldPais.setText("");
        textFieldCiudad.setText("");
        buttonCrearDestino.setVisible(false);
        buttonActualizarDestino.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void textFieldNumeroRutaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNumeroRutaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            boolean existe=false;
            Guatex guatex = new Guatex();
            PreparedStatement consulta;
            try {
                consulta = guatex.getConnection().prepareStatement("SELECT ESTADO FROM RUTA WHERE CODIGO_DESTINO= ? AND NUMERO= ? ");
                consulta.setString(1, textFieldDestino_ruta.getText());
                consulta.setInt(2, Integer.valueOf(textFieldNumeroRuta.getText()));
                ResultSet resultado=consulta.executeQuery();         
                while (resultado.next()){
                    if(resultado!=null){ 
                        existe=true;
                        if(resultado.getInt("ESTADO")==0){
                            radioButtonRutaInactiva.setSelected(true);
                        }else{
                            radioButtonRutaActiva.setSelected(true);
                        }
                        buttonActualizarRuta.setVisible(true);
                        buttonCrearRuta.setVisible(false);
                    }
                }
                if(existe==false){
                    JOptionPane.showMessageDialog(null, "Destino Y Ruta No Encontrados, Debe Crearlo");
                    buttonCrearRuta.setVisible(true);
                    buttonActualizarRuta.setVisible(false);
                    textFieldDestino_ruta.setText("");
                    textFieldNumeroRuta.setText("");
                }
            } catch (SQLException ex) {
            
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El Numero De Ruta Es Incorrecto");
            }
        }
    }//GEN-LAST:event_textFieldNumeroRutaKeyPressed

    private void buttonActualizarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarRutaActionPerformed
        PreparedStatement actualizar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldDestino_ruta.getText().equals("")&&!textFieldNumeroRuta.getText().equals("")
                    &&(radioButtonRutaActiva.isSelected()||radioButtonRutaInactiva.isSelected())){
                actualizar = guatex.getConnection().prepareStatement("UPDATE RUTA SET ESTADO= ? WHERE CODIGO_DESTINO= ? AND NUMERO= ? ");
                actualizar.setString(2, textFieldCiudad.getText());
                actualizar.setString(3, textFieldPais.getText());
                if(radioButtonRutaActiva.isSelected()){
                    actualizar.setInt(1, 1);                    
                    actualizar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Actualizacion Realizada");
                    textFieldDestino_ruta.setText("");
                    textFieldNumeroRuta.setText("");
                    buttonGroupEstadoRuta.clearSelection();
                }else if(radioButtonRutaInactiva.isSelected()){
                    actualizar.setInt(1, 0);                    
                    actualizar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Actualizacion Realizada");
                    textFieldDestino_ruta.setText("");
                    textFieldNumeroRuta.setText("");
                    buttonGroupEstadoRuta.clearSelection();
                }else{
                    JOptionPane.showMessageDialog(null, "Por Favor Marque Un Estado Para La Ruta");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                System.out.println(ex);
        }
    }//GEN-LAST:event_buttonActualizarRutaActionPerformed

    private void buttonCrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearRutaActionPerformed
        PreparedStatement insertar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldDestino_ruta.getText().equals("")&&!textFieldNumeroRuta.getText().equals("")
                    &&(radioButtonRutaActiva.isSelected()||radioButtonRutaInactiva.isSelected())){                
                insertar=guatex.getConnection().prepareStatement("INSERT INTO RUTA VALUES ( ? , ? , ? )");
                insertar.setString(1, textFieldNumeroRuta.getText());
                insertar.setString(2, textFieldDestino_ruta.getText());
                if(radioButtonRutaActiva.isSelected()){
                    insertar.setInt(3, 1);
                    insertar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Creacion Realizada");
                    textFieldDestino_ruta.setText("");
                    textFieldNumeroRuta.setText("");
                    buttonGroupEstadoRuta.clearSelection();
                }else if(radioButtonRutaInactiva.isSelected()){
                    insertar.setInt(3, 0);
                    insertar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Creacion Realizada");
                    textFieldCodigoDestino.setText("");
                    textFieldDestino_ruta.setText("");
                    textFieldNumeroRuta.setText("");
                    buttonGroupEstadoRuta.clearSelection();
                }else{
                    JOptionPane.showMessageDialog(null, "Por Favor Marque Un Estado Para La Ruta");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Verifique Que Sus Datos Son Correctos"
                        + "\nPor Ejemplo Que El Codigo Destino Tenga Menos o 10 Caracteres y que el Destino Este Registrado");
        }
    }//GEN-LAST:event_buttonCrearRutaActionPerformed

    private void radioButtonRutaInactivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonRutaInactivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonRutaInactivaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        panelPrincipal.add(internalFrameCrudRutas);
        internalFrameCrudRutas.pack();
        internalFrameCrudRutas.setVisible(true);
        textFieldDestino_ruta.setText("");
        textFieldNumeroRuta.setText("");
        buttonGroupEstadoRuta.clearSelection();
        buttonCrearRuta.setVisible(false);
        buttonActualizarRuta.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void textFieldNumeroPtoCtrlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNumeroPtoCtrlKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            boolean existe=false;
            Guatex guatex = new Guatex();
            PreparedStatement consulta;
            try {
                consulta = guatex.getConnection().prepareStatement("SELECT * FROM PUNTOS_DE_CONTROL WHERE "
                        + "CODIGO_DESTINO= ? AND NUMERO= ? AND NUMERO_DE_RUTA= ? ");
                consulta.setString(1, textFieldDestino_PtoCtrl.getText());
                consulta.setInt(2, Integer.valueOf(textFieldNumeroPtoCtrl.getText()));
                consulta.setInt(3, Integer.valueOf(textFieldNumeroRuta_PtoCtrl.getText()));
                ResultSet resultado=consulta.executeQuery();         
                while (resultado.next()){
                    if(resultado!=null){ 
                        existe=true;
                        if(resultado.getInt("TIPO_DE_TARIFA")==0){
                            radioButtonTarfiaGlobal.setSelected(true);
                        }else{
                            radioButtonTarfiaPropia.setSelected(true);
                        }
                        if(resultado.getInt("ESTADO")==0){
                            radioButtonPuntoInactivo.setSelected(true);
                        }else{
                            radioButtonPuntoActivo.setSelected(true);
                        }
                        textFieldLocalizacionPunto.setText(resultado.getString("LOCALIZACION"));
                        buttonActualizarPunto.setVisible(true);
                        buttonCrearPunto.setVisible(false);
                    }
                }
                if(existe==false){
                    JOptionPane.showMessageDialog(null, "Punto De Control No Encontrado, Debe Crearlo");
                    buttonActualizarPunto.setVisible(false);
                     buttonCrearPunto.setVisible(true);
                    textFieldDestino_ruta.setText("");
                    textFieldNumeroRuta.setText("");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Verifique sus datos, Como Por ejemplo que todos los campos esten llenos"
                        + "\ny que el codigo de destino tenga 10 caracteres o menos.");
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El Numero De Ruta Es Incorrecto");
            }
        }
    }//GEN-LAST:event_textFieldNumeroPtoCtrlKeyPressed

    private void buttonActualizarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarPuntoActionPerformed
        PreparedStatement actualizar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldDestino_PtoCtrl.getText().equals("")&&!textFieldNumeroRuta_PtoCtrl.getText().equals("")
                    &&!textFieldNumeroPtoCtrl.getText().equals("")&&!textFieldLocalizacionPunto.getText().equals("")
                    &&(radioButtonTarfiaGlobal.isSelected()||radioButtonTarfiaPropia.isSelected())
                    &&(radioButtonPuntoActivo.isSelected()||radioButtonPuntoInactivo.isSelected())){
                actualizar = guatex.getConnection().prepareStatement("UPDATE PUNTOS_DE_CONTROL"
                        + " SET TIPO_DE_TARIFA= ? ,ESTADO= ? ,LOCALIZACION= ? WHERE CODIGO_DESTINO= ? "
                        + "AND NUMERO= ? AND NUMERO_DE_RUTA= ? ");
                if(radioButtonTarfiaGlobal.isSelected()){
                    actualizar.setInt(1, 0);
                }else{
                    actualizar.setInt(1, 1);
                }
                if(radioButtonPuntoActivo.isSelected()){
                    actualizar.setInt(2, 1);
                }else{
                    actualizar.setInt(2, 0);
                }
                actualizar.setString(3, textFieldLocalizacionPunto.getText());
                actualizar.setString(4, textFieldDestino_PtoCtrl.getText());
                actualizar.setInt(5, Integer.valueOf(textFieldNumeroPtoCtrl.getText()));
                actualizar.setInt(6, Integer.valueOf(textFieldNumeroRuta_PtoCtrl.getText()));
                JOptionPane.showMessageDialog(null, "Actualizacion Completa");
                actualizar.executeUpdate();
                textFieldDestino_PtoCtrl.setText("");
                textFieldNumeroRuta_PtoCtrl.setText("");
                textFieldNumeroPtoCtrl.setText("");
                textFieldLocalizacionPunto.setText("");
                buttonActualizarPunto.setVisible(false);
                buttonCrearPunto.setVisible(false);
                buttonGroupTarifaPtoCtrl.clearSelection();
                buttonGroupEstadoPunto.clearSelection();
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Verifique sus datos, Como Por ejemplo que todos los campos esten llenos"
                        + "\ny que el codigo de destino tenga 10 caracteres o menos y que los datos esten registrados");
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "formato de datos Incorrecto, verifique");
        }
    }//GEN-LAST:event_buttonActualizarPuntoActionPerformed

    private void buttonCrearPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearPuntoActionPerformed
        PreparedStatement actualizar;
        Guatex guatex = new Guatex();
        try {
            if(!textFieldDestino_PtoCtrl.getText().equals("")&&!textFieldNumeroRuta_PtoCtrl.getText().equals("")
                    &&!textFieldNumeroPtoCtrl.getText().equals("")&&!textFieldLocalizacionPunto.getText().equals("")
                    &&(radioButtonTarfiaGlobal.isSelected()||radioButtonTarfiaPropia.isSelected())
                    &&(radioButtonPuntoActivo.isSelected()||radioButtonPuntoInactivo.isSelected())){
                actualizar = guatex.getConnection().prepareStatement("INSERT INTO PUNTOS_DE_CONTROL VALUES( ? , ? , ? , ? , ? , ? )");
                actualizar.setInt(1, Integer.valueOf(textFieldNumeroPtoCtrl.getText()));
                if(radioButtonTarfiaGlobal.isSelected()){
                    actualizar.setInt(2, 0);
                }else if(radioButtonTarfiaPropia.isSelected()){
                    actualizar.setInt(2, 1);
                }
                actualizar.setInt(3, Integer.valueOf(textFieldNumeroRuta_PtoCtrl.getText()));
                actualizar.setString(4, textFieldDestino_PtoCtrl.getText());
                actualizar.setString(5, textFieldLocalizacionPunto.getText());
                if(radioButtonPuntoActivo.isSelected()){
                    actualizar.setInt(6, 1);
                }else if(radioButtonPuntoInactivo.isSelected()){
                    actualizar.setInt(6, 0);
                }
                actualizar.executeUpdate();
                textFieldDestino_PtoCtrl.setText("");
                textFieldNumeroRuta_PtoCtrl.setText("");
                textFieldNumeroPtoCtrl.setText("");
                textFieldLocalizacionPunto.setText("");
                buttonActualizarPunto.setVisible(false);
                buttonCrearPunto.setVisible(false);
                buttonGroupTarifaPtoCtrl.clearSelection();
                buttonGroupEstadoPunto.clearSelection();
                JOptionPane.showMessageDialog(null, "Registro Completo");
            }else{
                JOptionPane.showMessageDialog(null, "La Informacion Debe Estar Completa");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Verifique sus datos, Como Por ejemplo que todos los campos esten llenos"
                        + "\ny que el codigo de destino tenga 10 caracteres o menos y que los datos esten registrados");
                System.out.println(ex);
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "formato de datos Incorrecto, verifique");
        }
    }//GEN-LAST:event_buttonCrearPuntoActionPerformed

    private void radioButtonPuntoInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonPuntoInactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonPuntoInactivoActionPerformed

    private void textFieldNumeroRuta_PtoCtrlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNumeroRuta_PtoCtrlKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroRuta_PtoCtrlKeyPressed

    private void radioButtonTarfiaPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonTarfiaPropiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonTarfiaPropiaActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        textFieldDestino_PtoCtrl.setText("");
        textFieldNumeroRuta_PtoCtrl.setText("");
        textFieldNumeroPtoCtrl.setText("");
        textFieldLocalizacionPunto.setText("");
        buttonActualizarPunto.setVisible(false);
        buttonCrearPunto.setVisible(false);
        buttonGroupTarifaPtoCtrl.clearSelection();
        buttonGroupEstadoPunto.clearSelection();
        panelPrincipal.add(internalFramePtosCtrol);
        internalFramePtosCtrol.pack();
        internalFramePtosCtrol.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizarDestino;
    private javax.swing.JButton buttonActualizarInfo;
    private javax.swing.JButton buttonActualizarPunto;
    private javax.swing.JButton buttonActualizarRuta;
    private javax.swing.JButton buttonCrearDestino;
    private javax.swing.JButton buttonCrearPunto;
    private javax.swing.JButton buttonCrearRuta;
    private javax.swing.JButton buttonCrearUsuario;
    private javax.swing.ButtonGroup buttonGroupEstadoPunto;
    private javax.swing.ButtonGroup buttonGroupEstadoRuta;
    private javax.swing.ButtonGroup buttonGroupEstadoUsuario;
    private javax.swing.ButtonGroup buttonGroupGerarquiaUsuario;
    private javax.swing.ButtonGroup buttonGroupTarifaPtoCtrl;
    private javax.swing.JInternalFrame internalFrameCRUDDestinos;
    private javax.swing.JInternalFrame internalFrameCrudRutas;
    private javax.swing.JInternalFrame internalFrameCrudUsuarios;
    private javax.swing.JInternalFrame internalFramePtosCtrol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelPressEnter;
    private javax.swing.JLabel labelPressEnter1;
    private javax.swing.JMenu menuCrud;
    private javax.swing.JMenu menuCuenta;
    private javax.swing.JMenu menuListados;
    private javax.swing.JMenu menuOpcionesAdministrador;
    private javax.swing.JMenu menuOpcionesOperador;
    private javax.swing.JMenu menuOpcionesRecepcionista;
    private javax.swing.JDesktopPane panelPrincipal;
    private javax.swing.JRadioButton radioButtonAdministrador;
    private javax.swing.JRadioButton radioButtonEstadoActivo;
    private javax.swing.JRadioButton radioButtonEstadoInactivo;
    private javax.swing.JRadioButton radioButtonOperadores;
    private javax.swing.JRadioButton radioButtonPuntoActivo;
    private javax.swing.JRadioButton radioButtonPuntoInactivo;
    private javax.swing.JRadioButton radioButtonRecepcionistas;
    private javax.swing.JRadioButton radioButtonRutaActiva;
    private javax.swing.JRadioButton radioButtonRutaInactiva;
    private javax.swing.JRadioButton radioButtonTarfiaGlobal;
    private javax.swing.JRadioButton radioButtonTarfiaPropia;
    private javax.swing.JTextField textFieldCiudad;
    private javax.swing.JTextField textFieldCodigoDestino;
    private javax.swing.JTextField textFieldCodigoUsuario;
    private javax.swing.JTextField textFieldContraseñaUsuario;
    private javax.swing.JTextField textFieldDestino_PtoCtrl;
    private javax.swing.JTextField textFieldDestino_ruta;
    private javax.swing.JTextField textFieldLocalizacionPunto;
    private javax.swing.JTextField textFieldNombreUsuario;
    private javax.swing.JTextField textFieldNumeroPtoCtrl;
    private javax.swing.JTextField textFieldNumeroRuta;
    private javax.swing.JTextField textFieldNumeroRuta_PtoCtrl;
    private javax.swing.JTextField textFieldPais;
    // End of variables declaration//GEN-END:variables
}
