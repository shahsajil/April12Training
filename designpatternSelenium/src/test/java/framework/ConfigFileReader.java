/*
 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.IOException; import java.util.Properties;
 * 
 * public class ConfigFileReader { public static void main(String[]args) {
 * Properties prop = new Properties(); String fileName = "app.config.txt";
 * try(FileInputStream fis = new FileInputStream(fileName)) { prop.load(fis); }
 * catch (FileNotFoundException ex){
 * 
 * } catch (IOException ex) {
 * 
 * } System.out.println(prop.getProperty("browserType")); } }
 */