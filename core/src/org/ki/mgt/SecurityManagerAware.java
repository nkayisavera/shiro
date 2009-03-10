/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ki.mgt;

/**
 * Interface providing a callback method that allows an implementation of this interface to receive a reference to
 * the {@link SecurityManager SecurityManager} if they require one.  This is mostly used by core implementation classes
 * for framework code and is rarely necessary for software developers enabling JSecurity in their applications.
 *
 * @author Les Hazlewood
 * @since 1.0
 */
public interface SecurityManagerAware {

    /**
     * Callback method that allows a component to receive the {@link SecurityManager SecurityManager} instance if it
     * requires one.
     *
     * @param securityManager the application's <code>SecurityManager</code>
     */
    void setSecurityManager(SecurityManager securityManager);
}