/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.client.common;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreadLocalIndexTest {
    @Test
    public void testIncrementAndGet() throws Exception {
        ThreadLocalIndex localIndex = new ThreadLocalIndex();

        int size = 100 ;
        for (int i = 0; i < 100; i++) {
            int initialVal = localIndex.incrementAndGet();
            System.out.println(initialVal % size);
        }
        //assertThat(localIndex.incrementAndGet()).isEqualTo(initialVal + 1);
    }

    @Test
    public void testIncrementAndGet2() throws Exception {
        ThreadLocalIndex localIndex = new ThreadLocalIndex();
        int initialVal = localIndex.incrementAndGet();
        assertThat(initialVal >= 0).isTrue();
    }

}