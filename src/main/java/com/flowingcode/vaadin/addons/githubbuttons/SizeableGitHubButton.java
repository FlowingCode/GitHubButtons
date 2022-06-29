package com.flowingcode.vaadin.addons.githubbuttons;

import com.flowingcode.vaadin.addons.githubbuttons.enums.ButtonSize;

public class SizeableGitHubButton extends BaseGitHubButton {
  
  public SizeableGitHubButton() {}

  public SizeableGitHubButton(String repo, String user) {
    super(repo, user);
  }

  /**
   * Sets size of the button. Use ButtonSize.LARGER for a bigger size button.
   * Default value 'none'.
   * 
   * @param size the size of the button
   */
  public void setSize(ButtonSize size) {
      this.getElement().setProperty("size", size.name().toLowerCase());
  }

  /**
   * @return ButtonSize return the size
   */
  public ButtonSize getSize() {
      String size = this.getElement().getProperty("size", ButtonSize.NONE.name());
      return ButtonSize.valueOf(size.toUpperCase());
  }
  
}
