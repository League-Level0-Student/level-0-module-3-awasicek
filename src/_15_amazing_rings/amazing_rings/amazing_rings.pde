// 1. Create a new sketch in Processing and add setup() and draw() methods.
void setup() {
  size(800, 800);
}

final int NUM_RINGS = 50;
final int RING_SIZE_COEFFICIENT = 10;
int leftX = 250;
int leftSpeed = 3;
int rightX = 550;
int rightSpeed = -3;

void draw() {
  background(#FFFFFF);
  
  noFill();
  
  // 2. Use the code from your Bullseye recipe to draw the rings. You can use the noFill() command to make your ellipses transparent.
  for(int i = NUM_RINGS; i >= 1; i--) {
    ellipse(leftX, 400, i * RING_SIZE_COEFFICIENT, i * RING_SIZE_COEFFICIENT);
  }
  
  for(int i = NUM_RINGS; i >= 1; i--) {
    ellipse(rightX, 400, i * RING_SIZE_COEFFICIENT, i * RING_SIZE_COEFFICIENT);
  }
  
  // 3. Make the rings move past each other.
  leftX += leftSpeed;
  rightX += rightSpeed;
  
  // 4. When the rings hit the side of the sketch, make them start moving the other direction.
  if(leftX <= 0 || leftX >= 800) {
    leftSpeed *= -1;
  }
  
  if(rightX <= 0 || rightX >= 800) {
    rightSpeed *= -1;
  }
}
