/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;
import models.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Fernando Candido
 */
public class FornecedorDAO {
    public void save(Fornecedor fornecedor){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO fornecedores(nome, cpf, numero, marcaveiculo, modeloveiculo, corveiculo, placaveiculo) values(?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, fornecedor.getNome());
            pstm.setString(2, fornecedor.getCpf());
            pstm.setString(3, fornecedor.getNumero());
            pstm.setString(4, fornecedor.getMarcaveiculo());
            pstm.setString(5, fornecedor.getModeloveiculo());
            pstm.setString(6, fornecedor.getCordeveiculo());
            pstm.setString(7, fornecedor.getPlacaveiculo());
            
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
    
    /*public List<Fornecedor> getFornecedores(){
        String sql = "SELECT * FROM fornecedores";
        
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setId(rset.getInt("id"));
                fornecedor.setNome(rset.getString("nome"));
                fornecedor.setCpf(rset.getString("cpf"));
                fornecedor.setNumero(rset.getString("numero"));
                fornecedor.setMarcaveiculo(rset.getString("marcaveiculo"));
                fornecedor.setModeloveiculo(rset.getString("modeloveiculo"));
                fornecedor.setCordeveiculo(rset.getString("corveiculo"));
                
                fornecedores.add(fornecedor);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
             if(rset != null){
                rset.close();
            }
            if(pstm != null){
                pstm.close();
            }
            if(conn != null){
                conn.close();
            }
            }catch(Exception e){
            e.printStackTrace();
            }   
        }
        return fornecedores;
    }*/
    
    /*public void getFornecedores(){
        String sql = "SELECT * FROM fornecedores";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Fornecedor fornecedor = new Fornecedor();
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
             if(rset != null){
                rset.close();
            }
            if(pstm != null){
                pstm.close();
            }
            if(conn != null){
                conn.close();
            }
            }catch(Exception e){
            e.printStackTrace();
            }   
        }
    }*/
    
}


