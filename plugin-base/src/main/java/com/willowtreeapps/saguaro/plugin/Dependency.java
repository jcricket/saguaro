/*
 * Copyright (C) 2014 WillowTree Apps Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.willowtreeapps.saguaro.plugin;

import com.google.common.base.Objects;
import org.apache.maven.plugins.annotations.Parameter;

public class Dependency {
    @Parameter
    private String groupId;

    @Parameter
    private String artifactId;

    public Dependency() {

    }

    public Dependency(String group, String artifact) {
        this.groupId = group;
        this.artifactId = artifact;
    }

    public boolean equals(String groupId, String artifactId) {
        return this.groupId.equals(groupId) && this.artifactId.equals(artifactId);
    }

    public String getName() {
        return artifactId;
    }

    public String getGroup() {
        return groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dependency that = (Dependency) o;

        return artifactId.equals(that.artifactId) && groupId.equals(that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(groupId, artifactId);
    }

    @Override
    public String toString() {
        return groupId + ":" + artifactId;
    }
}
