package collection.back_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 첫줄 건너띄기
			reader.readLine();
			
			String str = reader.readLine();
			while(str != null) {
				checkVPS(str);
			}	
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			closeBufferedReader(reader);
		}
		
	}

	private static void checkVPS(String str) {
		// TODO Auto-generated method stub
		
	}

	private static void closeBufferedReader(BufferedReader reader) {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
	}
}
