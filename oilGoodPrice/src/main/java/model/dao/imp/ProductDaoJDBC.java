package model.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.h2.message.DbException;

import model.dao.ProductDao;
import model.entities.Product;

public class ProductDaoJDBC implements ProductDao {
	private Connection connection;

	public ProductDaoJDBC(Connection connection) {
		this.connection = connection;
	}

	public void insert(Product object) {
		PreparedStatement stmt  = null;
		ResultSet rs = null;
		try {
			stmt  = connection.prepareStatement("insert into Product (name) VALUES (?)");
			stmt.setString(1, object.getName());
			int arrowsAffected = stmt.executeUpdate();
			
			if(arrowsAffected > 0) {
				rs = stmt .getGeneratedKeys();
				object.setId(rs.getInt("ID"));
			}
		} catch (SQLException e) {
			e.fillInStackTrace();
		}
		
	}

	public void delete(Product object) {
		// TODO Auto-generated method stub
		
	}

	public void update(Product object) {
		// TODO Auto-generated method stub
		
	}

	public Product fyndbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
