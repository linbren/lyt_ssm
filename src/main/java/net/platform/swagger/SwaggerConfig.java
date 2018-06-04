/**  
 * @Title: SwaggerConfig.java
 * @Package net.platform.Swagger
 * @author linyiting
 * @date 2017年12月6日
 * @Description: TODO
 */
package net.platform.swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @Title: SwaggerConfig.java
 * @Package net.platform.Swagger
 * @ClassName: SwaggerConfig 
 * @author linyiting
 * @date 2017年12月6日
 * @Description: TODO
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("系统")
                .select()  
                .apis(RequestHandlerSelectors.basePackage("net.business.system.web"))// 选择那些路径和api会生成document
                .paths(PathSelectors.any()) // 对所有路径进行监控
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
        .title("frm服务框架平台")
        .description("      接口说明文档")
        .termsOfServiceUrl("")
        .contact(new Contact("linyiting", "http://www.linyiting.com", "linyiting@swg.com"))
        .version("1.0")
        .build();
    }
}