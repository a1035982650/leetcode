package exercises;

import java.util.*;

public class _535CodeAndDecode {

    public static void main(String[] args) {
        _535CodeAndDecode main = new _535CodeAndDecode();
        System.out.println(main.encode("www.baidu.com/1asd"));
        System.out.println(main.urls.toString());

    }
    public List<String> urls = new ArrayList<String>();


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return (index<urls.size())?urls.get(index):"";
    }
}
