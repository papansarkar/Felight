//WRITE JAVA PROGRAM TO PRINT THE CHARACTERS THAT ARE EQUIVALENT TO THE UNICODES FROM 33 TO 122 IN A SINGLE LINE
class PrintCharacter{
	public static void main(String[] papan) {
		short to=33;
		short from=122;
		char equivalentCharacter='X';
		while(to<from){
			equivalentCharacter=(char)to;
			System.out.println("Equivalent character of unicode "+to+" is  "+equivalentCharacter);
			to++;
		}
	}
}

/*

D:\Felight\Basic Java>javac PrintCharacter.java

D:\Felight\Basic Java>java PrintCharacter
Equivalent character of unicode 33 is  !
Equivalent character of unicode 34 is  "
Equivalent character of unicode 35 is  #
Equivalent character of unicode 36 is  $
Equivalent character of unicode 37 is  %
Equivalent character of unicode 38 is  &
Equivalent character of unicode 39 is  '
Equivalent character of unicode 40 is  (
Equivalent character of unicode 41 is  )
Equivalent character of unicode 42 is  *
Equivalent character of unicode 43 is  +
Equivalent character of unicode 44 is  ,
Equivalent character of unicode 45 is  -
Equivalent character of unicode 46 is  .
Equivalent character of unicode 47 is  /
Equivalent character of unicode 48 is  0
Equivalent character of unicode 49 is  1
Equivalent character of unicode 50 is  2
Equivalent character of unicode 51 is  3
Equivalent character of unicode 52 is  4
Equivalent character of unicode 53 is  5
Equivalent character of unicode 54 is  6
Equivalent character of unicode 55 is  7
Equivalent character of unicode 56 is  8
Equivalent character of unicode 57 is  9
Equivalent character of unicode 58 is  :
Equivalent character of unicode 59 is  ;
Equivalent character of unicode 60 is  <
Equivalent character of unicode 61 is  =
Equivalent character of unicode 62 is  >
Equivalent character of unicode 63 is  ?
Equivalent character of unicode 64 is  @
Equivalent character of unicode 65 is  A
Equivalent character of unicode 66 is  B
Equivalent character of unicode 67 is  C
Equivalent character of unicode 68 is  D
Equivalent character of unicode 69 is  E
Equivalent character of unicode 70 is  F
Equivalent character of unicode 71 is  G
Equivalent character of unicode 72 is  H
Equivalent character of unicode 73 is  I
Equivalent character of unicode 74 is  J
Equivalent character of unicode 75 is  K
Equivalent character of unicode 76 is  L
Equivalent character of unicode 77 is  M
Equivalent character of unicode 78 is  N
Equivalent character of unicode 79 is  O
Equivalent character of unicode 80 is  P
Equivalent character of unicode 81 is  Q
Equivalent character of unicode 82 is  R
Equivalent character of unicode 83 is  S
Equivalent character of unicode 84 is  T
Equivalent character of unicode 85 is  U
Equivalent character of unicode 86 is  V
Equivalent character of unicode 87 is  W
Equivalent character of unicode 88 is  X
Equivalent character of unicode 89 is  Y
Equivalent character of unicode 90 is  Z
Equivalent character of unicode 91 is  [
Equivalent character of unicode 92 is  \
Equivalent character of unicode 93 is  ]
Equivalent character of unicode 94 is  ^
Equivalent character of unicode 95 is  _
Equivalent character of unicode 96 is  `
Equivalent character of unicode 97 is  a
Equivalent character of unicode 98 is  b
Equivalent character of unicode 99 is  c
Equivalent character of unicode 100 is  d
Equivalent character of unicode 101 is  e
Equivalent character of unicode 102 is  f
Equivalent character of unicode 103 is  g
Equivalent character of unicode 104 is  h
Equivalent character of unicode 105 is  i
Equivalent character of unicode 106 is  j
Equivalent character of unicode 107 is  k
Equivalent character of unicode 108 is  l
Equivalent character of unicode 109 is  m
Equivalent character of unicode 110 is  n
Equivalent character of unicode 111 is  o
Equivalent character of unicode 112 is  p
Equivalent character of unicode 113 is  q
Equivalent character of unicode 114 is  r
Equivalent character of unicode 115 is  s
Equivalent character of unicode 116 is  t
Equivalent character of unicode 117 is  u
Equivalent character of unicode 118 is  v
Equivalent character of unicode 119 is  w
Equivalent character of unicode 120 is  x
Equivalent character of unicode 121 is  y
Equivalent character of unicode 122 is  z

D:\Felight\Basic Java>
*/