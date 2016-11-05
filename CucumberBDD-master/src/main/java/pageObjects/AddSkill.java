package pageObjects;

import com.OHRM.BaseClass;
import org.openqa.selenium.By;

/**
 * Created by ravinder reddy on 04/11/2016.
 */
public class AddSkill extends BaseClass {
    static By adminModule=By.id("menu_admin_viewAdminModule");
    static By qualificationsModule=By.id("menu_admin_Qualifications");
    static By skillsModule=By.id("menu_admin_viewSkills");
    static By addSkillButton=By.id("btnAdd");
    static By skillBox=By.id("skill_name");
    static By skillDescriptionBox=By.id("skill_description");
    static By saveButton=By.id("btnSave");

    public static void goToAdminModule(){
        driver.findElement(adminModule).click();
    }
    public static void goToQualificationsModule(){
        driver.findElement(qualificationsModule).click();
    }
    public static void goToSkillsModule(){
        driver.findElement(skillsModule).click();
    }
    public static void selectAddSkill(){
        driver.findElement(addSkillButton).click();
    }
    public static void enterSkillDetails(String skillName, String description){
        driver.findElement(skillBox).sendKeys(skillName);
        if (description!=null)
            driver.findElement(skillDescriptionBox).sendKeys(description);
    }
    public static void selectSave(){
        driver.findElement(saveButton).click();
    }
    public static void seeSkill(){
        driver.findElement(By.tagName("body")).getText().contains("skill");
    }
}
