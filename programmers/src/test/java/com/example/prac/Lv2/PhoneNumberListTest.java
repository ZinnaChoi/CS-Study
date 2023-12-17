package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PhoneNumberListTest {

  @Test
  public void testSolution() {
    PhoneNumberList phoneNumberList = new PhoneNumberList();

    // Test case 1
    String[] phoneBook1 = { "119", "97674223", "1195524421" };
    assertFalse(phoneNumberList.solution(phoneBook1));

    // Test case 2
    String[] phoneBook2 = { "123", "456", "789" };
    assertTrue(phoneNumberList.solution(phoneBook2));

    // Test case 3
    String[] phoneBook3 = { "12", "123", "1235", "567", "88" };
    assertFalse(phoneNumberList.solution(phoneBook3));
  }
}
