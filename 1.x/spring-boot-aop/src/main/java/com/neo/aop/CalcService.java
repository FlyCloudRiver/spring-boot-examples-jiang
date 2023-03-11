/**
 * @projectName spring-boot-examples-jiang
 * @package com.neo.controller.service
 * @className com.neo.controller.service.CalcService
 * @copyright Copyright 2023 XiaoFeiPeng, Inc All rights reserved.
 */
package com.neo.aop;

import org.springframework.stereotype.Service;

/**
 * CalcService
 * @description CalcService
 * @author xiaofeipeng
 * @date 2023/3/11 20:23
 * @version 1.0
 */
@Service
public interface CalcService {

    int div(int x, int y);
}