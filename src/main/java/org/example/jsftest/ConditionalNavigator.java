package org.example.jsftest;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("conditionalNavigator")
@RequestScoped
public class ConditionalNavigator implements Serializable {
    @Inject
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    /*
     * Conditional navigation based on pageId.
     * If pageId is 1 show page1.xhtml.
     * If pageId is 2 show page2.xhtml.
     * Else show index.xhtml.
     * */
    public String showPage() {
        return switch (pageId) {
            case "1" -> "page1?faces-redirect=true";
            case "2" -> "page2?faces-redirect=true";
            default -> {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Lazy", "You stayed on this page"));
                yield "index"; // here, I don't want to actually redirect, otherwise the popup with the message is lost!
            }
        };
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
