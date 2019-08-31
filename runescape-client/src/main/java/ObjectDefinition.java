import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("ObjectDefinition")
public class ObjectDefinition extends DualNode {
   @ObfuscatedName("s")
   @Export("ObjectDefinition_isLowDetail")
   public static boolean ObjectDefinition_isLowDetail = false;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lhz;"
   )
   @Export("ObjectDefinition_archive")
   public static AbstractArchive ObjectDefinition_archive;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lhz;"
   )
   @Export("ObjectDefinition_modelsArchive")
   public static AbstractArchive ObjectDefinition_modelsArchive;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   @Export("ObjectDefinition_cached")
   static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   @Export("ObjectDefinition_cachedModelData")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   @Export("ObjectDefinition_cachedEntities")
   static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   @Export("ObjectDefinition_cachedModels")
   static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Ldq;"
   )
   static ModelData[] field3364 = new ModelData[4];
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1417245107
   )
   @Export("id")
   public int id;
   @ObfuscatedName("d")
   int[] field3370;
   @ObfuscatedName("f")
   int[] field3339;
   @ObfuscatedName("c")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("r")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("y")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("p")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("b")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 950062565
   )
   @Export("sizeX")
   public int sizeX = 1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1522492745
   )
   @Export("sizeY")
   public int sizeY = 1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1421419631
   )
   @Export("interactType")
   public int interactType = 2;
   @ObfuscatedName("a")
   @Export("boolean1")
   public boolean boolean1 = true;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -302869057
   )
   @Export("int1")
   public int int1 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 56177517
   )
   @Export("clipType")
   int clipType = -1;
   @ObfuscatedName("h")
   @Export("nonFlatShading")
   boolean nonFlatShading = false;
   @ObfuscatedName("v")
   @Export("modelClipped")
   public boolean modelClipped = false;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -796877595
   )
   @Export("animationId")
   public int animationId = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1920170119
   )
   @Export("int2")
   public int int2 = 16;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1091050737
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 147368649
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("ai")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2069147423
   )
   @Export("mapIconId")
   public int mapIconId = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1917085051
   )
   @Export("mapSceneId")
   public int mapSceneId = -1;
   @ObfuscatedName("aj")
   @Export("isRotated")
   boolean isRotated = false;
   @ObfuscatedName("an")
   @Export("clipped")
   public boolean clipped = true;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 260729967
   )
   @Export("modelSizeX")
   int modelSizeX = 128;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1929825155
   )
   @Export("modelHeight")
   int modelHeight = 128;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1921180203
   )
   @Export("modelSizeY")
   int modelSizeY = 128;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -487926215
   )
   @Export("offsetX")
   int offsetX = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2096022607
   )
   @Export("offsetHeight")
   int offsetHeight = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 531318875
   )
   @Export("offsetY")
   int offsetY = 0;
   @ObfuscatedName("au")
   @Export("boolean2")
   public boolean boolean2 = false;
   @ObfuscatedName("ax")
   @Export("isSolid")
   boolean isSolid = false;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1688064541
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("aa")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -338512887
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1932503727
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -2074842335
   )
   @Export("ambientSoundId")
   public int ambientSoundId = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -595012719
   )
   @Export("int4")
   public int int4 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1860442499
   )
   @Export("int5")
   public int int5 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1597544155
   )
   @Export("int6")
   public int int6 = 0;
   @ObfuscatedName("ab")
   public int[] field3378;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   @Export("params")
   IterableNodeHashTable params;

   ObjectDefinition() {
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1177883713"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.int1 == -1) {
         this.int1 = 0;
         if (this.field3370 != null && (this.field3339 == null || this.field3339[0] == 10)) {
            this.int1 = 1;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.actions[var1] != null) {
               this.int1 = 1;
            }
         }
      }

      if (this.int3 == -1) {
         this.int3 = this.interactType != 0 ? 1 : 0;
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lky;I)V",
      garbageValue = "1500766173"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lky;IB)V",
      garbageValue = "0"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.field3370 != null && !ObjectDefinition_isLowDetail) {
               var1.offset += var3 * 3;
            } else {
               this.field3339 = new int[var3];
               this.field3370 = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.field3370[var4] = var1.readUnsignedShort();
                  this.field3339[var4] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 5) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.field3370 != null && !ObjectDefinition_isLowDetail) {
               var1.offset += var3 * 2;
            } else {
               this.field3339 = null;
               this.field3370 = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.field3370[var4] = var1.readUnsignedShort();
               }
            }
         }
      } else if (var2 == 14) {
         this.sizeX = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.sizeY = var1.readUnsignedByte();
      } else if (var2 == 17) {
         this.interactType = 0;
         this.boolean1 = false;
      } else if (var2 == 18) {
         this.boolean1 = false;
      } else if (var2 == 19) {
         this.int1 = var1.readUnsignedByte();
      } else if (var2 == 21) {
         this.clipType = 0;
      } else if (var2 == 22) {
         this.nonFlatShading = true;
      } else if (var2 == 23) {
         this.modelClipped = true;
      } else if (var2 == 24) {
         this.animationId = var1.readUnsignedShort();
         if (this.animationId == 65535) {
            this.animationId = -1;
         }
      } else if (var2 == 27) {
         this.interactType = 1;
      } else if (var2 == 28) {
         this.int2 = var1.readUnsignedByte();
      } else if (var2 == 29) {
         this.ambient = var1.readByte();
      } else if (var2 == 39) {
         this.contrast = var1.readByte() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
         if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.recolorFrom = new short[var3];
         this.recolorTo = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.recolorFrom[var4] = (short)var1.readUnsignedShort();
            this.recolorTo[var4] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.retextureFrom = new short[var3];
         this.retextureTo = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.retextureFrom[var4] = (short)var1.readUnsignedShort();
            this.retextureTo[var4] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 62) {
         this.isRotated = true;
      } else if (var2 == 64) {
         this.clipped = false;
      } else if (var2 == 65) {
         this.modelSizeX = var1.readUnsignedShort();
      } else if (var2 == 66) {
         this.modelHeight = var1.readUnsignedShort();
      } else if (var2 == 67) {
         this.modelSizeY = var1.readUnsignedShort();
      } else if (var2 == 68) {
         this.mapSceneId = var1.readUnsignedShort();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (var2 == 70) {
         this.offsetX = var1.readShort();
      } else if (var2 == 71) {
         this.offsetHeight = var1.readShort();
      } else if (var2 == 72) {
         this.offsetY = var1.readShort();
      } else if (var2 == 73) {
         this.boolean2 = true;
      } else if (var2 == 74) {
         this.isSolid = true;
      } else if (var2 == 75) {
         this.int3 = var1.readUnsignedByte();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.ambientSoundId = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.int5 = var1.readUnsignedShort();
            this.int6 = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
            var3 = var1.readUnsignedByte();
            this.field3378 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3378[var4] = var1.readUnsignedShort();
            }
         } else if (var2 == 81) {
            this.clipType = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.mapIconId = var1.readUnsignedShort();
         } else if (var2 == 249) {
            this.params = DynamicObject.readStringIntParameters(var1, this.params);
         }
      } else {
         this.transformVarbit = var1.readUnsignedShort();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformVarp = var1.readUnsignedShort();
         if (this.transformVarp == 65535) {
            this.transformVarp = -1;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-2065499599"
   )
   public final boolean method4505(int var1) {
      if (this.field3339 != null) {
         for(int var4 = 0; var4 < this.field3339.length; ++var4) {
            if (this.field3339[var4] == var1) {
               return ObjectDefinition_modelsArchive.tryLoadFile(this.field3370[var4] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field3370 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3370.length; ++var3) {
            var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.field3370[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1513696522"
   )
   public final boolean method4502() {
      if (this.field3370 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field3370.length; ++var2) {
            var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.field3370[var2] & '\uffff', 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(II[[IIIIB)Len;",
      garbageValue = "-26"
   )
   public final Entity method4504(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field3339 == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Object var9 = (Entity)ObjectDefinition_cachedEntities.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         if (!this.nonFlatShading) {
            var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         } else {
            var10.field1531 = (short)(this.ambient + 64);
            var10.field1556 = (short)(this.contrast + 768);
            var10.method2720();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ((ModelData)var9).method2708();
      }

      if (this.clipType * 65536 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method2709(var3, var4, var5, var6, true, this.clipType * 65536);
         }
      }

      return (Entity)var9;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II[[IIIII)Ldo;",
      garbageValue = "-1392170814"
   )
   @Export("getModel")
   public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field3339 == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var9, var7);
      }

      if (this.clipType * 65536 >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
      }

      return var9;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II[[IIIILij;II)Ldo;",
      garbageValue = "687830026"
   )
   @Export("getModelDynamic")
   public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
      long var9;
      if (this.field3339 == null) {
         var9 = (long)(var2 + (this.id << 10));
      } else {
         var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
      if (var11 == null) {
         ModelData var12 = this.getModelData(var1, var2);
         if (var12 == null) {
            return null;
         }

         var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var11, var9);
      }

      if (var7 == null && this.clipType * 65536 == -1) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.transformObjectModel(var11, var8, var2);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (this.clipType * 65536 >= 0) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
         }

         return var11;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)Ldq;",
      garbageValue = "976816708"
   )
   @Export("getModelData")
   final ModelData getModelData(int var1, int var2) {
      ModelData var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (this.field3339 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field3370 == null) {
            return null;
         }

         var4 = this.isRotated;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.field3370.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.field3370[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
            if (var3 == null) {
               var3 = ModelData.method2703(ObjectDefinition_modelsArchive, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method2718();
               }

               ObjectDefinition_cachedModelData.put(var3, (long)var7);
            }

            if (var5 > 1) {
               field3364[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(field3364, var5);
         }
      } else {
         int var9 = -1;

         for(var5 = 0; var5 < this.field3339.length; ++var5) {
            if (this.field3339[var5] == var1) {
               var9 = var5;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var5 = this.field3370[var9];
         boolean var10 = this.isRotated ^ var2 > 3;
         if (var10) {
            var5 += 65536;
         }

         var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
         if (var3 == null) {
            var3 = ModelData.method2703(ObjectDefinition_modelsArchive, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var10) {
               var3.method2718();
            }

            ObjectDefinition_cachedModelData.put(var3, (long)var5);
         }
      }

      if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var11;
      if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
      if (var1 == 4 && var2 > 3) {
         var8.method2714(256);
         var8.method2715(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var8.method2769();
      } else if (var2 == 2) {
         var8.method2712();
      } else if (var2 == 3) {
         var8.method2713();
      }

      if (this.recolorFrom != null) {
         for(var7 = 0; var7 < this.recolorFrom.length; ++var7) {
            var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
         }
      }

      if (this.retextureFrom != null) {
         for(var7 = 0; var7 < this.retextureFrom.length; ++var7) {
            var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
         }
      }

      if (var4) {
         var8.method2719(this.modelSizeX, this.modelHeight, this.modelSizeY);
      }

      if (var11) {
         var8.method2715(this.offsetX, this.offsetHeight, this.offsetY);
      }

      return var8;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Lik;",
      garbageValue = "-1654967679"
   )
   @Export("transform")
   public final ObjectDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class208.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? class215.getObjectDefinition(var2) : null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-802928447"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var4 = this.params;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.get((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.integer;
         }
      }

      return var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1652503760"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class227.method4041(this.params, var1, var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2084886497"
   )
   public boolean method4542() {
      if (this.transforms == null) {
         return this.ambientSoundId != -1 || this.field3378 != null;
      } else {
         for(int var1 = 0; var1 < this.transforms.length; ++var1) {
            if (this.transforms[var1] != -1) {
               ObjectDefinition var2 = class215.getObjectDefinition(this.transforms[var1]);
               if (var2.ambientSoundId != -1 || var2.field3378 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-669374888"
   )
   static int method4545(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }
}
