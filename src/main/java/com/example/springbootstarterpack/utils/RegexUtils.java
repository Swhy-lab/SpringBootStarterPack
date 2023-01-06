package com.example.springbootstarterpack.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    public static String checkRegex(String regex, String str) {
        String res = null;
        Pattern p = null;
        Matcher m = null;
        try {
            p = Pattern.compile(regex);
            m = p.matcher(str);
            if(m.find()) {
                res = m.group();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public static String[] getJsParameter(String javascriptFunction){
        final String regex = "(?<=\\()(.*)(?=\\);)";
        final String regex2 = "(?<=\\w\\')(,[\\s]*)(?=\\'\\w)";
        final String regex3 = "(?<=\\')(\\w+)(?=\\')";

        Pattern p = null;
        Matcher m = null;
        Pattern p2 = null;
        Matcher m2 = null;
        String[] parameter = null;

        try {
            p = Pattern.compile(regex);
            m = p.matcher(javascriptFunction);
            if(m.find()) {
                parameter = m.group().split(regex2);
            }
            for(int i = 0; i < parameter.length; i++){
                parameter[i] = checkRegex(regex3, parameter[i]);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return parameter;
    }
}
