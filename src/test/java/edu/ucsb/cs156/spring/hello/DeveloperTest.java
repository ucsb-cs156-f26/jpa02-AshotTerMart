package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Ashot", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("AshotTerMart", Developer.getGithubId());
    }

    // Team Tests
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f26-08", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Ashot() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ashot"),"Team should contain Ashot");
    }

    @Test
    public void getTeam_returns_team_with_Celine() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Celine"),"Team should contain Celine");
    }

    @Test
    public void getTeam_returns_team_with_Hannah() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Hannah"),"Team should contain Hannah");
    }

    @Test
    public void getTeam_returns_team_with_Jared() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jared"),"Team should contain Jared");
    }

    @Test
    public void getTeam_returns_team_with_Kyle() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Kyle"),"Team should contain Kyle");
    }

    @Test
    public void getTeam_returns_team_with_Suveda() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Suveda"),"Team should contain Suveda");
    }
}