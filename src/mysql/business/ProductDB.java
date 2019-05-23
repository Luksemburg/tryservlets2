package mysql.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDB {
	private static String url = "jdbc:mysql://localhost/test?serverTimezone=Europe/Moscow&useSSL=false";
	private static String user = "root";
	private static String pass = "";
	
	public static ArrayList<Product> select(){
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		try{
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
			
			while(resultSet.next()){
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int price = resultSet.getInt(3);
				
				Product product = new Product(id, name, price);
				products.add(product);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}		
		
		return products;
	}
	
	public static Product selectOne(int id){
		Product product = null;
		
		try{
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT * FROM products WHERE id=?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				int prodId =resultSet.getInt(1);
				String name = resultSet.getString(2);
				int price = resultSet.getInt(3);
				
				product = new Product(prodId, name, price);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return product;
	}
	
	public static int insert(Product product){
		try{
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "INSERT INTO products (name, price) Values (?, ?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			
			return preparedStatement.executeUpdate(); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public static int update(Product product){
		
		try{
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			String sql = "UPDATE products SET name = ?, price = ? WHERE id = ?";
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3, product.getId());
			
			return preparedStatement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public static int delete(int id){
		
		try{
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "DELETE FROM products WHERE id = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			return preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}
}
