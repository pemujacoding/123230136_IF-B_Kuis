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
public class LoginPage extends JFrame implements  ActionListener{
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField usernameInput = new JTextField();
    JTextField passwordInput = new JTextField();
    JButton loginBtn = new JButton("Login");
    JButton resetBtn = new JButton("Reset");
    public LoginPage() throws HeadlessException {
        setVisible(true);
        setSize(480,480);
        setTitle("Login Page");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(username);
        add(password);
        add(usernameInput);
        add(passwordInput);
        add(loginBtn);
        add(resetBtn);
        
        username.setBounds(20,20,100,32);
        usernameInput.setBounds(120,20,200,32);
        password.setBounds(20,60,100,32);
        passwordInput.setBounds(120,60,200,32);
        loginBtn.setBounds(20,100,300,32);
        resetBtn.setBounds(20,140,300,32);
        
        loginBtn.addActionListener(this);
        resetBtn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String username,password;
       try{
         if(e.getSource() == loginBtn){
               username = usernameInput.getText();
               password = passwordInput.getText();
               if(username.equals("Sarah") && password.equals("123230136")){
                   new HomePage(username);
                   this.dispose();
               }
               else{
                   JOptionPane.showMessageDialog(this, "Username atau Password salah");
               }
         }
         else if(e.getSource()== resetBtn){
             usernameInput.setText("");
             passwordInput.setText("");
         }
       }catch(Exception error){
           JOptionPane.showMessageDialog(this,error.getMessage());
       }
    }
    
}
