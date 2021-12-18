package com.suse.blog_cy.util;

import org.springframework.util.StringUtils;

/**
 * 响应结果生成工具
 *
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link http://13blog.site
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";
    private static final int RESULT_CODE_SUCCESS = 200;
    private static final int RESULT_CODE_SERVER_ERROR = 500;

    public static com.suse.blog_cy.util.Result genSuccessResult() {
        com.suse.blog_cy.util.Result result = new com.suse.blog_cy.util.Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static com.suse.blog_cy.util.Result genSuccessResult(String message) {
        com.suse.blog_cy.util.Result result = new com.suse.blog_cy.util.Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setMessage(message);
        return result;
    }

    public static com.suse.blog_cy.util.Result genSuccessResult(Object data) {
        com.suse.blog_cy.util.Result result = new com.suse.blog_cy.util.Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static com.suse.blog_cy.util.Result genFailResult(String message) {
        com.suse.blog_cy.util.Result result = new com.suse.blog_cy.util.Result();
        result.setResultCode(RESULT_CODE_SERVER_ERROR);
        if (StringUtils.isEmpty(message)) {
            result.setMessage(DEFAULT_FAIL_MESSAGE);
        } else {
            result.setMessage(message);
        }
        return result;
    }

    public static com.suse.blog_cy.util.Result genErrorResult(int code, String message) {
        com.suse.blog_cy.util.Result result = new com.suse.blog_cy.util.Result();
        result.setResultCode(code);
        result.setMessage(message);
        return result;
    }
}
