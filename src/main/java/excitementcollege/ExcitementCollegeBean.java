package excitementcollege;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;


/**
 * 感動大学アンケート画面に関するバッキングビーン
 *
 */
@Named(value = "excitementcollege.ExcitementCollegeBean")
@RequestScoped
public class ExcitementCollegeBean implements Serializable {
	// 受講日
	@Size(min = 10, max = 10)
	private String jukou_date;
	// ユーザーID
	private String id;
	// 氏名
	private String name;
	// 講師名
	private String koushi_name;
	// 講座名
	private String kouza;
	// 評価点
	private String hyouka_point;
	// 評価理由
	private String hyouka_riyuu;
	// 改善点
	private String hyouka_kaizen;
	// おすすめ理由
	private String kouza_recommendRiyuu;
	// 新規申し込み
	private String kouza_request;
	// 受講理由
	List<String> kouza_jukouRiyuu = new ArrayList<String>();


	// コンストラクタ
	public ExcitementCollegeBean() {
	}


	// 以下より，ゲッターとセッター
	public String getName() {
    	return this.name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJukou_date() {
		return this.jukou_date;
	}

	public void setJukou_date(String jukou_date) {
		this.jukou_date = jukou_date;
	}

	public String getKoushi_name() {
		return this.koushi_name;
	}

	public void setKoushi_name(String koushi_name) {
		this.koushi_name = koushi_name;
	}

	public String getKouza() {
		return this.kouza;
	}

	public void setKouza(String kouza) {
		this.kouza = kouza;
	}

	public String getHyouka_point() {
		return this.hyouka_point;
	}

	public void setHyouka_point(String hyouka_point) {
		this.hyouka_point = hyouka_point;
	}

	public String getHyouka_riyuu() {
		return this.hyouka_riyuu;
	}

	public void setHyouka_riyuu(String hyouka_riyuu) {
		this.hyouka_riyuu = hyouka_riyuu;
	}

	public String getHyouka_kaizen() {
		return this.hyouka_kaizen;
	}

	public void setHyouka_kaizen(String hyouka_kaizen) {
		this.hyouka_kaizen = hyouka_kaizen;
	}

	public String getKouza_recommendRiyuu() {
		return this.kouza_recommendRiyuu;
	}

	public void setKouza_recommendRiyuu(String kouza_recommendRiyuu) {
		this.kouza_recommendRiyuu = kouza_recommendRiyuu;
	}

	public String getKouza_request() {
		return this.kouza_request;
	}

	public void setKouza_request(String kouza_request) {
		this.kouza_request = kouza_request;
	}

	public List<String> getKouza_jukouRiyuu() {
		return this.kouza_jukouRiyuu;
	}

	public void setKouza_jukouRiyuu(List<String> kouza_jukouRiyuu) {
		this.kouza_jukouRiyuu = kouza_jukouRiyuu;
	}


	// リクエスト受信時に呼ばれる初期化メソッド
    @PostConstruct
    public void init() {
        this.id = "999";
        this.name = "テスト太郎";

    }


    // submitボタンが押下されたときに呼ばれるメソッド
    public String send() {
    	return "output_excitement_college";

    }


}
