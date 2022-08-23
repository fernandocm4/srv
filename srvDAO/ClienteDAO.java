/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import models.Cliente;

/**
 *
 * @author Fernando Candido
 */
public class ClienteDAO {
    public void save(Cliente cliente){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO clientes(nome, cpf, telefone, endereco) values(?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getTelefone());
            pstm.setString(4, cliente.getEndereco());

            
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
    
    
    
    public void update(Cliente cliente){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "UPDATE clientes SET nome = ?, cpf = ?, telefone = ?, endereco = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,cliente.getNome());
            pstm.setString(2,cliente.getCpf());
            pstm.setString(3,cliente.getTelefone());
            pstm.setString(4,cliente.getEndereco());
            pstm.setString(5,cliente.getId());
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
