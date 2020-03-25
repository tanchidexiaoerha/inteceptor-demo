package com.jingtoo.demo.swaggerTest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 配置swagger2z生成api接口文档
 */
@Configuration
@ConfigurationProperties(prefix = "swagger2")
@EnableSwagger2//启用swaggert
public class SwaggerConf {

    /**
     *
     */
    private String title;
    private String contact;
    private String license;
    private String licenseUrl;
    private String termsOfServiceUrl;
    private String description;
    private String basePackage;
    @Bean
    public Docket getDocket() {
       return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select().apis(RequestHandlerSelectors.basePackage(basePackage)).build();
    }

    public ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .contact(contact)
                .description(description)
                .license(license)
                .licenseUrl(licenseUrl)
                .termsOfServiceUrl(termsOfServiceUrl)
                .title(title).build();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }
}
