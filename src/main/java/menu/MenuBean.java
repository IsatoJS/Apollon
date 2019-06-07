package menu;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * メニュー画面に関するバッキングビーン
 *
 */
@Named
@RequestScoped
public class MenuBean {

    /**
     * BOLDayアンケート入力画面に遷移する。
     *
     * @return 遷移先画面のxhtmlファイル名
     */
    public String trnInputBolday() {
        return "input_bolday.xhtml";
    }

    /**
     * 感動大学アンケート入力画面に遷移する。
     *
     * @return 遷移先画面のxhtmlファイル名
     */
    public String trnInputExcitementCollege() {
        return "input_excitement_college.xhtml";
    }

    /**
     * 技術勉強会アンケート入力画面に遷移する。
     *
     * @return 遷移先画面のxhtmlファイル名
     */
    public String trnInputTecStudy() {
        return "input_tec_study.xhtml";
    }

    /**
     * CSSサンプル画面に遷移する。
     *
     * @return 遷移先画面のxhtmlファイル名
     */
    public String trnCssSample() {
        return "css_sample.xhtml";
    }
}
