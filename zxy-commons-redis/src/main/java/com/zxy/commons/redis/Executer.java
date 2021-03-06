/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.zxy.commons.redis;

import redis.clients.jedis.Jedis;

/**
 * Redis Executer类
 * 
 * <p>
 * <a href="RedisExecuter.java"><i>View Source</i></a>
 * 
 * @author zhaoxunyong@qq.com
 * @version 1.0
 * @since 1.0
 */
public interface Executer {

    /**
     * Redis execute
     * 
     * @param <T> This is a type parameter
     * @param execution execution
     * @return T
     */
    public <T> T execute(RedisExecution<T> execution);

    /** 
     * Redis execution
     * 
     * <p>
     * <a href="Executer.java"><i>View Source</i></a>
     * </p>
     * @param <T> This is a type parameter
     * @author zhaoxunyong@qq.com
     * @version 1.0
     * @since 1.0 
    */
    public interface RedisExecution<T> {

        /**
         * execute
         * 
         * @param jedis redis object
         * @return T
         */
        public T execute(Jedis jedis);
    }
}
