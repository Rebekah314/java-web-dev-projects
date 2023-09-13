package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import technology.AbstractEntity;
import technology.Computer;
import technology.Laptop;
import technology.SmartPhone;

import static org.junit.jupiter.api.Assertions.*;


public class ComputerTest {

    Computer test_computer;
    Computer test2_computer;
    Laptop test_laptop;
    SmartPhone test_smartphone;
    boolean wifiEnabled = false;
    boolean portable = false;
    double memory = 8.0;
    double weightInPounds = 5;
    boolean keyboardGlows = false;
    boolean takePicture = false;
    boolean receivePhoneCall = false;

    @BeforeEach
    public void createComputerObject() {
        test_computer = new Computer(wifiEnabled, portable, memory);
        test2_computer = new Computer(wifiEnabled, portable, memory);
        test_laptop = new Laptop(wifiEnabled, portable, memory, weightInPounds, keyboardGlows);
        test_smartphone = new SmartPhone(wifiEnabled, portable, memory, takePicture, receivePhoneCall);
    }

@Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }
    @Test
    public void testComputerConstructorWifi() {
        assertFalse(test_computer.getWifiEnabled());
    }
    @Test
    public void testComputerId() {
        assertEquals(1, test_computer.getId());
    }
    @Test
    public void testComputerConstructorPortable() {
        assertFalse(test_computer.getPortable());
    }
    @Test
    public void testComputerConstructorMemory() {
        assertEquals(memory, test_computer.getMemory(), 0.001);
    }
    @Test
    public void testComputerConnectToWifi() {
        test_computer.connectToWifi();
        assertTrue(test_computer.getWifiEnabled());
    }
    @Test
    public void testSecondComputerUpdatesId() {

        assertEquals(2, test2_computer.getId());
    }
    @Test
    public void testLaptopId() {
        assertEquals(3, test_laptop.getId());
    }
    @Test
    public void testLaptopWeight() {
        assertEquals(weightInPounds, test_laptop.getWeight(), 0.001);
    }
    @Test
    public void testLaptopKeyboardGlows() {
        test_laptop.setKeyboardGlows();
        assertTrue(test_laptop.getKeyboardGlows());
    }
    @Test
    public void testSmartphoneId() {
        assertEquals(4, test_smartphone.getId());
    }
    @Test
    public void testSmartPhoneTakePicture(){
        test_smartphone.setTakePicture();
        assertTrue(test_smartphone.getTakePicture());
    }
    @Test
    public void testSmartPhoneReceivePhoneCall() {
        test_smartphone.setReceivePhoneCall();
        assertTrue(test_smartphone.getReceivePhoneCall());
    }



}
