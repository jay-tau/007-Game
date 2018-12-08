import java.io.*;
import java.util.*;
import java.security.*;
import java.util.concurrent.*;

public class Project007Object {

	public static SecureRandom r = new SecureRandom();
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		Project007 p007 = new Project007(); //Creating object
		p007.gameEngine(); //Running gameEngine
	}
}