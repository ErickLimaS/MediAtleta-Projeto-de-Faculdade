package data;

import business.Calculos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JogadorDao {

    Connection con;
    PreparedStatement st;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", "");

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public boolean salvarJogador(Calculos calc) {

        try {
            st = con.prepareStatement("INSERT INTO jogador VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            st.setByte(1, calc.getNumCamisa());
            st.setString(2, calc.getNome());
            st.setString(3, calc.getPosicao());
            st.setByte(4, calc.getRitmo());
            st.setByte(5, calc.getDrible());
            st.setByte(6, calc.getFinalizacao());
            st.setByte(7, calc.getDefesa());
            st.setByte(8, calc.getPasse());
            st.setByte(9, calc.getCobrFalta());
            st.setByte(10, calc.getCobrPenalti());
            st.setByte(11, calc.getPosicionamento());
            st.setByte(12, calc.getReflexos());
            st.setByte(13, calc.getChute());
            st.setString(14, calc.getMedia());
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Já existe uma Camisa com mesmo número cadastrada.");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar jogador.");
            }
            return false;
        }
    }
        

    public boolean salvarGoleiro(Calculos calc) {

        try {

            st = con.prepareStatement("INSERT INTO jogador VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            st.setByte(1, calc.getNumCamisa());
            st.setString(2, calc.getNome());
            st.setString(3, calc.getPosicao());
            st.setByte(6, calc.getFinalizacao());
            st.setByte(7, calc.getDefesa());
            st.setByte(8, calc.getPasse());
            st.setByte(5, calc.getDrible());
            st.setByte(4, calc.getRitmo());      
            st.setByte(10, calc.getCobrFalta());
            st.setByte(9, calc.getCobrPenalti());
            st.setByte(11, calc.getPosicionamento());
            st.setByte(12, calc.getReflexos());
            st.setByte(13, calc.getChute());
            st.setString(14, calc.getMedia());
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Já existe uma Camisa com mesmo número cadastrada.");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar jogador.");
            }
            return false;
        }
    }
}
