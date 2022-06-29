package com.flowingcode.vaadin.addons.githubbuttons;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("gh-button")
@Route(value = "githubbuttons/ghbutton", layout = GitHubButtonsDemoView.class)
@SuppressWarnings("serial")
public class GitHubButtonDemo extends VerticalLayout {

  public GitHubButtonDemo() {

    GitHubButton githubButton = new GitHubButton("GoogleMapsAddon", "FlowingCode");

    Html title = DemoUtils.getDemoTitle(githubButton.getRepo(), githubButton.getUser());
    
    Checkbox countCheckbox = DemoUtils.getCountCheckbox(githubButton);

    ComboBox<String> targetComboBox = DemoUtils.getTargetComboBox(githubButton);
  
    add(title, githubButton, countCheckbox, targetComboBox);
  }
}
