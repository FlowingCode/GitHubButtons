/*-
 * #%L
 * GitHub Buttons Add-on
 * %%
 * Copyright (C) 2022 Flowing Code
 * %%
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
 * #L%
 */
package com.flowingcode.vaadin.addons.githubbuttons;

import com.flowingcode.vaadin.addons.githubbuttons.enums.NtkmeGitHubButtonType;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("wc-ntkme-github-button")
@NpmPackage(value = "@flowingcode/wc-ngx-github-buttons", version = "1.0.0")
@JsModule("@flowingcode/wc-ngx-github-buttons/elements/ngxGithubButtons.js")
public class NtkmeGitHubButton extends SizeableGitHubButton {
  
    public NtkmeGitHubButton() {}

    public NtkmeGitHubButton(String repo, String user) {
        super(repo, user);
    }

    /**
     * Sets the button's type. Type can be 'star, follow, watch, fork, issue, download'.
     * Default value 'star'.
     * 
     * @param type the type of the button
     */
    public void setType(NtkmeGitHubButtonType type) {
        this.getElement().setProperty("type", type.name().toLowerCase());
    }

    /**
     * @return String return the type
     */    
    public NtkmeGitHubButtonType getType() {
        String type = this.getElement().getProperty("type", NtkmeGitHubButtonType.STAR.name());
        return NtkmeGitHubButtonType.valueOf(type.toUpperCase());
    }

    /**
     * Sets whether to use the github logo instead of other icons
     * 
     * @param standardIcon is true shows standard github logo
     */
    public void setStandardIcon(boolean standardIcon) {
        this.getElement().setProperty("standardIcon", standardIcon);
    }

    /**
     * @return boolean return if the standardIcon is displayed
     */
    public boolean isStandardIcon() {
        return this.getElement().getProperty("standardIcon", false);
    }

}
