package test;

import java.sql.Connection;
import javax.sql.DataSource;

import org.junit.Test;

public class JdbcTest extends BaseTest {
	
	@Test
	public void testDataSource() throws Exception{
		DataSource ds=ctx.getBean("dataSource",DataSource.class);
		Connection conn=ds.getConnection();
		System.out.println(conn);
	}
}
