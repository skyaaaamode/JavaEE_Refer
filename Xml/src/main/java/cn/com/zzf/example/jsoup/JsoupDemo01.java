package cn.com.zzf.example.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/7/1 17:40
 * @description
 * jsoup的快速入门
 */
public class JsoupDemo01 {
    public static void main(String[] args) {
//        2.根据xml获取document对象
        //2.1根据获取xml文件的path
        String resource = JsoupDemo01.class.getClassLoader().getResource("dtd/student.xml").getPath();
        //2.2解析xml，加载文档进内存，获取dom树---document
        try {
            Document parse = Jsoup.parse(new File(resource),"utf-8");
            //3.获取元素对象
            Elements name = parse.getElementsByTag("name");
            System.out.println(name.size());
            //4.获取数据
            System.out.println(name.get(0));
            System.out.println(name.text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
