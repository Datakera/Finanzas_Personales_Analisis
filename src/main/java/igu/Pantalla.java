package igu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nmb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ape = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_doc = new javax.swing.JTextField();
        btn_datos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_gasto = new javax.swing.JTextField();
        btn_ingre = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_gasto = new javax.swing.JButton();
        txt_ingre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_final = new javax.swing.JButton();
        txt_final = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese su Nombre:");

        txt_nmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nmbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese su apellido:");

        txt_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese su documento: ");

        txt_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docActionPerformed(evt);
            }
        });

        btn_datos.setBackground(new java.awt.Color(153, 255, 153));
        btn_datos.setText("INGRESAR");
        btn_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel4.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel4.setText("GESTION DE FINANZAS PERSONALES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_ingre.setBackground(new java.awt.Color(153, 255, 153));
        btn_ingre.setText("REGISTRAR");
        btn_ingre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ingrese el monto del ingreso:");

        btn_gasto.setBackground(new java.awt.Color(153, 255, 153));
        btn_gasto.setText("REGISTRAR");
        btn_gasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gastoActionPerformed(evt);
            }
        });

        txt_ingre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ingreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Ingrese el monto del gasto:");

        btn_final.setBackground(new java.awt.Color(153, 255, 153));
        btn_final.setText("VER MI SALDO DE AHORROS");
        btn_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalActionPerformed(evt);
            }
        });

        txt_final.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_final.setEnabled(false);
        txt_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_finalActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 51, 51));
        btn_limpiar.setText("LIMPIAR TODO");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txt_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nmb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_datos))
                            .addComponent(jLabel6)
                            .addComponent(txt_ingre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ingre)
                            .addComponent(btn_gasto))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_final)
                .addGap(57, 57, 57)
                .addComponent(btn_limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_ingre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_gasto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_final)
                    .addComponent(btn_limpiar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_final)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nmbActionPerformed

    private void txt_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apeActionPerformed

    private void txt_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docActionPerformed

    private void btn_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datosActionPerformed
          
        String datos = txt_nmb.getText()+"\n"+txt_ape.getText()+"\n"+txt_doc.getText(); 
     
       
       
    }//GEN-LAST:event_btn_datosActionPerformed

    private void btn_ingreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingreActionPerformed
        double ingresos = Integer.parseInt(txt_ingre.getText());
    }//GEN-LAST:event_btn_ingreActionPerformed

    private void btn_gastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gastoActionPerformed
        double gastos = Integer.parseInt(txt_gasto.getText());
    }//GEN-LAST:event_btn_gastoActionPerformed

    private void btn_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalActionPerformed
        // Obtén los datos ingresados
    String datos = txt_nmb.getText() + "\n" + txt_ape.getText() + "\n" + txt_doc.getText();
    
    // Calcula los ingresos y gastos
    double ingresos = Double.parseDouble(txt_ingre.getText());
    double gastos = Double.parseDouble(txt_gasto.getText());
    double ahorros = ingresos - gastos;
    
    
    // Crea una cadena que contiene los datos y el resultado
    String resultado = "Datos:\n" + datos + "\nAhorros: " + Double.toString(ahorros);

    // Establece la cadena en txt_final
   txt_final.setText(resultado);
   
   //sprint 2
        try {
            // Guarda los datos en un archivo de texto
            guardarDatosEnArchivo(resultado);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_finalActionPerformed
    private void guardarDatosEnArchivo(String data) throws IOException {
    
        // Abre un archivo para escribir (o crea uno nuevo si no existe)
        BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"));
        
        // Escribe los datos en el archivo
        writer.write(data);
        
        // Cierra el archivo
        writer.close();
        //sprint 3
        
}
    private void txt_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_finalActionPerformed
        
    }//GEN-LAST:event_txt_finalActionPerformed

    private void txt_ingreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ingreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ingreActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
    txt_nmb.setText(" ");
    txt_ape.setText(" ");
    txt_doc.setText(" ");
    txt_gasto.setText(" ");
    txt_ingre.setText(" ");
    txt_final.setText(" ");
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datos;
    private javax.swing.JButton btn_final;
    private javax.swing.JButton btn_gasto;
    private javax.swing.JButton btn_ingre;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_final;
    private javax.swing.JTextField txt_gasto;
    private javax.swing.JTextField txt_ingre;
    private javax.swing.JTextField txt_nmb;
    // End of variables declaration//GEN-END:variables
}
