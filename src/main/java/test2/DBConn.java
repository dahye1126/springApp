package test2;

public class DBConn {
	private String dbType;

	public DBConn(String dbType) {
		this.dbType = dbType;
		System.out.println(this.dbType + "db 연결됨");
	}
}
