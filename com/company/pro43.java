package com.company;
    abstract class Pen {
        abstract void write();

        abstract void refill();
    }

    class fountainPen extends Pen {
        void write() {
            System.out.println("writing!!!");
        }

        void refill() {
            System.out.println("refilling it..wait pls !!!");
        }

        void changeNib() {
            System.out.println("changing the nib pf the fountain pen !!!");
        }
    }
    public class pro43{
    public static void main() {
        fountainPen obj = new fountainPen();
        obj.write();
        obj.refill();
        obj.changeNib();
    }
}
