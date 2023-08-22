import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.function.Predicate;

public class CallableStmt {

	public static void main(String[] args) throws SQLException {
		var sql = "{call transform(?)}";
		try(var conn=DriverManager.getConnection("url")){
		try (var cs = conn.prepareCall(sql)) {
		   cs.registerOutParameter(1, Types.INTEGER);
		   cs.setInt(1, 8);
		   cs.execute();
		   System.out.println(cs.getInt(1));
		}}
		
		Predicate<Double> pred = 
				   n -> Math.round(n) == (int) n.doubleValue();
	}
}
