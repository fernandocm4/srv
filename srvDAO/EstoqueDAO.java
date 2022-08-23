/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import models.Cliente;
import models.Estoque;
import models.Veiculo;

/**
 *
 * @author Fernando Candido
 */
public class EstoqueDAO {
    public void save(Estoque estoque){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO estoque(marca, modelo, cor, placa, estado) values(?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, estoque.getMarca());
            pstm.setString(2, estoque.getModelo());
            pstm.setString(3, estoque.getCor());
            pstm.setString(4, estoque.getPlaca());
            pstm.setInt(5, estoque.getQtd());

            
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
    
    public void update(Veiculo veiculo){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "UPDATE estoque SET marca = ?, modelo = ?, cor = ?, placa = ?, estado = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,veiculo.getMarca());
            pstm.setString(2,veiculo.getModelo());
            pstm.setString(3,veiculo.getCor());
            pstm.setString(4,veiculo.getPlaca());
            pstm.setString(6,veiculo.getId());
            pstm.setString(5, veiculo.getEstado());
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
