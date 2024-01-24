package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
@interface NotNull{
	
}

class laxmi{}

public class Anno {
	@NotNull
         int a = 23;
	@NotNull
	String l = null;
	public static void main(String[] args) {
		//custom annotation
		

	}

}
