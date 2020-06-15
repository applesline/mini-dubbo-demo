package org.applesline;

import org.applesline.api.GreetingService;
import org.applesline.mini.dubbo.context.RpcContext;
import org.applesline.mini.dubbo.proxy.ProxyFactory;

/**
 * @author liuyaping
 * 创建时间：2020年06月13日
 */
public class ServiceConsumer {

    public static void main(String[] args) {
        RpcContext.initContext();
        GreetingService greetingService = ProxyFactory.getProxyObject(GreetingService.class);
        System.out.println(greetingService.sayHello("mini-dubbo"));
    }
}
