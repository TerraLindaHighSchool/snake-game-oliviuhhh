/*************************************************
 * By: Olivia Armstrong
 *
 * Code for Snake Segment
 *
 * 1/11/19
 **************************************************/
package com.example.bruce.snake_startercode;

public class SnakeSegment {
    private int XLoc;
    private int YLoc;
    private Body mBodyParts;
    private int mDegrees;


    /*************************************************
     * Enumerations
     **************************************************/

    public enum Body {

        HEAD, BODY, TAIL;
    }

    public SnakeSegment (Body bodyParts, int degrees ,int XLoc, int YLoc){
        mBodyParts = bodyParts;
        mDegrees = degrees;
        XLoc = XLoc;
        YLoc = YLoc;

    }

    /*************************************************
     * Getters and Setters
     **************************************************/

    public int getXLoc() {
        return XLoc;
    }

    public void setXLoc(int XLoc) {
        this.XLoc = XLoc;
    }

    public int getYLoc() {
        return YLoc;
    }

    public void setYLoc(int YLoc) {
        this.YLoc = YLoc;
    }

    public Body getmBodyParts() {
        return mBodyParts;
    }

    public int getmDegrees() {
        return mDegrees;
    }

    public void setmDegrees(int mDegrees) {
        this.mDegrees = mDegrees;
    }
}
