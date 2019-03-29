package net.mem;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemMainTest {

	public static void main(String[] args) {
		// MyBatis-3 ��� JDBC����
		try {
		  //1) DB ȯ�� ���� ���� ���� ��������
			String resource = "config/jdbc.xml";
			InputStream is = Resources.getResourceAsStream(resource);
			
		  //2) DB �����ϱ� ���� ���丮�� ����
		  //   -> DBOpen + MemberDAO
		  SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		  //System.out.println("DB���� ����");
		  
		  //3) ������ ����
		  //   -> PreparedStatement�� ����� ���
		  SqlSession sql = ssf.openSession(true);
		  
		  //4) ������ ����
		  //   ->1) ���߰�
		  /*
		  int result = sql.insert("mem.insertRow", new MemDTO("", 30));
		  System.out.println("���߰� ��� : " + result);
		  */
		  
		  //   ->3) ����
		  /*
		  int result = sql.insert("mem.updateRow", new MemDTO(2, "���޷�", 20));
		  System.out.println("�� ���� ��� : " + result);
		  */
		  
		  
		  //   ->4) ����
		  /*
		  int result = sql.insert("mem.deleteRow", 2);
		  System.out.println("�� ���� ��� : " + result);
		  */
		  
		  //   ->5) ����(3���� �� ����)
		  /*
		  int result = sql.insert("mem.deleteRow2", 3);
		  System.out.println("�� ���� ��� : " + result);
		  */
		  
		  //   ->2) ��ü ���
		  /*
		  List<MemDTO> list = sql.selectList("mem.selectAll");
		  for(int idx=0; idx<list.size(); idx++) {
			  MemDTO dto = list.get(idx);
			  System.out.print(dto.getNum() + " ");
			  System.out.print(dto.getName() + " ");
			  System.out.print(dto.getAge() + " ");
			  System.out.println();
		  }
		  */
		  
		  //   ->6) �󼼺���
		  /*
		  MemDTO dto = sql.selectOne("mem.selectRead", new MemDTO(5));
		  System.out.print(dto.getNum() + " ");
		  System.out.print(dto.getName() + " ");
		  System.out.print(dto.getAge() + " ");
		  System.out.println();
		  */
		  
		  //   ->7) �˻� (�̸��� '��'���ڰ� �ִ� �� �˻�
		  List<MemDTO> list = sql.selectList("mem.search", "��");
		  for(int idx=0; idx<list.size(); idx++) {
			  MemDTO dto = list.get(idx);
			  System.out.print(dto.getNum() + " ");
			  System.out.print(dto.getName() + " ");
			  System.out.print(dto.getAge() + " ");
			  System.out.println();
		  }
		  
		  System.out.println("���ڵ� ���� : " + sql.selectOne("mem.rowCount"));
		  
		}catch (Exception e) {
			System.out.println("���� : " + e);
		}//try end
		
	}
}//class end
