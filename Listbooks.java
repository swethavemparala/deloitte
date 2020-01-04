package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class Listbooks {
		
		Connection con = null;
		//List <Users> list = new ArrayList<Users> ();  
		
		public void listBooks()
		{
			DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			con=connector.getConnection();
			
			String sql="select b.isbn, b.title, b.pages, a.name, p.name, p.city from book b join author a on b.author_id = a.author_id join publisher p on b.publisher_id=p.publisher_id";

			try {
				PreparedStatement pst = con.prepareStatement(sql);
				
				ResultSet rs  = pst.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4)+" : "+rs.getString(5)+" : "+rs.getString(6));
				}
				
			}catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		
		
		public void listSortBooks()
		{
			DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			con=connector.getConnection();
			
			String sql="select a.name, b.title from book b join author a on b.author_id=a.author_id order by a.name, b.title";

			try {
				PreparedStatement pst = con.prepareStatement(sql);
				
				ResultSet rs  = pst.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" : "+rs.getString(2));
				}
				
			}catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		
		public void listyear()
		{
			DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			con=connector.getConnection();
			
			String sql="select * from book where pub_year>2000";

			try {
				PreparedStatement pst = con.prepareStatement(sql);
				
				ResultSet rs  = pst.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4)+" : "+rs.getString(5)+" : "+rs.getString(6));
				}
				
			}catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		
		public static void main(String[] args) {
			
			Listbooks lb = new Listbooks();
			
			lb.listBooks();
			lb.listSortBooks();
			lb.listyear();
		}
}