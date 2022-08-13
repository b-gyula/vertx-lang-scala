/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package io.vertx.scala

import scala.jdk.CollectionConverters._
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import scala.concurrent.Promise

import io.vertx.core.net.{PfxOptions => JPfxOptions}
import io.vertx.core.net
import io.vertx.core.net.{NetServerOptions => JNetServerOptions}
import java.util.concurrent.TimeUnit
import io.vertx.core.buffer.Buffer
import io.vertx.mqtt.{MqttServerOptions => JMqttServerOptions}
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.net.{OpenSSLEngineOptions => JOpenSSLEngineOptions}
import io.vertx.core.http.ClientAuth
import io.vertx.core.net.{JdkSSLEngineOptions => JJdkSSLEngineOptions}
import io.vertx.core.net.{PemTrustOptions => JPemTrustOptions}
import io.vertx.core.net.{PemKeyCertOptions => JPemKeyCertOptions}
import io.vertx.core.net.{JksOptions => JJksOptions}
package object mqtt{


  type MqttAuth = io.vertx.mqtt.MqttAuth
  object MqttAuth {
    def apply(json: JsonObject) = new MqttAuth(json)

  }



  type MqttClientOptions = io.vertx.mqtt.MqttClientOptions
  object MqttClientOptions {
    def apply() = new MqttClientOptions()
    def apply(json: JsonObject) = new MqttClientOptions(json)
    def apply( ackTimeout: java.lang.Integer = null, activityLogDataFormat: io.netty.handler.logging.ByteBufFormat = null, applicationLayerProtocols: scala.collection.immutable.List[java.lang.String] = null, autoGeneratedClientId: java.lang.Boolean = null, autoKeepAlive: java.lang.Boolean = null, cleanSession: java.lang.Boolean = null, clientId: java.lang.String = null, connectTimeout: java.lang.Integer = null, enabledSecureTransportProtocols: scala.collection.immutable.Set[java.lang.String] = null, hostnameVerificationAlgorithm: java.lang.String = null, idleTimeout: java.lang.Integer = null, idleTimeoutUnit: java.util.concurrent.TimeUnit = null, jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions = null, keepAliveInterval: java.lang.Integer = null, keyCertOptions: io.vertx.core.net.KeyCertOptions = null, keyStoreOptions: io.vertx.core.net.JksOptions = null, localAddress: java.lang.String = null, logActivity: java.lang.Boolean = null, maxInflightQueue: java.lang.Integer = null, maxMessageSize: java.lang.Integer = null, metricsName: java.lang.String = null, nonProxyHosts: scala.collection.immutable.List[java.lang.String] = null, openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions = null, password: java.lang.String = null, pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions = null, pemTrustOptions: io.vertx.core.net.PemTrustOptions = null, pfxKeyCertOptions: io.vertx.core.net.PfxOptions = null, pfxTrustOptions: io.vertx.core.net.PfxOptions = null, proxyOptions: io.vertx.core.net.ProxyOptions = null, readIdleTimeout: java.lang.Integer = null, receiveBufferSize: java.lang.Integer = null, reconnectAttempts: java.lang.Integer = null, reconnectInterval: java.lang.Long = null, reuseAddress: java.lang.Boolean = null, reusePort: java.lang.Boolean = null, sendBufferSize: java.lang.Integer = null, soLinger: java.lang.Integer = null, ssl: java.lang.Boolean = null, sslEngineOptions: io.vertx.core.net.SSLEngineOptions = null, sslHandshakeTimeout: java.lang.Long = null, sslHandshakeTimeoutUnit: java.util.concurrent.TimeUnit = null, tcpCork: java.lang.Boolean = null, tcpFastOpen: java.lang.Boolean = null, tcpKeepAlive: java.lang.Boolean = null, tcpNoDelay: java.lang.Boolean = null, tcpQuickAck: java.lang.Boolean = null, tcpUserTimeout: java.lang.Integer = null, trafficClass: java.lang.Integer = null, trustAll: java.lang.Boolean = null, trustOptions: io.vertx.core.net.TrustOptions = null, trustStoreOptions: io.vertx.core.net.JksOptions = null, useAlpn: java.lang.Boolean = null, username: java.lang.String = null, willFlag: java.lang.Boolean = null, willMessage: java.lang.String = null, willQoS: java.lang.Integer = null, willRetain: java.lang.Boolean = null, willTopic: java.lang.String = null, writeIdleTimeout: java.lang.Integer = null): MqttClientOptions = {
      val ret = new MqttClientOptions(new io.vertx.core.json.JsonObject(java.util.Collections.emptyMap[java.lang.String,java.lang.Object]()))
      if (ackTimeout != null) ret.setAckTimeout(ackTimeout) 
      if (activityLogDataFormat != null) ret.setActivityLogDataFormat(activityLogDataFormat) 
      if (applicationLayerProtocols != null) ret.setApplicationLayerProtocols(applicationLayerProtocols.asJava) 
      if (autoGeneratedClientId != null) ret.setAutoGeneratedClientId(autoGeneratedClientId) 
      if (autoKeepAlive != null) ret.setAutoKeepAlive(autoKeepAlive) 
      if (cleanSession != null) ret.setCleanSession(cleanSession) 
      if (clientId != null) ret.setClientId(clientId) 
      if (connectTimeout != null) ret.setConnectTimeout(connectTimeout) 
      if (enabledSecureTransportProtocols != null) ret.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.asJava) 
      if (hostnameVerificationAlgorithm != null) ret.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm) 
      if (idleTimeout != null) ret.setIdleTimeout(idleTimeout) 
      if (idleTimeoutUnit != null) ret.setIdleTimeoutUnit(idleTimeoutUnit) 
      if (jdkSslEngineOptions != null) ret.setJdkSslEngineOptions(jdkSslEngineOptions) 
      if (keepAliveInterval != null) ret.setKeepAliveInterval(keepAliveInterval) 
      if (keyCertOptions != null) ret.setKeyCertOptions(keyCertOptions) 
      if (keyStoreOptions != null) ret.setKeyStoreOptions(keyStoreOptions) 
      if (localAddress != null) ret.setLocalAddress(localAddress) 
      if (logActivity != null) ret.setLogActivity(logActivity) 
      if (maxInflightQueue != null) ret.setMaxInflightQueue(maxInflightQueue) 
      if (maxMessageSize != null) ret.setMaxMessageSize(maxMessageSize) 
      if (metricsName != null) ret.setMetricsName(metricsName) 
      if (nonProxyHosts != null) ret.setNonProxyHosts(nonProxyHosts.asJava) 
      if (openSslEngineOptions != null) ret.setOpenSslEngineOptions(openSslEngineOptions) 
      if (password != null) ret.setPassword(password) 
      if (pemKeyCertOptions != null) ret.setPemKeyCertOptions(pemKeyCertOptions) 
      if (pemTrustOptions != null) ret.setPemTrustOptions(pemTrustOptions) 
      if (pfxKeyCertOptions != null) ret.setPfxKeyCertOptions(pfxKeyCertOptions) 
      if (pfxTrustOptions != null) ret.setPfxTrustOptions(pfxTrustOptions) 
      if (proxyOptions != null) ret.setProxyOptions(proxyOptions) 
      if (readIdleTimeout != null) ret.setReadIdleTimeout(readIdleTimeout) 
      if (receiveBufferSize != null) ret.setReceiveBufferSize(receiveBufferSize) 
      if (reconnectAttempts != null) ret.setReconnectAttempts(reconnectAttempts) 
      if (reconnectInterval != null) ret.setReconnectInterval(reconnectInterval) 
      if (reuseAddress != null) ret.setReuseAddress(reuseAddress) 
      if (reusePort != null) ret.setReusePort(reusePort) 
      if (sendBufferSize != null) ret.setSendBufferSize(sendBufferSize) 
      if (soLinger != null) ret.setSoLinger(soLinger) 
      if (ssl != null) ret.setSsl(ssl) 
      if (sslEngineOptions != null) ret.setSslEngineOptions(sslEngineOptions) 
      if (sslHandshakeTimeout != null) ret.setSslHandshakeTimeout(sslHandshakeTimeout) 
      if (sslHandshakeTimeoutUnit != null) ret.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit) 
      if (tcpCork != null) ret.setTcpCork(tcpCork) 
      if (tcpFastOpen != null) ret.setTcpFastOpen(tcpFastOpen) 
      if (tcpKeepAlive != null) ret.setTcpKeepAlive(tcpKeepAlive) 
      if (tcpNoDelay != null) ret.setTcpNoDelay(tcpNoDelay) 
      if (tcpQuickAck != null) ret.setTcpQuickAck(tcpQuickAck) 
      if (tcpUserTimeout != null) ret.setTcpUserTimeout(tcpUserTimeout) 
      if (trafficClass != null) ret.setTrafficClass(trafficClass) 
      if (trustAll != null) ret.setTrustAll(trustAll) 
      if (trustOptions != null) ret.setTrustOptions(trustOptions) 
      if (trustStoreOptions != null) ret.setTrustStoreOptions(trustStoreOptions) 
      if (useAlpn != null) ret.setUseAlpn(useAlpn) 
      if (username != null) ret.setUsername(username) 
      if (willFlag != null) ret.setWillFlag(willFlag) 
      if (willMessage != null) ret.setWillMessage(willMessage) 
      if (willQoS != null) ret.setWillQoS(willQoS) 
      if (willRetain != null) ret.setWillRetain(willRetain) 
      if (willTopic != null) ret.setWillTopic(willTopic) 
      if (writeIdleTimeout != null) ret.setWriteIdleTimeout(writeIdleTimeout) 
      ret
    }
  }



  type MqttServerOptions = io.vertx.mqtt.MqttServerOptions
  object MqttServerOptions {
    def apply() = new MqttServerOptions()
    def apply(json: JsonObject) = new MqttServerOptions(json)
    def apply( acceptBacklog: java.lang.Integer = null, activityLogDataFormat: io.netty.handler.logging.ByteBufFormat = null, autoClientId: java.lang.Boolean = null, clientAuth: io.vertx.core.http.ClientAuth = null, enabledSecureTransportProtocols: scala.collection.immutable.Set[java.lang.String] = null, host: java.lang.String = null, idleTimeout: java.lang.Integer = null, idleTimeoutUnit: java.util.concurrent.TimeUnit = null, jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions = null, keyCertOptions: io.vertx.core.net.KeyCertOptions = null, keyStoreOptions: io.vertx.core.net.JksOptions = null, logActivity: java.lang.Boolean = null, maxMessageSize: java.lang.Integer = null, openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions = null, pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions = null, pemTrustOptions: io.vertx.core.net.PemTrustOptions = null, pfxKeyCertOptions: io.vertx.core.net.PfxOptions = null, pfxTrustOptions: io.vertx.core.net.PfxOptions = null, port: java.lang.Integer = null, proxyProtocolTimeout: java.lang.Long = null, proxyProtocolTimeoutUnit: java.util.concurrent.TimeUnit = null, readIdleTimeout: java.lang.Integer = null, receiveBufferSize: java.lang.Integer = null, reuseAddress: java.lang.Boolean = null, reusePort: java.lang.Boolean = null, sendBufferSize: java.lang.Integer = null, sni: java.lang.Boolean = null, soLinger: java.lang.Integer = null, ssl: java.lang.Boolean = null, sslEngineOptions: io.vertx.core.net.SSLEngineOptions = null, sslHandshakeTimeout: java.lang.Long = null, sslHandshakeTimeoutUnit: java.util.concurrent.TimeUnit = null, tcpCork: java.lang.Boolean = null, tcpFastOpen: java.lang.Boolean = null, tcpKeepAlive: java.lang.Boolean = null, tcpNoDelay: java.lang.Boolean = null, tcpQuickAck: java.lang.Boolean = null, tcpUserTimeout: java.lang.Integer = null, timeoutOnConnect: java.lang.Integer = null, trafficClass: java.lang.Integer = null, trustOptions: io.vertx.core.net.TrustOptions = null, trustStoreOptions: io.vertx.core.net.JksOptions = null, useAlpn: java.lang.Boolean = null, useProxyProtocol: java.lang.Boolean = null, useWebSocket: java.lang.Boolean = null, webSocketMaxFrameSize: java.lang.Integer = null, writeIdleTimeout: java.lang.Integer = null): MqttServerOptions = {
      val ret = new MqttServerOptions(new io.vertx.core.json.JsonObject(java.util.Collections.emptyMap[java.lang.String,java.lang.Object]()))
      if (acceptBacklog != null) ret.setAcceptBacklog(acceptBacklog) 
      if (activityLogDataFormat != null) ret.setActivityLogDataFormat(activityLogDataFormat) 
      if (autoClientId != null) ret.setAutoClientId(autoClientId) 
      if (clientAuth != null) ret.setClientAuth(clientAuth) 
      if (enabledSecureTransportProtocols != null) ret.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.asJava) 
      if (host != null) ret.setHost(host) 
      if (idleTimeout != null) ret.setIdleTimeout(idleTimeout) 
      if (idleTimeoutUnit != null) ret.setIdleTimeoutUnit(idleTimeoutUnit) 
      if (jdkSslEngineOptions != null) ret.setJdkSslEngineOptions(jdkSslEngineOptions) 
      if (keyCertOptions != null) ret.setKeyCertOptions(keyCertOptions) 
      if (keyStoreOptions != null) ret.setKeyStoreOptions(keyStoreOptions) 
      if (logActivity != null) ret.setLogActivity(logActivity) 
      if (maxMessageSize != null) ret.setMaxMessageSize(maxMessageSize) 
      if (openSslEngineOptions != null) ret.setOpenSslEngineOptions(openSslEngineOptions) 
      if (pemKeyCertOptions != null) ret.setPemKeyCertOptions(pemKeyCertOptions) 
      if (pemTrustOptions != null) ret.setPemTrustOptions(pemTrustOptions) 
      if (pfxKeyCertOptions != null) ret.setPfxKeyCertOptions(pfxKeyCertOptions) 
      if (pfxTrustOptions != null) ret.setPfxTrustOptions(pfxTrustOptions) 
      if (port != null) ret.setPort(port) 
      if (proxyProtocolTimeout != null) ret.setProxyProtocolTimeout(proxyProtocolTimeout) 
      if (proxyProtocolTimeoutUnit != null) ret.setProxyProtocolTimeoutUnit(proxyProtocolTimeoutUnit) 
      if (readIdleTimeout != null) ret.setReadIdleTimeout(readIdleTimeout) 
      if (receiveBufferSize != null) ret.setReceiveBufferSize(receiveBufferSize) 
      if (reuseAddress != null) ret.setReuseAddress(reuseAddress) 
      if (reusePort != null) ret.setReusePort(reusePort) 
      if (sendBufferSize != null) ret.setSendBufferSize(sendBufferSize) 
      if (sni != null) ret.setSni(sni) 
      if (soLinger != null) ret.setSoLinger(soLinger) 
      if (ssl != null) ret.setSsl(ssl) 
      if (sslEngineOptions != null) ret.setSslEngineOptions(sslEngineOptions) 
      if (sslHandshakeTimeout != null) ret.setSslHandshakeTimeout(sslHandshakeTimeout) 
      if (sslHandshakeTimeoutUnit != null) ret.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit) 
      if (tcpCork != null) ret.setTcpCork(tcpCork) 
      if (tcpFastOpen != null) ret.setTcpFastOpen(tcpFastOpen) 
      if (tcpKeepAlive != null) ret.setTcpKeepAlive(tcpKeepAlive) 
      if (tcpNoDelay != null) ret.setTcpNoDelay(tcpNoDelay) 
      if (tcpQuickAck != null) ret.setTcpQuickAck(tcpQuickAck) 
      if (tcpUserTimeout != null) ret.setTcpUserTimeout(tcpUserTimeout) 
      if (timeoutOnConnect != null) ret.setTimeoutOnConnect(timeoutOnConnect) 
      if (trafficClass != null) ret.setTrafficClass(trafficClass) 
      if (trustOptions != null) ret.setTrustOptions(trustOptions) 
      if (trustStoreOptions != null) ret.setTrustStoreOptions(trustStoreOptions) 
      if (useAlpn != null) ret.setUseAlpn(useAlpn) 
      if (useProxyProtocol != null) ret.setUseProxyProtocol(useProxyProtocol) 
      if (useWebSocket != null) ret.setUseWebSocket(useWebSocket) 
      if (webSocketMaxFrameSize != null) ret.setWebSocketMaxFrameSize(webSocketMaxFrameSize) 
      if (writeIdleTimeout != null) ret.setWriteIdleTimeout(writeIdleTimeout) 
      ret
    }
  }



  type MqttWill = io.vertx.mqtt.MqttWill
  object MqttWill {
    def apply(json: JsonObject) = new MqttWill(json)

  }



}
