/**
 * @projectName spring-boot-examples-jiang
 * @package com.neo.controller.service
 * @className com.neo.controller.service.CalcServiceImpl
 * @copyright Copyright 2023 XiaoFeiPeng, Inc All rights reserved.
 */
package com.neo.aop;

import org.springframework.stereotype.Service;

/**
 * CalcServiceImpl
 * @description CalcServiceImpl
 * @author xiaofeipeng
 * @date 2023/3/11 20:24
 * @version 1.0
 */
@Service
public class CalcServiceImpl implements CalcService{
    @Override
    public int div(int x, int y) {
        int result = x / y;
        System.out.println("=========>CalcServiceImpl被调用了,我们的计算结果：" + result);
        return result;
    }
}