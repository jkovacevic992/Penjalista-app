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
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.hibernate.Session;
import penjalistaapp.controller.ObradaPenjaliste;
import penjalistaapp.controller.ObradaSektor;
import penjalistaapp.model.Penjaliste;
import penjalistaapp.model.Sektor;
import penjalistaapp.model.Smjer;
import penjalistaapp.pomocno.HibernateUtil;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class Sektori extends javax.swing.JFrame {

    final private ObradaSektor o;
    private Sektor sektor;
    final private DecimalFormat df;


    public Sektori() {
        initComponents();
        promjenaIzgleda();

        o = new ObradaSektor();
        ucitajPenjalista();
        ucitajIzBaze();

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hr", "HR"));
        df = (DecimalFormat) nf;
        df.applyPattern("###,##0.00");
        lstSmjeroviNaSektoru.setModel(new DefaultListModel<>());
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
        txtLon = new javax.swing.JTextField();
        lblLat = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        prbBrisanje = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSmjeroviNaSektoru = new javax.swing.JList<>();
        btnMaps = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPenjalista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSektori = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sektori");

        lblNaziv.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblNaziv.setForeground(new java.awt.Color(255, 255, 255));
        lblNaziv.setText("Naziv");

        txtNaziv.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        lblLon.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblLon.setForeground(new java.awt.Color(255, 255, 255));
        lblLon.setText("Geografska dužina");

        txtLon.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        lblLat.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblLat.setForeground(new java.awt.Color(255, 255, 255));
        lblLat.setText("Geograska širina");

        txtLat.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

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

        lstSmjeroviNaSektoru.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(lstSmjeroviNaSektoru);

        btnMaps.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnMaps.setText("Google Maps");
        btnMaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Smjerovi na sektoru");

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Penjalište");

        cmbPenjalista.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLon)
                    .addComponent(txtLat)
                    .addComponent(txtNaziv)
                    .addComponent(btnMaps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(prbBrisanje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNaziv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPodaciLayout.createSequentialGroup()
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPenjalista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaziv)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLat)
                        .addGap(18, 18, 18)
                        .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPenjalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMaps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane3))
                .addGap(23, 23, 23)
                .addComponent(prbBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        lstSektori.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lstSektori.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSektoriValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstSektori);

        jLabel2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sektori");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseEntered
        btnDodaj.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDodajMouseEntered

    private void btnDodajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseExited
        btnDodaj.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnDodajMouseExited

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        sektor = new Sektor();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            o.dodaj(sektor);
            ucitajIzBaze();
        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseEntered
        btnPromjena.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPromjenaMouseEntered

    private void btnPromjenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseExited
        btnPromjena.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnPromjenaMouseExited

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        sektor = lstSektori.getSelectedValue();
        if (sektor == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi sektor.");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            o.promjena(sektor);
            ucitajIzBaze();

        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseEntered
        btnObrisi.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnObrisiMouseEntered

    private void btnObrisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseExited
        btnObrisi.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnObrisiMouseExited

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        sektor = lstSektori.getSelectedValue();
        if (sektor == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi sektor.");
            return;
        }

        if (lstSektori.getSelectedValuesList().size() == 1) {
            try {
                o.obrisi(lstSektori.getSelectedValuesList().get(0));
            } catch (Exception ex) {
                HibernateUtil.getSession().clear();
                JOptionPane.showMessageDialog(getRootPane(), "Sektor "
                        + lstSektori.getSelectedValuesList().get(0)
                        + " ne mogu obrisati.");
            }
            ucitajIzBaze();
        } else {
            new BrisanjeSektora().start();
        }
        ocistiPolja();

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstSektoriValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSektoriValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        
        Sektor s = lstSektori.getSelectedValue();
        if (s == null) {
            return;
        }
        ocistiPolja();
        ucitajPenjalista();


        txtNaziv.setText(s.getNaziv());
        txtLat.setText(String.valueOf(s.getLat()));
        txtLon.setText(String.valueOf(s.getLon()));
        cmbPenjalista.setSelectedItem(s.getPenjaliste());
        
        if (s.getSmjerovi() != null) {

            DefaultListModel<Smjer> m2 = new DefaultListModel<>();
            s.getSmjerovi().forEach((d) -> {
             
                m2.addElement(d);
            });
            lstSmjeroviNaSektoru.setModel(m2);
            

        }
        

    }//GEN-LAST:event_lstSektoriValueChanged

    private void btnMapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapsActionPerformed
        try {

            Desktop.getDesktop().browse(new URI("https://www.google.com/maps/?q=" + txtLon.getText() + "," + txtLat.getText()));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMapsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnMaps;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JComboBox<Penjaliste> cmbPenjalista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLat;
    private javax.swing.JLabel lblLon;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JList<Sektor> lstSektori;
    private javax.swing.JList<Smjer> lstSmjeroviNaSektoru;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JProgressBar prbBrisanje;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLon;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
private class BrisanjeSektora extends Thread {

        public void run() {
            prbBrisanje.setMinimum(0);
            prbBrisanje.setMaximum(lstSektori.getSelectedValuesList().size());
            int i = 0;

            for (Sektor e : lstSektori.getSelectedValuesList()) {
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

    private void ucitajIzBaze() {
        DefaultListModel<Sektor> m = new DefaultListModel<>();
        o.getEntiteti().forEach((s) -> {
            m.addElement(s);
        });
        lstSektori.setModel(m);
        lstSektori.repaint();
        lstSektori.revalidate();
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

    private void ocistiPolja() {

        for (Component c : pnlPodaci.getComponents()) {

            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }

    private boolean popuniSvojstva() {
        try {
            sektor.setNaziv(txtNaziv.getText());
            sektor.setLat(Double.parseDouble(txtLat.getText().replace(',', '.')));
            sektor.setLon(Double.parseDouble(txtLon.getText().replace(',', '.')));
            sektor.setPenjaliste((Penjaliste) cmbPenjalista.getSelectedItem());

        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nisu upisani svi potrebni podaci");
            return false;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(getRootPane(), "Geografska širina ili dužina nije unesena.");
        }

        return true;
    }

    public void ucitajPenjalista() {

        ObradaPenjaliste o = new ObradaPenjaliste();
        DefaultComboBoxModel<Penjaliste> m = new DefaultComboBoxModel<>();
        o.getEntiteti().forEach((s) -> {

            m.addElement(s);
        });
        cmbPenjalista.setModel(m);

    }

}
