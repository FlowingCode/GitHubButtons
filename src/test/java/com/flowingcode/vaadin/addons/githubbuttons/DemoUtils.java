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

import java.util.Arrays;
import com.flowingcode.vaadin.addons.githubbuttons.enums.ButtonSize;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;

public class DemoUtils {
  
  public static Html getDemoTitle(String repo, String user) {
    String repoString = "Repo: " + repo;
    String userString = "User: " + user;
    return new Html("<h4>" + repoString + "<br>" + userString + "</h4>");    
  }
  
  public static Checkbox getCountCheckbox(BaseGitHubButton button) {
    Checkbox countCheckbox = new Checkbox("Show Count");
    countCheckbox.addValueChangeListener(e -> button.setCount(e.getValue()));  
    countCheckbox.setValue(button.isCount());
    return countCheckbox;
  }
  
  public static ComboBox<String> getTargetComboBox(BaseGitHubButton button) {
    ComboBox<String> targetComboBox = new ComboBox<String>("Select Target");
    targetComboBox.setItems(Arrays.asList("_self", "_blank"));
    targetComboBox.addValueChangeListener(e -> button.setTarget(e.getValue()));
    targetComboBox.setValue(button.getTarget());
    return targetComboBox;
  }
  
  public static Checkbox getSizeCheckbox(SizeableGitHubButton button) {
    Checkbox sizeCheckbox =  new Checkbox("Large Size");
    sizeCheckbox.addValueChangeListener(e -> button.setSize(e.getValue() ? ButtonSize.LARGE : ButtonSize.NONE));
    sizeCheckbox.setValue(ButtonSize.LARGE.equals(button.getSize()));
    return sizeCheckbox;
  }

}
