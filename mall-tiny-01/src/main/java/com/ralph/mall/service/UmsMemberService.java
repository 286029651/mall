package com.ralph.mall.service;

import com.ralph.mall.common.api.CommonResult;

/**
 * @author Ralph.Chen
 * @date 2020/11/26
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
