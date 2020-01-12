package randomPassword;

import java.util.Random;

public class Main {

  public static String randomPassword(int length) {
    String lowerChar = "abcdefghijklmnopqrstuvwxyz";
    String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String number = "0123456789";
    String specialChar = "/*-+.,;:!&%$";

    String password = "";

    String chain = lowerChar + upperChar + number + specialChar;
    Random rnd = new Random();

    for (int i = 0; i < length; i++) {
      char randomChar = chain.charAt(rnd.nextInt(chain.length()));
      password += randomChar;
    }
    return password;
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Need length password argument");
    } else {
      String password = randomPassword(Integer.parseInt(args[0]));
      System.out.println(password);
    }
  }

}
