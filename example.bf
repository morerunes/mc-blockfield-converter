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
layers=3
width=5
length=5
# optional fields...
# emptyBlockChar= 
name=CompleteMess
:endfieldinfo:

# blocktypes format = g blocktype x where
#     g is a label, x is block metadata (if in doubt, use 0), and
#     blocktype is the type of block (dirt, cobblestone, glass, etc)
#     NOTE: you can place comments in-line in the blocktypes definitions

:blocktypes:
d dirt 0
c cobblestone 0
w wood 0        # Forest Log
b wood 2        # Birch Wood
l leaves 0      # Forest Leaves
:endblocktypes:

# For the number of layers you defined, you must create a field for each.
#     When making a field, you can use a period ('.') to represent the
#     abscense of a block (empty space) that is not one of your blocktypes.
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
..d..
.d.d.
..d..
d.d.d
.d.d.

.d.d.
d.d.d
dd.dd
.d.d.
d.d.d

..d..
.d.d.
..d..
d.d.d
.d.d.
