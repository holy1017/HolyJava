/**
 * 
 */
package holyJava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import lombok.*;
/**
 * @author lilly
 *
 */

@Data
@Builder
public class GradeClass {
	
	//@Setter
	//@Getter
	@NonNull
	private  String name;
	@NonNull
	private  int score;	
	
	// @Builder ���� , Ŭ���� �ʱ�ȭ �����ϴ� ����� ������
	GradeClass(String name,int score){
		this.name=name;
		this.score=score;
	}

	public GradeClass() {
		// TODO Auto-generated constructor stub
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}

	
}
