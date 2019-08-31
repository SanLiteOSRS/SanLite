import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Actor")
public abstract class Actor extends Entity {
   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "Lhp;"
   )
   static Widget field978;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1884598383
   )
   @Export("x")
   int x;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1632465489
   )
   @Export("y")
   int y;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1372261855
   )
   int field918;
   @ObfuscatedName("an")
   boolean field919 = false;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1570594880
   )
   @Export("size")
   int size = 64;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 608219797
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1134168353
   )
   @Export("readySequence")
   int readySequence = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1794207509
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1807906031
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 821150937
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -346334565
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 2122224863
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1158599439
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1650224251
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("ap")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("aq")
   @Export("isAutoChatting")
   boolean isAutoChatting;
   @ObfuscatedName("ay")
   boolean field926 = false;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 319208211
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1527605305
   )
   @Export("overheadTextColor")
   int overheadTextColor = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 611459225
   )
   @Export("overheadTextEffect")
   int overheadTextEffect = 0;
   @ObfuscatedName("aw")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("ae")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("bk")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("bw")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("bo")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("bn")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -666406559
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("bh")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 1338126615
   )
   int field946 = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 221299857
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 669631645
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1550152873
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 236934275
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1446546153
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1633380255
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -159449897
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1360808075
   )
   int field964 = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1209932375
   )
   @Export("spotAnimation")
   int spotAnimation = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1531272561
   )
   @Export("spotAnimationFrame")
   int spotAnimationFrame = 0;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 1785825301
   )
   @Export("spotAnimationFrameCycle")
   int spotAnimationFrameCycle = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -63871325
   )
   int field958;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 130403319
   )
   @Export("heightOffset")
   int heightOffset;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -446723661
   )
   int field960;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1274756773
   )
   int field961;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1683717067
   )
   int field954;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1907051737
   )
   int field963;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -356117007
   )
   int field941;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -1458171567
   )
   int field965;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 716061265
   )
   int field966;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -1132398517
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -2023452361
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 1438228269
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 1512808789
   )
   int field970 = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -1629005053
   )
   int field971 = 32;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1777881517
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("cp")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("cu")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("cm")
   @Export("pathTraversed")
   byte[] pathTraversed = new byte[10];
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -1405217673
   )
   int field976 = 0;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -1913917699
   )
   int field947 = 0;

   Actor() {
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-110"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1059295249"
   )
   final void method1671() {
      this.pathLength = 0;
      this.field947 = 0;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "888431256"
   )
   @Export("addHitSplat")
   final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.hitSplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var12 = StructDefinition.getHitSplatDefinition(var1);
         var10 = var12.field3323;
         var11 = var12.field3314;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.hitSplatCycles[0];
         } else if (var10 == 1) {
            var14 = this.hitSplatValues[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.hitSplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitSplatCycles[var13];
               }
            } else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
               var9 = var13;
               var14 = this.hitSplatValues[var13];
            }
         }

         if (var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.hitSplatCount = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.hitSplatCount;
            this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
            if (this.hitSplatCycles[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.hitSplatTypes[var9] = var1;
         this.hitSplatValues[var9] = var2;
         this.hitSplatTypes2[var9] = var3;
         this.hitSplatValues2[var9] = var4;
         this.hitSplatCycles[var9] = var5 + var11 + var6;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IIIIIIS)V",
      garbageValue = "-25412"
   )
   @Export("addHealthBar")
   final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var7 = GrandExchangeOfferUnitPriceComparator.method138(var1);
      HealthBar var8 = null;
      HealthBar var9 = null;
      int var10 = var7.int2;
      int var11 = 0;

      HealthBar var12;
      for(var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
         ++var11;
         if (var12.definition.field3264 == var7.field3264) {
            var12.put(var2 + var4, var5, var6, var3);
            return;
         }

         if (var12.definition.int1 <= var7.int1) {
            var8 = var12;
         }

         if (var12.definition.int2 > var10) {
            var9 = var12;
            var10 = var12.definition.int2;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new HealthBar(var7);
         if (var8 == null) {
            this.healthBars.addLast(var12);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
         }

         var12.put(var2 + var4, var5, var6, var3);
         if (var11 >= 4) {
            var9.remove();
         }

      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   @Export("removeHealthBar")
   final void removeHealthBar(int var1) {
      HealthBarDefinition var2 = GrandExchangeOfferUnitPriceComparator.method138(var1);

      for(HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
         if (var2 == var3.definition) {
            var3.remove();
            return;
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)Liz;",
      garbageValue = "505249630"
   )
   @Export("getInvDefinition")
   public static InvDefinition getInvDefinition(int var0) {
      InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         InvDefinition.InvDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
