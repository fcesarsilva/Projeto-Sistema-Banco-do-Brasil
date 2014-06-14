package br.unipe.cc.mlpIII.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

//import com.mysql.jdbc.Statement;

public class Acesso {
	
public boolean acesso;

    
    public void Acesso(String login, String senha){
       Connection conn = null;
       Statement consulta = null;
       ResultSet tabela = null;
       
       try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost/usuarios", "root", "1234");
         consulta = (Statement) conn.createStatement();
         tabela= consulta.executeQuery("select login, senha from tblusuarios where login='"+login+"'and senha='"+senha+"'");
			if(tabela.next()){
				JOptionPane.showMessageDialog(null, "Usuario e Senha Corretos");
				acesso=true;
			}
			else{
				JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos");
				acesso=false;
			}
			
			
			
			
		}catch(ClassNotFoundException |SQLException e){
			
		}
		
		
		
		
		
		
		
	}

}
