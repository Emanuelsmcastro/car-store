package com.store.infra.swagger;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.OAuthScope;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SecurityScheme(name = "security_auth", type = SecuritySchemeType.OAUTH2, flows = @OAuthFlows(authorizationCode = @OAuthFlow(authorizationUrl = "${springdoc.oAuthFlow.authorizationUrl}", tokenUrl = "${springdoc.oAuthFlow.tokenUrl}", scopes = {
		@OAuthScope(name = "profile"), @OAuthScope(name = "email"), @OAuthScope(name = "openid") })))
public class SwaggerConfig {

}
