package comk.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.BearDAOImp;

public class Driver {
	public static void main(String[] args) {
		
		//StudentDAOImp sdi = new StudentDAOImp();
		//PowerDAOImp pdi = new PowerDAOImp();
		//SuperheroDAOImp shdi = new SuperheroDAOImp();
		
		
		BearDAOImp bdi = new BearDAOImp();
		
		try {
		//	sdi.insertStudent(2,"Brad",33);
		//	System.out.println(sdi.getStudentList());
		//	pdi.createPowers("Flight");
		//	shdi.createSuperheor("Groot");
			
			
			bdi.createBear("cavename", "bearname", "20-MAY-2003", "beartype");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
