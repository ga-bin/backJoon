package practice.back_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = reader.readLine();
			
			// 대문자로 만들기
			input = input.toUpperCase();
			
			// 알파벳을 쪼개서 개수세기
			Map<String, Integer> map = new HashMap<>();
			for(int i = 0; i < input.length(); i++) {
				  String charactor = input.substring(i, i+1);
				  if(!map.containsKey(charactor)) {
					  map.put(charactor, 0);
				  } else {
					   Integer count = map.get(charactor);
					   map.put(charactor, count+1);
				  }				  
			}
			
			// 가장 많은 개수를 가진 알파벳 출력
			Collection<Integer> values = map.values();
			Integer maxValue = values.stream().max(Integer::compareTo).get();
			if(values.stream().filter(value -> value.equals(maxValue)).count() > 1) {
				System.out.println("?");
			} else {
				for(String key : map.keySet()) {
					if(map.get(key) == maxValue) {
						System.out.println(key);
					}
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
