package com.booyue.migu.utils;

import org.apache.commons.codec.EncoderException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.beans.Encoder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Http请求工具
 *
 * @author penglei
 * @email pl_stone@163.com
 * @date 2016-6-1
 */
public class HttpUtil {


    // 发送GET请求
    public static   boolean get(String url) {

        boolean isUse=false;
        InputStream so=null;
        try {
//            String ss=url.replace(" ","%20");
//            String encoder = URLEncoder.encode(url, "utf-8");
//            URL urlStr = new URL(url);
//            so = urlStr.openStream();

            // 建立链接
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
            //以Post方式提交表单，默认get方式
            conn.setDoInput(true);
            conn.setDoOutput(true);
            // post方式不能使用缓存
            conn.setUseCaches(false);
            conn.setRequestMethod("GET");
            //连接指定的资源
            conn.connect();
            //获取网络输入流
            so = conn.getInputStream();
            isUse= true;
        } catch (Exception e) {
            isUse= false;
        }finally {
            if (so!=null){
                try {
                    so.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return isUse;
    }

    public static int getMp3BitRate(String filePath){
        int bitRate=0;

        return bitRate;
    }



}
