package test2;

public class DaoImplMySql implements Dao {
	private DBConn conn;

	public void setConn(DBConn conn) {
		this.conn = conn;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql inset");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql select");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql update");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql delete");
	}
}