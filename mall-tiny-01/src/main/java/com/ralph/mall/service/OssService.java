package com.ralph.mall.service;

import javax.servlet.http.HttpServletRequest;

import com.ralph.mall.dto.OssCallbackResult;
import com.ralph.mall.dto.OssPolicyResult;

/**
 * @author Ralph.Chen
 * @date 2020/11/27
 */
public interface OssService {

    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
