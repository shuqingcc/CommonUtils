package com.qinssen.common;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtils {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 99; i++) {
            list.add(i);
        }

        g(list);
    }

    private static void g(List<Integer> list) {
        int perCount = 10, index = 0;

        int times = list.size() / perCount;

        do {
            List<Integer> listTemp = null;
            if (list.size() >= perCount) {
                listTemp = list.subList(0, perCount);// listTemp是分段处理逻辑的参数
            } else {
                listTemp = list.subList(0, list.size());// listTemp是分段处理逻辑的参数

            }
            //遍历当前的值是否正确
            String result = "";
            for (int i = 0; i < listTemp.size(); i++) {
                result += listTemp.get(i) + ",";
            }
            System.out.println("第" + index + "轮:>>" + result);

            list.removeAll(listTemp);

            System.out.println("当前剩余集合长度:>>" + list.size());

            index++;
        }
        while (index <= times);
    }

}
