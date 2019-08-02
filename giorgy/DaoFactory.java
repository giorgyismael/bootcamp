package model.dao;

import db.DB;
import model.dao.impl.CidadeDaoJDBC;
import model.dao.impl.CotacaoDaoJDBC;
import model.dao.impl.ProdutoDaoJDBC;
import model.dao.impl.RevendaDaoJDBC;

public class DaoFactory {
	public static CotacaoDao createCotacaoDao() {
		return new CotacaoDaoJDBC(DB.getConnection(DB.getConnection()));
	}
	
	public static CidadeDao createCidadeDao() {
		return new CidadeDaoJDBC(DB.getConnection());
	}
	
	public static RevendaDao createRevendaDao() {
		return new RevendaDaoJDBC(DB.getConnection());
	}
	
	public static ProdutoDao createProdutoDao() {
		return new ProdutoDaoJDBC(DB.getConnection());
	}
}
