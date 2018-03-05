/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.cs.java.v1.client.auth;

import com.huaweicloud.cs.java.v1.client.Pair;


import java.util.Map;
import java.util.List;

import com.squareup.okhttp.Request;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:38:54.344+08:00")
public class HttpBasicAuth implements Authentication {
    private String token;

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) { }

    public Request applyToParams(Request request) {
        if (token == null) {
            return request;
        }
        Request.Builder builder = request.newBuilder();
        builder.addHeader("x-auth-token", token);
        return builder.build();
    }
}
