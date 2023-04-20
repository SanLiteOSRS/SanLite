import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class149 extends class139 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 801047195
	)
	int field1705;
	@ObfuscatedName("an")
	String field1704;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class149(class142 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1705 = var1.readInt(); // L: 326
		this.field1704 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3318(this.field1705, this.field1704); // L: 331
	} // L: 332

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-200557618"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 150
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1290487561"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class31.scene.getWallObjectTag(var0, var1, var2); // L: 5889
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 5890
			var7 = class31.scene.getObjectFlags(var0, var1, var2, var5); // L: 5891
			var8 = var7 >> 6 & 3; // L: 5892
			var9 = var7 & 31; // L: 5893
			var10 = var3; // L: 5894
			if (class173.method3588(var5)) { // L: 5895
				var10 = var4;
			}

			int[] var11 = UrlRequester.sceneMinimapSprite.pixels; // L: 5896
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5897
			var13 = InterfaceParent.Entity_unpackID(var5); // L: 5898
			ObjectComposition var14 = class144.getObjectDefinition(var13); // L: 5899
			if (var14.mapSceneId != -1) { // L: 5900
				IndexedSprite var15 = class333.mapSceneSprites[var14.mapSceneId]; // L: 5901
				if (var15 != null) { // L: 5902
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5903
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5904
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 5905
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5909
					if (var8 == 0) { // L: 5910
						var11[var12] = var10; // L: 5911
						var11[var12 + 512] = var10; // L: 5912
						var11[var12 + 1024] = var10; // L: 5913
						var11[var12 + 1536] = var10; // L: 5914
					} else if (var8 == 1) { // L: 5916
						var11[var12] = var10; // L: 5917
						var11[var12 + 1] = var10; // L: 5918
						var11[var12 + 2] = var10; // L: 5919
						var11[var12 + 3] = var10; // L: 5920
					} else if (var8 == 2) { // L: 5922
						var11[var12 + 3] = var10; // L: 5923
						var11[var12 + 512 + 3] = var10; // L: 5924
						var11[var12 + 1024 + 3] = var10; // L: 5925
						var11[var12 + 1536 + 3] = var10; // L: 5926
					} else if (var8 == 3) { // L: 5928
						var11[var12 + 1536] = var10; // L: 5929
						var11[var12 + 1536 + 1] = var10; // L: 5930
						var11[var12 + 1536 + 2] = var10; // L: 5931
						var11[var12 + 1536 + 3] = var10; // L: 5932
					}
				}

				if (var9 == 3) { // L: 5935
					if (var8 == 0) { // L: 5936
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5937
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5938
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5939
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5941
					if (var8 == 3) { // L: 5942
						var11[var12] = var10; // L: 5943
						var11[var12 + 512] = var10; // L: 5944
						var11[var12 + 1024] = var10; // L: 5945
						var11[var12 + 1536] = var10; // L: 5946
					} else if (var8 == 0) { // L: 5948
						var11[var12] = var10; // L: 5949
						var11[var12 + 1] = var10; // L: 5950
						var11[var12 + 2] = var10; // L: 5951
						var11[var12 + 3] = var10; // L: 5952
					} else if (var8 == 1) { // L: 5954
						var11[var12 + 3] = var10; // L: 5955
						var11[var12 + 512 + 3] = var10; // L: 5956
						var11[var12 + 1024 + 3] = var10; // L: 5957
						var11[var12 + 1536 + 3] = var10; // L: 5958
					} else if (var8 == 2) { // L: 5960
						var11[var12 + 1536] = var10; // L: 5961
						var11[var12 + 1536 + 1] = var10; // L: 5962
						var11[var12 + 1536 + 2] = var10; // L: 5963
						var11[var12 + 1536 + 3] = var10; // L: 5964
					}
				}
			}
		}

		var5 = class31.scene.getGameObjectTag(var0, var1, var2); // L: 5969
		if (var5 != 0L) { // L: 5970
			var7 = class31.scene.getObjectFlags(var0, var1, var2, var5); // L: 5971
			var8 = var7 >> 6 & 3; // L: 5972
			var9 = var7 & 31; // L: 5973
			var10 = InterfaceParent.Entity_unpackID(var5); // L: 5974
			ObjectComposition var24 = class144.getObjectDefinition(var10); // L: 5975
			int var19;
			if (var24.mapSceneId != -1) { // L: 5976
				IndexedSprite var20 = class333.mapSceneSprites[var24.mapSceneId]; // L: 5977
				if (var20 != null) { // L: 5978
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5979
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5980
					var20.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48); // L: 5981
				}
			} else if (var9 == 9) { // L: 5984
				var12 = 15658734; // L: 5985
				if (class173.method3588(var5)) { // L: 5986
					var12 = 15597568;
				}

				int[] var18 = UrlRequester.sceneMinimapSprite.pixels; // L: 5987
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5988
				if (var8 != 0 && var8 != 2) { // L: 5989
					var18[var19] = var12; // L: 5996
					var18[var19 + 1 + 512] = var12; // L: 5997
					var18[var19 + 1024 + 2] = var12; // L: 5998
					var18[var19 + 1536 + 3] = var12; // L: 5999
				} else {
					var18[var19 + 1536] = var12; // L: 5990
					var18[var19 + 1 + 1024] = var12; // L: 5991
					var18[var19 + 512 + 2] = var12; // L: 5992
					var18[var19 + 3] = var12; // L: 5993
				}
			}
		}

		var5 = class31.scene.getGroundObjectTag(var0, var1, var2); // L: 6003
		if (0L != var5) { // L: 6004
			var7 = InterfaceParent.Entity_unpackID(var5); // L: 6005
			ObjectComposition var21 = class144.getObjectDefinition(var7); // L: 6006
			if (var21.mapSceneId != -1) { // L: 6007
				IndexedSprite var22 = class333.mapSceneSprites[var21.mapSceneId]; // L: 6008
				if (var22 != null) { // L: 6009
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6010
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6011
					var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 6012
				}
			}
		}

	} // L: 6016
}
