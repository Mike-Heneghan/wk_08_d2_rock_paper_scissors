package com.example.mike.rockpaperscissors;

import com.example.mike.rockpaperscissors.GameModels.Hand.Paper;
import com.example.mike.rockpaperscissors.GameModels.Hand.Rock;
import com.example.mike.rockpaperscissors.GameModels.Hand.Scissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandsTest {

    private Rock rock;
    private Paper paper;
    private Scissors scissors;

    @Before
    public void before(){
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
    }

    @Test
    public void canAssert(){
        assertEquals(1,1);
    }

    @Test
    public void hasName() {
        assertEquals("Rock", rock.getName());
        assertEquals("Paper", paper.getName());
        assertEquals("Scissors", scissors.getName());
    }

    @Test
    public void hasTrumps() {
        assertEquals(0, rock.getTrumps().size());
        assertEquals(0, scissors.getTrumps().size());
    }

    @Test
    public void canAddTrumps() {
        rock.addTrump(scissors);
        scissors.addTrump(paper);
        assertEquals(1, rock.getTrumps().size());
        assertEquals(1, scissors.getTrumps().size());
    }

    @Test
    public void canGetStringArrayList() {
        rock.addTrump(scissors);
        rock.addTrump(paper);
        assertEquals(2, rock.getTrumpsNames().size());
        assertEquals("Scissors", rock.getTrumpsNames().get(0));
    }
}
