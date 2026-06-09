import métier.Vol;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class GestionVolFrame extends JFrame {

    private JTextField txtNumero, txtDate, txtHeureDep, txtHeureArr, txtPrix;
    private JButton btnAjouter;
    private JTable table;
    private DefaultTableModel model;

    public GestionVolFrame() {

        setTitle("Gestion des Vols");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel l1 = new JLabel("Numéro Vol");
        l1.setBounds(20, 20, 100, 25);
        add(l1);

        txtNumero = new JTextField();
        txtNumero.setBounds(130, 20, 150, 25);
        add(txtNumero);

        JLabel l2 = new JLabel("Date Départ");
        l2.setBounds(20, 60, 100, 25);
        add(l2);

        txtDate = new JTextField();
        txtDate.setBounds(130, 60, 150, 25);
        add(txtDate);

        JLabel l3 = new JLabel("Heure Départ");
        l3.setBounds(20, 100, 100, 25);
        add(l3);

        txtHeureDep = new JTextField();
        txtHeureDep.setBounds(130, 100, 150, 25);
        add(txtHeureDep);

        JLabel l4 = new JLabel("Heure Arrivée");
        l4.setBounds(20, 140, 100, 25);
        add(l4);

        txtHeureArr = new JTextField();
        txtHeureArr.setBounds(130, 140, 150, 25);
        add(txtHeureArr);

        JLabel l5 = new JLabel("Prix");
        l5.setBounds(20, 180, 100, 25);
        add(l5);

        txtPrix = new JTextField();
        txtPrix.setBounds(130, 180, 150, 25);
        add(txtPrix);

        btnAjouter = new JButton("Ajouter");
        btnAjouter.setBounds(130, 220, 100, 30);
        add(btnAjouter);

        model = new DefaultTableModel();
        model.addColumn("Numéro");
        model.addColumn("Date");
        model.addColumn("Heure Départ");
        model.addColumn("Heure Arrivée");
        model.addColumn("Prix");

        table = new JTable(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(320, 20, 350, 250);
        add(sp);

        btnAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String numero = txtNumero.getText();
                String date = txtDate.getText();
                String hDep = txtHeureDep.getText();
                String hArr = txtHeureArr.getText();
                double prix = Double.parseDouble(txtPrix.getText());

                Vol vol = new Vol(numero, date, hDep, hArr, prix);

                model.addRow(new Object[]{
                        vol.getNumeroVol(),
                        vol.getDateDepart(),
                        vol.getHeureDepart(),
                        vol.getHeureArrivee(),
                        vol.getPrix()
                });

                txtNumero.setText("");
                txtDate.setText("");
                txtHeureDep.setText("");
                txtHeureArr.setText("");
                txtPrix.setText("");
            }
        });
    }
}