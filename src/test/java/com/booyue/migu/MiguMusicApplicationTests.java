package com.booyue.migu;

import com.alibaba.fastjson.JSONObject;
import com.booyue.migu.dao.*;
import com.booyue.migu.entity.*;
import com.booyue.migu.utils.FileUtils;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.swing.text.html.CSS.getAttribute;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MiguMusicApplicationTests {


    @Autowired
    private SongMapper songMapper;


    private final String fileName1 = "E:\\migu_music1.txt";
    private final String fileName2 = "E:\\migu_music2.txt";

    @Test
    public void contextLoads() {
        SongExample songExample = new SongExample();
        songExample.createCriteria().andAuditionUrlIsNotNull();
        long totalCount = songMapper.countByExample(songExample);

        System.out.println("totalCount:" + totalCount);
        long totalPage = totalCount / 10000L;
        Long pageSize = 10000L;

        for (int i = 0; i < totalPage; i++) {
            Long page = i * 10000L;
            songExample.setOffset(page);
            songExample.setLimit(pageSize);
            List<Song> songs = songMapper.selectByExample(songExample);
            songs.stream().forEach(song -> {
                String url = FileUtils.change(song.getAuditionUrl());

//                boolean isUse = HttpUtil.get(url);
//                String ss = "Song:" + "id:" + song.getId() + ",url:" + url + ",isUse:" + isUse;
//                if (!isUse) {
////                    System.out.println(ss);
////                    int row = songMapper.deleteByPrimaryKey(song.getId());
////                    if (row > 0) {
//                    try {
//                        FileUtils.writeFileContent(fileName1, ss);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
////                    }
//                } else {
//                    System.out.println(ss);
////                    String ss = "Song:" + "id:" + song.getId() + ",url:" + song.getAuditionUrl() + ",isUse:" + isUse;
////                    try {
////                        FileUtils.writeFileContent(fileName2, ss);
////                    } catch (IOException e) {
////                        e.printStackTrace();
////                    }
//
//                }
            });

        }

//        String url="http://tyst.migu.cn/public/ringmaker01/n4/tyxk/2012/03/2013年01月15日日常项目29首/全曲试听/Mp3_128_44_16/微信爱(DJ版)-陈玉建+陈美惠.mp3";
//        String url2 = FileUtils.change(url);
//        System.out.println(url2);
//
//        List<Song> songList = songMapper.selectByExample(songExample);
//        songList.stream().forEach(song -> {
//            System.out.println(song.toString());
//        });

    }


    @Test
    public void saveFileFromUrl() {

//        //三国演义
//        String bookName_SanGuo = "三国演义";
//        for (int i = 1; i <= 8; i++) {
//            String fileUrl = "http://ar.dolphinmedia.cn/bj1/jzsgyy/static/三国演义" + i + ".mp3";
//            String[] ss = fileUrl.split("/");
//            fileUrl = FileUtils.change(fileUrl);
//            String savePAth = FileUtils.saveUrlAs(fileUrl, ss[ss.length - 1], bookName_SanGuo, "GET");
//            System.out.println(savePAth.length() > 0 ? "保存完成:" + savePAth : "保存失败!");
//        }
//
//        //西游记
//        String bookName_XiYou = "西游记";
//        for (int i = 1; i <= 8; i++) {
//            String fileUrl = "http://ar.dolphinmedia.cn/bj1/jzxyj/static/西游记" + i + ".mp3";
//            String[] ss = fileUrl.split("/");
//            fileUrl = FileUtils.change(fileUrl);
//            String savePAth = FileUtils.saveUrlAs(fileUrl, ss[ss.length - 1], bookName_XiYou, "GET");
//            System.out.println(savePAth.length() > 0 ? "保存完成:" + savePAth : "保存失败!");
//        }

        //水浒传
        String bookName_ShuiHu = "水浒传";
        for (int i = 1; i <= 8; i++) {
            String fileUrl = "http://ar.dolphinmedia.cn/bj1/jzshz/static/水浒传" + i + ".mp3";
            String[] ss = fileUrl.split("/");
            fileUrl = FileUtils.change(fileUrl);
            String savePAth = FileUtils.saveUrlAs(fileUrl, ss[ss.length - 1], bookName_ShuiHu, "GET");
            System.out.println(savePAth.length() > 0 ? "保存完成:" + savePAth : "保存失败!");
        }


//        //红楼梦
//        String bookName_HongLouMeng="红楼梦";
//        for (int i=1;i<=8;i++){
//            String fileUrl = "http://ar.dolphinmedia.cn/bj1/jzhlm/static/红楼梦"+i+".mp3";
//            String[] ss = fileUrl.split("/");
//            fileUrl = FileUtils.change(fileUrl);
//            String savePAth = FileUtils.saveUrlAs(fileUrl, ss[ss.length - 1],bookName_HongLouMeng, "GET");
//            System.out.println(savePAth.length() > 0 ? "保存完成:" + savePAth : "保存失败!");
//        }


//
//        //孤獨的小螃蟹
//        String boomName_XiaoPangXie="孤獨的小螃蟹";
//        String[] titles={
//                "1孤独的小螃蟹-阅读指导",
//                "2小青蟹不见了",
//                "3小螃蟹的梦",
//                "4小纸鸟",
//                "5咚咚鼓",
//                "6树的眼泪",
//                "7“咔嚓咔嚓”剪头发",
//                "8一只大钳子",
//                "9小青蟹回来了",
//                "10红蜻蜓，红蜻蜓-阅读指导",
//                "11红草莓树",
//                "12一百岁生日",
//                "13老野牛哭了",
//                "14红蜻蜓",
//                "15森林历险",
//                "16臭屁虫",
//                "17月亮的红飘带",
//                "18山猫的恶作剧",
//                "19蛤蟆小姐装电话",
//                "20没有收到贺年卡",
//                "21炸黑了太阳的脸",
//                "22真的毒蘑菇",
//                "23灾难快要来了",
//                "24红草莓重现",
//                "25桃树下的小白兔",
//                "26雷龙大笨笨",
//                "27第一次下雪",
//        };
//        for (int i=0;i<titles.length;i++){
//            String fileUrl = "http://hmyx.oss-cn-hongkong.aliyuncs.com/radio/Gududexiaopangxie-ertong/"+titles[i]+".mp3";
//            String[] ss = fileUrl.split("/");
//            fileUrl = FileUtils.change(fileUrl);
//            String savePAth = FileUtils.saveUrlAs(fileUrl, ss[ss.length-1],boomName_XiaoPangXie, "GET");
//            System.out.println(savePAth.length() > 0 ? "保存完成:" + savePAth : "保存失败!");
//        }
//
//      //小学生必背经典古诗词
//        String boomName_XiaoXueSheng="小学生必背经典古诗词";
//        Map<String,String> headParms=new HashMap<>();
//        headParms.put("Accept","*/*");
//        headParms.put("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.36 Safari/537.36");
//        headParms.put("Referer","http://www.ecustpress.cn/erweima/qrList.aspx?blid=11104");
//        headParms.put("Connection","keep-alive");
//        headParms.put("Pragma","no-cache");
//        headParms.put("Cache-Control","no-cache");
//        headParms.put("Accept-Encoding","identity;q=1, *;q=0");
//        headParms.put("Accept-Language","zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
//        String fileUrl;
//        for (int i=1;i<=85;i++){
//            if (i<10){
//                fileUrl="http://hldqrcode1.oss-cn-shanghai.aliyuncs.com/wapaudio/57655/0"+i+".mp3";
//            }else {
//                 fileUrl="http://hldqrcode1.oss-cn-shanghai.aliyuncs.com/wapaudio/57655/"+i+".mp3";
//            }
//            String[] ss = fileUrl.split("/");
//            String savePAth = FileUtils.saveUrlHasHead(fileUrl, ss[ss.length - 1], "GET",boomName_XiaoXueSheng,headParms);
//            System.out.println(savePAth.length() > 0 ? "保存完成:" + savePAth : "保存失败!");
//        }

    }

    //根据绘本的名字从绘本借阅网抓取绘本借阅次数；根据绘本的isbn号码从豆瓣读书获取绘本的评分。
    @Autowired
    private SpecialMapper specialMapper;
    @Autowired
    private SpecialExtendMapper specialExtendMapper;
    @Autowired
    private TbHainanHuibenMapper hainanHuibenMapper;

    @Test
    public void testDouBanScore() {
        System.getProperties().setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        //下面的id都是数据都是属于绘本的八大分类：参考db_babyting中的表：tb_sclass
        List<Integer> huibenIDs = new ArrayList();
        huibenIDs.add(109);
        huibenIDs.add(110);
        huibenIDs.add(111);
        huibenIDs.add(112);
        huibenIDs.add(113);
        huibenIDs.add(114);
        huibenIDs.add(115);
        huibenIDs.add(116);
        TbSspecialExample example = new TbSspecialExample();
        example.createCriteria().andClassidIn(huibenIDs);
        //这里现在数据少的话没有考虑分页。将来数据多的话肯定需要分页处理。
        List<TbSspecial> huibens = specialMapper.selectByExample(example);
        huibens.stream().forEach(huiben -> {

//            System.out.println("=============豆瓣评分=============");
            getDoubenScore(webDriver, huiben.getName(), huiben.getId());

//            System.out.println("=========绘本借阅次数=======");
            getHuiBenBorrowNum(webDriver, huiben.getName(), huiben.getId());
        });
        webDriver.close();
    }

    private void getHuiBenBorrowNum(WebDriver webDriver, String huibenName, Integer specialId) {

        try {
            String regex = "借阅：(.*)次  被赞";
            String url = "https://www.huiben.cn/so/" + huibenName + "/#book";
            webDriver.get(url);
            System.out.println("=============绘本借阅=============url:" + url);
            List<WebElement> webElements = webDriver.findElements(By.className("h_iif2"));
            if (webElements.size() > 0) {
                WebElement webElement = webElements.get(0);
                String numer = webElement.getText();
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(numer);//匹配类
                while (matcher.find()) {
                    numer = matcher.group(1);
                    TbSspecialExtendExample extendExample = new TbSspecialExtendExample();
                    extendExample.createCriteria().andSpecialidEqualTo(specialId);
                    TbSspecialExtend se = specialExtendMapper.selectByExample(extendExample).get(0);
                    se.setBorrowNum(numer);
                    System.out.println(huibenName + ":" + numer);
                    specialExtendMapper.updateByPrimaryKey(se);
                    Thread.sleep(10000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void getDoubenScore(WebDriver webDriver, String huibenName, Integer specialId) {
        try {
            TbSspecialExtendExample extendExample = new TbSspecialExtendExample();
            extendExample.createCriteria().andSpecialidEqualTo(specialId);
            TbSspecialExtend se = specialExtendMapper.selectByExample(extendExample).get(0);
            String isbn = se.getIsbn();
            String url = "https://book.douban.com/subject_search?search_text=" + isbn + "&cat=1001";
            System.out.println("=============豆瓣评分=============url:" + url);
            webDriver.get(url);
            WebElement webElement = webDriver.findElement(By.id("root"));
            List<WebElement> webElements = webElement.findElements(By.className("rating_nums"));
            if (webElements.size() > 0) {
                String doubanScore = webElements.get(0).getText();
                se.setBoubanScore(doubanScore);
                System.out.println(huibenName + ":" + doubanScore);
                specialExtendMapper.updateByPrimaryKey(se);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void getMoreInformationFromDoubanByIsbn() {
        System.getProperties().setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_x64.exe");
        String url = "https://book.douban.com/subject/27608687/";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(url);
        //书名
        String bookName = webDriver.findElement(By.xpath("//*[@id=\"wrapper\"]/h1/span")).getText();
        String socre = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/div[2]/strong")).getText();
        String number = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/div[2]/div/div[2]/span/a/span")).getText();
        String star_5 = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/span[2]")).getText();
        String star_4 = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/span[4]")).getText();
        String star_3 = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/span[6]")).getText();
        String star_2 = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/span[8]")).getText();
        String star_1 = webDriver.findElement(By.xpath("//*[@id=\"interest_sectl\"]/div/span[10]")).getText();
        System.out.println("书名:" + bookName + "\n" + socre + "\n" + number + "\n" + star_5 + "\n" + star_4 + "\n" + star_3 + "\n" + star_2 + "\n" + star_1);

        //标签
        System.out.println("======================标签=====================");
        StringBuilder tagString = new StringBuilder();
        List<WebElement> tags = webDriver.findElement(By.xpath("//*[@id=\"db-tags-section\"]/div")).findElements(By.tagName("span"));
        tags.stream().forEach(tag -> {
            tagString.append(tag.getText());
        });
        System.out.println(tagString.toString());
        System.out.println("======================内容简介=====================");
        try {
            WebElement getBrief = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div/span/div/p[6]"));

            clickToElement(webDriver, getBrief);
        } catch (NoSuchElementException e) {
            System.out.println("没有找到展开全部的按钮!");
        }
        WebElement brief = webDriver.findElement(By.xpath("//*[@id=\"link-report\"]/span[2]/div/div"));
        System.out.println(brief.getText());
        System.out.println("======================作者简介=====================");
        try {
            WebElement authBrief = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/span[1]/div/p[4]/a"));
            clickToElement(webDriver, authBrief);
        } catch (NoSuchElementException e) {
            System.out.println("没有找到展开全部的按钮!");
        }
        WebElement authBrief = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/span[2]"));
        System.out.println(authBrief.getText());
        //丛书信息
        System.out.println("======================丛书信息=====================");
        String information = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[5]/div")).getText();
        System.out.println(information);

        //喜欢相关书籍
        System.out.println("======================喜欢“" + bookName + "”的人还喜欢=====================");
        WebElement aboutBookContent = webDriver.findElement(By.xpath("//*[@id=\"db-rec-section\"]/div"));
        List<WebElement> books = aboutBookContent.findElements(By.tagName("dl"));
        for (int i = 1; i <= books.size(); i++) {
            if (i == 6 || i == 12) {
                continue;
            }
            WebElement book = books.get(i-1);
            WebElement nameE = book.findElement(By.xpath("//*[@id=\"db-rec-section\"]/div/dl[" + i + "]/dd/a"));
            WebElement imageE = book.findElement(By.xpath("//*[@id=\"db-rec-section\"]/div/dl[" + i + "]/dt/a/img"));
            String name = nameE.getText();
            String image = imageE.getAttribute("src");
            System.out.println(name + "\n" + image);
        }
        System.out.println("======================借书=====================");
        List<WebElement> jieshus = aboutBookContent.findElement(By.xpath("//*[@id=\"borrowinfo\"]/ul")).findElements(By.tagName("li"));
        for (int i = 1; i <= jieshus.size(); i++) {
            WebElement jieshu = jieshus.get(i - 1);
            String name = jieshu.findElement(By.xpath("//*[@id=\"borrowinfo\"]/ul/li[" + i + "]/a")).getText();
            String address = jieshu.findElement(By.xpath("//*[@id=\"borrowinfo\"]/ul/li[" + i + "]/a")).getAttribute("href");
            System.out.println(name + "\n" + address);
        }

//        //短评：重新打开一个页面，获取全部的信息
//        System.out.println("======================短评=====================");
//        String commentsNumber = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[8]/h2/span[2]/a")).getText();
//        String regex = "全部 (.*) 条";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(commentsNumber);//匹配类
//        while (matcher.find()) {
//            commentsNumber = matcher.group(1);
//        }
//        int page = (int) Math.ceil(Double.valueOf(commentsNumber) / 20);
//
//        for (int i=1;i<page;i++){
//           String commentUrl="https://book.douban.com/subject/27608687/comments/hot?p="+i;
//            WebDriver commentDriver=new ChromeDriver();
//            commentDriver.get(commentUrl);
//            List<WebElement> commentItems = commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul")).findElements(By.tagName("li"));
//            for (int j=1;j<commentItems.size();j++){
//                  try {
//                      String name = commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul/li[" + j + "]/div[2]/h3/span[2]/a")).getText();
//                      String icon=commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul/li[" + j + "]/div[1]/a/img")).getAttribute("src");
//                      String star=commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul/li[" + j + "]/div[2]/h3/span[2]/span[1]")).getAttribute("title");
//                      String time=commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul/li["+j+"]/div[2]/h3/span[2]/span[2]")).getText();
//                      String content=commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul/li["+j+"]/div[2]/p/span")).getText();
//                      String up=commentDriver.findElement(By.xpath("//*[@id=\"comments\"]/ul[1]/li["+j+"]/div[2]/h3/span[1]")).findElement(By.tagName("span")).getText();
//                      System.out.println(name+"\n"+icon+"\n"+star+"\n"+time+"\n"+content+"\n"+up);
//                      System.out.println("============");
//                  }catch (Exception e){
//
//                  }
//             }
//            System.out.println("===================================現在是第"+i+"頁");
//            commentDriver.close();
//        }

        //书评：重新打开一个页面，获取全部的信息
        System.out.println("======================书评=====================");
        String reviewsNumber = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/section/header/h2/span/a")).getText();
        String reviewsrRegex = "全部 (.*) 条";
        Pattern reviewsPattern = Pattern.compile(reviewsrRegex);
        Matcher reviewsMatcher = reviewsPattern.matcher(reviewsNumber);//匹配类
        while (reviewsMatcher.find()) {
            reviewsNumber = reviewsMatcher.group(1);
        }
        int reviewsPage = (int) Math.ceil(Double.valueOf(reviewsNumber) / 20);
        for (int i = 1; i <= reviewsPage; i++) {
            int start = i * 10;
            String reviewsUrl = "https://book.douban.com/subject/27608687/reviews?start=" + start;
            WebDriver reviewsDriver = new ChromeDriver();
            reviewsDriver.get(reviewsUrl);
            List<WebElement> reviewList = reviewsDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]"))
                    .findElements(By.xpath("./child::div"));
            for (int j = 1; j < reviewList.size(); j++) {
                try {
                    WebElement item = reviewList.get(j - 1);
                    String icon = item.findElement(By.xpath(".//img")).getAttribute("src");
                    String name = item.findElement(By.xpath(".//a[2]")).getText();
                    String star = item.findElement(By.xpath(".//span[1]")).getAttribute("title");
                    String time = item.findElement(By.xpath(".//span[2]")).getText();
                    WebElement conten = item.findElement(By.xpath(".//div[1]/div[1]/div/div/a"));
                    clickToElement(reviewsDriver, conten);
                    Thread.sleep(5000);
                    String contenString = item.findElement(By.xpath(".//*[@class=\"review-content clearfix\"]")).getText();
                    System.out.println(icon + "\n" + name + "\n" + star + "\n" + time + "\n" + contenString);
                    System.out.println("==================");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            reviewsDriver.close();
        }

        System.out.println("======================购买链接=====================");
        //购买链接：重新打开一个页面，获取全部的信息
        String payLinkUrl = "https://book.douban.com/subject/27608687/buylinks";
        String commentsUrl = "https://book.douban.com/subject/27608687/comments/hot";
        WebDriver commentsWebDriver = new ChromeDriver();
        commentsWebDriver.get(commentsUrl);
        WebDriver payLinWebDriver = new ChromeDriver();
        payLinWebDriver.get(payLinkUrl);
        WebElement payLinksTable = payLinWebDriver.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody"));
        List<WebElement> payLinks = payLinksTable.findElements(By.tagName("tr"));
        for (int i = 2; i <= payLinks.size(); i++) {
            WebElement payLink = payLinks.get(i - 1);
            String icon = payLink.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody/tr[" + i + "]/td[1]/img")).getAttribute("src");
            String link = payLink.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody/tr[" + i + "]/td[2]/a")).getAttribute("href");
            String name = payLink.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody/tr[" + i + "]/td[2]/a")).getText();
            String price = payLink.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody/tr[" + i + "]/td[3]/a")).getText();
            String jiesheng = payLink.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody/tr[" + i + "]/td[4]")).getText();
            String mianyou = payLink.findElement(By.xpath("//*[@id=\"buylink-table\"]/tbody/tr[" + i + "]/td[5]/span")).getText();
            System.out.println(icon + "\n" + link + "\n" + name + "\n" + price + "\n" + jiesheng + "\n" + mianyou);
        }
        payLinWebDriver.close();

    }

    @Test
    public void testAge() {
//        System.getProperties().setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_x64.exe");
        System.getProperties().setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        String rootUrl = "https://list.jd.com/list.html?cat=1713,3263,4761&ev=expublishers%5F401&page=4&sort=sort_totalsales15_desc&trans=1&JL=6_0_0#J_main";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(rootUrl);
        List<WebElement> booList = webDriver.findElements(By.className("gl-item"));
        booList.stream().forEach(book -> {
            TbHainanHuiben tbHainanHuiben = new TbHainanHuiben();
            moveToElement(webDriver, book);
            WebElement bookName = null;
            String bookNameTxt = "";
            try {
                bookName = book.findElement(By.className("p-name")).findElement(By.tagName("em"));
            } catch (Exception elementException) {
                bookNameTxt = "未知绘本";
            }
            if (bookName != null) {
                bookNameTxt = bookName.getText();
            }
            System.out.println(bookNameTxt);
            tbHainanHuiben.setHuibenName(bookNameTxt);

            WebElement author = null;
            String authorTxt = null;
            try {
                author = book.findElement(By.className("p-bookdetails")).findElement(By.className("author_type_1")).findElement(By.tagName("a"));
            } catch (Exception elementException) {
                authorTxt = "未知作者";
            }
            if (author != null) {
                authorTxt = author.getText();
            }
            System.out.println(authorTxt);

            WebElement pingjiaCount = null;
            String pingjiaCountTxt = null;
            try {
                pingjiaCount = book.findElement(By.xpath("//*[@id=\"plist\"]/ul/li[1]/div/div[6]/strong/a"));
            } catch (Exception elementException) {
                pingjiaCountTxt = "未知评价数量";
            }
            if (pingjiaCount != null) {
                pingjiaCountTxt = pingjiaCount.getText();
            }
            System.out.println(pingjiaCountTxt);


            String publisher = book.findElement(By.className("p-bookdetails")).findElement(By.className("p-bi-store")).findElement(By.tagName("a")).getText();
            System.out.println(publisher);
            tbHainanHuiben.setPublisherName(publisher);

            String commitNumber = book.findElement(By.className("p-commit")).getText();
            System.out.println(commitNumber);
            tbHainanHuiben.setPingjiaCount(commitNumber);

            String detilsUrl = book.findElement(By.className("p-img")).findElement(By.tagName("a")).getAttribute("href");
            System.out.println(detilsUrl);
            tbHainanHuiben.setUrl(detilsUrl);

            String price = book.findElement(By.className("J_price")).getText();
            System.out.println(price);
            tbHainanHuiben.setJdPrice(price);


            WebDriver detilsWebDriver = new ChromeDriver();
            detilsWebDriver.get(detilsUrl);
            WebElement detils = detilsWebDriver.findElement(By.xpath("//*[@id=\"parameter2\"]/li[2]"));
            String isbn = detils.getText();//获取isbn时，可能出现异常。这里需要注意。
            tbHainanHuiben.setIsbn(isbn);
            System.out.println(isbn);

            WebElement haoping = null;
            String haopingTxt = null;
            try {
                detilsWebDriver.findElement(By.xpath("//*[@id=\"detail\"]/div[1]/ul/li[5]")).click();//这里有的没有精彩好评会出现异常，需要处理
                haoping = detilsWebDriver.findElement(By.xpath("//*[@id=\"J-bookcomment\"]/div/div/div[2]/div"));
            } catch (Exception elementException) {
                haopingTxt = "未知好评信息";
            }
            if (haoping != null) {
                haopingTxt = haoping.getText();
            }
            System.out.println(haopingTxt);
            tbHainanHuiben.setJdComment(haopingTxt);
            hainanHuibenMapper.insert(tbHainanHuiben);

            detilsWebDriver.close();
            System.out.println("=============================");
        });
        webDriver.close();
    }


    /**
     * 模拟鼠标悬停事件
     *
     * @param webDriver
     * @param book      鼠标悬停的控件
     */
    private void moveToElement(WebDriver webDriver, WebElement book) {
        Actions builder = new Actions(webDriver);
        builder.moveToElement(book).perform();
    }

    /**
     * 模拟鼠标点击事件
     *
     * @param webDriver
     * @param item      鼠标点击的控件
     */
    private void clickToElement(WebDriver webDriver, WebElement item) {
        Actions builder = new Actions(webDriver);
        builder.click(item).perform();
    }

    /**
     * 获取 年龄段的数组：比如："4-6岁"  获得："4-5岁,5-6岁"
     *
     * @param ageStr
     * @return
     */
    public static String getAges(String ageStr) {
        ageStr = ageStr.replace("岁", "");
        String[] items = ageStr.split("-");
        List<Integer> ageArr = new ArrayList<>();
        int fAge = Integer.valueOf(items[0]);
        int eAge = Integer.valueOf(items[1]);
        if (eAge > fAge && eAge - fAge == 1) {
            return ageStr + "岁";
        }
        ageArr.add(fAge);
        while (fAge < eAge) {
            fAge++;
            ageArr.add(fAge);
        }
        StringBuilder result = new StringBuilder();
        if (ageArr.size() >= 2) {
            for (int i : ageArr) {
                if (i == ageArr.get(ageArr.size() - 1)) {
                    break;
                }
                result.append(i);
                result.append("-");
                result.append(++i);
                result.append("岁");
                result.append(",");
            }

            return result.toString();
        }
        return null;
    }

    @Test
    public void getWanTongBookIdByISBN() {
        String wantongSreachUrl = "cloud-api1.51wanxue.com/api-cloud/book/searchBaseBook";
        TbHainanHuibenExample tbHainanHuibenExample = new TbHainanHuibenExample();
        tbHainanHuibenExample.createCriteria().andIdIsNotNull();
        List<TbHainanHuiben> huibens = hainanHuibenMapper.selectByExample(tbHainanHuibenExample);

//        {
//                "isbn":"1234567890"
//        }

//        {
//            "appKey": "3f8a6cffce6b45a5a7358ed2db633ec9",
//            "appSecret": "cc558536650f4652b9720504a4d3f77f"
//        }
        huibens.stream().forEach(huiben -> {


        });
        String url = "http://cloud-api1.51wanxue.com/api-cloud/auth/login";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appKey", "3f8a6cffce6b45a5a7358ed2db633ec9");
        jsonObject.put("appSecret", "cc558536650f4652b9720504a4d3f77f");
        try {
            String result = post(url, jsonObject.toString());
            System.out.println(result);
            JSONObject data = (JSONObject) JSONObject.parseObject(result).get("data");
            String token = (String) data.get("token");
            System.out.println(token);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static String get(String url) throws IOException {
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


    @Autowired
    private TbWantongHuibenMapper tbWantongHuibenMapper;
    //String app_id="2426865770b311e9a6166c92bf315f73";
    String url = "http://cloud-api1.51wanxue.com/api-cloud/user/book/query?bookId=";

    @Test
    public void getWanTongHuiben() {
        for (int i = 100001; i < 200001; i++) {
            try {
                String result = get(url + i);
                JSONObject bookString = JSONObject.parseObject(result);
                Object data = bookString.get("data");
                if (data == null) {
                    continue;
                }
                Thread.sleep(100);
                Object bookDetailVO = JSONObject.parseObject(data.toString()).get("bookDetailVO");
                Object bookLabels = JSONObject.parseObject(bookString.get("data").toString()).get("bookLabels");
                System.out.println(bookDetailVO.toString());
                System.out.println(bookLabels.toString());
                TbWantongHuiben wantongHuiben = JSONObject.parseObject(bookDetailVO.toString(), TbWantongHuiben.class);
                wantongHuiben.setBooklabels(bookLabels.toString());
                int row = tbWantongHuibenMapper.insert(wantongHuiben);
                if (row > 0) {
                    System.out.println(wantongHuiben.getName() + " 入库成功！");
                } else {
                    System.out.println(wantongHuiben.getName() + " 入库失败！");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
