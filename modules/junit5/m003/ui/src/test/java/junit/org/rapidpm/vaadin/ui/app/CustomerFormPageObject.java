package junit.org.rapidpm.vaadin.ui.app;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.FormLayoutElement;
import com.vaadin.testbench.elements.NativeSelectElement;
import com.vaadin.testbench.elements.TextFieldElement;
import org.openqa.selenium.WebDriver;
import org.rapidpm.vaadin.addons.testbench.junit5.pageobject.AbstractVaadinPageObject;

public class CustomerFormPageObject extends AbstractVaadinPageObject {


  public CustomerFormPageObject(WebDriver webDriver) {
    super(webDriver);
  }



  public String getLastName() {
    return $(FormLayoutElement.class).$(TextFieldElement.class).
        get(1).getValue();
  }

  public String getFirstName() {
    return firstnameTF().getValue();
  }

  public TextFieldElement firstnameTF() {
    return $(FormLayoutElement.class).$(TextFieldElement.class).
        first();
  }

  public void setLastName(String lastName) {
    $(FormLayoutElement.class).$(TextFieldElement.class).
        get(1).setValue(lastName);
  }

  public void setFirstName(String firstName) {
    $(FormLayoutElement.class).$(TextFieldElement.class).
        first().setValue(firstName);
  }

  public void saveEntry() {
    saveButton().click();
  }

  public void deleteEntry() {
    deleteButton().click();
  }

  public ButtonElement deleteButton() {
    return $(FormLayoutElement.class).$(ButtonElement.class).caption("Delete").first();
  }

  public ButtonElement saveButton() {
    return $(FormLayoutElement.class).$(ButtonElement.class).caption("Save").first();
  }

  public NativeSelectElement statusSelect() {
    return $(NativeSelectElement.class).caption("Status").first();
  }


}