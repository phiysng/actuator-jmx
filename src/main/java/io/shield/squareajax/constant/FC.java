package io.shield.squareajax.constant;

import java.util.HashMap;
import java.util.Map;

public enum FC {
    READ_MADRID("Real Madrid", 13), MILAN("Milan", 8), BAYERN_MUNICH("Bayern Munich", 6), LIVERPOOL("Liverpool", 6),
    BARCELONA("Barcelona", 5), AJAX("Ajax", 4), MANCHESTER_UNITED("Manchester United", 3),
    INVALID_FOOTBALL_CLUB("Not Exists", -1);

    private final String name;
    private final int trophy;

    private static final Map<String, FC> nameMap = new HashMap<>();

    static {
        for (FC fc : values()) {
            nameMap.put(fc.getName(), fc);
        }
    }

    private FC(String name, int trophy) {
        this.name = name;
        this.trophy = trophy;
    }

    // @getter
    public String getName() {
        return name;
    }

    public int getTrophy() {
        return trophy;
    }

    /**
     * 通过俱乐部名获取俱乐部
     * 
     * @param name 俱乐部名
     * @return 俱乐部枚举类型
     */
    public static FC getFC(String name) {
        return nameMap.getOrDefault(name, FC.INVALID_FOOTBALL_CLUB);
    }
}
