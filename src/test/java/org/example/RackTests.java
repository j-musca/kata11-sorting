package org.example;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RackTests {

    @Test
    public void testRack() {
        Rack rack = new Rack();

        assertThat(rack.getBalls()).isEqualTo(Lists.emptyList());

        rack.add(20);
        assertThat(rack.getBalls()).isEqualTo(Lists.newArrayList(20));

        rack.add(10);
        assertThat(rack.getBalls()).isEqualTo(Lists.newArrayList(10, 20));

        rack.add(30);
        assertThat(rack.getBalls()).isEqualTo(Lists.newArrayList(10, 20, 30));

        rack.add(10);
        assertThat(rack.getBalls()).isEqualTo(Lists.newArrayList(10, 10, 20, 30));
    }

    @Test
    public void testCharSorter() {
        TextBox charSorter = new TextBox("When not studying nuclear physics, Bambi likes to play\nbeach volleyball.");

        assertThat(charSorter.getSortedTextCharacters()).isEqualTo("aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy");
    }
}
