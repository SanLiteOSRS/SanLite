import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class119 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1488;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1490;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1468;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1471;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1472;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1473;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1474;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1475;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1476;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1477;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1478;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1482;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1479;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1481;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1470;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1483;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static final class119 field1480;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("mouseWheel")
	static class158 mouseWheel;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -752072491
	)
	final int field1485;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1075378133
	)
	final int field1486;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2147335737
	)
	final int field1487;

	static {
		field1488 = new class119(0, 0, (String)null, -1, -1); // L: 42
		field1490 = new class119(1, 1, (String)null, 0, 2); // L: 43
		field1468 = new class119(2, 2, (String)null, 1, 2); // L: 44
		field1471 = new class119(3, 3, (String)null, 2, 2); // L: 45
		field1472 = new class119(4, 4, (String)null, 3, 1); // L: 46
		field1473 = new class119(5, 5, (String)null, 4, 1); // L: 47
		field1474 = new class119(6, 6, (String)null, 5, 1); // L: 48
		field1475 = new class119(7, 7, (String)null, 6, 3); // L: 49
		field1476 = new class119(8, 8, (String)null, 7, 3); // L: 50
		field1477 = new class119(9, 9, (String)null, 8, 3); // L: 51
		field1478 = new class119(10, 10, (String)null, 0, 7); // L: 52
		field1482 = new class119(11, 11, (String)null, 1, 7); // L: 53
		field1479 = new class119(12, 12, (String)null, 2, 7); // L: 54
		field1481 = new class119(13, 13, (String)null, 3, 7); // L: 55
		field1470 = new class119(14, 14, (String)null, 4, 7); // L: 56
		field1483 = new class119(15, 15, (String)null, 5, 7); // L: 57
		field1480 = new class119(16, 16, (String)null, 0, 5); // L: 58
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1485 = var1; // L: 68
		this.field1486 = var2; // L: 69
		this.field1487 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1486;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-404131772"
	)
	int method2723() {
		return this.field1487;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Li;I)Lv;",
		garbageValue = "1989632710"
	)
	public static class3 method2732(class6 var0) {
		switch(var0.field20) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfj;",
		garbageValue = "-2034783467"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 70
		if (var1 != null) { // L: 71
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 72
			var1 = new NPCComposition(); // L: 73
			var1.id = var0; // L: 74
			if (var2 != null) { // L: 75
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 76
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 77
			return var1; // L: 78
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1896748538"
	)
	static final int method2724() {
		return ViewportMouse.ViewportMouse_y; // L: 94
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1562460171"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class12.scene.getWallObjectTag(var0, var1, var2); // L: 5842
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (var5 != 0L) { // L: 5843
			var7 = class12.scene.getObjectFlags(var0, var1, var2, var5); // L: 5844
			var8 = var7 >> 6 & 3; // L: 5845
			var9 = var7 & 31; // L: 5846
			var10 = var3; // L: 5847
			boolean var12 = 0L != var5; // L: 5850
			if (var12) { // L: 5851
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 5854
				var12 = !var13; // L: 5856
			}

			if (var12) { // L: 5860
				var10 = var4;
			}

			int[] var19 = class1.sceneMinimapSprite.pixels; // L: 5861
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5862
			var14 = WorldMapSection2.Entity_unpackID(var5); // L: 5863
			ObjectComposition var15 = FileSystem.getObjectDefinition(var14); // L: 5864
			if (var15.mapSceneId != -1) { // L: 5865
				IndexedSprite var16 = class120.mapSceneSprites[var15.mapSceneId]; // L: 5866
				if (var16 != null) { // L: 5867
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5868
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5869
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 5870
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5874
					if (var8 == 0) { // L: 5875
						var19[var26] = var10; // L: 5876
						var19[var26 + 512] = var10; // L: 5877
						var19[var26 + 1024] = var10; // L: 5878
						var19[var26 + 1536] = var10; // L: 5879
					} else if (var8 == 1) { // L: 5881
						var19[var26] = var10; // L: 5882
						var19[var26 + 1] = var10; // L: 5883
						var19[var26 + 2] = var10; // L: 5884
						var19[var26 + 3] = var10; // L: 5885
					} else if (var8 == 2) { // L: 5887
						var19[var26 + 3] = var10; // L: 5888
						var19[var26 + 512 + 3] = var10; // L: 5889
						var19[var26 + 1024 + 3] = var10; // L: 5890
						var19[var26 + 1536 + 3] = var10; // L: 5891
					} else if (var8 == 3) { // L: 5893
						var19[var26 + 1536] = var10; // L: 5894
						var19[var26 + 1536 + 1] = var10; // L: 5895
						var19[var26 + 1536 + 2] = var10; // L: 5896
						var19[var26 + 1536 + 3] = var10; // L: 5897
					}
				}

				if (var9 == 3) { // L: 5900
					if (var8 == 0) { // L: 5901
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 5902
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 5903
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5904
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5906
					if (var8 == 3) { // L: 5907
						var19[var26] = var10; // L: 5908
						var19[var26 + 512] = var10; // L: 5909
						var19[var26 + 1024] = var10; // L: 5910
						var19[var26 + 1536] = var10; // L: 5911
					} else if (var8 == 0) { // L: 5913
						var19[var26] = var10; // L: 5914
						var19[var26 + 1] = var10; // L: 5915
						var19[var26 + 2] = var10; // L: 5916
						var19[var26 + 3] = var10; // L: 5917
					} else if (var8 == 1) { // L: 5919
						var19[var26 + 3] = var10; // L: 5920
						var19[var26 + 512 + 3] = var10; // L: 5921
						var19[var26 + 1024 + 3] = var10; // L: 5922
						var19[var26 + 1536 + 3] = var10; // L: 5923
					} else if (var8 == 2) { // L: 5925
						var19[var26 + 1536] = var10; // L: 5926
						var19[var26 + 1536 + 1] = var10; // L: 5927
						var19[var26 + 1536 + 2] = var10; // L: 5928
						var19[var26 + 1536 + 3] = var10; // L: 5929
					}
				}
			}
		}

		var5 = class12.scene.getGameObjectTag(var0, var1, var2); // L: 5934
		if (0L != var5) { // L: 5935
			var7 = class12.scene.getObjectFlags(var0, var1, var2, var5); // L: 5936
			var8 = var7 >> 6 & 3; // L: 5937
			var9 = var7 & 31; // L: 5938
			var10 = WorldMapSection2.Entity_unpackID(var5); // L: 5939
			ObjectComposition var20 = FileSystem.getObjectDefinition(var10); // L: 5940
			if (var20.mapSceneId != -1) { // L: 5941
				IndexedSprite var28 = class120.mapSceneSprites[var20.mapSceneId]; // L: 5942
				if (var28 != null) { // L: 5943
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 5944
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 5945
					var28.drawAt(var1 * 4 + var26 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48); // L: 5946
				}
			} else if (var9 == 9) { // L: 5949
				int var25 = 15658734; // L: 5950
				boolean var27 = var5 != 0L; // L: 5953
				if (var27) { // L: 5954
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 5957
					var27 = !var21; // L: 5959
				}

				if (var27) { // L: 5963
					var25 = 15597568;
				}

				int[] var22 = class1.sceneMinimapSprite.pixels; // L: 5964
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5965
				if (var8 != 0 && var8 != 2) { // L: 5966
					var22[var29] = var25; // L: 5973
					var22[var29 + 1 + 512] = var25; // L: 5974
					var22[var29 + 1024 + 2] = var25; // L: 5975
					var22[var29 + 1536 + 3] = var25; // L: 5976
				} else {
					var22[var29 + 1536] = var25; // L: 5967
					var22[var29 + 1 + 1024] = var25; // L: 5968
					var22[var29 + 512 + 2] = var25; // L: 5969
					var22[var29 + 3] = var25; // L: 5970
				}
			}
		}

		var5 = class12.scene.getGroundObjectTag(var0, var1, var2); // L: 5980
		if (var5 != 0L) { // L: 5981
			var7 = WorldMapSection2.Entity_unpackID(var5); // L: 5982
			ObjectComposition var23 = FileSystem.getObjectDefinition(var7); // L: 5983
			if (var23.mapSceneId != -1) { // L: 5984
				IndexedSprite var24 = class120.mapSceneSprites[var23.mapSceneId]; // L: 5985
				if (var24 != null) { // L: 5986
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5987
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5988
					var24.drawAt(var10 + var1 * 4 + 48, var11 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 5989
				}
			}
		}

	} // L: 5993
}
