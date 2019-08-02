package com.booyue.migu.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

public class FileUtils {


    /**
     * 向文件中写入内容
     *
     * @param filepath 文件路径与名称
     * @param newstr   写入的内容
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath, String newstr) throws IOException {
        Boolean bool = false;
        String filein = newstr + "\r\n";//新写入的行，换行
        String temp = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//文件路径(包括文件名称)
            //将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();

            //文件原有内容
            for (int i = 0; (temp = br.readLine()) != null; i++) {
                buffer.append(temp);
                // 行与行之间的分隔符 相当于“\n”
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }

    /**
     * @param method 请求方法，包括POST和GET
     * @param url    请求的路径
     * @return
     * @从制定URL下载文件并保存到指定目录
     */

    public static String saveUrlAs(String url, String fileName, String rootPath,String method) {
        //System.out.println("fileName---->"+filePath);
        //创建不同的文件夹目录
        System.out.println("url===========:" + url);
        System.out.println("fileName===========:" + fileName);
        String saveRootPath = "E:\\saveFileFromUrl\\"+rootPath;
        String saveFilePath = saveRootPath + "\\" + fileName;
        File saveDir = new File(saveRootPath);
        //判断文件夹是否存在
        if (!saveDir.exists()) {
            //如果文件夹不存在，则创建新的的文件夹
            saveDir.mkdirs();
        }
        FileOutputStream fileOut = null;
        HttpURLConnection conn = null;
        InputStream inputStream = null;
        try {
            // 建立链接
            URL httpUrl = new URL(url);
            conn = (HttpURLConnection) httpUrl.openConnection();
            //以Post方式提交表单，默认get方式
            conn.setRequestMethod(method);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            // post方式不能使用缓存
            conn.setUseCaches(false);
            //连接指定的资源
            conn.connect();
            //获取网络输入流
            inputStream = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
//            //判断文件的保存路径后面是否以/结尾
//            if (!filePath.endsWith("/")) {
//                filePath += "/";
//            }
            //写入到文件（注意文件保存路径的后面一定要加上文件的名称）
            fileOut = new FileOutputStream(saveFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fileOut);

            byte[] buf = new byte[4096];
            int length = bis.read(buf);
            //保存文件
            while (length != -1) {
                bos.write(buf, 0, length);
                length = bis.read(buf);
            }
            bos.close();
            bis.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常！！");
            return "";
        }
        return saveFilePath;

    }

    public static String saveUrlHasHead(String url, String fileName, String method,String rootPath, Map<String,String> headParams) {
        //System.out.println("fileName---->"+filePath);
        //创建不同的文件夹目录
        System.out.println("url===========:" + url);
        System.out.println("fileName===========:" + fileName);
        String saveRootPath = "E:\\saveFileFromUrl\\"+rootPath;
        String saveFilePath = saveRootPath + "\\" + fileName;
        File saveDir = new File(saveRootPath);
        //判断文件夹是否存在
        if (!saveDir.exists()) {
            //如果文件夹不存在，则创建新的的文件夹
            saveDir.mkdirs();
        }
        FileOutputStream fileOut = null;
        HttpURLConnection conn = null;
        InputStream inputStream = null;
        try {
            // 建立链接
            URL httpUrl = new URL(url);
            conn = (HttpURLConnection) httpUrl.openConnection();
            //以Post方式提交表单，默认get方式
            conn.setRequestMethod(method);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            // post方式不能使用缓存
            conn.setUseCaches(false);
            if(headParams!=null){
                for(String key : headParams.keySet()){
                    conn.setRequestProperty(key, headParams.get(key));
                }
            }
            //连接指定的资源
            conn.connect();
            //获取网络输入流
            inputStream = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
//            //判断文件的保存路径后面是否以/结尾
//            if (!filePath.endsWith("/")) {
//                filePath += "/";
//            }
            //写入到文件（注意文件保存路径的后面一定要加上文件的名称）
            fileOut = new FileOutputStream(saveFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fileOut);

            byte[] buf = new byte[4096];
            int length = bis.read(buf);
            //保存文件
            while (length != -1) {
                bos.write(buf, 0, length);
                length = bis.read(buf);
            }
            bos.close();
            bis.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常！！");
            return "";
        }
        return saveFilePath;

    }

    public static String change(String srcUrl) {
        String srouce = null;
        try {
            srouce = URLEncoder.encode(srcUrl, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        srouce = srouce.replace("%2F", "/");
        srouce = srouce.replace("%3A", ":");
        return srouce;
    }





}
