class Wiggler {
  private int myX, myY;

  Wiggler() {
    myX = myY = 150;
  }
  int getmyX() {
    return myX;
  }
  int getmyY() {
    return myY;
  }
  void setmyX(int temp) {
    myX = temp;
  }
  void setmyY(int temp) {
    myY = temp;
  }
  void wiggle()
  {
    myX+=(int)(Math.random()*5)-2;
  }
}
