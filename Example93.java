// Example 93 from page 67
//

import java.awt.Color;
import java.awt.Graphics;

interface Colored { Color getColor(); }
interface Drawable { void draw(Graphics g); }
interface ColoredDrawable extends Colored, Drawable {}

