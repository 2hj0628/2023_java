package day02;

import static day02.Work101802.getDan;
import static java.lang.System.out;

public class Work101803 {
	
	public static void main(String[] args) {
		
		int startDan=0;
		int endDan=0;
		
//		startDan=work02.getDan("시작 단: ");
//		endDan=work02.getDan("종료 단: ");
		startDan=getDan("시작 단: ");
		endDan=getDan("종료 단: ");
		
		if(startDan > endDan) {
			int tempDan=startDan;
			startDan=endDan;
			endDan=tempDan;
		}
		
		for(int dan=startDan; dan<=endDan; dan+=3) {
			for(int cnt=0; cnt<3 && dan+cnt<10 && dan+cnt<=endDan; cnt++) {
				out.printf("***%d단***\t",dan+cnt);
			}
			out.println();
			for(int i=1; i<=9; i++) {
				for(int cnt=0; cnt<3 && dan+cnt<10 && dan+cnt<=endDan; cnt++) {
					out.printf("%d X %d = %d\t",dan+cnt,i,(dan+cnt)*i);
				}
				out.println();
			}
		}
	}
}
