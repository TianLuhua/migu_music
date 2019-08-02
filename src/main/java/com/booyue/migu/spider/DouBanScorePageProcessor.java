package com.booyue.migu.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

public class DouBanScorePageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    @Override
    public void process(Page page) {
        List<String> nodes = page.getHtml().xpath("//*div[@class='line-small list-box']").all();

        for (String selectable:nodes) {
            page.putField("selectable",selectable);
        }
    }

    @Override
    public Site getSite() {

        return site;
    }
}
