
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JButton mitgliederButton;
    private JButton kurseButton;
    private JButton mitgliederAnzeigenButton;

    private JFrame mainFrame;

    public Main() {
        mainFrame = new JFrame("FitFirst");
        mitgliederButton = new JButton("Mitglieder");
        kurseButton = new JButton("Kurse");

        mitgliederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openMitgliederWindow();
            }
        });

        kurseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openKurseWindow();
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.add(mitgliederButton);
        mainPanel.add(kurseButton);


        mainFrame.getContentPane().add(mainPanel);
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    private void openMitgliederWindow() {
        JFrame mitgliederFrame = new JFrame("Mitglieder");
        JButton closeButton = new JButton("Zurück");
        JButton mitgliederAnzeigenButton = new JButton("Mitglieder anzeigen");
        JButton mitgliederHinzufuegenButton = new JButton("Mitglieder hinzufügen");

        mitgliederAnzeigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openmitgliederAnzeigenWindow();
            }
        });

        mitgliederHinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openmitgliederHinzufuegenWindow();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mitgliederFrame.dispose();
            }
        });

        JPanel mitgliederPanel = new JPanel();
        mitgliederPanel.add(mitgliederAnzeigenButton);
        mitgliederPanel.add(mitgliederHinzufuegenButton);
        mitgliederPanel.add(closeButton);

        mitgliederFrame.getContentPane().add(mitgliederPanel);
        mitgliederFrame.setSize(500, 500);
        mitgliederFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mitgliederFrame.setVisible(true);
    }

    private void openmitgliederAnzeigenWindow() {
        JFrame mitgliederAnzeigenFrame = new JFrame("Mitglieder - Mitglieder anzeigen");
        JButton closeButton = new JButton("Zurück");

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mitgliederAnzeigenFrame.dispose();
            }
        });

        JPanel mitgliederPanel = new JPanel();
        mitgliederPanel.add(closeButton);

        mitgliederAnzeigenFrame.getContentPane().add(mitgliederPanel);
        mitgliederAnzeigenFrame.setSize(500, 500);
        mitgliederAnzeigenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mitgliederAnzeigenFrame.setVisible(true);
    }

    private void openmitgliederHinzufuegenWindow() {
        JFrame mitgliederHinzufuegenFrame = new JFrame("Mitglieder - Mitglieder hinzufügen");
        JButton hinzufuegenButton = new JButton("Hinzufügen");
        JButton closeButton = new JButton("Zurück");

        JTextField mitgliedNummerField = new JTextField(20);
        JTextField nameField = new JTextField(20);
        JTextField geburtsdatumField = new JTextField(20);
        JTextField geschlechtField = new JTextField(20);
        JTextField fitnesskurseField = new JTextField(20);

        hinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String geburtsdatum = geburtsdatumField.getText();
                String adresse = mitgliedNummerField.getText();
                String geschlecht = geschlechtField.getText();
                String fitnesskurse = fitnesskurseField.getText();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mitgliederHinzufuegenFrame.dispose();
            }
        });

        JPanel mitgliederHinzufuegenPanel = new JPanel(new GridLayout(6, 2));
        mitgliederHinzufuegenPanel.add(new JLabel("Name:"));
        mitgliederHinzufuegenPanel.add(nameField);
        mitgliederHinzufuegenPanel.add(new JLabel("Geburtsdatum:"));
        mitgliederHinzufuegenPanel.add(geburtsdatumField);
        mitgliederHinzufuegenPanel.add(new JLabel("Adresse:"));
        mitgliederHinzufuegenPanel.add(mitgliedNummerField);
        mitgliederHinzufuegenPanel.add(new JLabel("Geschlecht:"));
        mitgliederHinzufuegenPanel.add(geschlechtField);
        mitgliederHinzufuegenPanel.add(new JLabel("Fitnesskurse:"));
        mitgliederHinzufuegenPanel.add(fitnesskurseField);
        mitgliederHinzufuegenPanel.add(hinzufuegenButton);
        mitgliederHinzufuegenPanel.add(closeButton);

        mitgliederHinzufuegenFrame.getContentPane().add(mitgliederHinzufuegenPanel);
        mitgliederHinzufuegenFrame.setSize(500, 500);
        mitgliederHinzufuegenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mitgliederHinzufuegenFrame.setVisible(true);
    }

    private void openKurseWindow() {
        JFrame kurseFrame = new JFrame("Kurse");
        JButton kurseAnzeigenButton = new JButton("Kurse anzeigen");
        JButton kurseHinzufuegenButton = new JButton("Kurse hinzufügen");
        JButton closeButton = new JButton("Zurück");

        kurseAnzeigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openkurseAnzeigenWindow();
            }
        });

        kurseHinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openkurseHinzufuegenWindow();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kurseFrame.dispose();
            }
        });

        JPanel kursePanel = new JPanel();
        kursePanel.add(kurseAnzeigenButton);
        kursePanel.add(kurseHinzufuegenButton);
        kursePanel.add(closeButton);

        kurseFrame.getContentPane().add(kursePanel);
        kurseFrame.setSize(500, 500);
        kurseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        kurseFrame.setVisible(true);
    }

    private void openkurseAnzeigenWindow() {
        JFrame kurseAnzeigenFrame = new JFrame("Kurse - Kurse anzeigen");
        JButton closeButton = new JButton("Zurück");

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kurseAnzeigenFrame.dispose();
            }
        });

        JPanel kursePanel = new JPanel();
        kursePanel.add(closeButton);

        kurseAnzeigenFrame.getContentPane().add(kursePanel);
        kurseAnzeigenFrame.setSize(500, 500);
        kurseAnzeigenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        kurseAnzeigenFrame.setVisible(true);
    }

    private void openkurseHinzufuegenWindow() {
        JFrame kurseHinzufuegenFrame = new JFrame("Kurse - Kurse hinzufügen");
        JButton closeButton = new JButton("Zurück");

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kurseHinzufuegenFrame.dispose();
            }
        });

        JPanel kursePanel = new JPanel();
        kursePanel.add(closeButton);

        kurseHinzufuegenFrame.getContentPane().add(kursePanel);
        kurseHinzufuegenFrame.setSize(500, 500);
        kurseHinzufuegenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        kurseHinzufuegenFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}