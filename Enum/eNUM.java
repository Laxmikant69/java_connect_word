package Enum;
enum Week{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	Week(){
		System.out.println("I am constructor");
	}
}
enum Week1{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	Week1(){
		System.out.println("I am constructor");
	}
}
public class eNUM {
	
public static void main(String[] args) {

	System.out.println(Week.valueOf("THURSDAY"));
	System.out.println("hello");
	System.out.println(Week.valueOf("MONDAY").ordinal());
	//loop to traverse
	for(Week x : Week.values()) {
		System.out.println(x.name());
		}
	System.out.println(Week.MONDAY.compareTo(Week.FRIDAY));

}
}
