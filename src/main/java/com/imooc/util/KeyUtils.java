package com.imooc.util;

import java.util.Random;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 17:09$ 2018/1/12$
 * @Modified By:
 */
public class KeyUtils {

    /**
     * 生成唯一主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(90000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
