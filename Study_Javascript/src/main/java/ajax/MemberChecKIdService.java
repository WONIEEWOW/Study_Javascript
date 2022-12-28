package ajax;

import java.sql.Connection;

public class MemberChecKIdService {

	public boolean isExistsId(String id) {
		
		//1.boolean타입 변수 선언
		boolean isExist = false;
		
		//2. 공통객체 가져오기
		Connection con = JdbcUtil.getConnection();
		
		//3. 공통 DAO 객체 가져오기
		MemberDAO dao = MemberDAO.getInstance();
		
		dao.setConnection(con);
		
		//4.MemberDAO 객체의 selectMemberId() 호출 
		//=> 파라미터 : 아이디	리턴타입 : boolean(isExist)
		isExist = dao.selectMemberId(id);
			
		JdbcUtil.close(con);
		
		return isExist;
	}

	
	
	
}
