
void setup() {
PImage face = loadImage("frog.jpg"); 
size(500,400);
face.resize(500,400);
image(face,0,0);
}
void draw() {
  fill(mouseX,mouseY,mouseY);
ellipse(135,95,100,100);
fill(mouseX,mouseY,mouseX);
ellipse(360,100,100,100);
fill(mouseY,mouseX,mouseX);
ellipse(360,100,10,10);
fill(mouseY,mouseX,mouseY);
ellipse(135,95,10,10);
}
