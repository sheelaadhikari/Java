import java.net.*;
import java.io.*;

public class CookiesExamplr {
  public static void main(String[] args) {
    try {
      URL url = new URL("https://www.example.com");

      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      connection.setRequestMethod("GET");

      int responseCode = connection.getResponseCode();
      System.out.println("Response Code: " + responseCode);

      String cookieHeader = connection.getHeaderField("Set-Cookie");
      System.out.println("Cookies: " + cookieHeader);

      CookieManager cookieManager = new CookieManager();
      CookieHandler.setDefault(cookieManager);
      HttpCookie cookie = HttpCookie.parse(cookieHeader).get(0);
      cookieManager.getCookieStore().add(null, cookie);

      HttpURLConnection connection2 = (HttpURLConnection) url.openConnection();
      connection2.setRequestProperty("Cookie", cookieManager.getCookieStore().getCookies().get(0).toString());
      int responseCode2 = connection2.getResponseCode();
      System.out.println("Response Code with Cookies: " + responseCode2);
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
