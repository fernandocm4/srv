/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import models.Agendamentos;

/**
 *
 * @author Fernando Candido
 */
public class TestdriveDAO {
    public void save(Agendamentos agendamento){
        //ARRUMAR PARA NÃO INSERIR VAZIO
        String sql = "INSERT INTO testdrive(placa, datadrive, horario) values(?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, agendamento.getPlaca());
            pstm.setString(2, agendamento.getDatadrive());
            pstm.setString(3, agendamento.getHorario());

            
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
