# Example Block Field File
#
# The various sections do not have to be in any particular order,
#     although putting the field info first is probably more readable
#
# fieldinfo format is a map of keys to values formatted similarly to a java
#     properties file. You must specify layers (number of fields, will be stacked
#     vertically), width (consistent width of your grid, in number of blocks), and
#     length (consistent length of your grid, in number of blocks). Your width and
#     length do not have to be the same (in other words, you can make rectangles),
#     but it is a global value in this file and must be consistent! All fields must
#     have the same length and width.

:fieldinfo:
layers=21
width=25
length=21
# optional fields...
# emptyBlockChar= 
name=ElegantMansion
:endfieldinfo:

# blocktypes format = g blocktype x where
#     g is a label, x is block metadata (if in doubt, use 0), and
#     blocktype is the type of block (dirt, cobblestone, glass, etc)
#     NOTE: you can place comments in-line in the blocktypes definitions

# Also note that you should only add blocktypes that you are going to use.
#     If you added a block and then didn't use it, take it out to
#     help perfomance.

:blocktypes:
p planks 1      # Wooden Planks
g glass 0       # Glass Block
w wood 2        # Birch Wood
f fence 0       # Fence Post
:endblocktypes:

# For the number of layers you defined, you must create a field for each.
#     When making a field, you can use a period ('.') to represent the
#     abscense of a block (empty space).
#
#     If you don't like using a period you can specify the parameter emptyBlockChar
#     in the :fieldinfo: section to be whatever character you want
#     (i.e. "emptyBlockChar=-" will use '-' as a spacer. Similarly, "emptyBlockChar= "
#     will use a space (' ') character as a spacer. This field is optional.)
#
# NOTE: FIELDS MUST BE ORDERED to render properly! Bottom layer first, then next up,
#     and so forth. Draw your fields as if you are looking at it from the top.
#     When you generate the block field in minecraft, it will generate from the
#     south-west-lower corner of your field. Ex:
#
#     :field:
#     ...d.
#     ..d..
#     .d...
#     d....
#     *...d <- It will generate from where the star is

:fields:
.........................
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
....................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
....................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppp.................ppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppp.................ppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppp.........ppppppp.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppggggg.......gggggppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppppppgggggggggppppppp.
.pppppppgggggggggppppppp.
.pppppppgggggggggppppppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppggggg.......gggggppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.pppppppg.......gppppppp.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p......f.......f......p.
.p......f.......f...w..p.
.p......f.......f......p.
.p......f.......f......p.
.p......f.......f......p.
.p......f.......f......p.
.p......fffffffff......p.
.p.....................p.
.p.....................p.
.p.....................p.
.p......fffffffff......p.
.p......f.......f......p.
.p......f.......f......p.
.p......f.......f......p.
.p......f.......f......p.
.p......f.......f...w..p.
.p......f.......f......p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.pppppppppgggggppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.pppppppppgggggppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.p.....................p.
.p..................w..p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p.....................p.
.p..................w..p.
.p.....................p.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.ppppp....p...p....ppppp.
.ppppppppppppppppppppppp.
.........................

.........................
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpp.ppggggppppp.
.ppppppppppppppppppppppp.
.........................

ppppppppppppppppppppppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppggggpppppggggpppppp
ppppppppppppppppppppppppp
ppppppppppppppppppppppppp

.........................
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.pppppggggpppppggggppppp.
.ppppppppppppppppppppppp.
.........................

.........................
.........................
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
..ppppppppppppppppppppp..
..ppppggggpppppggggpppp..
.........................
.........................

.........................
.........................
.........................
.........................
......ggggpppppgggg......
......ppppppppppppp......
......ggggpppppgggg......
......ppppppppppppp......
......ggggpppppgggg......
......ppppppppppppp......
......ggggpppppgggg......
......ppppppppppppp......
......ggggpppppgggg......
......ppppppppppppp......
......ggggpppppgggg......
......ppppppppppppp......
......ggggpppppgggg......
.........................
.........................
.........................
.........................

.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
...........ppp...........
...........ppp...........
...........ppp...........
...........ppp...........
...........ppp...........
.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................

.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
............p............
.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
.........................
