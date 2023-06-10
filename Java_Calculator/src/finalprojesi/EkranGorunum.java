package finalprojesi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EkranGorunum extends JFrame {
    public JTextField yaziAlani = new JTextField();
    public JTextField bellek = new JTextField();
    private double sayi1;
    private String islem;

    public EkranGorunum() {
        setSize(540, 540);
        setTitle("Hesap Makinesi");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Butonlar - Satır Sırasına Göre Aralıklı / Bir Panel Altında Hepsi Toplandı
        JPanel butonlar = new JPanel();
        butonlar.setBounds(80, 130, 350, 375);
        butonlar.setLayout(null);

        JButton btn1 = new JButton("1");
        btn1.setBounds(20, 20, 65, 65);
        butonlar.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(95, 20, 65, 65);
        butonlar.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(170, 20, 65, 65);
        butonlar.add(btn3);

        JButton btnC = new JButton("C");
        btnC.setBounds(245, 20, 50, 50);
        butonlar.add(btnC);

        JButton btn4 = new JButton("4");
        btn4.setBounds(20, 90, 65, 65);
        butonlar.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(95, 90, 65, 65);
        butonlar.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(170, 90, 65, 65);
        butonlar.add(btn6);

        JButton btnArti = new JButton("+");
        btnArti.setBounds(245, 75, 50, 50);
        butonlar.add(btnArti);

        JButton btn7 = new JButton("7");
        btn7.setBounds(20, 160, 65, 65);
        butonlar.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(95, 160, 65, 65);
        butonlar.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(170, 160, 65, 65);
        butonlar.add(btn9);

        JButton btnEksi = new JButton("-");
        btnEksi.setBounds(245, 130, 50, 50);
        butonlar.add(btnEksi);

        JButton btnDot = new JButton(".");
        btnDot.setBounds(20, 230, 65, 65);
        butonlar.add(btnDot);

        JButton btn0 = new JButton("0");
        btn0.setBounds(95, 230, 65, 65);
        butonlar.add(btn0);

        JButton btnEsit = new JButton("=");
        btnEsit.setBounds(170, 230, 65, 65);
        butonlar.add(btnEsit);

        JButton btnBolme = new JButton("/");
        btnBolme.setBounds(245, 185, 50, 50);
        butonlar.add(btnBolme);

        JButton btnCarpi = new JButton("x");
        btnCarpi.setBounds(245, 240, 50, 50);
        butonlar.add(btnCarpi);

        JButton btnTers = new JButton("1/x");
        btnTers.setBounds(100, 300, 55, 50);
        butonlar.add(btnTers);

        // TextField Eklenen Yer
        yaziAlani.setEditable(false);
        yaziAlani.setBounds(95, 60, 290, 75);
        yaziAlani.setBackground(Color.white);
        yaziAlani.setHorizontalAlignment(JTextField.RIGHT);
        Font font = yaziAlani.getFont();
        Font buyukFont;
        buyukFont = font.deriveFont(5f + font.getSize());
        yaziAlani.setFont(buyukFont);

        bellek.setEditable(false);
        bellek.setBounds(95, 30, 290, 30);
        bellek.setHorizontalAlignment(JTextField.RIGHT);
        

        // Butonlara Basmalar
        btnArti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Double.parseDouble(yaziAlani.getText());
                islem = "+";
                yaziAlani.setText("");
                bellek.setText(sayi1+"+");
            }
        });

        btnEksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Double.parseDouble(yaziAlani.getText());
                islem = "-";
                yaziAlani.setText("");
                bellek.setText(sayi1+"-");
            }
        });

        btnCarpi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Double.parseDouble(yaziAlani.getText());
                islem = "x";
                yaziAlani.setText("");
                bellek.setText(sayi1+"x");
            }
        });

        btnBolme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Double.parseDouble(yaziAlani.getText());
                islem = "/";
                yaziAlani.setText("");
                bellek.setText(sayi1+"/");
            }
        });

        btnEsit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi2 = Double.parseDouble(yaziAlani.getText());
                double sonuc = 0;

                if (islem.equals("+")) {
                    sonuc = sayi1 + sayi2;
                } else if (islem.equals("-")) {
                    sonuc = sayi1 - sayi2;
                } else if (islem.equals("x")) {
                    sonuc = sayi1 * sayi2;
                } else if (islem.equals("/")) {
                    sonuc = sayi1 / sayi2;
                }

                yaziAlani.setText(String.valueOf(sonuc));
                bellek.setText("");
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText("");
                bellek.setText("");
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yaziAlani.setText(yaziAlani.getText() + e.getActionCommand());
            }
        });

        btnTers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi = Double.parseDouble(yaziAlani.getText());
                double sonuc = 1 / sayi;
                yaziAlani.setText(String.valueOf(sonuc));
            }
        });

        add(yaziAlani);
        add(butonlar);
        add(bellek);
    }
}
