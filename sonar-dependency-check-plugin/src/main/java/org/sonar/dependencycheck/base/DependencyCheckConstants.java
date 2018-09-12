/*
 * Dependency-Check Plugin for SonarQube
 * Copyright (C) 2015-2017 Steve Springett
 * steve.springett@owasp.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.dependencycheck.base;

public final class DependencyCheckConstants {

    public static final String REPORT_PATH_PROPERTY = "sonar.dependencyCheck.reportPath";
    public static final String HTML_REPORT_PATH_PROPERTY = "sonar.dependencyCheck.htmlReportPath";
    public static final String SEVERITY_CRITICAL = "sonar.dependencyCheck.severity.critical";
    public static final String SEVERITY_MAJOR = "sonar.dependencyCheck.severity.major";
    public static final String SEVERITY_MINOR = "sonar.dependencyCheck.severity.minor";

    private DependencyCheckConstants() {
    }

}
