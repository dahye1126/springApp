package test2;

public class ServiceImplSchoolA implements Service {
	
	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void addInfo() {
		// TODO Auto-generated method stub
		System.out.println("schoolA의 정보 추가");
		dao.insert();
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("schoolA의 정보 검색");
		dao.select();
		
	}

	@Override
	public void editInfo() {
		// TODO Auto-generated method stub
		System.out.println("schoolA의 정보 수정");
		dao.update();
	}

	@Override
	public void delInfo() {
		// TODO Auto-generated method stub
		System.out.println("schoolA의 정보 삭제");
		dao.delete();
	}
}