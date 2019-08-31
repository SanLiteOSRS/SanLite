import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("PlayerAppearance")
public class PlayerAppearance {
   @ObfuscatedName("x")
   public static short[] field2523;
   @ObfuscatedName("f")
   @Export("equipmentIndices")
   static final int[] equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   @Export("PlayerAppearance_cachedModels")
   public static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   @ObfuscatedName("s")
   @Export("equipment")
   int[] equipment;
   @ObfuscatedName("j")
   @Export("bodyColors")
   int[] bodyColors;
   @ObfuscatedName("i")
   @Export("isFemale")
   public boolean isFemale;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1853482323
   )
   @Export("npcTransformId")
   public int npcTransformId;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = -7365242967522799729L
   )
   long field2519;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = 2050546320493006419L
   )
   long field2522;

   public PlayerAppearance() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([I[IZIB)V",
      garbageValue = "-32"
   )
   @Export("update")
   public void update(int[] var1, int[] var2, boolean var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
               KitDefinition var7 = GameShell.getKitDefinition(var6);
               if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) {
                  var1[equipmentIndices[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.equipment = var1;
      this.bodyColors = var2;
      this.isFemale = var3;
      this.npcTransformId = var4;
      this.setHash();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-420581266"
   )
   public void method3929(int var1, boolean var2) {
      if (var1 != 1 || !this.isFemale) {
         int var3 = this.equipment[equipmentIndices[var1]];
         if (var3 != 0) {
            var3 -= 256;

            KitDefinition var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = KitDefinition.KitDefinition_fileCount - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= KitDefinition.KitDefinition_fileCount) {
                     var3 = 0;
                  }
               }

               var4 = GameShell.getKitDefinition(var3);
            } while(var4 == null || var4.nonSelectable || var1 + (this.isFemale ? 7 : 0) != var4.bodypartID);

            this.equipment[equipmentIndices[var1]] = var3 + 256;
            this.setHash();
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-2145641688"
   )
   public void method3930(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = FontName.field3651[var1].length - 1;
            }
         } while(!DevicePcmPlayerProvider.method794(var1, var3));
      } else {
         do {
            ++var3;
            if (var3 >= FontName.field3651[var1].length) {
               var3 = 0;
            }
         } while(!DevicePcmPlayerProvider.method794(var1, var3));
      }

      this.bodyColors[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1539673752"
   )
   public void method3937(boolean var1) {
      if (this.isFemale != var1) {
         this.update((int[])null, this.bodyColors, var1, -1);
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lky;I)V",
      garbageValue = "-1403518523"
   )
   public void method3948(Buffer var1) {
      var1.writeByte(this.isFemale ? 1 : 0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.equipment[equipmentIndices[var2]];
         if (var3 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.writeByte(this.bodyColors[var2]);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1367510111"
   )
   @Export("setHash")
   void setHash() {
      long var1 = this.field2519;
      int var3 = this.equipment[5];
      int var4 = this.equipment[9];
      this.equipment[5] = var4;
      this.equipment[9] = var3;
      this.field2519 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field2519 <<= 4;
         if (this.equipment[var5] >= 256) {
            this.field2519 += (long)(this.equipment[var5] - 256);
         }
      }

      if (this.equipment[0] >= 256) {
         this.field2519 += (long)(this.equipment[0] - 256 >> 4);
      }

      if (this.equipment[1] >= 256) {
         this.field2519 += (long)(this.equipment[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field2519 <<= 3;
         this.field2519 += (long)this.bodyColors[var5];
      }

      this.field2519 <<= 1;
      this.field2519 += (long)(this.isFemale ? 1 : 0);
      this.equipment[5] = var3;
      this.equipment[9] = var4;
      if (var1 != 0L && var1 != this.field2519) {
         PlayerAppearance_cachedModels.remove(var1);
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lij;ILij;II)Ldo;",
      garbageValue = "1074848537"
   )
   @Export("getModel")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.npcTransformId != -1) {
         return ViewportMouse.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
      } else {
         long var5 = this.field2519;
         int[] var7 = this.equipment;
         if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
            var7 = new int[12];

            for(int var15 = 0; var15 < 12; ++var15) {
               var7[var15] = this.equipment[var15];
            }

            if (var1.shield >= 0) {
               var5 += (long)(var1.shield - this.equipment[5] << 40);
               var7[5] = var1.shield;
            }

            if (var1.weapon >= 0) {
               var5 += (long)(var1.weapon - this.equipment[3] << 48);
               var7[3] = var1.weapon;
            }
         }

         Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
         if (var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (var11 >= 256 && var11 < 512 && !GameShell.getKitDefinition(var11 - 256).ready()) {
                  var9 = true;
               }

               if (var11 >= 512 && !WorldMapData_0.getItemDefinition(var11 - 512).method4556(this.isFemale)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != this.field2522) {
                  var8 = (Model)PlayerAppearance_cachedModels.get(this.field2522);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (var8 == null) {
               ModelData[] var16 = new ModelData[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  ModelData var14;
                  if (var13 >= 256 && var13 < 512) {
                     var14 = GameShell.getKitDefinition(var13 - 256).getModelData();
                     if (var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     var14 = WorldMapData_0.getItemDefinition(var13 - 512).method4557(this.isFemale);
                     if (var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               ModelData var18 = new ModelData(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.bodyColors[var13] < FontName.field3651[var13].length) {
                     var18.recolor(KeyHandler.field387[var13], FontName.field3651[var13][this.bodyColors[var13]]);
                  }

                  if (this.bodyColors[var13] < SoundCache.field1418[var13].length) {
                     var18.recolor(field2523[var13], SoundCache.field1418[var13][this.bodyColors[var13]]);
                  }
               }

               var8 = var18.toModel(64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var8, var5);
               this.field2522 = var5;
            }
         }

         if (var1 == null && var3 == null) {
            return var8;
         } else {
            Model var17;
            if (var1 != null && var3 != null) {
               var17 = var1.applyTransformations(var8, var2, var3, var4);
            } else if (var1 != null) {
               var17 = var1.transformActorModel(var8, var2);
            } else {
               var17 = var3.transformActorModel(var8, var4);
            }

            return var17;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldq;",
      garbageValue = "-337646401"
   )
   @Export("getModelData")
   ModelData getModelData() {
      if (this.npcTransformId != -1) {
         return ViewportMouse.getNpcDefinition(this.npcTransformId).getModelData();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipment[var2];
            if (var3 >= 256 && var3 < 512 && !GameShell.getKitDefinition(var3 - 256).method4360()) {
               var1 = true;
            }

            if (var3 >= 512 && !WorldMapData_0.getItemDefinition(var3 - 512).method4558(this.isFemale)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var7 = new ModelData[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.equipment[var4];
               ModelData var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = GameShell.getKitDefinition(var5 - 256).method4361();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = WorldMapData_0.getItemDefinition(var5 - 512).method4559(this.isFemale);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.bodyColors[var5] < FontName.field3651[var5].length) {
                  var8.recolor(KeyHandler.field387[var5], FontName.field3651[var5][this.bodyColors[var5]]);
               }

               if (this.bodyColors[var5] < SoundCache.field1418[var5].length) {
                  var8.recolor(field2523[var5], SoundCache.field1418[var5][this.bodyColors[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1490773548"
   )
   @Export("getChatHeadId")
   public int getChatHeadId() {
      return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + ViewportMouse.getNpcDefinition(this.npcTransformId).id;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IIIIIII)I",
      garbageValue = "-428872333"
   )
   public static int method3944(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }
}
