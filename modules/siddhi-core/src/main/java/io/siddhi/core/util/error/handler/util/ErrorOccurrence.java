/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.siddhi.core.util.error.handler.util;

/**
 * Denotes the point of an error occurrence. Used to identify the point to replay the collected event.
 */
public enum ErrorOccurrence {
    BEFORE_SOURCE_MAPPING,
    STORE_ON_SINK_ERROR,
    STORE_ON_STREAM_ERROR,
    // TODO ERROR HANDLER
    // STORE_ON_ADD_TO_TABLE,
    // STORE_ON_UPDATE_TABLE,...
    STORE_ON_TABLE_ADD,
    STORE_ON_TABLE_FIND,
    STORE_ON_TABLE_DELETE,
    STORE_ON_TABLE_UPDATE,
    STORE_ON_TABLE_UPDATE_OR_ADD,
    STORE_ON_TABLE_CONTAINS
}
