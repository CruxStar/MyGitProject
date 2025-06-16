package demo;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入一个字节
 */
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("fos.dat");
        String line = "犬は机の上にいます";
        fos.write(line.getBytes(StandardCharsets.UTF_8));
        line = "分支上写入的内容";
        fos.write(line.getBytes(StandardCharsets.UTF_8));
        line = "主线上新添加了一句内容";
        fos.write(line.getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();
    }
}
