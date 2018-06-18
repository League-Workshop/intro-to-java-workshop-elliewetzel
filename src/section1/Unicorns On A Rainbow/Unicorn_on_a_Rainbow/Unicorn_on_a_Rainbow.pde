PImage rainbow;
  PImage unicorn;
void setup(){
  rainbow = loadImage("Rainbow.png");
  size(800,600);
  rainbow.resize(800,600);
  background(rainbow);
  unicorn = loadImage("unicorn11.png");
  unicorn.resize(200,200);
  
}
void draw(){
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}