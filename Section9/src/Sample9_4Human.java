
public class Sample9_4Human {
	private String name;    //名前
	private int grade;      //学年
	private int record;     //成績
	private int gender;     //性別 0:女 1:男
	private double height;  //身長
	private Sample9_4Day birthday; //誕生日

	//--- コンストラクタ ---//
	Sample9_4Human(String name, int grade, int gender, double height, Sample9_4Day birthday){
		this.name = name; this.grade = grade;
		this.record = -1; this.gender = gender; this.height = height;
		this.birthday = new Sample9_4Day(birthday);
	}
	//--- ゲッタ ---//
	public String getName() { return name; }
	public int getGrade()  { return grade; }
	public int getGender() { return gender; }
	public double getHeight() { return height; }
	public Sample9_4Day getBirthday() { return new Sample9_4Day(birthday);}

	//--- セッタ ---//

	//--- 性別 ---//
	public void malelFemale(int gender) {
		if(gender == 0)      System.out.print("女");
		else if(gender == 1) System.out.print("男");
		else                 System.out.print("--");
	}

	//--- 進級の可否、成績 ---//
	public boolean advancement(int test) {
		if     (test >= 0  && test < 60)   record = 1;
		else if(test >= 60 && test < 70)   record = 2;
		else if(test >= 70 && test < 80)   record = 3;
		else if(test >= 80 && test < 90)   record = 4;
		else if(test >= 90 && test <= 100) record = 5;
		else record = -1;

		if (record == -1) {
			System.out.println("点数が正しくありません");
			return false;
		}else if (record == 1) {
			return false;
		}else {
			grade += 1;
			return true;
		}
	}

	//--- 成績表 ---//
	public void gradebook() {
		System.out.printf("%8s 成績:%2d", name, record);
	}
	
	//--- toString ---//
	public String toString() {
		return String.format("名前：%s\n学年：%s\n性別：%s\n身長：%fcm\n誕生日：" + birthday, name, grade, gender == 0 ? "女" : "男", height);
	}
}
