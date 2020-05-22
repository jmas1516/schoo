package calender;

public class Sample15_8CalendarTester {
	public static void main(String[] args) {
		Sample15_8Calendar cal;
		int p = 0;

		if(args.length == 0) {
			cal = new Sample15_8Calendar();
		}else if(args.length == 1) {
			cal = new Sample15_8Calendar(Integer.parseInt(args[0]));
			p++;
		}else{
			cal = new Sample15_8Calendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		}

		switch (p){
		case 0 :	int lastDay  = cal.lastDay(cal.getY(), cal.getM());
					int firstDay = cal.firstDay(cal.getY(), cal.getM());
					cal.cld(firstDay, lastDay);
					break;
		case 1 :	cal.cldAll();
					break;
		}

	}
}
