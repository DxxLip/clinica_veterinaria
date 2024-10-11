package dao;
import java.sql.*;
import domain.*;

public class AtendenteDao {

public void inserir(Atendente atendente) throws Exception{
    String sql = "insert into tb_atendente(nom_atendente,des_telefone,vlr_salario) values(?,?,?)";
    Connection conexao = ConexaoMysql.getConexao();
    PreparedStatement stmt = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    stmt.setString(1,atendente.getNome());
    stmt.setString(2,atendente.getTelefone());
    stmt.setDouble(3,atendente.getSalario());
    stmt.executeUpdate();
    ResultSet rs = stmt.getGeneratedKeys();
    if(rs.next()){
        atendente.setCodigo(rs.getInt(1));
    }
    stmt.close();
    conexao.close();

    
}

}
