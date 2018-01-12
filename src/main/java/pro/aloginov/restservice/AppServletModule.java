package pro.aloginov.restservice;

import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class AppServletModule extends ServletModule {

    @Override
    protected void configureServlets() {
        bind(TestController.class);
        serve("/*").with(GuiceContainer.class);
    }
}
