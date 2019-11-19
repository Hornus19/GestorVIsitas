import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** @author David Grande */
public class Visita extends javax.swing.JFrame {

  int limite4 = 4, limite2 = 2;
  String log;
  int cod = 0;
  DefaultTableModel modelo;
  Connection con;
  ResultSet rs;
  Statement st;
  String driver = "com.mysql.jdbc.Driver";
  String urlMysql = "jdbc:mysql://localhost:3306/";

  public Visita(String logueado) {
    initComponents();

    bloqueoinicial();
    tablavisitas.setAutoCreateRowSorter(true);
    log = logueado;
    cargainicial();

    try {
      Class.forName(driver).newInstance();
      con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
      st = con.createStatement();
    } catch (SQLException
        | ClassNotFoundException
        | InstantiationException
        | IllegalAccessException ex) {
      Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
    }
    txtnuevoano.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            if (txtnuevoano.getText().length() == limite4) {
              e.consume();
            }
          }

          @Override
          public void keyPressed(KeyEvent arg0) {}

          @Override
          public void keyReleased(KeyEvent arg0) {}
        });
    txtnuevodia.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            if (txtnuevodia.getText().length() == limite2) {
              e.consume();
            }
          }

          @Override
          public void keyPressed(KeyEvent arg0) {}

          @Override
          public void keyReleased(KeyEvent arg0) {}
        });
    txtnuevomes.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            if (txtnuevomes.getText().length() == limite2) {
              e.consume();
            }
          }

          @Override
          public void keyPressed(KeyEvent arg0) {}

          @Override
          public void keyReleased(KeyEvent arg0) {}
        });
    txtnuevohora.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            if (txtnuevohora.getText().length() == limite2) {
              e.consume();
            }
          }

          @Override
          public void keyPressed(KeyEvent arg0) {}

          @Override
          public void keyReleased(KeyEvent arg0) {}
        });
    txtnuevomin.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            if (txtnuevomin.getText().length() == limite2) {
              e.consume();
            }
          }

          @Override
          public void keyPressed(KeyEvent arg0) {}

          @Override
          public void keyReleased(KeyEvent arg0) {}
        });
  }

  private Visita() {
    throw new UnsupportedOperationException(
        "Not supported yet."); // To change body of generated methods, choose Tools | Templates.
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablavisitas = new javax.swing.JTable();
    btnnuevovisita = new javax.swing.JButton();
    btnguardarvisita = new javax.swing.JButton();
    btnsalirvisita = new javax.swing.JButton();
    btnmodifvisita = new javax.swing.JButton();
    combobusdistribuidor = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    combobusmes = new javax.swing.JComboBox();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    combobusestado = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();
    txtbuscp = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtbusrs = new javax.swing.JTextField();
    btnbusactualizar = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel7 = new javax.swing.JLabel();
    combonuevodistri = new javax.swing.JComboBox();
    jLabel8 = new javax.swing.JLabel();
    txtnuevors = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    txtnuevopsc = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    txtnuevotlf = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    txtnuevodireccion = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    txtnuevocp = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    txtnuevodia = new javax.swing.JTextField();
    txtnuevomes = new javax.swing.JTextField();
    txtnuevoano = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    txtnuevohora = new javax.swing.JTextField();
    txtnuevomin = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    combonuevoestado = new javax.swing.JComboBox();
    jLabel19 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    txtnuevoobser = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    txtcodvisita = new javax.swing.JTextField();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    jLabel28 = new javax.swing.JLabel();
    txtnuevoop = new javax.swing.JTextField();
    txtcodteleop = new javax.swing.JLabel();
    btnhabilfiltros = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Grupo Silac 84");

    tablavisitas.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {
              "Cod_Cliente",
              "Distribuidor",
              "Razón Social",
              "Persona Contacto",
              "Telefono",
              "Dirección",
              "Código Postal",
              "Fecha",
              "Hora",
              "Estado",
              "Venta",
              "Observaciones",
              "Fecha LLamada"
            }) {
          Class[] types =
              new Class[] {
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class
              };
          boolean[] canEdit =
              new boolean[] {
                false, false, false, false, false, false, false, false, false, false, false, false,
                true
              };

          public Class getColumnClass(int columnIndex) {
            return types[columnIndex];
          }

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    tablavisitas.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablavisitasMouseClicked(evt);
          }
        });
    jScrollPane2.setViewportView(tablavisitas);

    btnnuevovisita.setText("Nuevo");
    btnnuevovisita.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnnuevovisitaActionPerformed(evt);
          }
        });

    btnguardarvisita.setText("Guardar");
    btnguardarvisita.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnguardarvisitaActionPerformed(evt);
          }
        });

    btnsalirvisita.setText("Salir");
    btnsalirvisita.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnsalirvisitaActionPerformed(evt);
          }
        });

    btnmodifvisita.setText("Modificaciones");
    btnmodifvisita.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnmodifvisitaActionPerformed(evt);
          }
        });

    combobusdistribuidor.setModel(
        new javax.swing.DefaultComboBoxModel(
            new String[] {
              "-",
              "DANTE-BARCELONA",
              "LUSANET-BARCELONA",
              "PROMOVIL-NACIONAL",
              "DUATEL-GALICIA",
              "PLANETA VOZ-VIGO",
              "OSCAR-MADRID"
            }));

    jLabel2.setText("Distribuidor :");

    combobusmes.setModel(
        new javax.swing.DefaultComboBoxModel(
            new String[] {
              "-",
              "ENERO",
              "FEBRERO",
              "MARZO",
              "ABRIL",
              "MAYO",
              "JUNIO",
              "JULIO",
              "AGOSTO",
              "SEPTIEMBRE",
              "OCTUBRE",
              "NOVIEMBRE",
              "DICIEMBRE"
            }));

    jLabel3.setText("Mes :");

    jLabel4.setText("Estado :");

    combobusestado.setModel(
        new javax.swing.DefaultComboBoxModel(
            new String[] {
              "-",
              "PENDIENTE",
              "ATRASADA",
              "OK",
              "KO",
              "RELLAMADA",
              "ERRONEO",
              "ILOCALIZABLE",
              "NO INTERESADO",
              "ENVIADA",
              "DUPLICADO"
            }));

    jLabel5.setText("CP :");

    jLabel6.setText("Razón Social :");

    btnbusactualizar.setText("Actualizar");
    btnbusactualizar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnbusactualizarActionPerformed(evt);
          }
        });

    jLabel7.setText("Distribuidor :");

    combonuevodistri.setModel(
        new javax.swing.DefaultComboBoxModel(
            new String[] {
              "-",
              "DANTE-BARCELONA",
              "LUSANET-BARCELONA",
              "PROMOVIL-NACIONAL",
              "DUATEL-GALICIA",
              "PLANETA VOZ-VIGO",
              "OSCAR-MADRID"
            }));

    jLabel8.setText("Razón Social :");

    jLabel9.setText("Persona Contacto :");

    jLabel10.setText("Teléfono :");

    txtnuevotlf.setToolTipText("");
    txtnuevotlf.addFocusListener(
        new java.awt.event.FocusAdapter() {
          public void focusLost(java.awt.event.FocusEvent evt) {
            txtnuevotlfFocusLost(evt);
          }
        });

    jLabel11.setText("Dirección : ");

    jLabel12.setText("Código Postal :");

    txtnuevocp.addFocusListener(
        new java.awt.event.FocusAdapter() {
          public void focusLost(java.awt.event.FocusEvent evt) {
            txtnuevocpFocusLost(evt);
          }
        });
    txtnuevocp.addKeyListener(
        new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtnuevocpKeyTyped(evt);
          }
        });

    jLabel13.setText("Fecha :");

    jLabel14.setText("Hora :");

    txtnuevomin.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtnuevominActionPerformed(evt);
          }
        });

    jLabel15.setText(":");

    jLabel16.setText("Estado :");

    combonuevoestado.setModel(
        new javax.swing.DefaultComboBoxModel(
            new String[] {
              "-",
              "PENDIENTE",
              "ATRASADA",
              "OK",
              "KO",
              "RELLAMADA",
              "ERRONEO",
              "ILOCALIZABLE",
              "NO INTERESADO",
              "ENVIADA",
              "DUPLICADO"
            }));

    jLabel19.setText("Observaciones :");

    txtnuevoobser.setColumns(20);
    txtnuevoobser.setRows(5);
    jScrollPane3.setViewportView(txtnuevoobser);

    jLabel1.setText("Cod_Visita :");

    txtcodvisita.addFocusListener(
        new java.awt.event.FocusAdapter() {
          public void focusLost(java.awt.event.FocusEvent evt) {
            txtcodvisitaFocusLost(evt);
          }
        });

    jLabel20.setText("Día");

    jLabel21.setText("Mes");

    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel22.setText("Año");

    jLabel23.setText("Hora");

    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel24.setText("Min");

    jLabel25.setText("-");

    jLabel26.setText("-");

    jLabel28.setText("Operador :");

    btnhabilfiltros.setText("Filtros");
    btnhabilfiltros.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnhabilfiltrosActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(
                        jScrollPane2,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        989,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(btnnuevovisita)
                                                    .addGap(112, 112, 112)
                                                    .addComponent(btnmodifvisita))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(7, 7, 7)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(
                                                                combobusdistribuidor,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                143,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))))
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                txtbusrs,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                176,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addGroup(
                                                                jPanel1Layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(jLabel3)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .RELATED)
                                                                    .addComponent(
                                                                        combobusmes,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        106,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addGap(46, 46, 46)
                                                                    .addComponent(jLabel4)))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                combobusestado,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                184,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(
                                                                btnbusactualizar,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                112,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGap(149, 149, 149)
                                                    .addComponent(btnhabilfiltros)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addComponent(btnguardarvisita)))
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGap(180, 180, 180)
                                                    .addComponent(btnsalirvisita))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(
                                                        jLabel5,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        txtbuscp,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        43,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        txtcodvisita,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        39,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        false)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createSequentialGroup()
                                                            .addComponent(jLabel28)
                                                            .addPreferredGap(
                                                                javax.swing.LayoutStyle
                                                                    .ComponentPlacement.UNRELATED)
                                                            .addComponent(txtnuevoop))
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createSequentialGroup()
                                                            .addComponent(jLabel7)
                                                            .addPreferredGap(
                                                                javax.swing.LayoutStyle
                                                                    .ComponentPlacement.RELATED)
                                                            .addComponent(
                                                                combonuevodistri,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                144,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createSequentialGroup()
                                                            .addComponent(jLabel10)
                                                            .addPreferredGap(
                                                                javax.swing.LayoutStyle
                                                                    .ComponentPlacement.UNRELATED)
                                                            .addComponent(txtnuevotlf)))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        txtnuevopsc,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        241,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                txtcodteleop,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jLabel11))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(txtnuevodireccion)
                                                            .addComponent(txtnuevors)))
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING)
                                                            .addGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING,
                                                                jPanel1Layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(
                                                                        jLabel16,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .UNRELATED)
                                                                    .addComponent(
                                                                        combonuevoestado,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        146,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE))
                                                            .addGroup(
                                                                jPanel1Layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(jLabel12)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .RELATED,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                    .addComponent(
                                                                        txtnuevocp,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        50,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addGap(58, 58, 58)
                                                                    .addComponent(jLabel13)))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                jLabel20,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                26,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(
                                                                txtnuevodia,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                26,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(jLabel25)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addGroup(
                                                                jPanel1Layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(
                                                                        jLabel21,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        26,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addGap(15, 15, 15)
                                                                    .addComponent(
                                                                        jLabel22,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        52,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE))
                                                            .addGroup(
                                                                jPanel1Layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(
                                                                        txtnuevomes,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        26,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .RELATED)
                                                                    .addComponent(jLabel26)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .RELATED)
                                                                    .addComponent(
                                                                        txtnuevoano,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        41,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)))
                                                    .addGap(28, 28, 28)
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                txtnuevohora,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                28,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(jLabel23))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING,
                                                                false)
                                                            .addComponent(
                                                                jLabel24,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                            .addComponent(
                                                                txtnuevomin,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                28,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addGap(50, 50, 50))))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addComponent(
                        jScrollPane2,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        183,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                combobusdistribuidor,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(
                                combobusmes,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(
                                combobusestado,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(
                                txtbuscp,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(
                                txtbusrs,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                btnbusactualizar,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                24,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(
                                txtcodvisita,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addComponent(
                        jSeparator1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(
                                combonuevodistri,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(
                                txtnuevors,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(
                                txtnuevodireccion,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txtcodteleop,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                24,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(
                                txtnuevopsc,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22))
                                    .addGap(6, 6, 6)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(
                                                txtnuevodia,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(
                                                txtnuevohora,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                txtnuevomin,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel25)
                                            .addComponent(
                                                txtnuevomes,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnuevoano)
                                            .addComponent(jLabel10)
                                            .addComponent(
                                                txtnuevotlf,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(
                                                txtnuevocp,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel26))
                    .addGap(15, 15, 15)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(
                                txtnuevoop,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(
                                combonuevoestado,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel19)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        jScrollPane3,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        123,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevovisita)
                            .addComponent(btnguardarvisita)
                            .addComponent(btnsalirvisita)
                            .addComponent(btnmodifvisita)
                            .addComponent(btnhabilfiltros))
                    .addGap(8, 8, 8)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel1,
                javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(
                jPanel1,
                javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));

    pack();
  } 

  private void btnnuevovisitaActionPerformed(
      java.awt.event.ActionEvent evt) {
    bloqueonuevo();
  } 
  
  private void btnguardarvisitaActionPerformed(
      java.awt.event.ActionEvent evt) { 
    if (cod == 0) {

      if (!txtnuevors.getText().equalsIgnoreCase("")) {
        if (!txtnuevotlf.getText().equalsIgnoreCase("")) {
          if (!combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("-")) {
            if (!combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("OK")
                || !combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("KO")) {
              if (combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("PENDIENTE")) {
                if (!txtnuevoop.getText().equalsIgnoreCase("")
                    && !combonuevodistri.getSelectedItem().toString().equalsIgnoreCase("-")) {
                  if (!txtnuevoano.getText().toString().equalsIgnoreCase("0000")
                      && !txtnuevomes.getText().toString().equalsIgnoreCase("00")
                      && !txtnuevodia.getText().toString().equalsIgnoreCase("00")
                      && !txtnuevohora.getText().toString().equalsIgnoreCase("00")) {
                    try {
                      if (txtnuevoano.getText().equalsIgnoreCase("")) {
                        txtnuevoano.setText("0000");
                      }
                      if (txtnuevomes.getText().equalsIgnoreCase("")) {
                        txtnuevomes.setText("00");
                      }
                      if (txtnuevodia.getText().equalsIgnoreCase("")) {
                        txtnuevodia.setText("00");
                      }
                      if (txtnuevohora.getText().equalsIgnoreCase("")) {
                        txtnuevohora.setText("00");
                      }
                      if (txtnuevomin.getText().equalsIgnoreCase("")) {
                        txtnuevomin.setText("00");
                      }
                      if (txtnuevopsc.getText().equalsIgnoreCase("")) {
                        txtnuevopsc.setText(" ");
                      }
                      if (txtnuevodireccion.getText().equalsIgnoreCase("")) {
                        txtnuevodireccion.setText(" ");
                      }

                      if (txtnuevoobser.getText().equalsIgnoreCase("")) {
                        txtnuevoobser.setText("N/A");
                      }
                      Calendar fecha1 = new GregorianCalendar();
                      int amo = fecha1.get(Calendar.YEAR);
                      int mes = fecha1.get(Calendar.MONTH);
                      int dia = fecha1.get(Calendar.DAY_OF_MONTH);
                      String fechafin = amo + "-" + (mes + 1) + "-" + dia;

                      String fecha =
                          txtnuevoano.getText()
                              + "-"
                              + txtnuevomes.getText()
                              + "-"
                              + txtnuevodia.getText();
                      String hora = txtnuevohora.getText() + ":" + txtnuevomin.getText();
                      boolean ok =
                          st.execute(
                              "INSERT INTO `visita` (`distribuidor`, `razonsocial`, `pcontacto`, `telefono`, `direccion`, `fecha`, `codpostal`, `hora`, `estado`"
                                  + ", `venta`, `comisionvisita`, `comisionventa`, `observaciones`, `operador`, `teleoperadora`, fechacita) "
                                  + "VALUES ('"
                                  + combonuevodistri.getSelectedItem().toString()
                                  + "', '"
                                  + txtnuevors.getText()
                                  + "', '"
                                  + txtnuevopsc.getText()
                                  + "', "
                                  + "'"
                                  + txtnuevotlf.getText()
                                  + "', '"
                                  + txtnuevodireccion.getText()
                                  + "', '"
                                  + fecha
                                  + "', '"
                                  + txtnuevocp.getText()
                                  + "', "
                                  + "'"
                                  + hora
                                  + "', '"
                                  + combonuevoestado.getSelectedItem().toString()
                                  + "', '-', '0'"
                                  + ", '0', '"
                                  + txtnuevoobser.getText()
                                  + "', '"
                                  + txtnuevoop.getText()
                                  + "', '"
                                  + log
                                  + "', '"
                                  + fechafin
                                  + "');");
                      limpiar();
                      bloqueoinicial();
                      cargainicial();
                    } catch (SQLException ex) {
                      Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Asigna un Dia y hora correctos",
                        "Error Datos",
                        JOptionPane.ERROR_MESSAGE);
                  }

                } else {
                  JOptionPane.showMessageDialog(
                      null,
                      "Asigna un Operador o Distribuidor",
                      "Error Datos",
                      JOptionPane.ERROR_MESSAGE);
                }
              } else {
                try {
                  if (txtnuevoano.getText().equalsIgnoreCase("")) {
                    txtnuevoano.setText("0000");
                  }
                  if (txtnuevomes.getText().equalsIgnoreCase("")) {
                    txtnuevomes.setText("00");
                  }
                  if (txtnuevodia.getText().equalsIgnoreCase("")) {
                    txtnuevodia.setText("00");
                  }
                  if (txtnuevohora.getText().equalsIgnoreCase("")) {
                    txtnuevohora.setText("00");
                  }
                  if (txtnuevomin.getText().equalsIgnoreCase("")) {
                    txtnuevomin.setText("00");
                  }
                  if (txtnuevopsc.getText().equalsIgnoreCase("")) {
                    txtnuevopsc.setText(" ");
                  }
                  if (txtnuevodireccion.getText().equalsIgnoreCase("")) {
                    txtnuevodireccion.setText(" ");
                  }

                  if (txtnuevoobser.getText().equalsIgnoreCase("")) {
                    txtnuevoobser.setText("N/A");
                  }
                  Calendar fecha1 = new GregorianCalendar();
                  int amo = fecha1.get(Calendar.YEAR);
                  int mes = fecha1.get(Calendar.MONTH);
                  int dia = fecha1.get(Calendar.DAY_OF_MONTH);
                  String fechafin = amo + "-" + (mes + 1) + "-" + dia;
                  String fecha =
                      txtnuevoano.getText()
                          + "-"
                          + txtnuevomes.getText()
                          + "-"
                          + txtnuevodia.getText();
                  String hora = txtnuevohora.getText() + ":" + txtnuevomin.getText();
                  boolean ok =
                      st.execute(
                          "INSERT INTO `visita` (`distribuidor`, `razonsocial`, `pcontacto`, `telefono`, `direccion`, `fecha`, `codpostal`, `hora`, `estado`"
                              + ", `venta`, `comisionvisita`, `comisionventa`, `observaciones`, `operador`, `teleoperadora`, `fechafin`) "
                              + "VALUES ('"
                              + combonuevodistri.getSelectedItem().toString()
                              + "', '"
                              + txtnuevors.getText()
                              + "', '"
                              + txtnuevopsc.getText()
                              + "', "
                              + "'"
                              + txtnuevotlf.getText()
                              + "', '"
                              + txtnuevodireccion.getText()
                              + "', '"
                              + fecha
                              + "', '"
                              + txtnuevocp.getText()
                              + "', "
                              + "'"
                              + hora
                              + "', '"
                              + combonuevoestado.getSelectedItem().toString()
                              + "', '-', '0'"
                              + ", '0', '"
                              + txtnuevoobser.getText()
                              + "', '"
                              + txtnuevoop.getText()
                              + "', '"
                              + log
                              + "', '"
                              + fechafin
                              + "');");
                  limpiar();
                  bloqueoinicial();
                  cargainicial();
                } catch (SQLException ex) {
                  Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
                }
              }
            } else {
              JOptionPane.showMessageDialog(
                  null, "No puedes poner ese estado", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
          } else {
            JOptionPane.showMessageDialog(
                null, "Asigna un estado", "Error Datos", JOptionPane.ERROR_MESSAGE);
          }
        } else {
          JOptionPane.showMessageDialog(
              null, "Falta Teléfono de contacto", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
      } else {
        JOptionPane.showMessageDialog(
            null, "Falta Razón Social", "Error Datos", JOptionPane.ERROR_MESSAGE);
      }
    } else {
      // aqui se guardaria modificaciones
      if (!txtnuevors.getText().equalsIgnoreCase("")) {
        if (!txtnuevotlf.getText().equalsIgnoreCase("")) {
          if (!combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("-")) {
            if (!combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("OK")
                && !combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("KO")) {
              if (combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("PENDIENTE")) {
                if (!txtnuevoop.getText().equalsIgnoreCase("")
                    && !combonuevodistri.getSelectedItem().toString().equalsIgnoreCase("-")) {
                  if (!txtnuevoano.getText().toString().equalsIgnoreCase("0000")
                      && !txtnuevomes.getText().toString().equalsIgnoreCase("00")
                      && !txtnuevodia.getText().toString().equalsIgnoreCase("00")
                      && !txtnuevohora.getText().toString().equalsIgnoreCase("00")) {
                    try {
                      if (txtnuevoano.getText().equalsIgnoreCase("")) {
                        txtnuevoano.setText("0000");
                      }
                      if (txtnuevomes.getText().equalsIgnoreCase("")) {
                        txtnuevomes.setText("00");
                      }
                      if (txtnuevodia.getText().equalsIgnoreCase("")) {
                        txtnuevodia.setText("00");
                      }
                      if (txtnuevohora.getText().equalsIgnoreCase("")) {
                        txtnuevohora.setText("00");
                      }
                      if (txtnuevomin.getText().equalsIgnoreCase("")) {
                        txtnuevomin.setText("00");
                      }
                      if (txtnuevopsc.getText().equalsIgnoreCase("")) {
                        txtnuevopsc.setText(" ");
                      }
                      if (txtnuevodireccion.getText().equalsIgnoreCase("")) {
                        txtnuevodireccion.setText(" ");
                      }

                      if (txtnuevoobser.getText().equalsIgnoreCase("")) {
                        txtnuevoobser.setText("N/A");
                      }
                      Calendar fecha1 = new GregorianCalendar();
                      int amo = fecha1.get(Calendar.YEAR);
                      int mes = fecha1.get(Calendar.MONTH);
                      int dia = fecha1.get(Calendar.DAY_OF_MONTH);
                      String fechafin = amo + "-" + (mes + 1) + "-" + dia;
                      String fecha =
                          txtnuevoano.getText()
                              + "-"
                              + txtnuevomes.getText()
                              + "-"
                              + txtnuevodia.getText();
                      String hora = txtnuevohora.getText() + ":" + txtnuevomin.getText();
                      st.executeUpdate(
                          "UPDATE visita set pcontacto='"
                              + txtnuevopsc.getText()
                              + "',distribuidor='"
                              + combonuevodistri.getSelectedItem().toString()
                              + "', telefono='"
                              + txtnuevotlf.getText()
                              + "' , direccion='"
                              + txtnuevodireccion.getText()
                              + "', "
                              + "fecha='"
                              + fecha
                              + "', codpostal='"
                              + txtnuevocp.getText()
                              + "',hora='"
                              + hora
                              + "',estado='"
                              + combonuevoestado.getSelectedItem().toString()
                              + "',"
                              + "venta='-',comisionvisita='0',comisionventa='0',observaciones='"
                              + txtnuevoobser.getText()
                              + "' "
                              + ",operador='"
                              + txtnuevoop.getText()
                              + "',teleoperadora='"
                              + log
                              + "',fechafin='"
                              + fechafin
                              + "'"
                              + "where visita='"
                              + cod
                              + "'");
                      limpiar();
                      bloqueoinicial();
                      cargainicial();
                    } catch (SQLException ex) {
                      Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Asigna un Dia y hora correctos",
                        "Error Datos",
                        JOptionPane.ERROR_MESSAGE);
                  }

                } else {
                  JOptionPane.showMessageDialog(
                      null,
                      "Asigna un Operador o Distribuidor",
                      "Error Datos",
                      JOptionPane.ERROR_MESSAGE);
                }
              } else {
                try {
                  if (txtnuevoano.getText().equalsIgnoreCase("")) {
                    txtnuevoano.setText("0000");
                  }
                  if (txtnuevomes.getText().equalsIgnoreCase("")) {
                    txtnuevomes.setText("00");
                  }
                  if (txtnuevodia.getText().equalsIgnoreCase("")) {
                    txtnuevodia.setText("00");
                  }
                  if (txtnuevohora.getText().equalsIgnoreCase("")) {
                    txtnuevohora.setText("00");
                  }
                  if (txtnuevomin.getText().equalsIgnoreCase("")) {
                    txtnuevomin.setText("00");
                  }
                  if (txtnuevopsc.getText().equalsIgnoreCase("")) {
                    txtnuevopsc.setText(" ");
                  }
                  if (txtnuevodireccion.getText().equalsIgnoreCase("")) {
                    txtnuevodireccion.setText(" ");
                  }

                  if (txtnuevoobser.getText().equalsIgnoreCase("")) {
                    txtnuevoobser.setText("N/A");
                  }
                  Calendar fecha1 = new GregorianCalendar();
                  int amo = fecha1.get(Calendar.YEAR);
                  int mes = fecha1.get(Calendar.MONTH);
                  int dia = fecha1.get(Calendar.DAY_OF_MONTH);
                  String fechafin = amo + "-" + (mes + 1) + "-" + dia;

                  String fecha =
                      txtnuevoano.getText()
                          + "-"
                          + txtnuevomes.getText()
                          + "-"
                          + txtnuevodia.getText();
                  String hora = txtnuevohora.getText() + ":" + txtnuevomin.getText();
                  st.executeUpdate(
                      "UPDATE visita set pcontacto='"
                          + txtnuevopsc.getText()
                          + "',distribuidor='"
                          + combonuevodistri.getSelectedItem().toString()
                          + "', telefono='"
                          + txtnuevotlf.getText()
                          + "' , direccion='"
                          + txtnuevodireccion.getText()
                          + "', "
                          + "fecha='"
                          + fecha
                          + "', codpostal='"
                          + txtnuevocp.getText()
                          + "',hora='"
                          + hora
                          + "',estado='"
                          + combonuevoestado.getSelectedItem().toString()
                          + "',"
                          + "venta='-',comisionvisita='0',comisionventa='0',observaciones='"
                          + txtnuevoobser.getText()
                          + "' "
                          + ",operador='"
                          + txtnuevoop.getText()
                          + "',teleoperadora='"
                          + log
                          + "',fechafin='"
                          + fechafin
                          + "'"
                          + "where visita='"
                          + cod
                          + "'");
                  limpiar();
                  bloqueoinicial();
                  cargainicial();
                } catch (SQLException ex) {
                  Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
                }
              }
            } else {
              JOptionPane.showMessageDialog(
                  null, "No puedes poner ese estado", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
          } else {
            JOptionPane.showMessageDialog(
                null, "Asigna un estado", "Error Datos", JOptionPane.ERROR_MESSAGE);
          }
        } else {
          JOptionPane.showMessageDialog(
              null, "Falta Teléfono de contacto", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
      } else {
        JOptionPane.showMessageDialog(
            null, "Falta Razón Social", "Error Datos", JOptionPane.ERROR_MESSAGE);
      }
    }
  } 
  
  private void btnsalirvisitaActionPerformed(
      java.awt.event.ActionEvent evt) { 
    try {
      this.dispose();
      con.close();
      System.exit(0);

    } catch (SQLException ex) {
      Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
    }
  } 
  
  private void btnmodifvisitaActionPerformed(
      java.awt.event.ActionEvent evt) { 
    txtcodvisita.setEnabled(true);
    bloqueototal();
  } 
  
  private void btnbusactualizarActionPerformed(
      java.awt.event.ActionEvent evt) { 
    int a = 0, b = 0, c = 0, d = 0, e = 0;
    if (combobusdistribuidor.getSelectedIndex() != 0) {
      a = 1;
    }
    if (combobusestado.getSelectedIndex() != 0) {
      b = 1;
    }
    if (combobusmes.getSelectedIndex() != 0) {
      c = 1;
    }
    if (!txtbuscp.getText().equalsIgnoreCase("")) {
      d = 1;
    }
    if (!txtbusrs.getText().equalsIgnoreCase("")) {
      e = 1;
    }
    String busqueda =
        String.valueOf(a)
            + String.valueOf(b)
            + String.valueOf(c)
            + String.valueOf(d)
            + String.valueOf(e);
    System.out.println(busqueda);
    switch (busqueda) {
      case "00000":
        cargainicial();
        break;
      case "10000": // busqueda solo por distribuidor
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where teleoperadora='"
                      + log
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "'");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00100": // busqueda solo por fecha
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where teleoperadora='"
                      + log
                      + "' or teleoperadora='-' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "'");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01000": // busqueda solo por estado
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00010": // busqueda solo por codigo postal
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00001": // busqueda solo por Razon Social
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where razonsocial='"
                      + txtbusrs.getText()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10001": // busqueda por Ditribuidor y Razon Social
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where razonsocial='"
                      + txtbusrs.getText()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10010": // busqueda por Ditribuidor y codigo postal
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10100": // busqueda por Ditribuidor y estado
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11000": // busqueda por Ditribuidor y fecha
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11100": // busqueda por Ditribuidor, fecha y estado
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "'and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11010": // busqueda por Ditribuidor, fecha y codigo postal
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11001": // busqueda por Ditribuidor, fecha y Razon Social
        try {
          Class.forName(driver).newInstance();

          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where razonsocial='"
                      + txtbusrs.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11110": // busqueda por Ditribuidor, fecha, estado y codigo postal
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11101": // busqueda por Ditribuidor, fecha, estado y Razon Social
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "'  and razonsocial='"
                      + txtbusrs.getText()
                      + "' MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11111": // busqueda por Todos los campos
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "11011": // busqueda por Ditribuidor, fecha, codigo postal y Razon Social
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where razonsocial='"
                      + txtbusrs.getText()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10111": // busqueda por Ditribuidor, estado, codigo postal y Razon Social
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10101": // busqueda por Ditribuidor, estado y Razon Social
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "'  and razonsocial='"
                      + txtbusrs.getText()
                      + "'  and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10110": // busqueda por Ditribuidor, estado y cp
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "'  and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "'and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "10011": // busqueda por Ditribuidor, cp y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and distribuidor='"
                      + combobusdistribuidor.getSelectedItem().toString()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01001": // busqueda por Fecha y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where razonsocial='"
                      + txtbusrs.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01010": // busqueda por Fecha y cp
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "'  and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01011": // busqueda por Fecha, cp y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01100": // busqueda por Fecha y estado
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "web", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01101": // busqueda por Fecha, estado y  rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01110": // busqueda por Fecha, estado y  cp
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "'  and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "01111": // busqueda por Fecha, estado,cp y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and MONTH(fecha)='"
                      + combobusmes.getSelectedIndex()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00101": // busqueda por Estado y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00110": // busqueda por Estado y cp
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00111": // busqueda por Estado, cp y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where estado='"
                      + combobusestado.getSelectedItem().toString()
                      + "' and codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "00011": // busqueda por cp y rs
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where codpostal='"
                      + txtbuscp.getText()
                      + "' and razonsocial='"
                      + txtbusrs.getText()
                      + "' and (teleoperadora='"
                      + log
                      + "' or teleoperadora='-')");
          cargarbusqueda(rs);

        } catch (ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | SQLException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      default:
        cargainicial();
        break;
    }
  } 

  private void txtnuevotlfFocusLost(
      java.awt.event.FocusEvent evt) { 
    if (!txtnuevotlf.getText().equalsIgnoreCase("")) {
      if (validaciones.validar.tlf(txtnuevotlf.getText()) == 1) {
        try {
          Class.forName(driver).newInstance();
          con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
          st = con.createStatement();
          rs =
              st.executeQuery(
                  "select * from visita where telefono='" + txtnuevotlf.getText() + "'");
          if (rs.next()) {
            JOptionPane.showMessageDialog(
                null, "El Teléfono asignado a otra empresa", "Error", JOptionPane.WARNING_MESSAGE);
          }
        } catch (SQLException
            | ClassNotFoundException
            | InstantiationException
            | IllegalAccessException ex) {
          Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
        }
      } else {
        JOptionPane.showMessageDialog(
            null, "El Teléfono no es valido", "Error", JOptionPane.WARNING_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(
          null, "El Teléfono no puede estar vacío", "Error", JOptionPane.WARNING_MESSAGE);
    }
  } 

  private void txtnuevocpFocusLost(
      java.awt.event.FocusEvent evt) { 

    //        if (!txtnuevocp.getText().equalsIgnoreCase("")) {
    //
    //            int cp = Integer.parseInt(txtnuevocp.getText());
    //            if (cp > 0 || cp <= 52999) {
    //
    //            } else {
    //                JOptionPane.showMessageDialog(null, "El Código Postal no es valido", "Error",
    // JOptionPane.WARNING_MESSAGE);
    //            }
    //        } else {
    //            JOptionPane.showMessageDialog(null, "El Código Postal no puede estar vacío",
    // "Error", JOptionPane.WARNING_MESSAGE);
    //        }
  } // GEN-LAST:event_txtnuevocpFocusLost

  private void txtnuevocpKeyTyped(
      java.awt.event.KeyEvent evt) { // GEN-FIRST:event_txtnuevocpKeyTyped
    int k = (int) evt.getKeyChar();
    if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
      evt.setKeyChar((char) KeyEvent.VK_CLEAR);
      JOptionPane.showMessageDialog(
          null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
    }
    if (k == 241 || k == 209) {
      evt.setKeyChar((char) KeyEvent.VK_CLEAR);
      JOptionPane.showMessageDialog(
          null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
    }
    if (k == 10) {
      txtnuevocp.transferFocus();
    }
  } 

  private void txtnuevominActionPerformed(
      java.awt.event.ActionEvent evt) { 
    //
  } 

  private void txtcodvisitaFocusLost(
      java.awt.event.FocusEvent evt) { 
    // Cargo cliente existente en ficha para su modificación
    if (txtcodvisita.getText().equalsIgnoreCase("")) {
      JOptionPane.showMessageDialog(
          null, "Ponga codigo de visita", "Error Datos", JOptionPane.ERROR_MESSAGE);
    } else {
      try {
        rs = st.executeQuery("Select * from visita where visita='" + txtcodvisita.getText() + "'");
        if (rs.next()) {
          if (!rs.getString("estado").equalsIgnoreCase("PENDIENTE")
              && !rs.getString("estado").equalsIgnoreCase("OK")
              && !rs.getString("estado").equalsIgnoreCase("KO")
              && !rs.getString("estado").equalsIgnoreCase("NO INTERESADO")
              && !rs.getString("estado").equalsIgnoreCase("ENVIADA")
              && !rs.getString("estado").equalsIgnoreCase("DUPLICADO")) {
            switch (rs.getString("distribuidor")) {
              case "-":
                combonuevodistri.setSelectedIndex(0);
                break;
              case "DANTE-BARCELONA":
                combonuevodistri.setSelectedIndex(1);
                break;
              case "LUSANET-BARCELONA":
                combonuevodistri.setSelectedIndex(2);
                break;
              case "PROMOVIL-NACIONAL":
                combonuevodistri.setSelectedIndex(3);
                break;
              case "DUATEL-GALICIA":
                combonuevodistri.setSelectedIndex(4);
                break;
              case "PLANETA VOZ-VIGO":
                combonuevodistri.setSelectedIndex(5);
                break;
              case "OSCAR-MADRID":
                combonuevodistri.setSelectedIndex(6);
                break;
            }
            txtnuevors.setText(rs.getString("razonsocial"));
            txtnuevopsc.setText(rs.getString("persona"));
            txtnuevotlf.setText(rs.getString("telefono"));
            txtnuevodireccion.setText(rs.getString("direccion"));
            txtnuevocp.setText(rs.getString("codpostal"));
            String partesf[] = rs.getString("fecha").split("-");
            txtnuevodia.setText(partesf[2]);
            txtnuevomes.setText(partesf[1]);
            txtnuevoano.setText(partesf[0]);
            String partesh[] = rs.getString("hora").split(":");
            txtnuevomin.setText(partesh[1]);
            txtnuevohora.setText(partesh[0]);
            switch (rs.getString("estado")) {
              case "PENDIENTE":
                combonuevoestado.setSelectedIndex(1);
                break;
              case "APLAZADA":
                combonuevoestado.setSelectedIndex(2);
                break;
              case "OK":
                combonuevoestado.setSelectedIndex(3);
                break;
              case "KO":
                combonuevoestado.setSelectedIndex(4);
                break;
              case "RELLAMADA":
                combonuevoestado.setSelectedIndex(5);
                break;
              case "ERRONEO":
                combonuevoestado.setSelectedIndex(6);
                break;
              case "ILOCALIZABLE":
                combonuevoestado.setSelectedIndex(7);
                break;
              case "NO INTERESADO":
                combonuevoestado.setSelectedIndex(8);
                break;
              case "ENVIADA":
                combonuevoestado.setSelectedIndex(8);
                break;
            }
            txtnuevoobser.setText(rs.getString("observaciones"));
            bloqueomodificaciones();
            cod = Integer.parseInt(txtcodvisita.getText());
            if (combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("ERRONEO")) {
              bloqueototal();
            }
          } else {
            JOptionPane.showMessageDialog(
                null,
                "No puedes modificar una ficha en este estado, habla con oficina",
                "Error Datos",
                JOptionPane.ERROR_MESSAGE);
          }
        } else {
          JOptionPane.showMessageDialog(
              null, "Código incorrecto", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
      } catch (SQLException ex) {
        Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  } 
  
  private void btnhabilfiltrosActionPerformed(
      java.awt.event.ActionEvent evt) { 
    bloqueoinicial();
  } 
  
  private void tablavisitasMouseClicked(
      java.awt.event.MouseEvent evt) { 
    int mod = Integer.parseInt(tablavisitas.getValueAt(tablavisitas.getSelectedRow(), 0).toString());
    txtcodvisita.setText(String.valueOf(mod));
    cargacliente();
  } 
  
  public void cargacliente() {
    // Cargo cliente existente en ficha para su modificación
    if (txtcodvisita.getText().equalsIgnoreCase("")) {
      JOptionPane.showMessageDialog(
          null, "Ponga codigo de visita", "Error Datos", JOptionPane.ERROR_MESSAGE);
    } else {
      try {
        rs = st.executeQuery("Select * from visita where visita='" + txtcodvisita.getText() + "'");
        if (rs.next()) {
          if (!rs.getString("estado").equalsIgnoreCase("PENDIENTE")
              && !rs.getString("estado").equalsIgnoreCase("OK")
              && !rs.getString("estado").equalsIgnoreCase("KO")
              && !rs.getString("estado").equalsIgnoreCase("NO INTERESADO")
              && !rs.getString("estado").equalsIgnoreCase("ENVIADA")
              && !rs.getString("estado").equalsIgnoreCase("DUPLICADO")) {
            switch (rs.getString("distribuidor")) {
              case "-":
                combonuevodistri.setSelectedIndex(0);
                break;
              case "DANTE-BARCELONA":
                combonuevodistri.setSelectedIndex(1);
                break;
              case "LUSANET-BARCELONA":
                combonuevodistri.setSelectedIndex(2);
                break;
              case "PROMOVIL-NACIONAL":
                combonuevodistri.setSelectedIndex(3);
                break;
              case "DUATEL-GALICIA":
                combonuevodistri.setSelectedIndex(4);
                break;
              case "PLANETA VOZ-VIGO":
                combonuevodistri.setSelectedIndex(5);
                break;
              case "OSCAR-MADRID":
                combonuevodistri.setSelectedIndex(6);
                break;
            }
            txtnuevors.setText(rs.getString("razonsocial"));
            txtnuevopsc.setText(rs.getString("persona"));
            txtnuevotlf.setText(rs.getString("telefono"));
            txtnuevodireccion.setText(rs.getString("direccion"));
            txtnuevocp.setText(rs.getString("codpostal"));
            String partesf[] = rs.getString("fecha").split("-");
            txtnuevodia.setText(partesf[2]);
            txtnuevomes.setText(partesf[1]);
            txtnuevoano.setText(partesf[0]);
            String partesh[] = rs.getString("hora").split(":");
            txtnuevomin.setText(partesh[1]);
            txtnuevohora.setText(partesh[0]);
            switch (rs.getString("estado")) {
              case "PENDIENTE":
                combonuevoestado.setSelectedIndex(1);
                break;
              case "APLAZADA":
                combonuevoestado.setSelectedIndex(2);
                break;
              case "OK":
                combonuevoestado.setSelectedIndex(3);
                break;
              case "KO":
                combonuevoestado.setSelectedIndex(4);
                break;
              case "RELLAMADA":
                combonuevoestado.setSelectedIndex(5);
                break;
              case "ERRONEO":
                combonuevoestado.setSelectedIndex(6);
                break;
              case "ILOCALIZABLE":
                combonuevoestado.setSelectedIndex(7);
                break;
              case "NO INTERESADO":
                combonuevoestado.setSelectedIndex(8);
                break;
              case "ENVIADA":
                combonuevoestado.setSelectedIndex(8);
                break;
              case "DUPLICADO":
                combonuevoestado.setSelectedIndex(9);
                break;
            }
            txtnuevoobser.setText(rs.getString("observaciones"));
            bloqueomodificaciones();
            cod = Integer.parseInt(txtcodvisita.getText());
            if (combonuevoestado.getSelectedItem().toString().equalsIgnoreCase("ERRONEO")) {
              bloqueototal();
            }
          } else {
            JOptionPane.showMessageDialog(
                null,
                "No puedes modificar una ficha en este estado, habla con oficina",
                "Error Datos",
                JOptionPane.ERROR_MESSAGE);
          }
        } else {
          JOptionPane.showMessageDialog(
              null, "Código incorrecto", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
      } catch (SQLException ex) {
        Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  public void bloqueonuevo() {
    combonuevodistri.setEnabled(true);
    combonuevoestado.setEnabled(true);
    txtnuevoano.setEnabled(true);
    txtnuevocp.setEnabled(true);
    txtnuevodia.setEnabled(true);
    txtnuevodireccion.setEnabled(true);
    txtnuevohora.setEnabled(true);
    txtnuevomes.setEnabled(true);
    txtnuevomin.setEnabled(true);
    txtnuevoobser.setEnabled(true);
    txtnuevopsc.setEnabled(true);
    txtnuevors.setEnabled(true);
    txtnuevotlf.setEnabled(true);
    combobusdistribuidor.setEnabled(false);
    combobusestado.setEnabled(false);
    combobusmes.setEnabled(false);
    txtbuscp.setEnabled(false);
    txtbusrs.setEnabled(false);
    btnbusactualizar.setEnabled(false);
  }

  public void bloqueototal() {
    combonuevodistri.setEnabled(false);
    combonuevoestado.setEnabled(false);
    txtnuevoano.setEnabled(false);
    txtnuevocp.setEnabled(false);
    txtnuevodia.setEnabled(false);
    txtnuevodireccion.setEnabled(false);
    txtnuevohora.setEnabled(false);
    txtnuevomes.setEnabled(false);
    txtnuevomin.setEnabled(false);
    txtnuevoobser.setEnabled(false);
    txtnuevopsc.setEnabled(false);
    txtnuevors.setEnabled(false);
    txtnuevotlf.setEnabled(false);
    combobusdistribuidor.setEnabled(false);
    combobusestado.setEnabled(false);
    combobusmes.setEnabled(false);
    txtbuscp.setEnabled(false);
    txtbusrs.setEnabled(false);
    btnbusactualizar.setEnabled(false);
    txtnuevoop.setEnabled(false);
  }

  public void bloqueomodificaciones() {
    combonuevodistri.setEnabled(true);
    combonuevoestado.setEnabled(true);
    txtnuevoano.setEnabled(true);
    txtnuevocp.setEnabled(true);
    txtnuevodia.setEnabled(true);
    txtnuevodireccion.setEnabled(true);
    txtnuevohora.setEnabled(true);
    txtnuevomes.setEnabled(true);
    txtnuevomin.setEnabled(true);
    txtnuevoobser.setEnabled(true);
    txtnuevopsc.setEnabled(true);
    txtnuevors.setEnabled(false);
    txtnuevotlf.setEnabled(true);
    combobusdistribuidor.setEnabled(false);
    combobusestado.setEnabled(false);
    combobusmes.setEnabled(false);
    txtbuscp.setEnabled(false);
    txtbusrs.setEnabled(false);
    btnbusactualizar.setEnabled(false);
    txtnuevoop.setEnabled(true);
  }

  public void limpiar() {
    combonuevodistri.setSelectedIndex(0);
    combonuevoestado.setSelectedIndex(0);
    txtnuevoano.setText("");
    txtnuevocp.setText("");
    txtnuevodia.setText("");
    txtnuevodireccion.setText("");
    txtnuevohora.setText("");
    txtnuevomes.setText("");
    txtnuevomin.setText("");
    txtnuevoobser.setText("");
    txtnuevopsc.setText("");
    txtnuevors.setText("");
    txtnuevotlf.setText("");
    txtnuevoop.setText("");
  }

  public void bloqueoinicial() {
    combonuevodistri.setEnabled(false);
    combonuevoestado.setEnabled(false);
    txtnuevoano.setEnabled(false);
    txtnuevocp.setEnabled(false);
    txtnuevodia.setEnabled(false);
    txtnuevodireccion.setEnabled(false);
    txtnuevohora.setEnabled(false);
    txtnuevomes.setEnabled(false);
    txtnuevomin.setEnabled(false);
    txtnuevoobser.setEnabled(false);
    txtnuevopsc.setEnabled(false);
    txtnuevors.setEnabled(false);
    txtnuevotlf.setEnabled(false);
    combobusdistribuidor.setEnabled(true);
    combobusestado.setEnabled(true);
    combobusmes.setEnabled(true);
    txtbuscp.setEnabled(true);
    txtbusrs.setEnabled(true);
    btnbusactualizar.setEnabled(true);
    txtcodvisita.setEnabled(false);
    txtnuevoop.setEnabled(false);
  }

  private DefaultTableModel crearModelo() {

    Object[] columnas = new Object[13];
    columnas[0] = "Cod_cliente";
    columnas[1] = "Distribuidor";
    columnas[2] = "Razón Social";
    columnas[3] = "Persona Contacto";
    columnas[4] = "Teléfono";
    columnas[5] = "Dirección";
    columnas[6] = "Código Postal";
    columnas[7] = "Fecha";
    columnas[8] = "Hora";
    columnas[9] = "Estado";
    columnas[10] = "Venta";
    columnas[11] = "Observaciones";
    columnas[12] = "Fecha Llamada";

    modelo = new DefaultTableModel(columnas, 0);

    return modelo;
  }

  public void cargainicial() {
    try {
      Class.forName(driver).newInstance();
      con = DriverManager.getConnection(urlMysql + "sencitel", "sencitel", "Ludwig1753");
      st = con.createStatement();
      rs =
          st.executeQuery(
              "select * from visita where teleoperadora='" + log + "' or teleoperadora='-'");
      if (rs.next()) {
        modelo = crearModelo();
        do {
          rs.getString("fecha");
          String[] parts = rs.getString("fecha").split("-");
          String ano = parts[0];
          String mes = parts[1];
          String dia = parts[2];
          String fecha = dia + "-" + mes + "-" + ano;
          String[] parts2 = rs.getString("fechafin").split("-");
          String ano1 = parts2[0];
          String mes1 = parts2[1];
          String dia1 = parts2[2];
          String fecha1 = dia1 + "-" + mes1 + "-" + ano1;
          String[] filas = new String[13];
          filas[0] = rs.getString("idvisita");
          filas[1] = rs.getString("distribuidor");
          filas[2] = rs.getString("razonsocial");
          filas[3] = rs.getString("pcontacto");
          filas[4] = rs.getString("telefono");
          filas[5] = rs.getString("direccion");
          filas[6] = rs.getString("codpostal");
          filas[7] = fecha;
          filas[8] = rs.getString("hora");
          filas[9] = rs.getString("estado");
          filas[10] = rs.getString("venta");
          filas[11] = rs.getString("observaciones");
          filas[12] = fecha1;
          modelo.addRow(filas);
        } while (rs.next());
        tablavisitas.setModel(modelo);
      } else {
        int i = tablavisitas.getModel().getRowCount();
        if (i < 1) {
          modelo = crearModelo();
          tablavisitas.setModel(modelo);
        } else {
          modelo.rowsRemoved(null);
          modelo = crearModelo();
          tablavisitas.setModel(modelo);
        }
      }
    } catch (SQLException | NullPointerException ex) {
      Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
      Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void cargarbusqueda(ResultSet rs) {
    try {
      if (rs.next()) {
        modelo = crearModelo();
        do {
          rs.getString("fecha");
          String[] parts = rs.getString("fecha").split("-");
          String ano = parts[0];
          String mes = parts[1];
          String dia = parts[2];
          String fecha = dia + "-" + mes + "-" + ano;
          String[] parts2 = rs.getString("fechafin").split("-");
          String ano1 = parts2[0];
          String mes1 = parts2[1];
          String dia1 = parts2[2];
          String fecha1 = dia1 + "-" + mes1 + "-" + ano1;
          String[] filas = new String[13];
          filas[0] = rs.getString("idvisita");
          filas[1] = rs.getString("distribuidor");
          filas[2] = rs.getString("razonsocial");
          filas[3] = rs.getString("pcontacto");
          filas[4] = rs.getString("telefono");
          filas[5] = rs.getString("direccion");
          filas[6] = rs.getString("codpostal");
          filas[7] = fecha;
          filas[8] = rs.getString("hora");
          filas[9] = rs.getString("estado");
          filas[10] = rs.getString("venta");
          filas[11] = rs.getString("observaciones");
          filas[12] = fecha1;
          modelo.addRow(filas);
        } while (rs.next());
        tablavisitas.setModel(modelo);
      } else {
        int i = tablavisitas.getModel().getRowCount();
        if (i < 1) {
          modelo = crearModelo();
          tablavisitas.setModel(modelo);
        } else {
          modelo.rowsRemoved(null);
          modelo = crearModelo();
          tablavisitas.setModel(modelo);
        }
      }
    } catch (SQLException | NullPointerException ex) {
      Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /** @param args the command line arguments */
  public static void main(String args[]) {
   
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Visita.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Visita.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Visita.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Visita.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new Visita().setVisible(true);
          }
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnbusactualizar;
  private javax.swing.JButton btnguardarvisita;
  private javax.swing.JButton btnhabilfiltros;
  private javax.swing.JButton btnmodifvisita;
  private javax.swing.JButton btnnuevovisita;
  private javax.swing.JButton btnsalirvisita;
  private javax.swing.JComboBox combobusdistribuidor;
  private javax.swing.JComboBox combobusestado;
  private javax.swing.JComboBox combobusmes;
  private javax.swing.JComboBox combonuevodistri;
  private javax.swing.JComboBox combonuevoestado;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel28;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTable tablavisitas;
  private javax.swing.JTextField txtbuscp;
  private javax.swing.JTextField txtbusrs;
  private javax.swing.JLabel txtcodteleop;
  private javax.swing.JTextField txtcodvisita;
  private javax.swing.JTextField txtnuevoano;
  private javax.swing.JTextField txtnuevocp;
  private javax.swing.JTextField txtnuevodia;
  private javax.swing.JTextField txtnuevodireccion;
  private javax.swing.JTextField txtnuevohora;
  private javax.swing.JTextField txtnuevomes;
  private javax.swing.JTextField txtnuevomin;
  private javax.swing.JTextArea txtnuevoobser;
  private javax.swing.JTextField txtnuevoop;
  private javax.swing.JTextField txtnuevopsc;
  private javax.swing.JTextField txtnuevors;
  private javax.swing.JTextField txtnuevotlf;
  // End of variables declaration//GEN-END:variables
}
