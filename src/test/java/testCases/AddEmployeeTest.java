package testCases;

import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeTest extends CommonMethods {

    @Test
    public void addEmployee() {
        //login function
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));

        DashBoardPage dashBoardPage = new DashBoardPage();
        click(dashBoardPage.pimOption);
        click(dashBoardPage.addEmployeeButton);

        //add employee page
        AddEmployeePage addEmployeePage = new AddEmployeePage();
        sendText(addEmployeePage.firstName, "testUser4564612");
        sendText(addEmployeePage.middleName, "testUserMD4564612");
        sendText(addEmployeePage.lastName, "testUserLN4564612");
        click(addEmployeePage.saveButton);
    }
}
