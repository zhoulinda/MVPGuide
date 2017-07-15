package com.linda.mvpguide.bean;

import java.util.List;

/**
 * Created by linda on 2017/7/12.
 */

public class News {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"ebe3ffbe282866d5e009c1f38c97cbf7","title":"高温下的劳动者","date":"2017-07-12 16:15","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170712161506652.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_89a5ec940ebd74946bed87eac73b6217_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_812dded271ccd59333b099bfa862d747_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_4c386befa0f5da0f0109ffde6dc4e0d0_2_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : ebe3ffbe282866d5e009c1f38c97cbf7
             * title : 高温下的劳动者
             * date : 2017-07-12 16:15
             * category : 头条
             * author_name : 新华社
             * url : http://mini.eastday.com/mobile/170712161506652.html
             * thumbnail_pic_s : http://08.imgmini.eastday.com/mobile/20170712/20170712161506_89a5ec940ebd74946bed87eac73b6217_3_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://08.imgmini.eastday.com/mobile/20170712/20170712161506_812dded271ccd59333b099bfa862d747_4_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://08.imgmini.eastday.com/mobile/20170712/20170712161506_4c386befa0f5da0f0109ffde6dc4e0d0_2_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
