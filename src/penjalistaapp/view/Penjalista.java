/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import penjalistaapp.controller.ObradaPenjaliste;
import penjalistaapp.model.Penjaliste;
import penjalistaapp.model.Sektor;
import penjalistaapp.pomocno.HibernateUtil;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class Penjalista extends javax.swing.JFrame {

    final private ObradaPenjaliste o;
    private Penjaliste penjaliste;
    final private DecimalFormat df;

    public Penjalista() {
        initComponents();
        promjenaIzgleda();

        o = new ObradaPenjaliste();
        ucitajIzBaze();
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hr", "HR"));
        df = (DecimalFormat) nf;
        df.applyPattern("###,##0.00");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPodaci = new javax.swing.JPanel();
        lblNaziv = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        lblLon = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        lblLat = new javax.swing.JLabel();
        txtLon = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        prbBrisanje = new javax.swing.JProgressBar();
        btnMap = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstSektoriNaPenjalistu = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPenjalista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Penjališta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNaziv.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblNaziv.setForeground(new java.awt.Color(255, 255, 255));
        lblNaziv.setText("Naziv");

        txtNaziv.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        lblLon.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblLon.setForeground(new java.awt.Color(255, 255, 255));
        lblLon.setText("Geografska dužina");

        txtLat.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        lblLat.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblLat.setForeground(new java.awt.Color(255, 255, 255));
        lblLat.setText("Geograska širina");

        txtLon.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        btnDodaj.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDodajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDodajMouseExited(evt);
            }
        });
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPromjena.setText("Promjena");
        btnPromjena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPromjenaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPromjenaMouseExited(evt);
            }
        });
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnObrisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnObrisiMouseExited(evt);
            }
        });
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnMap.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnMap.setText("Google Maps");
        btnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapActionPerformed(evt);
            }
        });

        lstSektoriNaPenjalistu.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(lstSektoriNaPenjalistu);

        jLabel2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sektori na penjalištu");

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prbBrisanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLat)
                    .addComponent(txtNaziv)
                    .addComponent(btnMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNaziv)
                    .addComponent(lblLat)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLon)
                    .addComponent(txtLon))
                .addGap(28, 28, 28)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaziv)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblLon)
                        .addGap(13, 13, 13)
                        .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLat)
                        .addGap(11, 11, 11)
                        .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane4))
                .addGap(9, 9, 9)
                .addComponent(prbBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(pnlPodaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 0, 472, -1));

        lstPenjalista.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lstPenjalista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPenjalistaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPenjalista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 103, 250));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penjališta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPenjalistaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPenjalistaValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Penjaliste p = lstPenjalista.getSelectedValue();
        if (p == null) {
            return;
        }
        ocistiPolja();

        txtNaziv.setText(p.getNaziv());
        txtLon.setText(String.valueOf(p.getLon()));
        txtLat.setText(String.valueOf(p.getLat()));
//         if (p.getSektori()!= null) {

        DefaultListModel<Sektor> m2 = new DefaultListModel<>();
        p.getSektori().forEach((d) -> {

            m2.addElement(d);
        });
        lstSektoriNaPenjalistu.setModel(m2);

//                }

    }//GEN-LAST:event_lstPenjalistaValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        penjaliste = new Penjaliste();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            o.dodaj(penjaliste);
            ucitajIzBaze();
        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        penjaliste = lstPenjalista.getSelectedValue();
        if (penjaliste == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjalište.");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            o.promjena(penjaliste);
            ucitajIzBaze();

        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        penjaliste = lstPenjalista.getSelectedValue();
        if (penjaliste == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjalište.");
            return;
        }

        if (lstPenjalista.getSelectedValuesList().size() == 1) {
            try {
                o.obrisi(lstPenjalista.getSelectedValuesList().get(0));
            } catch (Exception ex) {
                HibernateUtil.getSession().clear();
                JOptionPane.showMessageDialog(getRootPane(), "Penjalište "
                        + lstPenjalista.getSelectedValuesList().get(0)
                        + " ne mogu obrisati.");
            }
            ucitajIzBaze();
        } else {
            new BrisanjePenjalista().start();
        }
        ocistiPolja();


    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnDodajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseEntered
        btnDodaj.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDodajMouseEntered

    private void btnDodajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseExited
        btnDodaj.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnDodajMouseExited

    private void btnPromjenaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseEntered
        btnPromjena.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPromjenaMouseEntered

    private void btnPromjenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseExited
        btnPromjena.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnPromjenaMouseExited

    private void btnObrisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseEntered
        btnObrisi.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnObrisiMouseEntered

    private void btnObrisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseExited
        btnObrisi.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnObrisiMouseExited

    private void btnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapActionPerformed
        try {

            Desktop.getDesktop().browse(new URI("https://www.google.com/maps/?q=" + txtLat.getText() + "," + txtLon.getText()));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMapActionPerformed

    /**
     * @param args the command line arguments
     */
    private class BrisanjePenjalista extends Thread {

        public void run() {
            prbBrisanje.setMinimum(0);
            prbBrisanje.setMaximum(lstPenjalista.getSelectedValuesList().size());
            int i = 0;

            for (Penjaliste e : lstPenjalista.getSelectedValuesList()) {
                prbBrisanje.setValue(++i);
                try {
                    o.obrisi(e);
                } catch (Exception ex) {
                    HibernateUtil.getSession().clear();

                }
            }
            ucitajIzBaze();
            prbBrisanje.setValue(0);
        }
    }

    private void ocistiPolja() {

        for (Component c : pnlPodaci.getComponents()) {

            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnMap;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblLat;
    private javax.swing.JLabel lblLon;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JList<Penjaliste> lstPenjalista;
    protected javax.swing.JList<Sektor> lstSektoriNaPenjalistu;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JProgressBar prbBrisanje;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLon;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void ucitajIzBaze() {
        DefaultListModel<Penjaliste> m = new DefaultListModel<>();
        o.getEntiteti().forEach((s) -> {
            m.addElement(s);
        });
        lstPenjalista.setModel(m);
        ocistiPolja();

         
    }

    private boolean popuniSvojstva() {
        try {
            penjaliste.setNaziv(txtNaziv.getText());
            penjaliste.setLat(Double.parseDouble(txtLat.getText().replace(',', '.')));
            penjaliste.setLon(Double.parseDouble(txtLon.getText().replace(',', '.')));
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nisu upisani svi potrebni podaci");
            return false;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(getRootPane(), "Geografska širina ili dužina pogrešno unesena.");
            return false;
        }

        return true;
    }

    private void promjenaIzgleda() {
        getContentPane().setBackground(Color.decode("#082F4E"));
        pnlPodaci.setBackground(Color.decode("#082F4E"));
        try {
            setIconImage(ImageIO.read(new File("Slike/climbingIcon.png")));
        } catch (IOException exc) {
            exc.printStackTrace();
        }

    }

}
