package object_oriennted;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello () {
		System.out.println("Hello " + this.name);
	}

//	コンストラクターの命名はクラス名と同じになる
	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class RemoteStaff extends Staff {
	String location; 

	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	 
}
public class StaffInfo {

	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada", 123, "avc@gmail.com");
		RemoteStaff  tanaka = new RemoteStaff( "Hanako Tanaka", 124, "tanaka@gmail.com");
		tanaka.location = "大阪";
		
		System.out.println("【社員情報】");
		System.out.println("氏名 :" + yamada.getName());
		System.out.println("社員番号 ：" + yamada.getStaffid());
		System.out.println("メール ：" + yamada.getEmail());
		
		System.out.println("【社員情報】");
		System.out.println("氏名 :" + tanaka.getName());
		System.out.println("社員番号 ：" + tanaka.getStaffid());
		System.out.println("メール ：" + tanaka.getEmail());
		System.out.println("勤務地 ：" + tanaka.location);

	}

}
