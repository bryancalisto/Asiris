package formularios;

import clases.AntiInyeccionSQL;
import clases.ConectorDB;
import clases.LimpiadorDeEntrada;
import clases.ProvinciaCiudad;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Calendar;
import javafx.scene.control.DatePicker;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio Mero
 */
public class Pantalla_principal extends javax.swing.JFrame {

    boolean admin = false;
    int flagFecha;
    LimpiadorDeEntrada limpiador = new LimpiadorDeEntrada();
    AntiInyeccionSQL antiSQL = new AntiInyeccionSQL();
    ProvinciaCiudad provCiud = new ProvinciaCiudad();
    ConectorDB con = new ConectorDB();
    /**
     * Creates new form Pantalla_principal
     * @param es_admin
     */
    
    public Pantalla_principal(){
        initComponents();
        this.setLocationRelativeTo(this); //Centrar pantalla  
        jLabel3.setText("");
        
        // Inicializamos elementos de paginas.
        // Provincias y cantones.
        provCiud.cargarComboProvincias(comboProv);
             
        
        if (!this.admin)
            btn_registrar_personal.setVisible(false); 
    }
    
    public Pantalla_principal(boolean es_admin) {
        initComponents();
        this.setLocationRelativeTo(this); //Centrar pantalla  
        
        // Definimos si es administrador aqui en la clase.
        this.admin = es_admin;
        
        // Si no es usuario administrador, esconda boton de registrar usuarios.
        if (!es_admin){
            btn_registrar_personal.setVisible(false); 
            btn_crear_usuario.setVisible(false);
        }
        
        // Inicializamos elementos de panel opcion "registrar trabajador".
        // Provincias y cantones.
        //provCiud.cargarComboProvincias(comboProv);
        // Profesiones.
        String query = "SELECT ID_CARGO, NOMBRE_CARGO FROM CARGO";
        //ResultSet rs = con.consultar(query);
        
        //try{
        //    while(rs.next()){
        //        comboProfesion.addItem(rs.getString("NOMBRE_CARGO"));
        //    }
        //}
        //catch(SQLException ex){
            
        //}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_registrar_personal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_crear_usuario = new javax.swing.JButton();
        LayeredPane = new javax.swing.JLayeredPane();
        Opc_regist_personal = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        comboProfesion = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        comboProv = new javax.swing.JComboBox<>();
        comboCiud = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        dateChooNacim = new com.toedter.calendar.JDateChooser();
        dateChooIngreso = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Opc_crear_usuario = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_menu.setBackground(new java.awt.Color(204, 204, 204));
        pnl_menu.setPreferredSize(new java.awt.Dimension(200, 439));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-menu.png"))); // NOI18N

        btn_registrar_personal.setBackground(new java.awt.Color(0, 153, 204));
        btn_registrar_personal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_registrar_personal.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_personal.setText("Registrar personal");
        btn_registrar_personal.setContentAreaFilled(false);
        btn_registrar_personal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar_personal.setOpaque(true);
        btn_registrar_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_personalActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Historias clínicas");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agendar citas");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar paciente");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        btn_crear_usuario.setBackground(new java.awt.Color(0, 153, 204));
        btn_crear_usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_crear_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_usuario.setText("Crear usuario");
        btn_crear_usuario.setContentAreaFilled(false);
        btn_crear_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear_usuario.setOpaque(true);
        btn_crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_registrar_personal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_crear_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(108, 108, 108)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_registrar_personal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        LayeredPane.setBackground(new java.awt.Color(204, 255, 204));
        LayeredPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LayeredPane.setLayout(new java.awt.CardLayout());

        Opc_regist_personal.setBackground(new java.awt.Color(255, 255, 255));
        Opc_regist_personal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5));
        Opc_regist_personal.setAlignmentX(0.0F);
        Opc_regist_personal.setAlignmentY(0.0F);
        Opc_regist_personal.setMinimumSize(new java.awt.Dimension(838, 573));
        Opc_regist_personal.setPreferredSize(new java.awt.Dimension(838, 573));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Registrar Trabajador");

        jLabel14.setText("Primer nombre");

        jLabel15.setText("Segundo nombre");

        jLabel16.setText("Primer apellido");

        jLabel17.setText("Segundo apellido");

        jLabel18.setText("Identificación");

        jLabel19.setText("Teléfono");

        jLabel21.setText("Dirección");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "HOMBRE", "MUJER" }));

        jTextField1.setMargin(new java.awt.Insets(3, 6, 3, 6));
        jTextField1.setMinimumSize(new java.awt.Dimension(51, 43));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 16));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });

        jLabel20.setText("Sexo");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel23.setText("Profesión");

        comboProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));

        jLabel24.setText("Fecha nacimiento");

        jLabel25.setText("Lugar de nacimiento");

        comboProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        comboProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProvActionPerformed(evt);
            }
        });

        comboCiud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));

        jLabel26.setText("Fecha Ingreso ");

        dateChooNacim.setDateFormatString("yyyy-MM-dd");
        dateChooNacim.setMaxSelectableDate(new java.util.Date(4102466480000L));
        dateChooNacim.setMinSelectableDate(new java.util.Date(-946749520000L));
        dateChooNacim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooNacimPropertyChange(evt);
            }
        });

        dateChooIngreso.setDateFormatString("yyyy-MM-dd");
        dateChooIngreso.setMaxSelectableDate(new java.util.Date(4102466498000L));
        dateChooIngreso.setMinSelectableDate(new java.util.Date(-946749502000L));
        dateChooIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooIngresoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout Opc_regist_personalLayout = new javax.swing.GroupLayout(Opc_regist_personal);
        Opc_regist_personal.setLayout(Opc_regist_personalLayout);
        Opc_regist_personalLayout.setHorizontalGroup(
            Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel15))
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opc_regist_personalLayout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addGap(18, 18, 18)))
                                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField11)
                                            .addComponent(jTextField12)
                                            .addComponent(jTextField13)
                                            .addComponent(jTextField14)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(dateChooNacim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)))
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel20))
                                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel23))
                                    .addComponent(comboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateChooIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113))
                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                                .addComponent(comboProv, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCiud, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21))
                        .addGap(194, 353, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opc_regist_personalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opc_regist_personalLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opc_regist_personalLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(315, 315, 315))))
        );
        Opc_regist_personalLayout.setVerticalGroup(
            Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addGap(49, 49, 49)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Opc_regist_personalLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel24)
                        .addComponent(jLabel26))
                    .addComponent(dateChooNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(19, 19, 19)
                .addGroup(Opc_regist_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCiud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        LayeredPane.add(Opc_regist_personal, "card3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        LayeredPane.add(jPanel4, "card4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        LayeredPane.add(jPanel5, "card5");

        Opc_crear_usuario.setBackground(new java.awt.Color(235, 253, 250));

        jLabel5.setText("Nombre");

        jLabel6.setText("Apellido");

        jLabel7.setText("Cedula");

        jLabel8.setText("Celular");

        jLabel9.setText("Correo");

        jLabel4.setText("Nombre de acceso");

        jLabel10.setText("Contrasena");

        jLabel11.setText("Confirmar contrasena");

        jLabel12.setText("Creacion de usuario");

        jButton1.setText("Crear usuario");

        javax.swing.GroupLayout Opc_crear_usuarioLayout = new javax.swing.GroupLayout(Opc_crear_usuario);
        Opc_crear_usuario.setLayout(Opc_crear_usuarioLayout);
        Opc_crear_usuarioLayout.setHorizontalGroup(
            Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opc_crear_usuarioLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(38, 38, 38)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opc_crear_usuarioLayout.createSequentialGroup()
                                .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(38, 38, 38)
                                .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(98, 98, 98))
                    .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Opc_crear_usuarioLayout.setVerticalGroup(
            Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(66, 66, 66)
                .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Opc_crear_usuarioLayout.createSequentialGroup()
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Opc_crear_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        LayeredPane.add(Opc_crear_usuario, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(LayeredPane)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        desresaltar_boton(jButton5);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        resaltar_boton(jButton5);
    }//GEN-LAST:event_jButton5MouseEntered

    private void btn_registrar_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_personalActionPerformed
        LayeredPane.removeAll();
        LayeredPane.add(Opc_regist_personal);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }//GEN-LAST:event_btn_registrar_personalActionPerformed

    private void btn_crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_usuarioActionPerformed
        LayeredPane.removeAll();
        LayeredPane.add(Opc_crear_usuario);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }//GEN-LAST:event_btn_crear_usuarioActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombre1 = jTextField1.getText();
        String nombre2 = jTextField10.getText();
        String apellido1 = jTextField11.getText();
        String apellido2 = jTextField12.getText();
        String identificacion = jTextField13.getText();
        String telefono = jTextField14.getText();
        String direccion = antiSQL.limpiar_string(jTextField15.getText());
    
        // VALIDACIONES.
        int flagFechaNacim = limpiador.validarFecha(dateChooNacim,"1940-01-01","2000-01-01");
        int flagFechaIngreso = limpiador.validarFecha(dateChooNacim,"1940-01-01","0");
        
        // Primer nombre.
        if (nombre1.isEmpty() || nombre1.length() > 20)        
        {
            JOptionPane.showMessageDialog(this, "Ingrese el primer nombre del trabajador.");
            return;
        }
        
        // Segundo nombre.
        if (nombre2.isEmpty() || nombre2.length() > 20)
        {
            JOptionPane.showMessageDialog(this, "Ingrese el segundo nombre del trabajador.");
            return;
        }
        
        // Primer apellido.
        else if (apellido1.isEmpty() || apellido1.length() > 20)
        {
            JOptionPane.showMessageDialog(this, "Ingrese el primer apellido del trabajador.");
            return;
        }
        // Segundo apellido.
        else if(!apellido2.isEmpty() && apellido2.length() > 20)
        {
            JOptionPane.showMessageDialog(this, "Ingrese el segundo apellido del trabajador.");
            return;
        }
        // Identificacion.
        else if (identificacion.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese la identificación del trabajador.");
            return;
        }
        else if (!limpiador.ValidarCedula(identificacion)){
            JOptionPane.showMessageDialog(this, "El número de identificación del trabajador no es válido.");
            return;
        }
        // Telefono.
        else if (telefono.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese el teléfono del trabajador.");
            return;
        }
        //else if (!limpiador.soloEnteros(telefono) || telefono.length() > 10){
        else if (!limpiador.soloEnteros(telefono) || (telefono.length() < 9 || telefono.length() > 10 )      ){
            JOptionPane.showMessageDialog(this, "Ingrese un teléfono válido, Ej. 023456789 o 0987654321.");
            return;
        }
        // Direccion.
        else if (direccion.isEmpty() || direccion.length() > 60)
        {
            JOptionPane.showMessageDialog(this, "Ingrese la dirección del trabajador.");
            return;
        }
        // Tipo de identificacion.
        //else if (comboIdentificacion.getSelectedIndex() == 0){
        //    JOptionPane.showMessageDialog(this, "Seleccione el tipo de identificación del trabajador.");
        //    return;
        //}
        // Sexo.
        else if (comboSexo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Seleccione sexo del trabajador.");
            return;
        }
        // Fechas.
        else if (limpiador.validarFecha(dateChooNacim,"1940-01-01","2000-01-01") != 0){
            JOptionPane.showMessageDialog(this, "Seleccione una fecha de nacimiento válida.");
            return;
        }
        else if (flagFechaNacim != 0){
            switch(flagFechaNacim){
                case -2:
                    JOptionPane.showMessageDialog(this, "Seleccione una fecha de nacimiento mayor a 1940.");
                    break;
                case -3:
                    JOptionPane.showMessageDialog(this, "Seleccione una fecha de nacimiento válida.");
                    break;
            }
        }
        
        else if (flagFechaIngreso != 0){
            switch(flagFechaIngreso){
                case -2:
                    JOptionPane.showMessageDialog(this, "Seleccione una fecha de ingreso mayor a 1940.");
                    break;
                case -3:
                    JOptionPane.showMessageDialog(this, "Seleccione una fecha de ingreso válida.");
                    break;
            }
        }
        
        else if (comboProv.getSelectedIndex() == 0 || comboCiud.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Seleccione Provincia y canton de nacimiento.");
            return;
        }
        // FIN VALIDACION.
        
        /////////////////////////////////////////////////////////////////////////////////// ADECUAR A BD.
        // verificamos que cedula no este registrada.
        String query = "SELECT cedula FROM trabajador where cedula='"+ identificacion +"'";
        
        ResultSet rs = con.consultar(query);
        
        try{
            if (rs.next()){
                JOptionPane.showMessageDialog(this, "Trabajador ya registrado.");
                return;
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, "Ha habido un error inesperado.");
            return;
        }
        
        // Insertamos nuevo trabajador.
        query = "INSERT INTO trabajador (primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,"
                + ",identificacion,telefono,direccion, sexo, id_profesion) VALUES ('"+ nombre1 +"','"+
                nombre2 +"','"+ apellido1 +"','" + apellido2 + "','" + identificacion + "','','','',"
                + "'','','')";
        
        /////////////////////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Consumimos evento de tecla presionada cuando el largo de la string es mayor al especificado.
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        limpiador.soloLetrasEspacios(evt, jTextField1, 20);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        limpiador.soloLetrasEspacios(evt, jTextField10, 20);
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        limpiador.soloLetrasEspacios(evt, jTextField11, 20);
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        limpiador.soloLetrasEspacios(evt, jTextField12, 20);
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        limpiador.soloNumeros(evt, jTextField13, 10);
        //limpiador.ValidarCedula(jTextField13.getText());
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        limpiador.soloNumeros(evt, jTextField14, 10);
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        limpiador.NumerosLetrasEspacios(evt, jTextField15, 60);
    }//GEN-LAST:event_jTextField15KeyTyped

    private void comboProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProvActionPerformed
        //Cuando se selecciona una provincia.
        String provSelecc = String.valueOf(this.comboProv.getSelectedItem());

        provCiud.cargarComboCiudades(comboCiud, provSelecc);
    }//GEN-LAST:event_comboProvActionPerformed

    private void dateChooNacimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooNacimPropertyChange
        // Verificamos validez de fecha seleccionada.
        Date fechaNacim = dateChooNacim.getDate();
        Instant hace18Anos = ZonedDateTime.now().minusYears(18).toInstant();
        if (!(fechaNacim == null)){
            if (fechaNacim.toInstant().isAfter(ZonedDateTime.now().toInstant())){
                JOptionPane.showMessageDialog(this, "Fecha seleccionada no válida");
                Date today = Calendar.getInstance().getTime();
                dateChooNacim.setDate(today);
            }
        }
    }//GEN-LAST:event_dateChooNacimPropertyChange

    private void dateChooIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooIngresoPropertyChange
        // Verificamos validez de fecha seleccionada.
        Date fechaIngreso = dateChooIngreso.getDate();
        if (!(fechaIngreso == null)){
            if (fechaIngreso.toInstant().isAfter(ZonedDateTime.now().toInstant())){
                JOptionPane.showMessageDialog(this, "Fecha seleccionada no válida");
                Date today = Calendar.getInstance().getTime();
                dateChooIngreso.setDate(today);
            }
        }
    }//GEN-LAST:event_dateChooIngresoPropertyChange
    // Funcion para cambiar color de boton (mouse entra)
    private void resaltar_boton(JButton boton){
        boton.setBackground(new Color(110,215,226));
    }

    // Funcion para cambiar color de boton (mouse entra)
    private void desresaltar_boton(JButton boton){
        boton.setBackground(new Color(0,153,204));
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
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayeredPane;
    private javax.swing.JPanel Opc_crear_usuario;
    private javax.swing.JPanel Opc_regist_personal;
    private javax.swing.JButton btn_crear_usuario;
    private javax.swing.JButton btn_registrar_personal;
    private javax.swing.JComboBox<String> comboCiud;
    private javax.swing.JComboBox<String> comboProfesion;
    private javax.swing.JComboBox<String> comboProv;
    private javax.swing.JComboBox comboSexo;
    private com.toedter.calendar.JDateChooser dateChooIngreso;
    private com.toedter.calendar.JDateChooser dateChooNacim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel pnl_menu;
    // End of variables declaration//GEN-END:variables
}
