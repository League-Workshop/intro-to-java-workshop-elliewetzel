void setup() {
  size(500, 400);
}
void draw() {
  fill(#0549FF);
  if (mousePressed) {
    fill(#FFDA08);
  }
  ellipse(300, 200, 100, 100);
  fill(#65EDBC);
  rect(100, 300, 100, 150);
  fill(#858685);
  triangle(100, 300, 200, 300, 150, 80);
  fill(#CBCBCB);
  ellipse(mouseX, mouseY, 300, 100);
}