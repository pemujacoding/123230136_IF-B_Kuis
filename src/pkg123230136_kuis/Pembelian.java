/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230136_kuis;

import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Lab Informatika
 */
public class Pembelian extends JFrame implements ActionListener{
    String username;
    JLabel apel = new JLabel();
    JLabel jeruk = new JLabel();
    JLabel mangga = new JLabel();
    JLabel subTotal = new JLabel();
    JLabel pajak = new JLabel();
    JLabel total = new JLabel();
    JButton kembali = new JButton("Kembali");
    public Pembelian(String username, int hargaApel, int jumlahApel,int hargaJeruk, int jumlahJeruk,int hargaMangga, int jumlahMangga) throws HeadlessException {
        setVisible(true);
        setSize(480,480);
        setTitle("Halaman Pembelian");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(apel);
        add(jeruk);
        add(mangga);
        add(subTotal);
        add(pajak);
        add(total);
        add(kembali);
        
        apel.setText("Apel     : "+ jumlahApel +" kg x Rp "+ hargaApel +" /kg = Rp "+ jumlahApel*hargaApel);
        jeruk.setText("Jeruk   : "+ jumlahJeruk +" kg x Rp "+ hargaJeruk +" /kg = Rp "+ jumlahJeruk*hargaJeruk);
        mangga.setText("Mangga : "+ jumlahMangga +" kg x Rp "+ hargaMangga +" /kg = Rp "+ jumlahMangga*hargaMangga);
        int totalHarga = jumlahApel*hargaApel+ jumlahJeruk*hargaJeruk  + jumlahMangga*hargaMangga;
        subTotal.setText("SubTotal : Rp " + totalHarga);
        pajak.setText("Pajak(10%) : Rp " + totalHarga*10/100);
        total.setText("Total Harga : Rp "+ totalHarga*110/100);
        
        apel.setBounds(20, 40, 300, 32);
        jeruk.setBounds(20, 80, 300, 32);
        mangga.setBounds(20, 120, 300, 32);
        subTotal.setBounds(20, 200, 200, 32);
        pajak.setBounds(20, 240, 200, 32);
        total.setBounds(20, 280, 200, 32);
        kembali.setBounds(20,350,300,32);
        
        kembali.addActionListener(this);
        this.username = username;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      try{
          if(e.getSource() == kembali){
              new HomePage(this.username);
              this.dispose();
          }
      }catch(Exception error){
           JOptionPane.showMessageDialog(this,error.getMessage());
      }
    }
   
}
