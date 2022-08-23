/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import models.Venda;

/**
 *
 * @author Fernando Candido
 */
public class VendaDAO {
    public void save(Venda venda) {
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO vendas(cpf, percomissao, comissaovenda, "
                + "valorvenda, marca, cor, placa, formapgto, valorveiculo) values(?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, venda.getCpf());
            pstm.setString(2, venda.getPercomissao());
            pstm.setString(3, venda.getComissao());
            pstm.setString(4, venda.getValorvenda());
            pstm.setString(5, venda.getMarca());
            pstm.setString(6, venda.getCor());
            pstm.setString(7, venda.getPlaca());
            pstm.setString(8, venda.getFormapgto());
            pstm.setString(9, venda.getValorveiculo());

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

    /*public void delete(int id) {
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
    }*/
}
