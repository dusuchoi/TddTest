package knu.ac.kr.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void 미니멈랭쓰가_지정값보다크면_테스트_성공(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }

    @Test
    public void 맥시멈랭쓰가_지정값보다작으면_테스트_성공(){
        String testPassword = "abcdefg";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }

    @Test
    public void 맥시멈랭쓰가_지정값보다크면_테스트_실패(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void password가_널이면_테스트_실패(){
        String testPassword = null;
        PasswordValidator passwordValidator = new PasswordValidator(2, 8);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void password가_emptyString이면_테스트_실패(){
        String testPassword = "";
        PasswordValidator passwordValidator = new PasswordValidator(2, 8);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void password가_admin이면_테스트_성공(){
        String testPassword = "admin";
        PasswordValidator passwordValidator = new PasswordValidator(2, 8);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }
}
