package ch07.beyondclasses.p367;

import java.io.Serializable;

public sealed class SealedClass extends Thread implements Serializable,Runnable permits sub1, sub2, sub3 {

}
