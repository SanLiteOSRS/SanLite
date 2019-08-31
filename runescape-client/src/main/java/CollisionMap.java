import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("CollisionMap")
public class CollisionMap {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 379779745
   )
   @Export("xInset")
   public int xInset = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 899493249
   )
   @Export("yInset")
   public int yInset = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -67571785
   )
   @Export("xSize")
   int xSize;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1623106677
   )
   @Export("ySize")
   int ySize;
   @ObfuscatedName("ac")
   @Export("flags")
   public int[][] flags;

   public CollisionMap(int var1, int var2) {
      this.xSize = var1;
      this.ySize = var2;
      this.flags = new int[this.xSize][this.ySize];
      this.clear();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "8482"
   )
   @Export("clear")
   public void clear() {
      for(int var1 = 0; var1 < this.xSize; ++var1) {
         for(int var2 = 0; var2 < this.ySize; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
               this.flags[var1][var2] = 16777216;
            } else {
               this.flags[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "-37"
   )
   public void method3495(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3496(var1, var2, 128);
            this.method3496(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3496(var1, var2, 2);
            this.method3496(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3496(var1, var2, 8);
            this.method3496(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3496(var1, var2, 32);
            this.method3496(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3496(var1, var2, 1);
            this.method3496(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3496(var1, var2, 4);
            this.method3496(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3496(var1, var2, 16);
            this.method3496(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3496(var1, var2, 64);
            this.method3496(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3496(var1, var2, 130);
            this.method3496(var1 - 1, var2, 8);
            this.method3496(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3496(var1, var2, 10);
            this.method3496(var1, var2 + 1, 32);
            this.method3496(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3496(var1, var2, 40);
            this.method3496(var1 + 1, var2, 128);
            this.method3496(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3496(var1, var2, 160);
            this.method3496(var1, var2 - 1, 2);
            this.method3496(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3496(var1, var2, 65536);
               this.method3496(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3496(var1, var2, 1024);
               this.method3496(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3496(var1, var2, 4096);
               this.method3496(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3496(var1, var2, 16384);
               this.method3496(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3496(var1, var2, 512);
               this.method3496(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3496(var1, var2, 2048);
               this.method3496(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3496(var1, var2, 8192);
               this.method3496(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3496(var1, var2, 32768);
               this.method3496(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3496(var1, var2, 66560);
               this.method3496(var1 - 1, var2, 4096);
               this.method3496(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3496(var1, var2, 5120);
               this.method3496(var1, var2 + 1, 16384);
               this.method3496(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3496(var1, var2, 20480);
               this.method3496(var1 + 1, var2, 65536);
               this.method3496(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3496(var1, var2, 81920);
               this.method3496(var1, var2 - 1, 1024);
               this.method3496(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-1939556917"
   )
   public void method3493(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.xInset;
      var2 -= this.yInset;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.xSize) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.ySize) {
                  this.method3496(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2081310668"
   )
   public void method3494(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 2097152;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "5864"
   )
   public void method3490(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 262144;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "79"
   )
   void method3496(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] |= var3;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "1397124488"
   )
   public void method3497(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3523(var1, var2, 128);
            this.method3523(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3523(var1, var2, 2);
            this.method3523(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3523(var1, var2, 8);
            this.method3523(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3523(var1, var2, 32);
            this.method3523(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3523(var1, var2, 1);
            this.method3523(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3523(var1, var2, 4);
            this.method3523(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3523(var1, var2, 16);
            this.method3523(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3523(var1, var2, 64);
            this.method3523(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3523(var1, var2, 130);
            this.method3523(var1 - 1, var2, 8);
            this.method3523(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3523(var1, var2, 10);
            this.method3523(var1, var2 + 1, 32);
            this.method3523(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3523(var1, var2, 40);
            this.method3523(var1 + 1, var2, 128);
            this.method3523(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3523(var1, var2, 160);
            this.method3523(var1, var2 - 1, 2);
            this.method3523(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3523(var1, var2, 65536);
               this.method3523(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3523(var1, var2, 1024);
               this.method3523(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3523(var1, var2, 4096);
               this.method3523(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3523(var1, var2, 16384);
               this.method3523(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3523(var1, var2, 512);
               this.method3523(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3523(var1, var2, 2048);
               this.method3523(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3523(var1, var2, 8192);
               this.method3523(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3523(var1, var2, 32768);
               this.method3523(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3523(var1, var2, 66560);
               this.method3523(var1 - 1, var2, 4096);
               this.method3523(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3523(var1, var2, 5120);
               this.method3523(var1, var2 + 1, 16384);
               this.method3523(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3523(var1, var2, 20480);
               this.method3523(var1 + 1, var2, 65536);
               this.method3523(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3523(var1, var2, 81920);
               this.method3523(var1, var2 - 1, 1024);
               this.method3523(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIIIZB)V",
      garbageValue = "25"
   )
   public void method3498(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.xInset;
      var2 -= this.yInset;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.xSize) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.ySize) {
                  this.method3523(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1656686360"
   )
   void method3523(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] &= ~var3;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1414783341"
   )
   public void method3527(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] &= -262145;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhz;I)V",
      garbageValue = "-1914788069"
   )
   @Export("setFloorUnderlayDefinitionArchive")
   public static void setFloorUnderlayDefinitionArchive(AbstractArchive var0) {
      FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "-3946"
   )
   static final void method3505(int var0) {
      if (Projectile.loadInterface(var0)) {
         Tile.method2800(Widget.Widget_interfaceComponents[var0], -1);
      }
   }
}
