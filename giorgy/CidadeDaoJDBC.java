package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.exceptions.DbException;
import model.dao.CidadeDao;
import model.entities.Cidade;
import model.entities.enums.Estado;
import model.entities.enums.Regiao;

public class CidadeDaoJDBC implements CidadeDao{
	
	private Connection conn;
	
	public CidadeDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Cidade obj) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("INSERT INTO CIDADE (NOME, ESTADO, REGIAO) VALUES (?, ?, ?)", Statement.NO_GENERATED_KEYS);
			st.setString(1, obj.getNome());
			st.setString(2, obj.getEstado().name());
			st.setString(3, obj.getRegiao().name());
			int arrowsAffected = st.executeUpdate();
			
			if(arrowsAffected > 0) {
				rs = st.getGeneratedKeys();
				obj.setId(rs.getInt("ID"));
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	@Override
	public void update(Cidade obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cidade obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cidade findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cidade> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Cidade instantiateCidade(ResultSet rs) throws SQLException {
		Estado estado = Estado.valueOf(rs.getString("ESTADO"));
		Regiao regiao = Regiao.valueOf(rs.getString("REGIAO"));
		Cidade cidade = new Cidade(rs.getInt("ID"), rs.getString("NOME"), estado, regiao);
		return cidade;
	}

}
