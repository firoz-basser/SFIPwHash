package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import xpertek.security.SFIPwHash;

public class TestPwHash {
@Test
public void someTest() {
	assertEquals("Ok!", SFIPwHash.getHash("gadero", "SHA"), "Z2FkZXJv");
}

}
