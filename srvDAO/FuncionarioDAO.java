/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import models.Funcionario;
import srvDAO.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import srvGUI.GerenciarFornecedor;
import srvGUI.GerenciarFuncionario;

/**
 *
 * @author Fernando Candido
 */
public class FuncionarioDAO {

    public void save(Funcionario funcionario) {
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO funcionarios(nome, cpf, telefone, endereco, senha) values(?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getCpf());
            pstm.setString(3, funcionario.getTelefone());
            pstm.setString(4, funcionario.getEndereco());
            //pstm.setString(5, funcionario.getComissao());
            pstm.setString(5, funcionario.getSenha());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(int id) {
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "DELETE FROM funcionario WHERE id = ? ";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean checkLogin(String cpf, String senha) throws Exception {
        Connection conn = null;
        PreparedStatement pstm = null;
        PreparedStatement pstm2 = null;
        conn = ConnectionFactory.createConnectionToMySQL();
        ResultSet rs = null;
        boolean check = false;
        
        
        try{
            pstm = conn.prepareStatement("SELECT * FROM funcionarios WHERE id <> 1 AND cpf = ? AND senha = ?");
            pstm2 = conn.prepareStatement("INSERT INTO login(cpf) values(?)");
            pstm.setString(1, cpf);
            pstm.setString(2, senha);
            pstm2.setString(1,cpf);
            rs = pstm.executeQuery();
            pstm2.execute();
            
            if(rs.next()){
                check = true;
            }
        }catch(SQLException e){
            Logger.getLogger(GerenciarFuncionario.class.getName()).log(Level.SEVERE, null, e);
        }
        return check;
    }
    
    public boolean checkLoginAdm(String cpf, String senha) throws Exception {
        Connection conn = null;
        PreparedStatement pstm = null;
        
        conn = ConnectionFactory.createConnectionToMySQL();
        ResultSet rs = null;
        boolean check = false;
        
        
        try{
            pstm = conn.prepareStatement("SELECT * FROM funcionarios WHERE cpf = ? AND senha = ?");
            pstm.setString(1, cpf);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        }catch(SQLException e){
            Logger.getLogger(GerenciarFuncionario.class.getName()).log(Level.SEVERE, null, e);
        }
        return check;
    }
    
}
