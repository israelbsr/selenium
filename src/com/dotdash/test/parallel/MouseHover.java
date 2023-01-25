package com.dotdash.test.parallel;

import com.dotdash.pageobject.MouseHoverPage;
import com.dotdash.test.BaseTest;


public class MouseHover extends BaseTest {
    private MouseHoverPage mouse_hover_page = null;


    void init() {
        if (mouse_hover_page == null) mouse_hover_page = null;
    }


    void able_to_hover_and_see_user_info() {
        mouse_hover_page.mouse_over_user(1).verify_general_info_for_user(1);
        mouse_hover_page.mouse_over_user(2).verify_general_info_for_user(2);
        mouse_hover_page.mouse_over_user(3).verify_general_info_for_user(3);
    }
}
