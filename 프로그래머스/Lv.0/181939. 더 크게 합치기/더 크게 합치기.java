	class Solution {
		public int solution(int a, int b) {

			StringBuilder st_x = new StringBuilder();
			StringBuilder st_y = new StringBuilder();

			st_x.append(a).append(b);
			st_y.append(b).append(a);

			String temp_x = st_x.toString();
			String temp_y = st_y.toString();

			int x = Integer.valueOf(temp_x);
			int y = Integer.valueOf(temp_y);
			
			int answer = Math.max(x, y);
	        return answer;
		}
	}