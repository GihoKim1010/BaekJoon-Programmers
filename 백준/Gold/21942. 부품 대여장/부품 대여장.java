import java.io.*;
import java.lang.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Map<String, Long> rentalLog = new HashMap<>();
        Map<String, Long> chargeLog = new TreeMap<>();
        StringBuilder result = new StringBuilder();

        String[] fisrtLine = br.readLine().split(" ");
        int N = Integer.parseInt(fisrtLine[0]);
        String[] limit = fisrtLine[1].split("[/:]");
        int charge = Integer.parseInt(fisrtLine[2]);
        long limitTime = (Long.parseLong(limit[0])*1440) + (Long.parseLong(limit[1])*60) + (Long.parseLong(limit[2]));

        for(int i=0; i<N; i++) {
            String[] inputLine = br.readLine().split(" ");
            StringBuilder dateMaker = new StringBuilder();
            dateMaker.append(inputLine[0]).append(" ").append(inputLine[1]);
            Date date = dateFormat.parse(dateMaker.toString());
            Long currTime = date.getTime();

            StringBuilder keyMaker = new StringBuilder();
            keyMaker.append(inputLine[2]).append(" ").append(inputLine[3]);
            String key = keyMaker.toString();

            if(!rentalLog.containsKey(key)) {
                rentalLog.put(key, currTime);
            }else{
                long prevTime = rentalLog.get(key);
                long timeDiff = (currTime - prevTime)/60000 - limitTime;
                if(timeDiff > 0) {
                    chargeLog.put(inputLine[3], chargeLog.getOrDefault(inputLine[3], 0L) + (timeDiff*charge));
                }
                rentalLog.remove(key);
            }
        }
        if(chargeLog.isEmpty()) {
            result.append(-1);
        }else {
            for (Map.Entry<String, Long> entry : chargeLog.entrySet()) {
                String key = entry.getKey();
                Long value = entry.getValue();
                result.append(key).append(" ").append(value).append("\n");
            }
        }
        bw.write(result.toString());
        bw.flush();
    }
}