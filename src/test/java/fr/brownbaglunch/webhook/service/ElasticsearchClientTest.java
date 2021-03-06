/*
 * Licensed to Brownbaglunch.fr under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Brownbaglunch.fr licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

package fr.brownbaglunch.webhook.service;

import org.junit.jupiter.api.Test;

class ElasticsearchClientTest {

    @Test
    void testBuildClient() {
        ElasticsearchClient.buildRestClient("http://localhost:9200");
        ElasticsearchClient.buildRestClient("http://username@localhost:9200");
        ElasticsearchClient.buildRestClient("http://username:password@localhost:9200");
    }
}
