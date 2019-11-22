package com.shangxue.demo05.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


   // @ResponseBody
 /*   @RequestMapping({"/","index.html"})
    public String index() {
        return "index";
    }*/

    @RequestMapping("/hello01")
    public String hello01(Map<String, Object> maps) {
        maps.put("hello", "<h1>你好</h1>");
        maps.put("hello01", "<h1>你好</h1>");
        maps.put("userNames", Arrays.asList("张三", "李四"));
        return "hello";
    }


    @ResponseBody
    @RequestMapping("/toPay")
    public String toPay() throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        try {
/*            alipayRequest.setBizContent("{\"out_trade_no\":\" + 12312123 + ",
                    + \"total_amount\":\""+100+"\","
                    + "\"subject\":\"" + "测试支付" + "\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");*/
            alipayRequest.setBizContent("{" + "    \"out_trade_no\":\"2015032001010100"+(int)(Math.random()*1000)+"\","
                    + "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," + "    \"total_amount\":"+(int)(Math.random()*10)+0.88+","
                    + "    \"subject\":\"Iphone6 16G\"," + "    \"body\":\"Iphone6 16G 耐克金\","
                    + "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\","
                    + "    \"extend_params\":{" + "    \"sys_service_provider_id\":\"2088511833207846\"" + "    }" + "  }");// 填充业务参数


            //请求
            String result;
            result = alipayClient.pageExecute(alipayRequest).getBody();
            System.out.println("*********************\n返回结果为：" + result);
            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/123")
    public String toIndex() {
        return "login";
    }
}
