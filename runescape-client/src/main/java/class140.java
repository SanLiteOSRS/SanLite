import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class140 extends class135 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -584515193
	)
	int field1625;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1635278101
	)
	int field1622;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1633329395
	)
	int field1623;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1944544005
	)
	int field1624;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class140(class138 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1625 = var1.readInt(); // L: 292
		this.field1624 = var1.readInt(); // L: 293
		this.field1622 = var1.readUnsignedByte(); // L: 294
		this.field1623 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3090(this.field1625, this.field1624, this.field1622, this.field1623); // L: 299
	} // L: 300

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V",
		garbageValue = "-1812147921"
	)
	static final void method3021(Actor var0, int var1) {
		Skeleton.worldToScreen(var0.x, var0.y, var1); // L: 5506
	} // L: 5507

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-10"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class139.scene.getWallObjectTag(var0, var1, var2); // L: 6034
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 6035
			var7 = class139.scene.getObjectFlags(var0, var1, var2, var5); // L: 6036
			var8 = var7 >> 6 & 3; // L: 6037
			var9 = var7 & 31; // L: 6038
			var10 = var3; // L: 6039
			if (AbstractByteArrayCopier.method6222(var5)) { // L: 6040
				var10 = var4;
			}

			int[] var11 = Calendar.sceneMinimapSprite.pixels; // L: 6041
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6042
			var13 = AttackOption.Entity_unpackID(var5); // L: 6043
			ObjectComposition var14 = InterfaceParent.getObjectDefinition(var13); // L: 6044
			if (var14.mapSceneId != -1) { // L: 6045
				IndexedSprite var15 = HealthBar.mapSceneSprites[var14.mapSceneId]; // L: 6046
				if (var15 != null) { // L: 6047
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6048
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6049
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 6050
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6054
					if (var8 == 0) { // L: 6055
						var11[var12] = var10; // L: 6056
						var11[var12 + 512] = var10; // L: 6057
						var11[var12 + 1024] = var10; // L: 6058
						var11[var12 + 1536] = var10; // L: 6059
					} else if (var8 == 1) { // L: 6061
						var11[var12] = var10; // L: 6062
						var11[var12 + 1] = var10; // L: 6063
						var11[var12 + 2] = var10; // L: 6064
						var11[var12 + 3] = var10; // L: 6065
					} else if (var8 == 2) { // L: 6067
						var11[var12 + 3] = var10; // L: 6068
						var11[var12 + 512 + 3] = var10; // L: 6069
						var11[var12 + 1024 + 3] = var10; // L: 6070
						var11[var12 + 1536 + 3] = var10; // L: 6071
					} else if (var8 == 3) { // L: 6073
						var11[var12 + 1536] = var10; // L: 6074
						var11[var12 + 1536 + 1] = var10; // L: 6075
						var11[var12 + 1536 + 2] = var10; // L: 6076
						var11[var12 + 1536 + 3] = var10; // L: 6077
					}
				}

				if (var9 == 3) { // L: 6080
					if (var8 == 0) { // L: 6081
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6082
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6083
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6084
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6086
					if (var8 == 3) { // L: 6087
						var11[var12] = var10; // L: 6088
						var11[var12 + 512] = var10; // L: 6089
						var11[var12 + 1024] = var10; // L: 6090
						var11[var12 + 1536] = var10; // L: 6091
					} else if (var8 == 0) { // L: 6093
						var11[var12] = var10; // L: 6094
						var11[var12 + 1] = var10; // L: 6095
						var11[var12 + 2] = var10; // L: 6096
						var11[var12 + 3] = var10; // L: 6097
					} else if (var8 == 1) { // L: 6099
						var11[var12 + 3] = var10; // L: 6100
						var11[var12 + 512 + 3] = var10; // L: 6101
						var11[var12 + 1024 + 3] = var10; // L: 6102
						var11[var12 + 1536 + 3] = var10; // L: 6103
					} else if (var8 == 2) { // L: 6105
						var11[var12 + 1536] = var10; // L: 6106
						var11[var12 + 1536 + 1] = var10; // L: 6107
						var11[var12 + 1536 + 2] = var10; // L: 6108
						var11[var12 + 1536 + 3] = var10; // L: 6109
					}
				}
			}
		}

		var5 = class139.scene.getGameObjectTag(var0, var1, var2); // L: 6114
		if (0L != var5) { // L: 6115
			var7 = class139.scene.getObjectFlags(var0, var1, var2, var5); // L: 6116
			var8 = var7 >> 6 & 3; // L: 6117
			var9 = var7 & 31; // L: 6118
			var10 = AttackOption.Entity_unpackID(var5); // L: 6119
			ObjectComposition var24 = InterfaceParent.getObjectDefinition(var10); // L: 6120
			int var19;
			if (var24.mapSceneId != -1) { // L: 6121
				IndexedSprite var20 = HealthBar.mapSceneSprites[var24.mapSceneId]; // L: 6122
				if (var20 != null) { // L: 6123
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6124
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6125
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6126
				}
			} else if (var9 == 9) { // L: 6129
				var12 = 15658734; // L: 6130
				if (AbstractByteArrayCopier.method6222(var5)) { // L: 6131
					var12 = 15597568;
				}

				int[] var18 = Calendar.sceneMinimapSprite.pixels; // L: 6132
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6133
				if (var8 != 0 && var8 != 2) { // L: 6134
					var18[var19] = var12; // L: 6141
					var18[var19 + 1 + 512] = var12; // L: 6142
					var18[var19 + 1024 + 2] = var12; // L: 6143
					var18[var19 + 1536 + 3] = var12; // L: 6144
				} else {
					var18[var19 + 1536] = var12; // L: 6135
					var18[var19 + 1 + 1024] = var12; // L: 6136
					var18[var19 + 512 + 2] = var12; // L: 6137
					var18[var19 + 3] = var12; // L: 6138
				}
			}
		}

		var5 = class139.scene.getGroundObjectTag(var0, var1, var2); // L: 6148
		if (0L != var5) { // L: 6149
			var7 = AttackOption.Entity_unpackID(var5); // L: 6150
			ObjectComposition var21 = InterfaceParent.getObjectDefinition(var7); // L: 6151
			if (var21.mapSceneId != -1) { // L: 6152
				IndexedSprite var22 = HealthBar.mapSceneSprites[var21.mapSceneId]; // L: 6153
				if (var22 != null) { // L: 6154
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6155
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6156
					var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 6157
				}
			}
		}

	} // L: 6161
}
