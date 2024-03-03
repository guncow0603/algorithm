class Solution119 {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken; // 초기 쿠폰 수를 저장하는 변수입니다.
        int rest = 0; // 남은 쿠폰을 저장하는 변수입니다.

        while(coupons > 0){
            int chickenToCoupon = (coupons + rest) / 10; // 쿠폰을 모아서 받을 수 있는 치킨의 수를 계산합니다.
            rest = (coupons + rest) % 10; // 남은 쿠폰을 계산합니다.
            answer += chickenToCoupon; // 무료 치킨의 수를 더합니다.
            coupons = chickenToCoupon; // 쿠폰 수를 업데이트합니다.
        }

        return answer; // 최대 무료 치킨의 수를 반환합니다.
    }
}