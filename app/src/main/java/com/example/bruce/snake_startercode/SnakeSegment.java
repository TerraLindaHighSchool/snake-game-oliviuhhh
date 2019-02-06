/*************************************************
 * By: Olivia Armstrong
 *
 * Code for Snake Segment
 *
 * 1/11/19
 **************************************************/
package com.example.bruce.snake_startercode;

public class SnakeSegment {
    private int mXLoc, mYLoc, mDegrees;
    private Body mBodyParts;


    /*************************************************
     * Enumerations
     **************************************************/

    public enum Body {

        HEAD, BODY, TAIL;
    }

    public SnakeSegment (Body bodyParts, int degrees ,int xLoc, int yLoc){
        mBodyParts = bodyParts;
        mDegrees = degrees;
        mXLoc = xLoc;
        mYLoc = yLoc;

    }

    /*************************************************
     * Getters and Setters
     **************************************************/

    public int getXLoc() {
        return mXLoc;
    }

    public void setXLoc(int XLoc) {
        mXLoc = XLoc;
    }

    public int getYLoc() {
        return mYLoc;
    }

    public void setYLoc(int YLoc) {
        mYLoc = YLoc;
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
