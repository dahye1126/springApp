package test2;

public class DaoImplOracle  implements Dao{
	private DBConn conn;

	public DBConn getConn() {
		return conn;
	}

	public void setConn(DBConn conn) {
		this.conn = conn;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("oracle insert");
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("oracle select");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("oracle update");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("oracle delete");
		
	}
	
	
}
