package com.lsc.sso.config;

import com.lsc.sso.interceptor.WebSocketInterceptor;
import com.lsc.sso.websocket.WebSocketEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry
                .addHandler(new WebSocketEndpoint(), "/echo")
                .addInterceptors(new WebSocketInterceptor())
                .setAllowedOrigins("*");
    }
}
