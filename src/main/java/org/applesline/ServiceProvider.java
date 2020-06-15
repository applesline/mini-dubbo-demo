package org.applesline;

import org.applesline.mini.dubbo.context.RpcContext;
import org.applesline.mini.dubbo.protocol.Protocol;

/**
 * @author liuyaping
 * 创建时间：2020年06月13日
 */
public class ServiceProvider {

    public static void main(String[] args) {
        RpcContext.setConfiguration(new ServerConfig());
        Protocol protocol = RpcContext.getBean(Protocol.class);
        protocol.export();
    }
}
