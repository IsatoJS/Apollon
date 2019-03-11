package tecstudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 勉強会アンケートバッキングビーン
 * @author ryuta maehara
 *
 */
@Named
@RequestScoped
public class TecStudyBean {

	//日付
	private Date date;
	/*	//日付
		private SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd(E)");
	*/
	//感動大学申込受付
	private String receptionist;

	//講座名
	private String courseName;

	//講師名
	private String instractorName;

	//社員番号
	private Integer employeesNo;

	//社員名
	private String employeesName;

	//勉強会点数
	private Integer point;

	//点数理由
	private String reason;

	//参加希望
	private Integer join;

	//改善点
	private String improvement;

	//次回出席 選択リスト
	private static Map<String,Integer> items;

	static{
		items = new LinkedHashMap<>();
		items.put("12月19日(水)参加します！",1);
		items.put("また次の機会にします。",2);
	}

	/**
	 * submit処理。csvをCドライブ直下のcsvフォルダにアンケートを出力する。
	 * @return
	 */
	public String submit(){
		try {
			//出力先を作成する
			FileWriter fw = new FileWriter("C:\\csv\\input_tec_studyt.csv", false);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			//内容を指定する
			pw.print(getDate());
			pw.print(",");
			pw.print(getEmployeesNo());
			pw.print(",");
			pw.print(getEmployeesName());
			pw.print(",");
			pw.print(getInstractorName());
			pw.print(",");
			pw.print(getCourseName());
			pw.print(",");
			pw.print(getPoint());
			pw.print(",");
			pw.print(getReason());
			pw.print(",");
			pw.print(getJoin());
			pw.print(",");
			pw.print(getImprovement());
			pw.print(",");
			pw.print(getReceptionist());

			//ファイルに書き出す
			pw.close();

			//終了メッセージをコンソールに出力する
			System.out.println("CSV出力が完了しました。");

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		return "input_tec_study.xhtml";
	}

	//選択リスト 取得
	public Map<String, Integer> getItems() {
		return items;
	}

	//勉強会点数 取得
	public Integer getPoint() {
		return point;
	}

	//勉強会点数 設定
	public void setPoint(Integer point) {
		this.point = point;
	}

	//点数理由 取得
	public String getReason() {
		return reason;
	}

	//点数理由 設定
	public void setReason(String reason) {
		this.reason = reason;
	}

	//参加希望 取得
	public Integer getJoin() {
		return join;
	}

	//参加希望 設定
	public void setJoin(Integer join) {
		this.join = join;
	}

	//改善点 取得
	public String getImprovement() {
		return improvement;
	}

	//改善点 設定
	public void setImprovement(String improvement) {
		this.improvement = improvement;
	}

	//感動大学申込受付　取得
	public String getReceptionist() {
		return receptionist;
	}

	//感動大学申込受付　設定
	public void setReceptionist(String receptionist) {
		this.receptionist = receptionist;
	}

	//講座名 取得
	public String getCourseName() {
		return courseName;
	}

	//講座名 設定
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	//講師名　取得
	public String getInstractorName() {
		return instractorName;
	}

	//講師名　設定
	public void setInstractorName(String instractorName) {
		this.instractorName = instractorName;
	}

	//社員番号　取得
	public Integer getEmployeesNo() {
		return employeesNo;
	}

	//社員番号　設定
	public void setEmployeesNo(Integer employeesNo) {
		this.employeesNo = employeesNo;
	}

	//社員名　取得
	public String getEmployeesName() {
		return employeesName;
	}

	//社員名　設定
	public void setEmployeesName(String employeesName) {
		this.employeesName = employeesName;
	}

	//日付　取得
	public Date getDate() {
		//カレンダーを生成
		Calendar cal = Calendar.getInstance();
		date = cal.getTime();
		return date;
	}

	//日付 設定
	public void setDate(Date date) {
		this.date = date;
	}
}
