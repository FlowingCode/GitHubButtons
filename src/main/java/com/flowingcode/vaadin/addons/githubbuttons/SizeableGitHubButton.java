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
