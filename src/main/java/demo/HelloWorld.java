package demo;

import java.io.FileOutputStream;

/**
 * 向文件中写入一个字节
 */
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("fos.dat");
        fos.write(1);
        System.out.println("写出完毕");
        fos.close();
    }
}
