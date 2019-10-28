/**
 * @fileoverview Use modulo to make a bullseye like the provided image.
 */

// 1. Create a new sketch in Processing and add setup() and draw() methods.
void setup() {
  size(800, 800);
  
  // 2. Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 8; i >= 1; i--) {
    // 3. Use an if statement and modulo to alternate the color of your rings.
    if(i % 2 == 0) {
      fill(255, 0, 0); // red
    } else {
      fill(0, 0, 0); // red
    }
    ellipse(400, 400, i * 50, i * 50);
  }
}

void draw() {

}
