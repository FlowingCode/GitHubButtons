package com.flowingcode.vaadin.addons.githubbuttons;

import java.util.Arrays;
import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.flowingcode.vaadin.addons.githubbuttons.enums.NtkmeGitHubButtonType;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("ntkme-github-button")
@Route(value = "githubbuttons/ntkmebutton", layout = GitHubButtonsDemoView.class)
@SuppressWarnings("serial")
public class NtkmeGitHubButtonDemo extends VerticalLayout {

  public NtkmeGitHubButtonDemo() {

    NtkmeGitHubButton ntkmeGithubButton = new NtkmeGitHubButton("GoogleMapsAddon", "FlowingCode");

    Html title = DemoUtils.getDemoTitle(ntkmeGithubButton.getRepo(), ntkmeGithubButton.getUser());

    ComboBox<NtkmeGitHubButtonType> typeComboBox = new ComboBox<NtkmeGitHubButtonType>("Select Type");
    typeComboBox.setItems(Arrays.asList(NtkmeGitHubButtonType.values()));
    typeComboBox.addValueChangeListener(e -> ntkmeGithubButton.setType(e.getValue()));
    typeComboBox.setValue(ntkmeGithubButton.getType());
    
    Checkbox countCheckbox = DemoUtils.getCountCheckbox(ntkmeGithubButton);  

    Checkbox sizeCheckbox = DemoUtils.getSizeCheckbox(ntkmeGithubButton);
        
    ComboBox<String> targetComboBox = DemoUtils.getTargetComboBox(ntkmeGithubButton);
    
    Checkbox standardIconCheckbox = new Checkbox("Show standard icon ", e -> ntkmeGithubButton.setStandardIcon(e.getValue()));
        
    add(title, ntkmeGithubButton, typeComboBox, countCheckbox, sizeCheckbox, standardIconCheckbox, targetComboBox);
  }
}
