package groupid4.app.conf;

import io.tesler.core.config.APIConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Import(APIConfig.class)
@ComponentScan({"groupid4.controller"})
public class APPNAME5APIConfig extends WebMvcConfigurerAdapter {

}
