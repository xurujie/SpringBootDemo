package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id =  "2016101700708608";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCq27W3Z25MYR7ZMcuEe1E7XueMUw+qgscuLUcEHdVPSS2LHRWw6Fh4Y8EKtK6Xb/4fQuZhCkNmGB5hDrdSR7CODIOa26Re3+nLwPlLU4p/+Tq/gUB1Pr517YgvXZE94u9BgXBMk7lF5Ts3o7EGNo5JcqQHWSqGEXHoIgqZC35qE/cGIxoWmDJBVG1naCf4+qEHxGeYyJi4CBfLR6CoicNzW8tS5jh7iYcwL8UVcRtCUBDi3aFEW7MqyzGSSRYNrZL2xiI0GGslGMVb1IAf2evrnBS8bp3H+rqB6Xtr6ymf8ADAhe6QkKQxXKmIolczxJaPqWHvT1BNUZCU5WQAR3gtAgMBAAECggEALOFfv1h0+a09TDIvUpKOCPlp+0tKPzDxHykXkXZAtP3076jpLLormxwg9i31+qOZbh7Fo1Ht2GCXgkk6UGuybe3NmBz/9Uf+At6i3W2JYQpXqzxJcULVBucpMb/zSf1VebCFjifzr++B+aCO/KHSCGsLuT5r1CG6+Q4QGJmTUEuVCbVyDEjSHe9PJrPVNJAPuww3ixieW0SxaC70/t9w1p6+DsC8RO6lSzxMAuPaLEOWJj5BCFManMoE/Kck+frtLpso5GQ75MUg3Wxk8FfbuCIdSFxdYI+hqfF0Bjya6sw3Lh73BxkveTwkJyTX95oGFWxUVr2g48mHQs+NXSHcYQKBgQD0sUAm7B035Cyidn+zmxIASXwXmCKWrXwbBUYfrajbdXLn5YS99KUgBMawaAQ6uk4wlOAx5BU+c4E1siaGUHnlqFx4/rZjlV+q4EG30xjZcn+o03fZAjWxS8XUGGTfwW4H6QHog2A6PNTte2R8QP10O+GeDSDCVFmRI1/q01v7ZQKBgQCywP1dKy5nCwDJFP/kaX0yfWrCXmvIQVCobasOtzXK8scbWUsgpy2ItHNWgepe06xc+8sX7W0misGukT5j4iRqy99H/X8sBkHrd9J0HtJKo9ofHEInAoQ9oyAR++HBmjvuXisQiNJGBW3ajCJA5UZ97KkPg989TrFBxt4OSgiRKQKBgFescun/S/DMxtlnUBZQh8Cmk9n4XtxSSNd9qkSLeqc3i/ZfHJLbZ5bzXyWx/2HzgzSRA0udB6eaxz8wF/GkQCjzjD6mNT+1M9QMCkANWSgAiJE7RAPzcL2YAsgd/XbW3c/jwxVGjWIQjdKRlc2Xk7jkA9EXrxcyFe2VGTcQiDKpAoGABsfXVI9sxS/fqcEIK+vsedvUDudyAzinDJyMXpSIj9hBwUHT3bs5uPPPZDqtX0d8RFKw04mIGGwvCKYtzbAoXXy6TYrKJitemMYEz67Tn00z2vZBdCVeStBDSSta1vM4zsP3sjrebxWJoz6plficge5WQ2ZnM3Ymty4KAlTAmnECgYASifXra8tguVU1R8m+p6P/XgdBt3CzYemj/7+dgupxqnzbT6TAVMx6fznqlcfsGK/BQalcvgGIM2jJD0ux+a/3rKT9z0VZN3E5Ff2DlNiv3L/UsZMm7wE9aSgmwa2bNJT8EPdpLH0Omf2yT5hwTJrrTuIq4PLNYZ57o0w6BVHxpg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgF9q4GUNFY87DLnlK++2/bG7+6qAqFp35dC7jZXtXmHUK7pGwBPRJAcCj2pNyOE5O/c7c0qnkII6ZmcgSAfOoXc0IYR8XXeOKBnI7H1T8EAf746R1gk01G2394dbg9NTpOCnN42BJLCt9zNIdZfac25ZO+7l0bhHJ7u7q5r8NAIvNfmoyiTGSzh4W8phtTgCK2wt3rN+4jjChRkgdMeOCTCXKPWL994uYT1F1LSTXO0N3opKLvUyCvtKjQ1jZ6hpdeu4lH2gYl60sSlzFSNZFVQCXNNI3iV+Ow2WYZdby7pzPdEgxeoRCOft/9iCu4h4k2Kg2OPGeGgI/UJ3QJrA2QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.baidu.com";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://www.baidu.com";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

