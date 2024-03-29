package homeWork2;

import com.codeborne.selenide.Selenide;
import org.homeWork2.LoginPage;
import org.homeWork2.ProfilePage;
import org.homeWork2.StudentPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class ProfileTest extends HomeWork2AbstractTest {
    @Test
    void testFullNameInProfile() {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.authorize("GB202306611b511", "2ee4e216d5");

        StudentPage studentPage = page(StudentPage.class);
        studentPage.openProfilePage();

        ProfilePage profilePage = page(ProfilePage.class);
        Assertions.assertEquals("GB202306 611b511", profilePage.getTextFullNameRow());
        Assertions.assertEquals("GB202306 611b511", profilePage.getTextFullNameUnderCard());
    }

    @Test
    void testAddPictureInProfile() {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.authorize("GB202306611b511", "2ee4e216d5");
        StudentPage studentPage = page(StudentPage.class);
        studentPage.openProfilePage();

        ProfilePage profilePage = page(ProfilePage.class);
        profilePage.clickEditProfile();
        profilePage.uploadNewAvatarImage("src/test/resources/111.jpg");
        Assertions.assertTrue(profilePage.getFileName().contains("111.jpg"));

    }

    @Test
    void testChangeBirthdateInProfile() {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.authorize("GB202306611b511", "2ee4e216d5");

        StudentPage studentPage = page(StudentPage.class);
        studentPage.openProfilePage();

        ProfilePage profilePage = page(ProfilePage.class);
        profilePage.clickEditProfile();
        profilePage.changeBirthdate("01.01.1992");
        Assertions.assertEquals("01.01.1992", profilePage.getBirthdate());

    }
}
