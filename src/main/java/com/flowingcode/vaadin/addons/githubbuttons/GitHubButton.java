package com.flowingcode.vaadin.addons.githubbuttons;

import com.flowingcode.vaadin.addons.githubbuttons.enums.GitHubButtonType;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * Simple Github Star button.
 * 
 */
@Tag("wc-gh-button")
@NpmPackage(value = "@flowingcode/wc-ngx-github-buttons", version = "1.0.0")
@JsModule("@flowingcode/wc-ngx-github-buttons/elements/ngxGithubButtons.js")
public class GitHubButton extends BaseGitHubButton {

  public GitHubButton() {}

  public GitHubButton(String repo, String user) {
    super(repo, user);
    this.setType();
  }

  public void setType() {
    this.getElement().setProperty("type", GitHubButtonType.STAR.name().toLowerCase());
  }

  /**
   * @return String return the type
   */
  public GitHubButtonType getType() {
    String type = this.getElement().getProperty("type", GitHubButtonType.STAR.name());
    return GitHubButtonType.valueOf(type.toUpperCase());
  }
}
