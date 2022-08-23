/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import models.Contrato;

/**
 *
 * @author Fernando Candido
 */
public class ContratoDAO {
    public void save(Contrato contrato){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO contratos(nome, cpf, telefone, endereco,marca,"
                + "modelo, cor, placa, formapgto) values(?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, contrato.getNome());
            pstm.setString(2, contrato.getCpf());
            pstm.setString(3, contrato.getTelefone());
            pstm.setString(4, contrato.getEndereco());
            pstm.setString(5, contrato.getMarca());
            pstm.setString(6, contrato.getModelo());
            pstm.setString(7, contrato.getCor());
            pstm.setString(8, contrato.getPlaca());
            pstm.setString(9, contrato.getFormapgto());

            
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }         
    }
    
    public void delete(int id){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "DELETE FROM estoque WHERE id = ? ";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,id);
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }         
    }
}
