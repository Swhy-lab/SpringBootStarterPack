package com.example.springbootstarterpack.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;

public class JsonModule {
    public static String prettyPrintAndOutput(Object o, Path oPath){
        String res = null;
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            res = gson.toJson(o);
            save(res.getBytes("UTF-8"), oPath);
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;

    }
    public static String prettyPrint(Object list){
        String res = null;
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            res = gson.toJson(list);
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;

    }

    private static void save(byte[] bytes, Path oPath){
        int len = 0;
        byte[] buffer = new byte[8192];
        try(BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(bytes));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(oPath.toFile()))){
            while((len = bis.read(buffer)) != -1){
                bufferedOutputStream.write(buffer, 0, len);
            }
            bufferedOutputStream.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
