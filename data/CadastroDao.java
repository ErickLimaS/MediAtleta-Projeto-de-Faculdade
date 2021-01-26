

package data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class CadastroDao {

    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jogadores", "root", "");
                return true;
            } catch (SQLException ex) {
                return false;
            }
        } catch (ClassNotFoundException ex) {
            return false;
        }

    }

   

    public Usuario logar(String u, String s) {

        try {
            String sql = "SELECT nome FROM jogadores WHERE usuario=? AND senha=?";
            st = conn.prepareStatement(sql);
            st.setString(1, u);
            st.setString(2, s);
            rs = st.executeQuery();
            if (rs.next()) {
                Usuario usu = new Usuario();
                usu.setNome(rs.getString("nome"));
                return usu;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }

    }
     public int salvarUsuario(Usuario usu) {
        try {
            String sql = "INSERT INTO jogadores VALUES (?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, usu.getNome());
            st.setString(2, usu.getEmail());
            st.setString(3, usu.getTelefone());
            st.setString(4, usu.getUsername());
            st.setString(5, usu.getSenha());
            st.executeUpdate();
            return 1;
        } catch (SQLException x) {

            if (x.getErrorCode() == 1062) {
                return 1062;
            } else {
                return 1000;
            }

        }

    }

    public int salvarJogador(Jogador jogador) {
        try {
            String sql = "INSERT INTO caracteristica VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, jogador.getNome());
            st.setDouble(2, jogador.getNumcamisa());
            st.setDouble(3, jogador.getRitmo());
            st.setDouble(4, jogador.getFinalizacao());
            st.setDouble(5, jogador.getDefesa());
            st.setDouble(6, jogador.getPasse());
            st.setDouble(7, jogador.getDrible());
            st.setDouble(8, jogador.getCobrFalta());
            st.setDouble(9, jogador.getCobrPenalti());
            st.setString(10, "");
            st.setDouble(11, 0);
            st.setDouble(12, 0);
            st.setString(13, jogador.getPosicao());
            st.executeUpdate();
            return 1;
        } catch (SQLException x) {
                    
            return 0;

        }
    }
 
        public int salvarGoleiro(Jogador jogador) {
        try {
            String sql = "INSERT INTO caracteristica VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, jogador.getNome());
            st.setDouble(2, jogador.getNumcamisa());
            st.setDouble(3, 0);
            st.setDouble(4, 0);
            st.setDouble(5, 0);
            st.setDouble(6, 0);
            st.setDouble(7, 0);
            st.setDouble(8, jogador.getCobrFalta());
            st.setDouble(9, jogador.getCobrPenalti());
            st.setString(10, jogador.getPosicionamento());
            st.setDouble(11, jogador.getReflexo());
            st.setDouble(12, jogador.getChute());
            st.setString(13, jogador.getPosicao());
            st.executeUpdate();
            return 1;
        } catch (SQLException x) {

            return 0;

        }
    }
    
    public Jogador consultar (String n, String nc) {
        
        try {
            Jogador jogador = new Jogador();
            st = conn.prepareStatement("SELECT * FROM caracteristica WHERE nome = ? AND numcamisa = ?");
                    st.setString(1, n);
                    st.setString(2, nc);
                    rs = st.executeQuery();
                    if(rs.next()){
                        jogador.setNome(rs.getString("nome"));
                        jogador.setNumcamisa(rs.getDouble("numcamisa"));
                        jogador.setRitmo(rs.getDouble("ritmo"));
                        jogador.setFinalizacao(rs.getDouble("finalizacao"));
                        jogador.setDefesa(rs.getDouble("defesa"));
                        jogador.setPasse(rs.getDouble("passe"));
                        jogador.setDrible(rs.getDouble("drible"));
                        jogador.setCobrFalta(rs.getDouble("cobrfalta"));
                        jogador.setCobrPenalti(rs.getDouble("cobrpenalti"));
                        jogador.setPosicionamento(rs.getString("posicionamento"));
                        jogador.setReflexo(rs.getDouble("reflexo"));
                        jogador.setChute(rs.getDouble("chute"));
                        jogador.setPosicao(rs.getString("posicao"));
                        return jogador;
                        
                    }
                    else {
                        return null;
                    }} catch (SQLException ex) {
           
            return null;
        }
    }
    
    public boolean excluir(String n , String nc){
        
        
        try {
            st = conn.prepareStatement("DELETE FROM caracteristica WHERE nome = ? AND numcamisa = ?");
            st.setString(1, n);
            st.setString(2, nc);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return false;
        }
    }
    

}
