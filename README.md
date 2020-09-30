# **CS319 - Group 3J Risk Game Project Repository**

Fall'20 Bilkent University CS319: Object Oriented Software Engineering Course Project

**Project Members:**
  - Ahmet Ayberk Yılmaz
  - Denizhan Kemeröz
  - Mustafa Tuna Acar
  - Pelin Laçin Önen
  - Süleyman Semih Demir
  
# Project Description

&nbsp;&nbsp;&nbsp;It is based on the original RISK Table Game but instead of the soldiers conquering the world, the hackers are taking control of the whole web. The game will be a multiplayer desktop application. On the same computer, the players will take turns to make their moves one by one. The main difference between RISK and our game is: in RISK, players can only conquer the regions which have a border to conqueror’s regions; in our game, instead, the player can attack any region on the map regardless of the distance. However, to make attacking distant regions more difficult and risky for players, there is a rule which says that if a player attacks a distant region, then the player will have less chance to be successful, because of a higher level of ping.

&nbsp;&nbsp;&nbsp;Regarding the map of the game, it includes all regions in the world, with their exact places on all continents. At the beginning of the game, players will be given randomly selected regions by game, which are close to or distant from each other. After that, starting from the first player, all players will have 3 parts in their turn; hire, hack, and fortify respectively.

&nbsp;&nbsp;&nbsp;In the “HIRE” part, the player who has the turn can deploy some hackers in his/her regions. Players will be given a certain number of hackers at each hire part. The choice of which region will get how many hackers will be made by the player.  Also, at this part, the players will be able to combine their cards for more hackers.

&nbsp;&nbsp;&nbsp;In the “HACK” part, the player can attack other regions with the decided number of hackers. The defending side will use all of the hackers in that area. Each side will roll some dice proportional to the number of their hackers. As the distance increases the highest number of attacker’s dice will be lowered. The highest dice will be compared one by one, if the attacker has a higher number on their dice as their highest number, the defender loses one hacker. If the defender has a higher number on their dice as their highest number or has the same highest number as the attacker, the attacker loses one hacker. If the defender loses all of his/her hackers, the region will be hacked by attacker hackers. Otherwise, the defender keeps control of the web in the region and continues to stay in there. One important rule related to this part is; if the player takes control of the web of all regions in any continent, then he/she will be gifted with extra hackers for the next hiring part. Also, at the end of every hack part in which you have captured at least one territory, you will earn one (and only one) card.

&nbsp;&nbsp;&nbsp;In the third part, namely “FORTIFY”, the player will choose which region to hire their hackers on. This is important because the player will gain cards and extra hackers after gaining full control of a continent so the player should prevent any other player gaining a region in that continent.

&nbsp;&nbsp;&nbsp;If a player loses all the regions they own, they will be defeated and knocked out from the game. The last standing player who controls the whole map wins the game.

&nbsp;&nbsp;&nbsp;According to the progress of making the project, there are some features we would like to add:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Adding new GUI elements such as rolling of the dice, portrait of the hacker organizations, or different visual characteristics for the players’ main hacker.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Battle animations.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Soundtracks and sound effects.
