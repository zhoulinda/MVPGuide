package com.linda.mvpguide.bean;

import java.util.List;

/**
 * Created by linda on 2017/7/12.
 */

public class News {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"ebe3ffbe282866d5e009c1f38c97cbf7","title":"高温下的劳动者","date":"2017-07-12 16:15","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170712161506652.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_89a5ec940ebd74946bed87eac73b6217_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_812dded271ccd59333b099bfa862d747_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_4c386befa0f5da0f0109ffde6dc4e0d0_2_mwpm_03200403.jpg"},{"uniquekey":"caa06ee1f935c94038276e0c6dd65ac0","title":"俄外长拉夫罗夫警告 考虑报复美驱逐其外交官","date":"2017-07-12 16:24","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712162432587.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170712/20170712162432_1214c2dcfc433bbccb5b862e5e3aba5e_1_mwpm_03200403.jpg"},{"uniquekey":"dd758a44f9c5c70aba765798fcb6c836","title":"河北张家口市委常委郭英已兼任常务副市长职务","date":"2017-07-12 16:17","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170712161728388.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170712/20170712161728_32c3bcef4372c534af85a9afc74c79f8_1_mwpm_03200403.jpg"},{"uniquekey":"570704696a919fc61bec692979854dec","title":"日本一女子承认毒杀丈夫和男友在内6人 说出这样一番话","date":"2017-07-12 16:04","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712160415231.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170712/20170712160415_68be89dc9bd451cb0278c7ce68941b2b_1_mwpm_03200403.jpg"},{"uniquekey":"f21752e3cbd4497ec1f83ef29ee31326","title":"女子钻公交车底寻短见 民警跪地劝一小时","date":"2017-07-12 16:04","category":"头条","author_name":"平安杭州","url":"http://mini.eastday.com/mobile/170712160414427.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170712/20170712160414_9c805698f4faf538f35676f083b4cf84_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170712/20170712160414_9c805698f4faf538f35676f083b4cf84_2_mwpm_03200403.jpg"},{"uniquekey":"06976287c24e8b535e0a8b3fcabfec1d","title":"朱成山：《那岁月刻骨铭心》的第一手资料令人赞叹","date":"2017-07-12 15:33","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712153338009.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170712153338_80e913474636b72fb2ed559c574e4dbe_1_mwpm_03200403.jpg"},{"uniquekey":"cb7e4d1238f4dae390ba0f38434d3dfd","title":"旅韩大熊猫待遇好 初伏天享用冰镇西瓜","date":"2017-07-12 15:33","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712153333948.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712153333_e20eb04aea51233406eaed2d3d032eb5_1_mwpm_03200403.jpg"},{"uniquekey":"01c865cd28c5eeab96b74fb09ec32ed6","title":"担忧在海外遭遇诱骗 菲律宾近一年禁止4.3万人出国","date":"2017-07-12 15:23","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712152316753.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170712/20170712152316_f6bc81b52ef21be2a7fc7776754f50b5_1_mwpm_03200403.jpg"},{"uniquekey":"f577079188d946ed15af6c38f5bb58a9","title":"千年前高僧坐化遗体扫描:骨骼完整 大脑仍在","date":"2017-07-12 15:01","category":"头条","author_name":"中国青年报","url":"http://mini.eastday.com/mobile/170712150133029.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712150133_b9c7cab026c53557b4200ea3e099a792_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712150133_b9c7cab026c53557b4200ea3e099a792_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712150133_b9c7cab026c53557b4200ea3e099a792_3_mwpm_03200403.jpg"},{"uniquekey":"81925f65ca876b87a2cdc88f0b0105a9","title":"小王家中有三张纸币，市场估价七位数，但是他不卖！","date":"2017-07-12 15:00","category":"头条","author_name":"历史评论家","url":"http://mini.eastday.com/mobile/170712150015725.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170711_af64efab624f247c58310ed02fa7d613_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170712/20170711_5d9947d8a9fd325a5a12fadde4b37768_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170712/20170711_422e20ef0c8527ab0b5175ff6c338b7c_mwpm_03200403.jpg"},{"uniquekey":"ea41be47d8e76fee0a2f0fd8c65b5f7d","title":"2018年春晚开始筹备？苗阜晒合照赞剧组接地气","date":"2017-07-12 14:48","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170712144839538.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712144839_dad2e7d20cb05cabc5e20aa7dbbabb34_1_mwpm_03200403.jpg"},{"uniquekey":"2773886f40fa5cf0bc08e487b456d8a8","title":"林志玲现身医院被疑修脸 经纪人回应：打美白针","date":"2017-07-12 14:43","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170712144312939.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170712144312_d5ad4692f8e62eec50c02b90d10464c3_1_mwpm_03200403.jpg"},{"uniquekey":"7e2785bfb42cbb485b32e91d1a503ec6","title":"德国一游艇猛烈爆炸致13人受伤：多为消防员，事发时正灭火","date":"2017-07-12 14:41","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170712144150613.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712144150_ea6c41623a504bc1a4072ac71c085984_1_mwpm_03200403.jpg"},{"uniquekey":"ee9d1badc2f04b5ffd68db1587f2c8c7","title":"天已入伏,今年全国热到爆炸 哪里最热?","date":"2017-07-12 14:32","category":"头条","author_name":"储能佰草","url":"http://mini.eastday.com/mobile/170712143218684.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170712/20170712_e92a1512d04c097fd7a5b44e9ee92a16_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170712/20170712_d9d43c0d691dd18a1d6f9eb1a84333c3_mwpm_03200403.png","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170712/20170712_69a4db194486e137412dc490da96ebe0_mwpm_03200403.png"},{"uniquekey":"9bdef620fa8faa4b99319720d6e93dc7","title":"韩统一部：重启金刚山旅游需考虑游客人身安全","date":"2017-07-12 14:32","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712143214532.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712143214_49954613f0872703c9d8e2d6ff1cb55c_1_mwpm_03200403.jpg"},{"uniquekey":"8aae7ad2d7786008f8d93ebf64a5223e","title":"全国大部分地区迎高温\u201c烤验\u201d，拉萨最低10℃有人穿羽绒服","date":"2017-07-12 14:32","category":"头条","author_name":"西藏商报微信公号","url":"http://mini.eastday.com/mobile/170712143200626.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170712/20170712143200_495e8bdc9691ef82bbcaa72500459773_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170712/20170712143200_495e8bdc9691ef82bbcaa72500459773_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170712/20170712143200_495e8bdc9691ef82bbcaa72500459773_3_mwpm_03200403.jpg"},{"uniquekey":"0bfffb646013b7634fc4fcb60c27938b","title":"四川农村小伙迎娶英国美女为妻，上演现实版\u201c屌丝逆袭\u201d！","date":"2017-07-12 14:27","category":"头条","author_name":"爆料生活","url":"http://mini.eastday.com/mobile/170712142736601.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170712/20170712_752a12a87b7dc378960949c72421582d_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170712/20170712_0924ea584edac26ff8334c96ee95b7f4_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170712/20170712_2f29106b3685da253839518f077c3d92_cover_mwpm_03200403.jpeg"},{"uniquekey":"65fce3dcbbdcceea2de25336a01aa3da","title":"中国被欺负到头上为何不反击？真相惊人","date":"2017-07-12 14:21","category":"头条","author_name":"米尔军事","url":"http://mini.eastday.com/mobile/170712142155914.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170712/20170712142155_4d30f968e6ae3f1757ee5e23082915f4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170712/20170712142155_4d30f968e6ae3f1757ee5e23082915f4_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170712/20170712142155_4d30f968e6ae3f1757ee5e23082915f4_4_mwpm_03200403.jpg"},{"uniquekey":"051a360f97593bc1498de51ba2f6e3be","title":"20多岁女孩几个月变成老奶奶，丈夫不离不弃，网友：这才是真爱","date":"2017-07-12 14:20","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170712142058501.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712_54ed99402b7c2ff7d13b72f98d92c348_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170712/20170712_dea775ee679cf70eb2a5af72e4f0737d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170712/20170712_0213b8d36fbc7214325f0b095fe3bd19_cover_mwpm_03200403.jpeg"},{"uniquekey":"7183f8e98a65a4fff71d560bb86aecc5","title":"这几种嘴唇的形状看你的性格，看看你是哪一种","date":"2017-07-12 14:16","category":"头条","author_name":"小燕子说星座","url":"http://mini.eastday.com/mobile/170712141655894.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712141655_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170712/20170712141655_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170712/20170712141655_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg"},{"uniquekey":"f0ce6597d8e8a92ac9ac63c7c2afe7a3","title":"广联达付永晖：成本管控的大数据应用前景看好","date":"2017-07-12 14:11","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/170712141151050.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170712/20170712141151_9fee503ff983b1f688d74edc44e0904b_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170712/20170712141151_9fee503ff983b1f688d74edc44e0904b_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170712/20170712141151_9fee503ff983b1f688d74edc44e0904b_7_mwpm_03200403.jpg"},{"uniquekey":"539f46224a958b56c8987ef163a31e64","title":"世界上最小的婴儿，身体只有鸡蛋大小，体重只有280克！","date":"2017-07-12 14:06","category":"头条","author_name":"深涵幽默秀","url":"http://mini.eastday.com/mobile/170712140604071.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712_8bf56a0b317034c73e8dac8240a9e4bf_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170712/20170712_e85f340a870d85cb7a680227242b8229_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170712/20170712_94733aa525a34cfb4ce802c25b893f94_cover_mwpm_03200403.jpeg"},{"uniquekey":"b951ad198e86f85d9906198b94bbb5b6","title":"韩巨济市称暂不修缮文在寅故居 但会限制周边开发","date":"2017-07-12 14:01","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712140132547.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712140132_972a4ad4839e00767400dc86a467eb1e_1_mwpm_03200403.jpg"},{"uniquekey":"dafeecfffa0e8ecb406a7e65e6e8d2ff","title":"如果手掌上有这几种症状，证明体内毒素爆了！肺癌已经缠上你了！","date":"2017-07-12 13:41","category":"头条","author_name":"育儿微刊","url":"http://mini.eastday.com/mobile/170712134105537.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712_da5073975ddb810be8551038ba8517df_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170712/20170712_01d871ca3dbcef99232c89672bbcfd6b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170712/20170712_9e34f2570a997b842bc3e8094340749d_cover_mwpm_03200403.jpeg"},{"uniquekey":"8fc49f29db877a302c12ee496e3bdd68","title":"台认证客语混入日文 蔡英文被怒问:你母语是日语?","date":"2017-07-12 13:41","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/170712134102456.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170712134102_21e5fd0cb7ef1c5324c9243b9b2f3751_1_mwpm_03200403.jpg"},{"uniquekey":"74949a31aeeb854173d419f7e9be46e5","title":"京津冀传统产业转型升级靠什么？","date":"2017-07-12 13:32","category":"头条","author_name":"中高新传媒","url":"http://mini.eastday.com/mobile/170712133230207.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170712/20170712133230_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170712/20170712133230_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"708194f231855af260974197517acbdd","title":"11名群众围捕姚常凤细节：围追堵截逼得他举手投降","date":"2017-07-12 13:28","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170712132818213.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170712/20170712132818_3ed5566e3f600267951a5b174176eef9_1_mwpm_03200403.jpg"},{"uniquekey":"d91de201c822bc915d04d227101ab40a","title":"美国担忧：中国将造新核动力轰炸机，一旦实现核打击能力跃升世界前列 ","date":"2017-07-12 13:16","category":"头条","author_name":"小飞猪观察","url":"http://mini.eastday.com/mobile/170712131633128.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170712/20170712131633_4202ea0b409e22bcf0f7343df2c18ee1_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170712/20170712131633_4202ea0b409e22bcf0f7343df2c18ee1_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170712/20170712131633_4202ea0b409e22bcf0f7343df2c18ee1_4_mwpm_03200403.jpg"},{"uniquekey":"7ea016d620335d24437a7bcca75127d9","title":"纪委书记的情妇、市委书记家的保姆，为何都惹上了受贿罪","date":"2017-07-12 13:14","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/170712131422758.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712131422_62745a472d9a4fc9e2c60a8cade9e25d_1_mwpm_03200403.jpg"},{"uniquekey":"21aeb01ef565ce0ad5720e69ace1f9b9","title":"\u200b印方一意孤行只会招致挨揍，中国军队决不让疆土有半寸丢失！","date":"2017-07-12 13:05","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/170712130537482.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712_f895c900ee4e8ec1baf1bea5ad0f2633_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712_31c354e526e12d1b358f84f5c345f8d2_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712_d02e72361c3dcfc2dfdada8e40340136_cover_mwpm_03200403.jpeg"}]}
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
        /**
         * stat : 1
         * data : [{"uniquekey":"ebe3ffbe282866d5e009c1f38c97cbf7","title":"高温下的劳动者","date":"2017-07-12 16:15","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170712161506652.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_89a5ec940ebd74946bed87eac73b6217_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_812dded271ccd59333b099bfa862d747_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712161506_4c386befa0f5da0f0109ffde6dc4e0d0_2_mwpm_03200403.jpg"},{"uniquekey":"caa06ee1f935c94038276e0c6dd65ac0","title":"俄外长拉夫罗夫警告 考虑报复美驱逐其外交官","date":"2017-07-12 16:24","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712162432587.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170712/20170712162432_1214c2dcfc433bbccb5b862e5e3aba5e_1_mwpm_03200403.jpg"},{"uniquekey":"dd758a44f9c5c70aba765798fcb6c836","title":"河北张家口市委常委郭英已兼任常务副市长职务","date":"2017-07-12 16:17","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170712161728388.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170712/20170712161728_32c3bcef4372c534af85a9afc74c79f8_1_mwpm_03200403.jpg"},{"uniquekey":"570704696a919fc61bec692979854dec","title":"日本一女子承认毒杀丈夫和男友在内6人 说出这样一番话","date":"2017-07-12 16:04","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712160415231.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170712/20170712160415_68be89dc9bd451cb0278c7ce68941b2b_1_mwpm_03200403.jpg"},{"uniquekey":"f21752e3cbd4497ec1f83ef29ee31326","title":"女子钻公交车底寻短见 民警跪地劝一小时","date":"2017-07-12 16:04","category":"头条","author_name":"平安杭州","url":"http://mini.eastday.com/mobile/170712160414427.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170712/20170712160414_9c805698f4faf538f35676f083b4cf84_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170712/20170712160414_9c805698f4faf538f35676f083b4cf84_2_mwpm_03200403.jpg"},{"uniquekey":"06976287c24e8b535e0a8b3fcabfec1d","title":"朱成山：《那岁月刻骨铭心》的第一手资料令人赞叹","date":"2017-07-12 15:33","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712153338009.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170712153338_80e913474636b72fb2ed559c574e4dbe_1_mwpm_03200403.jpg"},{"uniquekey":"cb7e4d1238f4dae390ba0f38434d3dfd","title":"旅韩大熊猫待遇好 初伏天享用冰镇西瓜","date":"2017-07-12 15:33","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712153333948.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712153333_e20eb04aea51233406eaed2d3d032eb5_1_mwpm_03200403.jpg"},{"uniquekey":"01c865cd28c5eeab96b74fb09ec32ed6","title":"担忧在海外遭遇诱骗 菲律宾近一年禁止4.3万人出国","date":"2017-07-12 15:23","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712152316753.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170712/20170712152316_f6bc81b52ef21be2a7fc7776754f50b5_1_mwpm_03200403.jpg"},{"uniquekey":"f577079188d946ed15af6c38f5bb58a9","title":"千年前高僧坐化遗体扫描:骨骼完整 大脑仍在","date":"2017-07-12 15:01","category":"头条","author_name":"中国青年报","url":"http://mini.eastday.com/mobile/170712150133029.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712150133_b9c7cab026c53557b4200ea3e099a792_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712150133_b9c7cab026c53557b4200ea3e099a792_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712150133_b9c7cab026c53557b4200ea3e099a792_3_mwpm_03200403.jpg"},{"uniquekey":"81925f65ca876b87a2cdc88f0b0105a9","title":"小王家中有三张纸币，市场估价七位数，但是他不卖！","date":"2017-07-12 15:00","category":"头条","author_name":"历史评论家","url":"http://mini.eastday.com/mobile/170712150015725.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170711_af64efab624f247c58310ed02fa7d613_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170712/20170711_5d9947d8a9fd325a5a12fadde4b37768_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170712/20170711_422e20ef0c8527ab0b5175ff6c338b7c_mwpm_03200403.jpg"},{"uniquekey":"ea41be47d8e76fee0a2f0fd8c65b5f7d","title":"2018年春晚开始筹备？苗阜晒合照赞剧组接地气","date":"2017-07-12 14:48","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170712144839538.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712144839_dad2e7d20cb05cabc5e20aa7dbbabb34_1_mwpm_03200403.jpg"},{"uniquekey":"2773886f40fa5cf0bc08e487b456d8a8","title":"林志玲现身医院被疑修脸 经纪人回应：打美白针","date":"2017-07-12 14:43","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170712144312939.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170712144312_d5ad4692f8e62eec50c02b90d10464c3_1_mwpm_03200403.jpg"},{"uniquekey":"7e2785bfb42cbb485b32e91d1a503ec6","title":"德国一游艇猛烈爆炸致13人受伤：多为消防员，事发时正灭火","date":"2017-07-12 14:41","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170712144150613.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712144150_ea6c41623a504bc1a4072ac71c085984_1_mwpm_03200403.jpg"},{"uniquekey":"ee9d1badc2f04b5ffd68db1587f2c8c7","title":"天已入伏,今年全国热到爆炸 哪里最热?","date":"2017-07-12 14:32","category":"头条","author_name":"储能佰草","url":"http://mini.eastday.com/mobile/170712143218684.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170712/20170712_e92a1512d04c097fd7a5b44e9ee92a16_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170712/20170712_d9d43c0d691dd18a1d6f9eb1a84333c3_mwpm_03200403.png","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170712/20170712_69a4db194486e137412dc490da96ebe0_mwpm_03200403.png"},{"uniquekey":"9bdef620fa8faa4b99319720d6e93dc7","title":"韩统一部：重启金刚山旅游需考虑游客人身安全","date":"2017-07-12 14:32","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712143214532.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712143214_49954613f0872703c9d8e2d6ff1cb55c_1_mwpm_03200403.jpg"},{"uniquekey":"8aae7ad2d7786008f8d93ebf64a5223e","title":"全国大部分地区迎高温\u201c烤验\u201d，拉萨最低10℃有人穿羽绒服","date":"2017-07-12 14:32","category":"头条","author_name":"西藏商报微信公号","url":"http://mini.eastday.com/mobile/170712143200626.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170712/20170712143200_495e8bdc9691ef82bbcaa72500459773_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170712/20170712143200_495e8bdc9691ef82bbcaa72500459773_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170712/20170712143200_495e8bdc9691ef82bbcaa72500459773_3_mwpm_03200403.jpg"},{"uniquekey":"0bfffb646013b7634fc4fcb60c27938b","title":"四川农村小伙迎娶英国美女为妻，上演现实版\u201c屌丝逆袭\u201d！","date":"2017-07-12 14:27","category":"头条","author_name":"爆料生活","url":"http://mini.eastday.com/mobile/170712142736601.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170712/20170712_752a12a87b7dc378960949c72421582d_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170712/20170712_0924ea584edac26ff8334c96ee95b7f4_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170712/20170712_2f29106b3685da253839518f077c3d92_cover_mwpm_03200403.jpeg"},{"uniquekey":"65fce3dcbbdcceea2de25336a01aa3da","title":"中国被欺负到头上为何不反击？真相惊人","date":"2017-07-12 14:21","category":"头条","author_name":"米尔军事","url":"http://mini.eastday.com/mobile/170712142155914.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170712/20170712142155_4d30f968e6ae3f1757ee5e23082915f4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170712/20170712142155_4d30f968e6ae3f1757ee5e23082915f4_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170712/20170712142155_4d30f968e6ae3f1757ee5e23082915f4_4_mwpm_03200403.jpg"},{"uniquekey":"051a360f97593bc1498de51ba2f6e3be","title":"20多岁女孩几个月变成老奶奶，丈夫不离不弃，网友：这才是真爱","date":"2017-07-12 14:20","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170712142058501.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712_54ed99402b7c2ff7d13b72f98d92c348_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170712/20170712_dea775ee679cf70eb2a5af72e4f0737d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170712/20170712_0213b8d36fbc7214325f0b095fe3bd19_cover_mwpm_03200403.jpeg"},{"uniquekey":"7183f8e98a65a4fff71d560bb86aecc5","title":"这几种嘴唇的形状看你的性格，看看你是哪一种","date":"2017-07-12 14:16","category":"头条","author_name":"小燕子说星座","url":"http://mini.eastday.com/mobile/170712141655894.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712141655_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170712/20170712141655_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170712/20170712141655_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg"},{"uniquekey":"f0ce6597d8e8a92ac9ac63c7c2afe7a3","title":"广联达付永晖：成本管控的大数据应用前景看好","date":"2017-07-12 14:11","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/170712141151050.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170712/20170712141151_9fee503ff983b1f688d74edc44e0904b_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170712/20170712141151_9fee503ff983b1f688d74edc44e0904b_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170712/20170712141151_9fee503ff983b1f688d74edc44e0904b_7_mwpm_03200403.jpg"},{"uniquekey":"539f46224a958b56c8987ef163a31e64","title":"世界上最小的婴儿，身体只有鸡蛋大小，体重只有280克！","date":"2017-07-12 14:06","category":"头条","author_name":"深涵幽默秀","url":"http://mini.eastday.com/mobile/170712140604071.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170712/20170712_8bf56a0b317034c73e8dac8240a9e4bf_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170712/20170712_e85f340a870d85cb7a680227242b8229_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170712/20170712_94733aa525a34cfb4ce802c25b893f94_cover_mwpm_03200403.jpeg"},{"uniquekey":"b951ad198e86f85d9906198b94bbb5b6","title":"韩巨济市称暂不修缮文在寅故居 但会限制周边开发","date":"2017-07-12 14:01","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170712140132547.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712140132_972a4ad4839e00767400dc86a467eb1e_1_mwpm_03200403.jpg"},{"uniquekey":"dafeecfffa0e8ecb406a7e65e6e8d2ff","title":"如果手掌上有这几种症状，证明体内毒素爆了！肺癌已经缠上你了！","date":"2017-07-12 13:41","category":"头条","author_name":"育儿微刊","url":"http://mini.eastday.com/mobile/170712134105537.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170712/20170712_da5073975ddb810be8551038ba8517df_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170712/20170712_01d871ca3dbcef99232c89672bbcfd6b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170712/20170712_9e34f2570a997b842bc3e8094340749d_cover_mwpm_03200403.jpeg"},{"uniquekey":"8fc49f29db877a302c12ee496e3bdd68","title":"台认证客语混入日文 蔡英文被怒问:你母语是日语?","date":"2017-07-12 13:41","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/170712134102456.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170712/20170712134102_21e5fd0cb7ef1c5324c9243b9b2f3751_1_mwpm_03200403.jpg"},{"uniquekey":"74949a31aeeb854173d419f7e9be46e5","title":"京津冀传统产业转型升级靠什么？","date":"2017-07-12 13:32","category":"头条","author_name":"中高新传媒","url":"http://mini.eastday.com/mobile/170712133230207.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170712/20170712133230_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170712/20170712133230_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"708194f231855af260974197517acbdd","title":"11名群众围捕姚常凤细节：围追堵截逼得他举手投降","date":"2017-07-12 13:28","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170712132818213.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170712/20170712132818_3ed5566e3f600267951a5b174176eef9_1_mwpm_03200403.jpg"},{"uniquekey":"d91de201c822bc915d04d227101ab40a","title":"美国担忧：中国将造新核动力轰炸机，一旦实现核打击能力跃升世界前列 ","date":"2017-07-12 13:16","category":"头条","author_name":"小飞猪观察","url":"http://mini.eastday.com/mobile/170712131633128.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170712/20170712131633_4202ea0b409e22bcf0f7343df2c18ee1_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170712/20170712131633_4202ea0b409e22bcf0f7343df2c18ee1_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170712/20170712131633_4202ea0b409e22bcf0f7343df2c18ee1_4_mwpm_03200403.jpg"},{"uniquekey":"7ea016d620335d24437a7bcca75127d9","title":"纪委书记的情妇、市委书记家的保姆，为何都惹上了受贿罪","date":"2017-07-12 13:14","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/170712131422758.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712131422_62745a472d9a4fc9e2c60a8cade9e25d_1_mwpm_03200403.jpg"},{"uniquekey":"21aeb01ef565ce0ad5720e69ace1f9b9","title":"\u200b印方一意孤行只会招致挨揍，中国军队决不让疆土有半寸丢失！","date":"2017-07-12 13:05","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/170712130537482.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170712/20170712_f895c900ee4e8ec1baf1bea5ad0f2633_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170712/20170712_31c354e526e12d1b358f84f5c345f8d2_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170712/20170712_d02e72361c3dcfc2dfdada8e40340136_cover_mwpm_03200403.jpeg"}]
         */

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
