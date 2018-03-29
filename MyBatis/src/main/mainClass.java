package main;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dto.MemberVo;

public class mainClass {

	public static void main(String[] args) {
		
		String res = "mybatis/config.xml";	//어디에 설정되어있는지 경로
		
		try {
			// mybatis 설정 파일을 읽는다(read).
			InputStream is = Resources.getResourceAsStream(res);
			
			// SqlSessionFactory 객체를 취득한다.
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			
			// SqlSession 객체를 취득(spring framework가 해준다 열고 닫는 부분)
			SqlSession session = factory.openSession();
			
			// insert
			/*
			MemberVo vo = new MemberVo("eee", "211", "baa@aaa", "211-1111");
			
			int n = session.insert("add", vo);	// memberMapper.xml id값 add
			if(n>0) {
				session.commit();
				System.out.println("추가 성공");
			}else {
				session.rollback();
				System.out.println("추가 실패");
			}
			*/
			
			// delete
			/*
			int n = session.delete("remove", "aaa");
			if(n>0) {
				session.commit();
				System.out.println("삭제 성공");
			}else {
				session.rollback();
				System.out.println("삭제 실패");
			}
			*/
			// select 1개
			/*
			String findid ="bbb";
			MemberVo vo1 = session.selectOne("find", findid);
			if(vo1 == null) {
				System.out.println("검색된 회원이 없다");
			}else {
				System.out.println(vo1.toString());
			}
			*/
			// select *
			List<MemberVo> list = session.selectList("getlist");
			for (MemberVo vo : list) {
				System.out.println(vo.toString());
			}
			
			
			
			session.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
