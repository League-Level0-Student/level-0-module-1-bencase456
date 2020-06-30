PImage cookie;
PImage bar;
void setup() {
    size(500,500);
        fill(#D89F32);
    ellipse(250,250,300,300);
    fill(255,255,255);
        ellipse(250,250,250,250);
        
        cookie = loadImage("CHOCcookie.png");
        cookie.resize(75,50);
}
void draw() {

    if(mousePressed){
      image(cookie,mouseX,mouseY);
        
}
  
}
