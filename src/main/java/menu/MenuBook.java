package menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuBook {
    private static final String[] categories =
            new String[]{"일식", "한식", "중식", "아시안", "양식"};
    private static final Map<String, List<String>> categoryMenus = new HashMap<>();

    static {
        addMenus("일식", new String[]{
                "규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼"
        });
        addMenus("한식", new String[]{
                "김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음"
        });
        addMenus("중식", new String[]{
                "깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채"
        });
        addMenus("아시안", new String[]{
                "팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜"
        });
        addMenus("양식", new String[]{
                "라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"
        });
    }

    private static void addMenus(String category, String[] menus) {
        categoryMenus.put(category, List.of(menus));
    }
}
