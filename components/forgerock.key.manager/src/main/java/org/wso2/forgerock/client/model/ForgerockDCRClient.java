/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.forgerock.client.model;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ForgerockDCRClient {

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    public ClientInfo createApplication(ClientInfo clientInfo);

    @RequestLine("GET ?client_id={client_id}")
    @Headers("Content-Type: application/json")
    public ClientInfo getApplication(@Param("client_id") String clientId);

    @RequestLine("PUT ?client_id={client_id}")
    @Headers("Content-Type: application/json")
    public ClientInfo updateApplication(@Param("client_id") String clientId, ClientInfo clientInfo);

    @RequestLine("DELETE ?client_id={client_id}")
    @Headers("Content-Type: application/json")
    public void deleteApplication(@Param("client_id") String clientId);

}
