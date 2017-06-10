package com.wmall.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created by Cong Qianhao on 2017/5/27.
 */
public class JsonTranslateUtil {
    public static void translate(String jsonStr, HttpServletResponse response) {
        response.setContentType("application/json; charset=utf-8");
        try (OutputStream outputStream = response.getOutputStream()) {
            outputStream.write(jsonStr.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //java 7 特性，不需要在finally中关闭输出流
    }
}
