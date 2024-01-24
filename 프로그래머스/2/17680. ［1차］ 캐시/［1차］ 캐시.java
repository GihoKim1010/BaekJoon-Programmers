import java.util.ArrayList;

public class Solution {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		ArrayList<String> cache = new ArrayList<>();
		for (int i = 0; i < cities.length; i++) {
			cities[i]=cities[i].toLowerCase();
			if (cache.contains(cities[i])) {
				answer++;
				cache.remove(cities[i]);
				cache.add(cities[i]);
			}else {
				cache.add(cities[i]);
				answer+=5;
				if(cache.size()>cacheSize) {
					cache.remove(0);
				}
			}
		}
		return answer;
	}
}