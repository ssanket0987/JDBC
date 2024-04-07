package file.demo;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.InputStream;



import com.utility.DBUtil;


public class TestJdbcFileDemo {

	public static void main(String[] args) {
	
		try {
			Connection con =DBUtil.getConnect();
			InputStream input = new FileInputStream("F://csj35-36.png");
			PreparedStatement ps = con.prepareStatement("Insert into UserProfile values(?,?)");
			ps.setInt(1, 1);
			ps.setBinaryStream(2,input);
			
			int status= ps.executeUpdate();
			if(status>0)
			{
				//FileOutputStream
				System.out.println("Inserted");
				
				FileOutputStream fout = new FileOutputStream("./src/mydbimage.png");
				
				PreparedStatement ps1 = con.prepareStatement("Select user_photo from UserProfile where user_id=?");
						ps1.setInt(1,118);
				ResultSet rs =ps1.executeQuery();
				rs.next();
				
				byte[] imageBytes = rs.getBytes(1);
				fout.write(imageBytes);
				System.out.println("fecthed from DB .... check your file");
				
			}
			else
			{
				System.out.println("unale to load image file");
			}
			
		}catch (Exception e){
			System.out.println(" "+e);
		}

	}

}
