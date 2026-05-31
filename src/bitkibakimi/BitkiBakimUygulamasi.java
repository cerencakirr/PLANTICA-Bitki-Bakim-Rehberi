package bitkibakimi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.regex.Pattern;
import java.security.MessageDigest;
import java.io.File;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;
import java.util.ArrayList;


public class BitkiBakimUygulamasi extends JFrame {
    private ArrayList<Kullanici> kullanicilar = new ArrayList<>();
    private Kullanici aktifKullanici;
    private CardLayout cardLayout = new CardLayout();
    private JPanel mainPanel = new JPanel(cardLayout);
    
    private JTextField txtMail, txtKullaniciAdi, txtKayitMail;
    private JPasswordField txtSifre, txtKayitSifre;
    private JLabel lblGirisMesaj, lblKayitMesaj;
    private JLabel lblBitkiResim, lblBitkiAdi, lblBilimselIsim;
    private JTextArea txtBakim, txtDetay;
    private JPanel arkaPlanPanel;
    private JLabel backgroundLabel;



    private JPanel arkaPlanliPanel(JPanel panel) {
        URL imageUrl = getClass().getResource("/images/bitkiarkaplan.jpg");
        if (imageUrl != null) {
            backgroundLabel = new JLabel(new ImageIcon(imageUrl));
        } else {
            System.out.println("Arka plan resmi bulunamadı!");
            backgroundLabel = new JLabel();
        }
        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.add(panel, BorderLayout.CENTER);

        JPanel arkaPlanPanel = new JPanel(new BorderLayout());
        arkaPlanPanel.add(backgroundLabel, BorderLayout.CENTER);

        return arkaPlanPanel;
    }

    
    private JPanel ustPanel = new JPanel(new BorderLayout());
    private JPanel aramaPanel = new JPanel();
    private JPanel profilPanel = new JPanel(new GridBagLayout());
    private JComboBox<String> comboBitkiTurleri;
    private JPanel bitkiListePanel = new JPanel(new GridLayout(2, 5, 10, 10));

  
    

    public BitkiBakimUygulamasi() {
        setTitle("Bitki Bakım Uygulaması");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        mainPanel.setOpaque(false);
        mainPanel.add(girisPaneli(), "GIRIS");
        mainPanel.add(kayitPaneli(), "KAYIT");
        mainPanel.add(secimPaneli(), "SECIM");
        mainPanel.add(bitkiDetayPaneli(), "DETAY");

        setContentPane(arkaPlanliPanel(mainPanel));

        cardLayout.show(mainPanel, "GIRIS");
    }
    
    private void bitkiDetayGoster(Bitki bitki) {  
        lblBitkiAdi.setText("Adı: " + bitki.getAd());  
        lblBilimselIsim.setText("Bilimsel İsmi: " + bitki.getBilimselIsim());  
        txtDetay.setText("Genel Bilgi:\n" + bitki.getGenelBilgi());  
        txtBakim.setText("Bakım Bilgisi:\n" + bitki.getBakimBilgisi());  
    }


    
    private JPanel bitkiDetayPaneli() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;

        lblBitkiAdi = new JLabel("", JLabel.CENTER);
        lblBilimselIsim = new JLabel("", JLabel.CENTER);

        txtDetay = new JTextArea(5, 30);
        txtDetay.setEditable(false);
        txtDetay.setWrapStyleWord(true);
        txtDetay.setLineWrap(true);

        txtBakim = new JTextArea(5, 30);
        txtBakim.setEditable(false);
        txtBakim.setWrapStyleWord(true);
        txtBakim.setLineWrap(true);

        JButton btnGeri = new JButton("Geri");
        btnGeri.addActionListener(e -> cardLayout.show(mainPanel, "SECIM"));

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; panel.add(lblBitkiAdi, gbc);
        gbc.gridy = 1; panel.add(lblBilimselIsim, gbc);
        gbc.gridy = 2; panel.add(new JScrollPane(txtDetay), gbc);
        gbc.gridy = 3; panel.add(new JScrollPane(txtBakim), gbc);
        gbc.gridy = 4; gbc.gridwidth = 1; panel.add(btnGeri, gbc);

        return panel;
    }
    
    private JPanel secimPaneli() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);

       
        JPanel ustPanel = new JPanel(new BorderLayout());

        
        aramaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnArama = new JButton("🔍 Arama");
        aramaPanel.add(btnArama);
        ustPanel.add(aramaPanel, BorderLayout.WEST);

      
        profilPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnProfil = new JButton("⚙️ Profilim");
        profilPanel.add(btnProfil);
        ustPanel.add(profilPanel, BorderLayout.EAST);

        
        JPanel merkezSecimPanel = new JPanel();
        merkezSecimPanel.setOpaque(false);
        String[] turler = {"Ağaç", "Çiçek", "Meyve", "Sebze"};
        comboBitkiTurleri = new JComboBox<>(turler);
        JButton btnListele = new JButton("Listele");
        merkezSecimPanel.add(new JLabel("Bitki Türü Seçin:"));
        merkezSecimPanel.add(comboBitkiTurleri);
        merkezSecimPanel.add(btnListele);
        ustPanel.add(merkezSecimPanel, BorderLayout.CENTER);

        panel.add(ustPanel, BorderLayout.NORTH);

        
        bitkiListePanel = new JPanel(new GridLayout(2, 5, 10, 10));
        bitkiListePanel.setOpaque(false);
        JScrollPane scrollPane = new JScrollPane(bitkiListePanel);
        panel.add(scrollPane, BorderLayout.CENTER);

        
        btnListele.addActionListener(e -> {
            bitkiListePanel.removeAll();
            List<Bitki> filtrelenmis = new ArrayList<>();
            String secilen = (String) comboBitkiTurleri.getSelectedItem();

            if (secilen.equals("Ağaç")) filtrelenmis.addAll(Agac.getAgacTuruListesi());
            else if (secilen.equals("Çiçek")) filtrelenmis.addAll(Cicek.getCicekTuruListesi());
            else if (secilen.equals("Meyve")) filtrelenmis.addAll(Meyve.getMeyveTuruListesi());
            else if (secilen.equals("Sebze")) filtrelenmis.addAll(Sebze.getSebzeTuruListesi());

            for (Bitki bitki : filtrelenmis) {
                URL imgUrl = getClass().getResource("/images/" + bitki.getGorselYolu());
                ImageIcon icon = null;
                if (imgUrl != null) {
                    Image scaled = new ImageIcon(imgUrl).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    icon = new ImageIcon(scaled);
                }

                JButton btnBitki = new JButton(bitki.getAd(), icon);
                btnBitki.setVerticalTextPosition(SwingConstants.BOTTOM);
                btnBitki.setHorizontalTextPosition(SwingConstants.CENTER);
                btnBitki.setPreferredSize(new Dimension(120, 120));
                btnBitki.setBackground(Color.decode("#beeb9f"));
                btnBitki.setOpaque(true);
                btnBitki.setBorderPainted(false);

                btnBitki.addActionListener(e2 -> {
                    bitkiDetayGoster(bitki);
                    cardLayout.show(mainPanel, "DETAY");
                });

                bitkiListePanel.add(btnBitki);
            }

            bitkiListePanel.revalidate();
            bitkiListePanel.repaint();
        });

        
        btnArama.addActionListener(e -> {
            JDialog aramaDialog = new JDialog();
            aramaDialog.setTitle("Bitki Arama");
            aramaDialog.setSize(300, 150);
            aramaDialog.setLayout(new GridBagLayout());
            aramaDialog.setLocationRelativeTo(null);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            JTextField txtArama = new JTextField(15);
            JButton btnAra = new JButton("🔎 Ara");

            gbc.gridx = 0; gbc.gridy = 0;
            aramaDialog.add(new JLabel("Bitki İsmi:"), gbc);
            gbc.gridx = 1;
            aramaDialog.add(txtArama, gbc);

            gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
            aramaDialog.add(btnAra, gbc);

            btnAra.addActionListener(e2 -> {
                String aranan = txtArama.getText().toLowerCase();
                bitkiListePanel.removeAll();

                List<Bitki> tumBitkiler = new ArrayList<>();
                tumBitkiler.addAll(Agac.getAgacTuruListesi());
                tumBitkiler.addAll(Cicek.getCicekTuruListesi());
                tumBitkiler.addAll(Meyve.getMeyveTuruListesi());
                tumBitkiler.addAll(Sebze.getSebzeTuruListesi());

                for (Bitki bitki : tumBitkiler) {
                    if (bitki.getAd().toLowerCase().contains(aranan)) {
                        JButton btnBitki = new JButton(bitki.getAd(), new ImageIcon(getClass().getResource("/images/" + bitki.getGorselYolu())));
                        btnBitki.setVerticalTextPosition(SwingConstants.BOTTOM);
                        btnBitki.setHorizontalTextPosition(SwingConstants.CENTER);
                        btnBitki.setPreferredSize(new Dimension(120, 120));
                        btnBitki.addActionListener(ev -> {
                            bitkiDetayGoster(bitki);
                            cardLayout.show(mainPanel, "DETAY");
                        });
                        bitkiListePanel.add(btnBitki);
                    }
                }

                bitkiListePanel.revalidate();
                bitkiListePanel.repaint();
                aramaDialog.dispose();
            });

            aramaDialog.setVisible(true);
        });

        
        btnProfil.addActionListener(e -> {
            JDialog profilDialog = new JDialog();
            profilDialog.setTitle("Kullanıcı Bilgileri");
            profilDialog.setSize(600, 600);
            profilDialog.setLayout(new GridBagLayout());
            profilDialog.setLocationRelativeTo(null);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            gbc.gridx = 0; gbc.gridy = 0;
            profilDialog.add(new JLabel("Ad: " + aktifKullanici.getKullaniciAdi()), gbc);

            gbc.gridy = 1;
            profilDialog.add(new JLabel("E-posta: " + aktifKullanici.getMail()), gbc);

            JPasswordField txtEskiSifre = new JPasswordField(20);
            txtEskiSifre.setPreferredSize(new Dimension(250, 30));  
            txtEskiSifre.setEnabled(true);
            txtEskiSifre.setEditable(true);
            JPasswordField txtYeniSifre = new JPasswordField(20);
            txtYeniSifre.setPreferredSize(new Dimension(250, 30));
            txtYeniSifre.setEnabled(true);
            txtYeniSifre.setEditable(true);
            JButton btnSifreDegistir = new JButton("🔑 Şifreyi Değiştir");

            gbc.gridy = 2; gbc.gridx = 0;
            profilDialog.add(new JLabel("Eski Şifre:"), gbc);
            gbc.gridx = 1;
            profilDialog.add(txtEskiSifre, gbc);

            gbc.gridy = 3; gbc.gridx = 0;
            profilDialog.add(new JLabel("Yeni Şifre:"), gbc);
            gbc.gridx = 1;
            profilDialog.add(txtYeniSifre, gbc);

            gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
            profilDialog.add(btnSifreDegistir, gbc);

            btnSifreDegistir.addActionListener(e2 -> {
                String eskiSifre = new String(txtEskiSifre.getPassword());
                String yeniSifre = new String(txtYeniSifre.getPassword());

                if (!hashPassword(eskiSifre).equals(aktifKullanici.getSifre())) {
                    JOptionPane.showMessageDialog(null, "Eski şifre yanlış!");
                    return;
                }

                aktifKullanici.setSifre(eskiSifre, yeniSifre);
                JOptionPane.showMessageDialog(null, "Şifre başarıyla değiştirildi!");
            });

            JButton btnCikis = new JButton("🚪 Çıkış Yap");
            gbc.gridy = 5;
            profilDialog.add(btnCikis, gbc);

            btnCikis.addActionListener(e2 -> {
                profilDialog.dispose();
                cardLayout.show(mainPanel, "GIRIS");
            });

            profilDialog.setVisible(true);
        });

        return panel;
    }




    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Şifre hashleme hatası", e);
        }
    }
    
    
    private JPanel girisPaneli() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel lblMail = new JLabel("E-mail:");
        JLabel lblSifre = new JLabel("Şifre:");

        txtMail = new JTextField(20);
        txtSifre = new JPasswordField(20);

        JButton btnGiris = new JButton("Giriş Yap");
        JButton btnKayitSayfasi = new JButton("Kayıt Ol");

        lblGirisMesaj = new JLabel(" ");

        btnGiris.addActionListener(e -> {
            String mail = txtMail.getText().trim();
            String sifre = new String(txtSifre.getPassword());

            if (!isValidEmail(mail) || sifre.isEmpty()) {
                lblGirisMesaj.setText("E-mail veya şifre geçersiz");
                return;
            }

            String hash = hashPassword(sifre);
            for (Kullanici k : kullanicilar) {
                if (k.getMail().equalsIgnoreCase(mail) && k.getSifre().equals(hash)) {
                    aktifKullanici = k;
                    cardLayout.show(mainPanel, "SECIM");
                    return;
                }
            }
            lblGirisMesaj.setText("Bilgiler uyuşmuyor");
        });

        btnKayitSayfasi.addActionListener(e -> cardLayout.show(mainPanel, "KAYIT"));

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 0; panel.add(lblMail, gbc);
        gbc.gridx = 1; panel.add(txtMail, gbc);
        gbc.gridx = 0; gbc.gridy = 1; panel.add(lblSifre, gbc);
        gbc.gridx = 1; panel.add(txtSifre, gbc);
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; panel.add(lblGirisMesaj, gbc);
        gbc.gridy = 3; gbc.gridwidth = 1; gbc.gridx = 0; panel.add(btnGiris, gbc);
        gbc.gridx = 1; panel.add(btnKayitSayfasi, gbc);

        return panel;
    }

    private JPanel kayitPaneli() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel lblKullaniciAdi = new JLabel("Kullanıcı Adı:");
        JLabel lblMail = new JLabel("E-mail:");
        JLabel lblSifre = new JLabel("Şifre:");

        txtKullaniciAdi = new JTextField(20);
        txtKayitMail = new JTextField(20);
        txtKayitSifre = new JPasswordField(20);

        lblKayitMesaj = new JLabel(" ");

        JButton btnKayit = new JButton("Kayıt Ol");
        JButton btnGeri = new JButton("Geri");

        btnKayit.addActionListener(e -> {
            String kullaniciAdi = txtKullaniciAdi.getText().trim();
            String mail = txtKayitMail.getText().trim();
            String sifre = new String(txtKayitSifre.getPassword());

            if (!isValidEmail(mail) || !isValidPassword(sifre)) {
                lblKayitMesaj.setText("Geçersiz bilgi girdiniz.");
                return;
            }

            for (Kullanici k : kullanicilar) {
                if (k.getMail().equalsIgnoreCase(mail)) {
                    lblKayitMesaj.setText("Bu mail zaten kullanımda.");
                    return;
                }
            }

            kullanicilar.add(new Kullanici(kullaniciAdi, mail, sifre));
            lblKayitMesaj.setText("Kayıt başarılı");
        });

        btnGeri.addActionListener(e -> cardLayout.show(mainPanel, "GIRIS"));

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 0; panel.add(lblKullaniciAdi, gbc);
        gbc.gridx = 1; panel.add(txtKullaniciAdi, gbc);
        gbc.gridx = 0; gbc.gridy = 1; panel.add(lblMail, gbc);
        gbc.gridx = 1; panel.add(txtKayitMail, gbc);
        gbc.gridx = 0; gbc.gridy = 2; panel.add(lblSifre, gbc);
        gbc.gridx = 1; panel.add(txtKayitSifre, gbc);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2; panel.add(lblKayitMesaj, gbc);
        gbc.gridy = 4; gbc.gridwidth = 1; gbc.gridx = 0; panel.add(btnKayit, gbc);
        gbc.gridx = 1; panel.add(btnGeri, gbc);

        return panel;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$"; 
        return Pattern.matches(emailRegex, email);
    }


    private boolean isValidPassword(String password) {
        return password.length() >= 8 &&  // En az 8 karakter olmalı
               password.matches(".*[A-Z].*") && // En az 1 büyük harf
               password.matches(".*[a-z].*") && // En az 1 küçük harf
               password.matches(".*[0-9].*") && // En az 1 rakam
               password.matches(".*[!@#$%^&*()-_+=].*"); // En az 1 özel karakter
    }


    private class Kullanici {
        private String kullaniciAdi, mail, sifre;
        public Kullanici(String k, String m, String s) {
            kullaniciAdi = k;
            mail = m;
            sifre = hashPassword(s);
        }

        public String getKullaniciAdi() { return kullaniciAdi; }
        public String getMail() { return mail; }
        public String getSifre() { return sifre; }

        public void setSifre(String eskiSifre, String yeniSifre) {
            if (!hashPassword(eskiSifre).equals(this.sifre)) {
                throw new IllegalArgumentException("Eski şifre yanlış!");
            }
            this.sifre = hashPassword(yeniSifre);
        }
    }

    // ✅ Artık Kullanici sınıfının dışında, BitkiBakimUygulamasi sınıfının içinde
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BitkiBakimUygulamasi uygulama = new BitkiBakimUygulamasi();
            uygulama.setVisible(true);
        });
    }
}

