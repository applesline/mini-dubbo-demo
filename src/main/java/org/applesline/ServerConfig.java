package org.applesline;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.applesline.api.GreetingService;

/**
 * @author liuyaping
 * 创建时间：2020年06月13日
 */
public class ServerConfig extends AbstractModule {
    public void configure() {
        bind(GreetingService.class).to(GreetingServiceImpl.class).in(Singleton.class);
    }
}
