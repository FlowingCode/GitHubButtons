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
import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.flowingcode.vaadin.addons.githubbuttons.enums.MdoGitHubButtonType;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("mdo-github-button")
@Route(value = "githubbuttons/mdobutton", layout = GitHubButtonsDemoView.class)
@SuppressWarnings("serial")
public class MdoGitHubButtonDemo extends VerticalLayout {

  public MdoGitHubButtonDemo() {

    MdoGitHubButton mdoGithubButton = new MdoGitHubButton("GoogleMapsAddon", "FlowingCode");
       
    Html title = DemoUtils.getDemoTitle(mdoGithubButton.getRepo(), mdoGithubButton.getUser());

    ComboBox<MdoGitHubButtonType> typeComboBox = new ComboBox<MdoGitHubButtonType>("Select Type");
    typeComboBox.setItems(Arrays.asList(MdoGitHubButtonType.values()));
    typeComboBox.addValueChangeListener(e -> mdoGithubButton.setType(e.getValue()));
    typeComboBox.setValue(mdoGithubButton.getType());
    
    Checkbox countCheckbox = DemoUtils.getCountCheckbox(mdoGithubButton);

    Checkbox sizeCheckbox = DemoUtils.getSizeCheckbox(mdoGithubButton);
    
    ComboBox<String> targetComboBox = DemoUtils.getTargetComboBox(mdoGithubButton);

    add(title, mdoGithubButton, typeComboBox, countCheckbox, sizeCheckbox, targetComboBox);
  }
}
