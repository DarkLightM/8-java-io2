package com.example.task02;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public List<Path> result = new ArrayList<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
        */

    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> result = new ArrayList<>();
        Files.walk(Paths.get(rootDir.toString())).filter(Files::isRegularFile).forEach(result::add);
        return result;
    }
}
