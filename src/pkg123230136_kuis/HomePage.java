/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230136_kuis;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Lab Informatika
 */
public class HomePage extends  JFrame implements ActionListener{
    String username;
    int hargaApel = 15000, hargaJeruk = 12000, hargaMangga = 20000;
    JLabel welcome = new JLabel();
    JLabel apel = new JLabel("Apel (Rp "+ hargaApel +"/kg)");
    JLabel jeruk = new JLabel("Jeruk (Rp "+ hargaJeruk +"/kg)");
    JLabel mangga = new JLabel("Mangga (Rp "+ hargaMangga +"/kg)");
    JTextField apelInput = new JTextField();
    JTextField jerukInput = new JTextField();
    JTextField manggaInput = new JTextField();
    JButton beliBtn = new JButton("Beli");
    JButton logoutBtn = new JButton("Logout");
    public HomePage(String username) {
        setVisible(true);
        setSize(480,480);
        setTitle("Home Page");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(welcome);
        add(apel);
        add(jeruk);
        add(mangga);
        add(apelInput);
        add(jerukInput);
        add(manggaInput);
        add(beliBtn);
        add(logoutBtn);
       
        welcome.setText("Selamat datang ,"+ username);
        apelInput.setText("0");
        jerukInput.setText("0");
        manggaInput.setText("0");
        
        welcome.setBounds(20, 20, 200, 32);
        apel.setBounds(20, 60, 200, 32);
        apelInput.setBounds(220, 60, 200, 32);
        jeruk.setBounds(20, 100, 200, 32);
        jerukInput.setBounds(220, 100, 200, 32);
        mangga.setBounds(20, 140, 200, 32);
        manggaInput.setBounds(220, 140, 200, 32);
        beliBtn.setBounds(20, 200, 300, 32);
        logoutBtn.setBounds(20, 240, 300, 32);
        
        beliBtn.addActionListener(this);
        logoutBtn.addActionListener(this);
        
        this.username = username;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String jumlahApel = apelInput.getText();
        String jumlahJeruk = jerukInput.getText();
        String jumlahMangga = manggaInput.getText();
       try{
           if(e.getSource() == beliBtn){
               if(!isNumeric(jumlahApel) || !isNumeric(jumlahJeruk) || !isNumeric(jumlahMangga)){
                   JOptionPane.showMessageDialog(this, "Jumlah buah harus angka dan tidak boleh minus");
               }
               else{
                   int jApel = Integer.parseInt(jumlahApel);
                   int jJeruk = Integer.parseInt(jumlahJeruk);
                   int jMangga = Integer.parseInt(jumlahMangga);
                   new Pembelian(this.username, hargaApel, jApel,hargaJeruk, jJeruk,hargaMangga, jMangga);
               }
           }
           else if(e.getSource() == logoutBtn){
               
           }
       }catch(Exception error){
           JOptionPane.showMessageDialog(this,error.getMessage());
       }
    }

    private boolean isNumeric(String input) {
        if(input == null || input.isEmpty()){
            return false;
        }
        else{
            try{
                int cek = Integer.parseInt(input);
                if(cek < 0){
                    return false;
                }
                else{
                    return true;
                }
            }catch(NumberFormatException e){
           return false;
       }
        }

    }
    
}
