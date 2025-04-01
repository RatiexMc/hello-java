package igu;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {

    int contSorteos = 1;

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        FondoDatosDelSorteo = new javax.swing.JPanel();
        tituloDatosDelSorteo = new javax.swing.JLabel();
        mesDelSorteo = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        tituloCantGanadores = new javax.swing.JLabel();
        txtCantGanadores = new javax.swing.JTextField();
        btnSortear = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        FondoResultado = new javax.swing.JPanel();
        tituloDatosDelSorteo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGanadores = new javax.swing.JTable();
        FondoTitulo = new javax.swing.JPanel();
        TituloSupermercadoRossi = new javax.swing.JLabel();
        TituloSorteador = new javax.swing.JLabel();
        IconoSupermercado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoDatosDelSorteo.setBackground(new java.awt.Color(236, 236, 236));

        tituloDatosDelSorteo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tituloDatosDelSorteo.setForeground(new java.awt.Color(0, 0, 0));
        tituloDatosDelSorteo.setText("Datos del Sorteo");

        mesDelSorteo.setForeground(new java.awt.Color(0, 0, 0));
        mesDelSorteo.setText("Mes del Sorteo");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        tituloCantGanadores.setForeground(new java.awt.Color(0, 0, 0));
        tituloCantGanadores.setText("Cant. Ganadores");

        txtCantGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantGanadoresActionPerformed(evt);
            }
        });

        btnSortear.setBackground(new java.awt.Color(107, 208, 107));
        btnSortear.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgboton.png"))); // NOI18N
        btnSortear.setText("Sortear");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(236, 236, 236));
        btnCerrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnCerrar.setText("Cerrar Sorteo");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Ejercicio-Sorteador\nUn supermercado realiza todos los meses sorteos entre sus clientes que depositen, en un sobre, \nal menos 3 tickets de compras realizadas en algunas de sus sucursales en días dístintos, En todos\n los sorteos se pueden elegir distintas cantidades de ganadores. Por cada sobre que un cliente\n deposita, recibe un número de participante que está compuesto por el día de entrega del sobre,\n el mes y un número de ticket(4dígitos) de algunos de los 3 que haya depositado. Por ejemplo:\n Si hubiese entregado su sobre el 19/09 y su numero de ticket sea 0158 del día, su código\n sería 19090158\n-Se necesita un programa que sea capaz de llevar a cabo los sorteos donde el encargado del \nsupermercado deba ingresar el número del mes del cuál se está sorteando, la cantidad de \nganadores (puede variar de mes a mes)  y luego presionar un botón para ir visualizando \ncada ganador\n-Los números ganadores se deben ir visualizando en una interfaz gráfica dentro de una tabla en\nel lado derecho del programa de forma acumulativa hasta que se dé por cerrado el sorteo.\n-Para cerrar/finalizar un sorteo, se necesita un botón que haga dicha tarea y vacíe todos los\n campos de la interfaz gráfica\nPistas importantes:\n-En cada mes el rango de números dentro del cual se sortea, va ser distinto, ejemplo, \nen septiembre será desde 01090001 hasta 30099999, pero,  en octubre desde 01100001\n hasta 31109999\n-Se recomienda guardar cada número ganador dentro de la posición de un vector en base\n al puesto que corresponda al premio\n-La lógica a implementar es solo la lógica de la interfaz gráfica\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout FondoDatosDelSorteoLayout = new javax.swing.GroupLayout(FondoDatosDelSorteo);
        FondoDatosDelSorteo.setLayout(FondoDatosDelSorteoLayout);
        FondoDatosDelSorteoLayout.setHorizontalGroup(
            FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoDatosDelSorteoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoDatosDelSorteoLayout.createSequentialGroup()
                        .addComponent(tituloDatosDelSorteo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoDatosDelSorteoLayout.createSequentialGroup()
                        .addGroup(FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesDelSorteo)
                            .addComponent(tituloCantGanadores))
                        .addGap(18, 18, 18)
                        .addGroup(FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantGanadores)
                            .addComponent(cmbMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoDatosDelSorteoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addGap(148, 148, 148))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoDatosDelSorteoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        FondoDatosDelSorteoLayout.setVerticalGroup(
            FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoDatosDelSorteoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDatosDelSorteo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoDatosDelSorteoLayout.createSequentialGroup()
                        .addGroup(FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesDelSorteo)
                            .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FondoDatosDelSorteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCantGanadores)
                            .addComponent(txtCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        FondoResultado.setBackground(new java.awt.Color(236, 236, 236));

        tituloDatosDelSorteo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tituloDatosDelSorteo1.setForeground(new java.awt.Color(0, 0, 0));
        tituloDatosDelSorteo1.setText("Ganadores");

        tblGanadores.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Ganador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGanadores);

        javax.swing.GroupLayout FondoResultadoLayout = new javax.swing.GroupLayout(FondoResultado);
        FondoResultado.setLayout(FondoResultadoLayout);
        FondoResultadoLayout.setHorizontalGroup(
            FondoResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDatosDelSorteo1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        FondoResultadoLayout.setVerticalGroup(
            FondoResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDatosDelSorteo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FondoTitulo.setBackground(new java.awt.Color(236, 236, 236));

        TituloSupermercadoRossi.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TituloSupermercadoRossi.setForeground(new java.awt.Color(0, 0, 0));
        TituloSupermercadoRossi.setText("SUPERMERCADO \"VELAUSAN\"");

        TituloSorteador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TituloSorteador.setForeground(new java.awt.Color(0, 0, 0));
        TituloSorteador.setText("Sorteador");

        IconoSupermercado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout FondoTituloLayout = new javax.swing.GroupLayout(FondoTitulo);
        FondoTitulo.setLayout(FondoTituloLayout);
        FondoTituloLayout.setHorizontalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconoSupermercado)
                .addGap(18, 18, 18)
                .addGroup(FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloSupermercadoRossi)
                    .addComponent(TituloSorteador))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        FondoTituloLayout.setVerticalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TituloSupermercadoRossi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloSorteador)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconoSupermercado, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoDatosDelSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FondoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(FondoTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FondoDatosDelSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FondoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantGanadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantGanadoresActionPerformed

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        if (!txtCantGanadores.getText().equals("")) {
            //traemos cantidad de ganadore
            int cantGan = Integer.parseInt(txtCantGanadores.getText());

            if (contSorteos <= cantGan) {

                String mes;
                String max;
                //rango de valores
                mes = (String) cmbMes.getSelectedItem();
                String min = "01";

                if (mes.equals("02")) {
                    max = "28";
                } else {
                    if (mes.equals("11") || mes.equals("06")
                            || mes.equals("04") || mes.equals("09")) {
                        max = "30";
                    } else {
                        max = "31";
                    }
                }

                //sortear random
                Random numRandom = new Random();
                int minimo = Integer.parseInt(min);
                int maximo = Integer.parseInt(max);

                //sorteamos
                int randomDia = numRandom.nextInt(maximo - minimo + 1) + minimo;
                int randomTicket = numRandom.nextInt(9999 - 0001 + 1) + 0001;

                String numeroSorteado = agregarCeros(randomDia, mes, randomTicket);

                //controlar que no haya salido antes el número
                DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
                Object[] objeto = {contSorteos, numeroSorteado};
                modelo.addRow(objeto);

                //agregar el ganador a la tabla
                contSorteos++;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ya se alcanzó la cantidad de ganadores");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Es necesario completar la cantidad de ganadores");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortearActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente finalizar el sorteo?",
                "Finalización Sorteo",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            txtCantGanadores.setText("");
            cmbMes.setSelectedIndex(0);

            DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
            modelo.setRowCount(0);

            contSorteos = 1;
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    public String agregarCeros(int randomDia, String mes, int randomTicket) {

        int largoString = (Integer.toString(randomDia)).length();

        //agregar los 0 al día
        String numeroSorteado;
        if (largoString == 2) {
            numeroSorteado = randomDia + mes;
        } else {
            numeroSorteado = "0" + randomDia + mes;
        }

        //agregar los 0 al ticket
        largoString = (Integer.toString(randomTicket)).length();
        if (largoString == 3) {
            numeroSorteado = numeroSorteado + "0" + randomTicket;
        } else {
            if (largoString == 2) {
                numeroSorteado = numeroSorteado + "00" + randomTicket;
            } else {
                if (largoString == 1) {
                    numeroSorteado = numeroSorteado + "000" + randomTicket;
                } else {
                    numeroSorteado = numeroSorteado + randomTicket;
                }
            }
        }

        return numeroSorteado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoDatosDelSorteo;
    private javax.swing.JPanel FondoResultado;
    private javax.swing.JPanel FondoTitulo;
    private javax.swing.JLabel IconoSupermercado;
    private javax.swing.JLabel TituloSorteador;
    private javax.swing.JLabel TituloSupermercadoRossi;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSortear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mesDelSorteo;
    private javax.swing.JTable tblGanadores;
    private javax.swing.JLabel tituloCantGanadores;
    private javax.swing.JLabel tituloDatosDelSorteo;
    private javax.swing.JLabel tituloDatosDelSorteo1;
    private javax.swing.JTextField txtCantGanadores;
    // End of variables declaration//GEN-END:variables

}
