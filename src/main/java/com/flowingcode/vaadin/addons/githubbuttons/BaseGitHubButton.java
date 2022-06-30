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

import com.vaadin.flow.component.Component;

public class BaseGitHubButton extends Component {
  
    public BaseGitHubButton() {}
    
    public BaseGitHubButton(String repo, String user) {
        this.setRepo(repo);
        this.setUser(user);
    }

    /**
     * Sets the repository name.
     * 
     * @param repo the repository name
     */
    public void setRepo(String repo) {
        this.getElement().setProperty("repo", repo);
    }

    /**
     * @return String return the repo
     */
    public String getRepo() {
        return this.getElement().getProperty("repo");
    }

    /**
     * Sets the user or organization name.
     * 
     * @param user the user or org name
     */
    public void setUser(String user) {
        this.getElement().setProperty("user", user);
    }
    
    /**
     * @return String return the user
     */
    public String getUser() {
        return this.getElement().getProperty("user");
    }

    /**
     * Sets whether to show count or not.
     * 
     * @param count if true, it shows count.
     */
    public void setCount(boolean count){
        this.getElement().setProperty("count", count);
    }

    /**
     * @return boolean return the count
     */
    public boolean isCount() {
        return this.getElement().getProperty("count", false);
    } 
   
    /**
     * Specifies where to open the github link. Default '_self'.
     * 
     * @param target where to open the link
     */
    public void setTarget(String target) {
        this.getElement().setProperty("target", target);
    }

    /**
     * @return String return the target
     */
    public String getTarget() {
        return this.getElement().getProperty("target", "_self");
    }

}
