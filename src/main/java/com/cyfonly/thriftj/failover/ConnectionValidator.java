package com.cyfonly.thriftj.failover;

import com.cyfonly.thriftj.ThriftClient;
import org.apache.thrift.transport.TTransport;
import com.cyfonly.thriftj.pool.ThriftServer;

/**
 * 连接验证
 * @author yunfeng.cheng
 * @create 2016-11-19
 */
public interface ConnectionValidator {

	boolean isValid(TTransport object,ThriftServer thriftServer);
}
