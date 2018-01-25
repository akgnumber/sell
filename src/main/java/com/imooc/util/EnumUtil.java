package com.imooc.util;

import com.imooc.enums.CodeEnum;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 9:59$ 2018/1/19$
 * @Modified By:
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
