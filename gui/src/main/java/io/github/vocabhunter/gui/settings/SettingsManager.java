/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.vocabhunter.gui.settings;

import java.nio.file.Path;

public interface SettingsManager {
    Path getDocumentsPath();

    void setDocumentsPath(Path path);

    Path getSessionsPath();

    void setSessionsPath(Path path);

    Path getExportPath();

    void setExportPath(Path path);
}