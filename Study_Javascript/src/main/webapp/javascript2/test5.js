/**
 * 외부로부터 아이디(id), 패스워드(pass)를 전달받아 판별하는 login()함수 정의
	아이디가 "admin" 이고, 패스워드가 "1234" 일 경우 "로그인 성공!" 출력하고
	아니면 "로그인 실패!" 리턴하기! 
 */
 
 
 //1. login 함수 정의! 
 function login(id, pass){
	if(id == "admin" & pass == "1234"){
		return "로그인 성공" ;
		} else {
		return "로그인 실패" ;
		}
	
	}
