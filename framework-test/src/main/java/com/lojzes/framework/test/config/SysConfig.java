package com.lojzes.framework.test.config;

import com.lojzes.framework.core.enableConfig.EnableEnv;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2019/8/25 0025 21:20
 */
@Configuration
@ComponentScan("com.lojzes.framework.*")
@EnableEnv(china = true)
public class SysConfig {
}
