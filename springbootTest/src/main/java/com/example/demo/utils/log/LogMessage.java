/*
author:chaohl
date:2020/12/16
*/
package com.example.demo.utils.log;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* @Author chaohl
 * @Description 日志信息处理
 * @Date 11:05 2020/12/16
 **/
@Slf4j
public class LogMessage {

    /**
     *  获取方法参数名和参数值
     * @param joinPoint
     * @return
     */


//    private Map<String, Object> getNameAndValue(ProceedingJoinPoint joinPoint) {
//
//        final Signature signature = joinPoint.getSignature();
//        MethodSignature methodSignature = (MethodSignature) signature;
//        final String[] names = methodSignature.getParameterNames();
//        final Object[] args = joinPoint.getArgs();
//
//        if (ArrayUtil.isEmpty(names) || ArrayUtil.isEmpty(args)) {
//            return Collections.emptyMap();
//        }
//        if (names.length != args.length) {
//            log.warn("{}方法参数名和参数值数量不一致", methodSignature.getName());
//            return Collections.emptyMap();
//        }
//        Map<String, Object> map = Maps.newHashMap();
//        for (int i = 0; i < names.length; i++) {
//            map.put(names[i], args[i]);
//        }
//        return map;
//    }

    private static final String UNKNOWN = "unknown";

    /**
     * 获取ip地址
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        String comma = ",";
        String localhost = "127.0.0.1";
        if (ip.contains(comma)) {
            ip = ip.split(",")[0];
        }
        if (localhost.equals(ip)) {
            // 获取本机真正的ip地址
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                log.error(e.getMessage(), e);
            }
        }
        return ip;
    }

}
