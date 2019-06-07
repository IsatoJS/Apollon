package bolday;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * BOLDayアンケート画面に関するバッキングビーン
 *
 */
@Named
@RequestScoped
public class BoldayBean {
    private Integer number;
    private String name;
    private String sankaday;
    private Integer tensu;
    private String riyuu;

    private String kousi;
    protected Map<String,Integer> kousiname;

    private String kouza;
    protected Map<String,Integer> kouzaname;

    //段取りの点数の結果を配列で受け取る
    private Integer[] dandoriList;

    //段取りの選択肢
    protected Map<String,Integer> dandori;

    //ワークショップの結果を配列で受け取る
    private Integer[] workresult;

    //ワークショップの選択肢
    protected Map<String,Integer> workList;

    //意見の入力結果
    private String iken;

    //さしさとし結果
    private Integer sasiresult;

    //さしさとし選択肢
    protected Map<String,Integer> sasiList;

    //懇親会点数
    private Integer konsinresulet;

    //懇親会点数理由
    private  String konsinroyuu;







    /*初期化*/
    @PostConstruct
    public void init(){

        kousiname = new LinkedHashMap<>();
        kousiname.put("講師A", 1);
        kousiname.put("講師B", 2);
        kousiname.put("講師C", 3);

        kouzaname = new LinkedHashMap<>();
        kouzaname.put("講座A", 1);
        kouzaname.put("講座B", 2);
        kouzaname.put("講座C", 3);

        dandori = new LinkedHashMap<>();
        dandori.put("悪かった", 1);
        dandori.put("やや悪かった", 2);
        dandori.put("普通", 3);
        dandori.put("やや良かった", 4);
        dandori.put("良かった", 5);

        workList = new LinkedHashMap<>();
        workList.put("楽しかった", 1);
        workList.put("楽しくなかった・・・", 2);
        workList.put("考えるのが難しかった", 3);
        workList.put("時間が足りなかった", 4);
        workList.put("実際の業務やプライベートでも活用したい", 5);
        workList.put("新しい発見や発送が出来た", 6);

        sasiList = new LinkedHashMap<>();
        sasiList.put("希望する", 1);
        sasiList.put("希望しない", 2);

    }




    public void toConsole(){
        System.out.println("number="+this.number+"/ name="+this.name);
    }

    public String next(){
        System.out.println("★number="+this.number+"/ name="+this.name);
        return "output.xhtml";
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSankaday() {
        return sankaday;
    }

    public void setSankaday(String sankaday) {
        this.sankaday = sankaday;
    }

        public Integer getTensu() {
        return tensu;
    }

    public void setTensu(Integer tensu) {
        this.tensu = tensu;
    }

    public String getRiyuu() {
        return riyuu;
    }

    public void setRiyuu(String riyuu) {
        this.riyuu = riyuu;
    }


    public String getKousi() {
        return kousi;
    }

    public void setKousi(String kousi) {
        this.kousi = kousi;
    }

    public Map<String, Integer> getKousiname() {
        return kousiname;
    }

    public void setKousiname(Map<String, Integer> kousiname) {
        this.kousiname = kousiname;
    }

    public String getKouza() {
        return kouza;
    }

    public void setKouza(String kouza) {
        this.kouza = kouza;
    }

    public Map<String, Integer> getKouzaname() {
        return kouzaname;
    }

    public void setKouzaname(Map<String, Integer> kouzaname) {
        this.kouzaname = kouzaname;
    }

        public Integer[] getDandoriList() {
        return dandoriList;
    }

    public void setDandoriList(Integer[] dandoriList) {
        this.dandoriList = dandoriList;
    }

    public Map<String, Integer> getDandori() {
        return dandori;
    }

    public void setDandori(Map<String, Integer> dandori) {
        this.dandori = dandori;
    }

        public Integer[] getWorkresult() {
        return workresult;
    }

    public void setWorkresult(Integer[] workresult) {
        this.workresult = workresult;
    }

    public Map<String, Integer> getWorkList() {
        return workList;
    }

    public void setWorkList(Map<String, Integer> workList) {
        this.workList = workList;
    }

    public String getIken() {
        return iken;
    }

    public void setIken(String iken) {
        this.iken = iken;
    }

        public Integer getSasiresult() {
        return sasiresult;
    }

    public void setSasiresult(Integer sasiresult) {
        this.sasiresult = sasiresult;
    }

    public Map<String, Integer> getSasiList() {
        return sasiList;
    }

    public void setSasiList(Map<String, Integer> sasiList) {
        this.sasiList = sasiList;
    }

        public Integer getKonsinresulet() {
        return konsinresulet;
    }

    public void setKonsinresulet(Integer konsinresulet) {
        this.konsinresulet = konsinresulet;
    }

        public String getKonsinroyuu() {
        return konsinroyuu;
    }

    public void setKonsinroyuu(String konsinroyuu) {
        this.konsinroyuu = konsinroyuu;
    }

}
