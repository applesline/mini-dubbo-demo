package org.applesline;

import org.applesline.api.GreetingService;

/**
 * @author liuyaping
 * 创建时间：2020年06月13日
 */
public class GreetingServiceImpl implements GreetingService {
    public String sayHello(String name) {
        return "hi " + name;
    }

}
