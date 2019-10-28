for(int i = 99; i >= 0; i--) {
  String lyrics;
  if (i > 1) {
    lyrics = i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n";
  } else if (i == 1) {
    lyrics = i + " bottle of beer on the wall, " + i + " bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n";
  } else {
    lyrics = "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.";
  }
  println(lyrics);
}
