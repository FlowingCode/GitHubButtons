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
