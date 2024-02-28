import java.util.*;

class Solution107 {
    public String solution(String polynomial) {
        String[] terms = polynomial.split("\\s*\\+\\s*"); // "+" 기호를 기준으로 항을 분리
        int coefficient = 0; // 계수
        int constant = 0; // 상수

        for (String term : terms) {
            if (term.contains("x")) {
                // x를 포함하는 항인 경우
                int index = term.indexOf('x');
                String coefficientStr = term.substring(0, index); // 계수를 추출
                if (!coefficientStr.isEmpty()) {
                    coefficient += Integer.parseInt(coefficientStr);
                } else {
                    coefficient += 1;
                }
            } else {
                // 상수항인 경우
                constant += Integer.parseInt(term.trim());
            }
        }

        StringBuilder result = new StringBuilder();
        if (coefficient != 0) {
            // 계수가 0이 아닌 경우
            if (coefficient == 1) {
                result.append("x");
            } else {
                result.append(coefficient).append("x");
            }
        }
        if (constant != 0) {
            // 상수항이 있는 경우
            if (result.length() > 0 && constant > 0) {
                // 계수가 있는 경우
                result.append(" + ").append(constant);
            } else {
                // 계수가 없는 경우
                result.append(constant);
            }
        }

        return result.toString();
    }
}
