Change: Now when drawing the rectangles students must press the spacebar to draw each subsequent one so that students can see each rectangle as it appears, 
reducing the chance they get confused if a rectangle is drawing over another.

Justification:
I wrote the code to keep the original excercise in place. The students only have to make the extra distinction to not edit the if statements, but edit the rectangle drawing lines the same as before. I added an
extra rectangle to be drawn by default so that they don't have to guess about making more if statements, and can focus of just editing the rectangle color, size, and position. I did not put the rectangle colors in
the right order so students still have to chance to learn by experience and observation about draw order, which is assisted by my "drawing step by step" change. I kept any helper code and other methods
out of the way so students won't edit them, such as the text to inform students to press the spacebar and the KeyListener methods.

Context:
Students sometimes have trouble understanding how draw order works, and get confused when a bigger rectangle draws over a smaller one, potentially leading them to think the smaller one was never drawn in the first
place. This "step by step" implementation makes the draw cycle occur whenever the spacebar is pressed, keeping track of clicks so that it draws more rectangles each time. This makes it so that students can clearly
see how each rectangle is drawn and affected by rectangles drawn after it.

Importance:
This change is important because it will help students more quickly and intuitively understand how drawing graphics in Java works. By adding separation to the drawing of each item the draw order becomes clear,
giving the student important information for their leanring. This change helps students get the same amount of learning out of the excercise, but more easily and efficiently.
