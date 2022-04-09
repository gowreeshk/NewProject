package GL;

import java.util.*;

public class UserMainCode {
	static LinkedHashMap<String, String> calculateGrade(LinkedHashMap<String, Float> map) {
		LinkedHashMap<String, String> grades = new LinkedHashMap<>();

		for (Map.Entry<String, Float> m : map.entrySet()) {
			if (m.getValue() < 60) {
				grades.put(m.getKey(), "FAIL");
			} else if (m.getValue() >= 60) {
				grades.put(m.getKey(), "PASS");
			} else {
				grades.put(m.getKey(), "FAIL");
			}
		}
		return grades;
	}
}
