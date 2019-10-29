package com.zhangyu.mallparent.service;

import com.zhangyu.mallparent.common.CommonResult;

/**
 * @author zhangyu
 * @description 会员管理Service
 * @date 2019/9/26
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
