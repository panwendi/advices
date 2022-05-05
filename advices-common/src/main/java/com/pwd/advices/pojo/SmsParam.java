package com.pwd.advices.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * @author pwd
 * 短信参数
 */
@Data
@Builder
public class SmsParam {
    /**
     * 手机号
     */
    private Set<String> phones;
    /**
     * 短信内容
     */
    private String content;
}
