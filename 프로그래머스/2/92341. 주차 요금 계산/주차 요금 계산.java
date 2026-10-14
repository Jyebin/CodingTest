import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int plusTime = fees[2];
        int plusFee = fees[3];

        Map<String, Integer> inMap = new HashMap<>();     // 차번호 → 입차 시각(분)
        Map<String, Integer> totalMap = new HashMap<>();  // 차번호 → 누적 시간(분)

        for (int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            String[] t = str[0].split(":");
            int min = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
            String car = str[1];

            if (str[2].equals("IN")) {
                inMap.put(car, min);
            } else {
                int inMin = inMap.get(car);
                inMap.remove(car);
                totalMap.put(car, totalMap.getOrDefault(car, 0) + (min - inMin));
            }
        }

        for (String car : inMap.keySet()) {
            int inMin = inMap.get(car);
            totalMap.put(car, totalMap.getOrDefault(car, 0) + (23 * 60 + 59 - inMin));
        }

        List<String> cars = new ArrayList<>(totalMap.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            int total = totalMap.get(cars.get(i));

            if (total <= defaultTime) {
                answer[i] = defaultFee;
            } else {
                int extra = total - defaultTime;
                int units = (extra + plusTime - 1) / plusTime;   // 올림
                answer[i] = defaultFee + units * plusFee;
            }
        }
        return answer;
    }
}