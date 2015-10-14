package com.example.hahahs.funreader.beans;

import java.util.List;

/**
 * Created by hahahs on 2015/10/13.
 */
public class News {

    /**
     * reason : 查询成功
     * result : [{"title":"习近平从严治党立新规的五个\"重在\"(组图)","content":"廉洁自律是一种人格力量,也是立身之本、处事之基、为人之道,是党一贯坚持的鲜明政治立场,是人民关注的重大政治问题。<em>习近平<\/em>说:\"道德问题是做人的首要的基本问题。古人说:'百行以德为首',讲的就是这个道理。大量情况表明,道德情操与生活情趣是密切联系在一起的。许多腐败分子...","img_width":"654","full_title":"习近平从严治党立新规的五个\"重在\"(组图)","pdate":"1小时前","src":"中工网","img_length":"800","img":"http://p2.qhimg.com/t01763183a012edc212.jpg","url":"http://news.workercn.cn/607/201510/13/151013183129733.shtml","pdate_src":"2015-10-13 21:16:18"},{"title":"习近平:推动全球治理体制更加公正更加合理","content":"新华网北京10月13日电 中共中央政治局10月l2日下午就全球治理格局和全球治理体制进行第二十七次集体学习。中共中央总书记<em>习近平<\/em>在主持学习时强调,我们参与全球治理的根本目的,就是服从服务于实现\"两个一百年\"奋斗目标、实现中华民族伟大复兴的中国梦。要审时度势,努力抓住...","img_width":"","full_title":"习近平:推动全球治理体制更加公正更加合理","pdate":"4小时前","src":"中国经济网","img_length":"","img":"","url":"http://www.ce.cn/xwzx/gnsz/szyw/201510/13/t20151013_6694285.shtml","pdate_src":"2015-10-13 18:54:00"},{"title":"习近平对全国道德模范表彰活动作出重要批示","content":"新华网北京10月13日电 第五届全国道德模范座谈会13日下午在京召开。中共中央总书记、国家主席、中央军委主席<em>习近平<\/em>日前作出重要批示,向受表彰的全国道德模范致以热烈祝贺和崇高敬意。  <em>习近平<\/em>指出,隆重表彰全国道德模范,对展示社会主义思想道德建设的丰硕成果,彰显中华民...","img_width":"","full_title":"习近平对全国道德模范表彰活动作出重要批示","pdate":"4小时前","src":"新华网","img_length":"","img":"","url":"http://news.xinhuanet.com/politics/2015-10/13/c_1116812676.htm","pdate_src":"2015-10-13 18:48:46"},{"title":"习近平:鼓励基层改革创新大胆探索 推动改革落地生根造福群众","content":"新华网北京10月13日 电中共中央总书记、国家主席、中央军委主席、中央全面深化改革领导小组组长<em>习近平<\/em>10月13日上午主持召开中央全面深化改革领导小组第十七次会议并发表重要讲话。他强调,中央通过的改革方案落地生根,必须鼓励和允许不同地方进行差别化探索。全面深化改...","img_width":"","full_title":"习近平:鼓励基层改革创新大胆探索 推动改革落地生根造福群众","pdate":"4小时前","src":"中国西藏网","img_length":"","img":"","url":"http://www.tibet.cn/wap/news/hot/1444732477630.shtml","pdate_src":"2015-10-13 18:32:34"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultEntity> result;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public int getError_code() {
        return error_code;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity {
        /**
         * title : 习近平从严治党立新规的五个"重在"(组图)
         * content : 廉洁自律是一种人格力量,也是立身之本、处事之基、为人之道,是党一贯坚持的鲜明政治立场,是人民关注的重大政治问题。<em>习近平</em>说:"道德问题是做人的首要的基本问题。古人说:'百行以德为首',讲的就是这个道理。大量情况表明,道德情操与生活情趣是密切联系在一起的。许多腐败分子...
         * img_width : 654
         * full_title : 习近平从严治党立新规的五个"重在"(组图)
         * pdate : 1小时前
         * src : 中工网
         * img_length : 800
         * img : http://p2.qhimg.com/t01763183a012edc212.jpg
         * url : http://news.workercn.cn/607/201510/13/151013183129733.shtml
         * pdate_src : 2015-10-13 21:16:18
         */

        private String title;
        private String content;
        private String img_width;
        private String full_title;
        private String pdate;
        private String src;
        private String img_length;
        private String img;
        private String url;
        private String pdate_src;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setImg_width(String img_width) {
            this.img_width = img_width;
        }

        public void setFull_title(String full_title) {
            this.full_title = full_title;
        }

        public void setPdate(String pdate) {
            this.pdate = pdate;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public void setImg_length(String img_length) {
            this.img_length = img_length;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setPdate_src(String pdate_src) {
            this.pdate_src = pdate_src;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getImg_width() {
            return img_width;
        }

        public String getFull_title() {
            return full_title;
        }

        public String getPdate() {
            return pdate;
        }

        public String getSrc() {
            return src;
        }

        public String getImg_length() {
            return img_length;
        }

        public String getImg() {
            return img;
        }

        public String getUrl() {
            return url;
        }

        public String getPdate_src() {
            return pdate_src;
        }
    }
}
