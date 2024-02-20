package projetaslak;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;



public class Main {
    
    private static JFrame pencere1;
    private static JFrame pencere2;
    private static JFrame pencere3;
    private static JFrame pencere4;
    private static JOptionPane panelim;
    private static JOptionPane panel2;
    private static JComboBox<String> comboBox;
    
    public static Company Selected = null;
    
    
    //admin kullanıcı adı ve şifresi admin class'ının içinde
    

    public static void newTab() {

        //pencere1.dispose();     //1. pencerenin kapanmasını sağlar

        pencere2 = new JFrame();
        pencere2.setSize(400, 360);
        pencere2.setLocation(600, 100);
        pencere2.setLayout(new FlowLayout());

        pencere2.setVisible(true);

    }

    public static void main(String[] args) {
        
        //admin ve company nesneleri tanımlama ve şifre oluşturma
        Admin admin = new Admin("admin" , "admin");
        Company company = new Company("company","company","company");
            
        Company A = new Company("a","a","A");
        admin.addToArrayList(A);
        Company B = new Company("b","b","B");
        admin.addToArrayList(B);
        Company C = new Company("c","c","C");
        admin.addToArrayList(C);
        Company D = new Company("d","d","D");
        admin.addToArrayList(D);
        Company F = new Company("f","f","F");
        admin.addToArrayList(F);
        
        
       
        /*
        
        Trip trip1 = new Trip("Istanbul - Kocaeli - Ankara");
        Trip trip2 = new Trip("Istanbul - Kocaeli - Eskisehir - Konya");
        A.addToSefer(trip1);
        B.addToSefer(trip1);
        B.addToSefer(trip2);
        C.addToSefer(trip2);
        
        
        Trip trip3 = new Trip("Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara");
        Trip trip4 = new Trip("Istanbul - Kocaeli - Bilecik - Eskisehir - Konya");
        D.addToSefer(trip3);
        D.addToSefer(trip4);
        
        Trip trip5 = new Trip("Istanbul - Konya");
        Trip trip6 = new Trip("Istanbul - Ankara");
        C.addToSefer(trip5);
        F.addToSefer(trip6);
        
        */
        
        
        
        ///////////////
        
        //admin.addToArrayList("Kamil Koc");
        //admin.addToArrayList("Pegasus");
        
        ///////////////
        
        Main proje = new Main();
        pencere1 = new JFrame();
        pencere1.setVisible(true);
        pencere1.setTitle("WHICH TYPE OF USER ARE YOU ?");
        pencere1.setSize(400, 360);
        pencere1.setLocation(1000, 100);
        //pencere1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere1.setLayout(new FlowLayout());

        
        JLabel label1 = new JLabel();
        label1.setText("Admin Kullanıcı adı giriniz :");
        pencere1.getContentPane().add(label1);

        JTextField text1 = new JTextField(20);
        pencere1.getContentPane().add(text1);

        JLabel label2 = new JLabel();
        label2.setText("Admin şifrenizi giriniz       :");
        pencere1.getContentPane().add(label2);
    
        JTextField text2 = new JTextField(20);
        pencere1.getContentPane().add(text2);
        
        JButton adminButton = new JButton("Admin Submit");
        pencere1.getContentPane().add(adminButton);
        
        
        pencere1.add(Box.createRigidArea(new Dimension(200, 50))); //Boşluk eklemek için kullandık
        
        
        JLabel label3 = new JLabel();
        label3.setText("Şirket Kullanıcı adı giriniz :");
        pencere1.getContentPane().add(label3);

        JTextField text3 = new JTextField(20);
        pencere1.getContentPane().add(text3);

        JLabel label4 = new JLabel();
        label4.setText("Şirket şifrenizi giriniz       :");
        pencere1.getContentPane().add(label4);
    
        JTextField text4 = new JTextField(20);
        pencere1.getContentPane().add(text4);
        
        JButton companyButton = new JButton("Company Submit");
        pencere1.getContentPane().add(companyButton);
        
        
        pencere1.add(Box.createRigidArea(new Dimension(200, 50))); //Boşluk eklemek için kullandık
        
        JButton userButton = new JButton("BILET AL");
        pencere1.getContentPane().add(userButton);
        
        
        JOptionPane panel = new JOptionPane();

        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                pencere1.dispose();
                
                String adminUser = text1.getText();
                String adminPass = text2.getText();
                if(adminUser.equals(admin.getUsername()) && adminPass.equals(admin.getPassword()))
                {
                    
                    proje.newTab();
                    
                    pencere2.setTitle("Admin Penceresi");
                    JButton firmaGoruntule = new JButton("Firmaları Goruntule");
                    JButton firmaKaydi = new JButton("Firma Kaydet");
                    JButton firmaSilme = new JButton("Firma Sil");
                    JButton hizmetBedeli = new JButton("Hizmet Bedeli Belirle");
                    JButton geriTusu = new JButton("Geri Dön");
                    
                    
                    
                    pencere2.getContentPane().add(firmaGoruntule);
                    pencere2.getContentPane().add(firmaKaydi);
                    pencere2.getContentPane().add(firmaSilme);
                    pencere2.getContentPane().add(hizmetBedeli);
                    pencere2.getContentPane().add(geriTusu);
                    
                    
                    JOptionPane panelim = new JOptionPane();
                    
                    
                    firmaGoruntule.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            
                            String temp = "";
                            
                            if(admin.getCompanyList().isEmpty())
                                panel.showMessageDialog(null,"Kayıtlı Bir Firma Bulunmamaktadır !");
                                
                            for(Company s : admin.getCompanyList())
                            {
                                temp = temp + s.getName() + "\n";
                            }
                            
                            panelim.showMessageDialog(null,temp);

                    }
                });
                    
                    
                    firmaKaydi.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                            String yeniSirket = panelim.showInputDialog("Şirket ismi :");
                            String kullaniciAdi = panelim.showInputDialog("Kullanıcı adı :");
                            String sifre = panelim.showInputDialog("Şifre :");
                        
                            
                            Company company1 = new Company(kullaniciAdi,sifre,yeniSirket);
                            admin.addToArrayList(company1);
                            
                            

                    }
                });
                    
                    
                    firmaSilme.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                            if(admin.getCompanyList().isEmpty())
                            {
                                panel.showMessageDialog(null,"Kayıtlı firma bulunamadı!");
                            }
                            
                            String silinecekSirket = panelim.showInputDialog("Silmek İstediğiniz Şirketin Adını Giriniz :");
                            
                            boolean kontrol = false;
                            int i=0,j=0;
                            
                            for(Company s : admin.getCompanyList())
                            {
                                i++;
                                if(silinecekSirket.equalsIgnoreCase(s.getName()))
                                {
                                    kontrol = true;
                                    j = i;
                                }
                                    
                            }
                            
                            if(kontrol == false)
                            {
                                panel.showMessageDialog(null,"Girdiğiniz isimde bir şirket yok !");
                            }
                            else
                            {
                                admin.removeFromArrayList(j-1);
                                panel.showMessageDialog(null,"Company Has Been Deleted Succesfully! ");
                            }
                

                    }
                });
                    
                    
                    
                    hizmetBedeli.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                            String deger1 = JOptionPane.showInputDialog("Lütfen bir değer girin:");
                            Integer deger = Integer.valueOf(deger1);
                            admin.setHizmetParasi(deger);
                            JOptionPane.showMessageDialog(null, "HİZMET BEDELİ: "+String.valueOf(admin.getHizmetParasi()), "HİZMET BEDELİ", JOptionPane.INFORMATION_MESSAGE);
                

                    }
                });
                    
                    
                    geriTusu.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                        pencere1.setVisible(true); // Önceki pencereyi tekrar görünür yap
                        pencere2.dispose();

                    }
                });
                    
                    
          
                    
                }
                else if(!adminUser.equals(admin.getUsername()) && adminPass.equals(admin.getPassword()))
                {
                    panel.showMessageDialog(null,"Kullanıcı adı yanlış tekrar deneyiniz !");
                }
                else if(adminUser.equals(admin.getUsername()) && !adminPass.equals(admin.getPassword()))
                {
                    panel.showMessageDialog(null,"Şifre yanlış tekrar deneyiniz !");
                }
                else
                {
                    panel.showMessageDialog(null,"Hem kullanıcı adı hem şifre yanlış tekrar deneyiniz !");
                }
                

            }
        });
        
        
        
        

        companyButton.addActionListener((ActionEvent e) -> {
            panel2 = new JOptionPane();
            
            pencere1.dispose();
            
            String compUser = text3.getText();
            String compPass = text4.getText();
            
            boolean kontrol = false;
            int i=0;
                           
            for(Company s : admin.getCompanyList())
            {
                i++;
                    
                if(compUser.equals(s.getUsername()) && compPass.equals(s.getPassword()))
                {
                    kontrol = true;
                    Main.Selected = s;
                    break;
                } 
            
            }
                            
            if(kontrol == false)
            {
                panel.showMessageDialog(null,"Girdiğiniz Bilgilerle Eşleşen Bir Şirket Yok!");
            }
            else
            {
                
                pencere3 = new JFrame();
                pencere3.setSize(400, 360);
                pencere3.setLocation(600, 100);
                pencere3.setLayout(new FlowLayout());
                pencere3.setVisible(true);

                pencere3.setTitle("Company Paneli");
                JButton aracEkle = new JButton("Araç Ekle");
                JButton aracCikar = new JButton("Araç Çıkar");
                JButton seferEkle = new JButton("Sefer Ekle");
                JButton seferCikar = new JButton("Sefer Çıkar");
                JButton karHesabi = new JButton("Kar Hesabı");
                JButton geriTusu = new JButton("Geri");
                    
                pencere3.getContentPane().add(aracEkle);
                pencere3.getContentPane().add(aracCikar);
                pencere3.getContentPane().add(seferEkle);
                pencere3.getContentPane().add(seferCikar);
                pencere3.getContentPane().add(karHesabi);
                pencere3.getContentPane().add(geriTusu);

                aracEkle.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) { 
                        pencere3.dispose();
                        
                        pencere4 = new JFrame();
                        pencere4.setVisible(true);
                        pencere4.setTitle("Araç Ekleme");
                        pencere4.setSize(400, 360);
                        pencere4.setLocation(1000, 100);
                        pencere4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        pencere4.setLayout(new FlowLayout());
                        
                        JButton geri = new JButton("Geri Dön");
                        pencere4.getContentPane().add(geri);
                        
                        
                        String[] araclar = {"Bus" , "Train" , "Plane"};
                        comboBox = new JComboBox<>(araclar);
                        comboBox.setPreferredSize(new Dimension(100,20));
                        pencere4.add(comboBox);
                        
                        comboBox.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent e) {
                            String selected = (String) comboBox.getSelectedItem();
                            
                            switch(selected) {
                            case "Bus":
                                Main.Selected.addToVehicle(new Bus("Bus"));
                                break;
                            case "Train":
                                Main.Selected.addToVehicle(new Train("Train"));
                                break;
                            case "Plane":
                                Main.Selected.addToVehicle(new Airplane("Plane"));
                                break;
                            default:
                                System.out.println("HATALI GİRİŞ!!!!!");
                                System.exit(1);
                            }
                            
                            String temp1 = "";
                            
                            for(Vehicle s : Selected.aracListe())
                            {
                                temp1 = temp1 + s.getAracTuru() + "\n";
                            }
                            panel.showMessageDialog(null,   temp1);
                            
                    geri.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                        pencere3.setVisible(true); // Önceki pencereyi tekrar görünür yap
                        pencere4.dispose();

                    }
                });
                             
                            
                      }
                     });
                        

                    }
                });     
                    
                    
                    
                    seferEkle.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) { 
                        pencere3.dispose();
                            
                        // String eklenecekSefer = panel2.showInputDialog("Sefer Giriniz :");
                        // Trip yeniTrip = new Trip(eklenecekSefer);
                           
                        pencere4= new JFrame();
                        pencere4.setTitle("Sefer Ekle");
                        pencere4.setSize(1000, 600); //Pencere boyutunu ayarla
                        pencere4.setVisible(true); //Pencereyi göster
                        pencere4.setLayout(new FlowLayout());
                        JButton geri = new JButton("Geri Dön");
                        
                        pencere4.getContentPane().add(geri);

                        // Ana pencereyi kapatma işlemi
                        pencere4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        
                        // Sefer adları
                        String[] seferler = {
                                "1.sefer Demiryolu: Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir - Bilecik - Kocaeli - Istanbul (gidiş-dönüş)",//50-150-200-250
                                "2.sefer Demiryolu: Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul (gidiş-dönüş)",//50-150-200-250-300
                                "3.sefer Karayolu: Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul (gidiş-dönüş)",
                                "4.sefer Karayolu: Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul (gidiş-dönüş)",
                                "5.sefer Havayolu: Istanbul - Konya - Istanbul (gidiş-dönüş)",
                                "6.sefer Havayolu: Istanbul - Ankara - Istanbul (gidiş-dönüş)"
                        };

                        comboBox = new JComboBox<>(seferler);
                        comboBox.setPreferredSize(new Dimension(800,45));
                        pencere4.add(comboBox);
                        

                        comboBox.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent e) {
                             
                            String selected = (String) comboBox.getSelectedItem();
                            Selected.addToSefer(new Trip(selected));
                            
                            for(Trip s : Main.Selected.seferListe())
                            {
                                panel.showMessageDialog(null,s.getGuzergah());
                            }
                            
                            
                      }
                     });
                        
                    geri.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                        pencere3.setVisible(true); // Önceki pencereyi tekrar görünür yap
                        pencere4.dispose();

                    }
                });

                    }
                        
                });
                    
                    
                    
                    aracCikar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {   
                        pencere4 = new JFrame();
                        pencere4.setVisible(true);
                        pencere4.setTitle("Araç Ekleme");
                        pencere4.setSize(400, 360);
                        pencere4.setLocation(1000, 100);
                        pencere4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        pencere4.setLayout(new FlowLayout());
                        
                        
                        JButton geri = new JButton("Geri Dön");
                        pencere4.getContentPane().add(geri);
                        
                        String silinecekArac = panel.showInputDialog("Silmek istediğiniz aracı giriniz :");
                        
                        boolean kontrol = true;
                        int k=0;
                        for(Vehicle s : Selected.aracListe())
                        {
                            if(silinecekArac.equalsIgnoreCase(s.getAracTuru()))
                            {
                                kontrol = false;
                            }
                        }
                        
                        if(kontrol == true)
                        {
                            panel.showMessageDialog(null,"Bu şirketin listesinde silmek istediğiniz araç yok");
                        }
                        else
                        {
                            Selected.removeFromVehicle(k);
                            panel.showMessageDialog(null,"Araç başarıyla silindi");
                        }

                        
                            
                    geri.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                        pencere3.setVisible(true); // Önceki pencereyi tekrar görünür yap
                        pencere4.dispose();

                    }
                });
                            
                

                    }
                });
                    
                    
                    seferCikar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            pencere3.dispose();
                            
                            
                        pencere4 = new JFrame();
                        pencere4.setVisible(true);
                        pencere4.setTitle("Araç Ekleme");
                        pencere4.setSize(400, 360);
                        pencere4.setLocation(1000, 100);
                        pencere4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        pencere4.setLayout(new FlowLayout());
                        
                        JButton geri = new JButton("Geri Dön");
                        pencere4.getContentPane().add(geri);
                            
                            
                            String[] seferler = null;
                            
                            
                            if(Selected.seferListe().isEmpty())
                            {
                                panel.showMessageDialog(null,"Kayıtlı Sefer Bulunamadı!");
                            }
                            
                            int  i=0;
                            for(Trip s : Selected.seferListe())
                            {
                                seferler[i] = s.getGuzergah();
                                i++;
                            }
                            
                        comboBox = new JComboBox<>(seferler);
                        comboBox.setPreferredSize(new Dimension(800,45));
                        pencere4.add(comboBox);
                        
                        comboBox.addItemListener(new ItemListener() {
                            public void itemStateChanged(ItemEvent e) {
                                
                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                    
                                   String selectedValue = (String) comboBox.getSelectedItem();
                    
                              }
                           }
                       });
                        
                        int k=0;
                        for(Trip s : Selected.seferListe())
                        {
                            k++;
                            if(selectedValue.equalsIgnoreCase(s.getGuzergah()))
                            {
                                Selected.removeFromSefer(k);
                                break;
                            }
                        }      
                        
                        
                        
                            
                        geri.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {  
                            
                            pencere3.setVisible(true); // Önceki pencereyi tekrar görünür yap
                            pencere4.dispose();

                    }
                });
                           


                    }
                });
                                            
                                            
                    
                    
                    
                    karHesabi.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            pencere3.dispose();
                            JButton geri = new JButton("Geri Dön");
                            
                                A.setKullananUcretler(5000);
                                B.setKullananUcretler(3000);
                                C.setKullananUcretler(4000);//otobus
                                D.setKullananUcretler(2000);
                                F.setKullananUcretler(7500);
                                C.setKullananUcretler(10000);//ucak

                                A.setHizmetUcretleri(2000);
                                B.setHizmetUcretleri(1500);
                                C.setHizmetUcretleri(2000);//otobus
                                D.setHizmetUcretleri(1000);
                                F.setHizmetUcretleri(4000);
                                C.setHizmetUcretleri(6000);//ucak
                            
                            
                            
                            
                     geri.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                        pencere3.setVisible(true); // Önceki pencereyi tekrar görünür yap
                        pencere4.dispose();

                    }
                });
                

                    }
                });
                    
                    geriTusu.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {  
                            
                        pencere1.setVisible(true); // Önceki pencereyi tekrar görünür yap
                        pencere2.dispose();

                    }
                });
            }
            

        });
        
        
        
        
        
        
        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // pencere1.dispose();     //ilk ekranın kapatılmasını sağlar
                
                /*
                *Bir gündeki ulaşım araçları görülebilir bu ekrandan.
                *Rezervasyon yapılabilir.
                *Bir kullanıcı birden fazla rezervasyon yapabiasyon yapılabilir.
                *Bir kullanıcı birden fazlalir.
                *Kullanıcı bilet aldıktan sonra o koltuk kapatılmalı, aynı koltuğa bir daha rezervasyon kabul edilmemeli
                *Kullanıcı bileti almadan önce 4 şey seçmelidir . Kalkış noktası - Varış Noktası - Yolculuk Tarihi - Seyahat edecek yolcu sayısı
                *Kullanıcı her şeyi girdikten sonra sefer bul butonuna basar ve uygun seferler gösterilir.
                *
                *
                *
                *
                *
                *
                */
                
                
                
                JFrame pencere4 = new JFrame();
                pencere4.setTitle("Sefer Ekle");
                pencere4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());


                String[] seferAdlari = {
                        "1.sefer Demiryolu: Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir - Bilecik - Kocaeli - Istanbul (gidiş-dönüş)",
                        "2.sefer Demiryolu: Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul (gidiş-dönüş)",
                        "3.sefer Karayolu: Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul (gidiş-dönüş)",
                        "4.sefer Karayolu: Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul (gidiş-dönüş)",
                        "5.sefer Havayolu: Istanbul - Konya - Istanbul (gidiş-dönüş)",
                        "6.sefer Havayolu: Istanbul - Ankara - Istanbul (gidiş-dönüş)"
                };


                String[] tarihler = {"4 Aralık", "5 Aralık", "6 Aralık", "7 Aralık", "8 Aralık", "9 Aralık", "10 Aralık"};

                DefaultComboBoxModel<String> seferModel = new DefaultComboBoxModel<>(seferAdlari);
                DefaultComboBoxModel<String> tarihModel = new DefaultComboBoxModel<>(tarihler);


                JComboBox<String> seferComboBox = new JComboBox<>(seferModel);
                JComboBox<String> tarihComboBox = new JComboBox<>(tarihModel);

                Integer[] kisiSayilari = {1, 2, 3, 4, 5};
                JComboBox<Integer> kisiSayisiComboBox = new JComboBox<>(kisiSayilari);

                JPanel ortaPanel = new JPanel(new GridLayout(3, 2));
                ortaPanel.add(new JLabel("Sefer Seçimi:"));
                ortaPanel.add(seferComboBox);
                ortaPanel.add(new JLabel("Tarih Seçimi:"));
                ortaPanel.add(tarihComboBox);
                ortaPanel.add(new JLabel("Kişi Sayısı:"));
                ortaPanel.add(kisiSayisiComboBox);

                panel.add(ortaPanel, BorderLayout.CENTER);


                JButton buton = new JButton("Devam Et");
                buton.addActionListener(a -> {
                    String seciliSefer = (String) seferComboBox.getSelectedItem();
                    String seciliTarih = (String) tarihComboBox.getSelectedItem();
                    int kisiSayisi = (int) kisiSayisiComboBox.getSelectedItem();


                    if (seciliSefer != null && seciliTarih != null) {
                        JOptionPane.showMessageDialog(pencere4, "Seçilen Sefer: " + seciliSefer + "\nTarih: " + seciliTarih + "\nKişi Sayısı: " + kisiSayisi, "Bilgi", JOptionPane.INFORMATION_MESSAGE);

                        for (int i = 0; i < kisiSayisi; i++) {
                            JPanel kisiPanel = new JPanel(new GridLayout(3, 2));

                            JTextField adSoyadField = new JTextField();
                            JTextField tcNoField = new JTextField();

                            kisiPanel.add(new JLabel("Ad Soyad:"));
                            kisiPanel.add(adSoyadField);
                            kisiPanel.add(new JLabel("TC No:"));
                            kisiPanel.add(tcNoField);

                            int result = JOptionPane.showConfirmDialog(pencere4, kisiPanel, "Kişi Bilgileri", JOptionPane.OK_CANCEL_OPTION);

                            if (result == JOptionPane.OK_OPTION) {
                                // Kullanıcı OK düğmesine bastığında burada ad, soyad ve TC No ile yapılacak işlemleri ekleyebilirsiniz.
                                String adSoyad = adSoyadField.getText();
                                String tcNo = tcNoField.getText();

                                System.out.println("Kişi Bilgileri: Ad Soyad: " + adSoyad + ", TC No: " + tcNo);
                            } else {
                                // Kullanıcı İPTAL düğmesine bastığında burada bir işlem yapabilirsiniz.
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(pencere4, "Lütfen bir sefer ve tarih seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                    }
                    pencere4.setVisible(true);

                });


                panel.add(buton, BorderLayout.SOUTH);

                pencere4.getContentPane().add(panel);

                pencere4.setSize(1000, 600);

                pencere4.setVisible(true);
                
                

            }
        });

    }
}