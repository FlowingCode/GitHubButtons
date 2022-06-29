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
