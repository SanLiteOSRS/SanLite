import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -927953281
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1101167455
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 762373049
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1924527011
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1003361881
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -632801265
	)
	int field846;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 912132477
	)
	int field847;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 426447249
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1111981983
	)
	int field841;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 997080131
	)
	int field854;
	@ObfuscatedName("ai")
	int[] field852;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1341306061
	)
	int field843;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 28

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1862821053"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 45
		ObjectComposition var2 = this.obj.transform(); // L: 46
		if (var2 != null) { // L: 47
			this.soundEffectId = var2.ambientSoundId; // L: 48
			this.field846 = var2.int7 * 16384; // L: 49
			this.field847 = var2.field2296 * 16384; // L: 50
			this.field841 = var2.int6; // L: 51
			this.field854 = var2.field2294; // L: 52
			this.field852 = var2.soundEffectIds; // L: 53
		} else {
			this.soundEffectId = -1; // L: 56
			this.field846 = 0; // L: 57
			this.field847 = 0; // L: 58
			this.field841 = 0; // L: 59
			this.field854 = 0; // L: 60
			this.field852 = null; // L: 61
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 63
			HealthBarUpdate.pcmStreamMixer.removeSubStream(this.stream1); // L: 64
			this.stream1 = null; // L: 65
		}

	} // L: 67

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)Lta;",
		garbageValue = "398370712"
	)
	static PlatformInfo method1919() {
		return class166.field1810; // L: 715
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1343112272"
	)
	static final void method1920(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8667
			if (Client.isLowDetail && var0 != class172.Client_plane) { // L: 8668
				return;
			}

			long var8 = 0L; // L: 8669
			boolean var10 = true; // L: 8670
			boolean var11 = false; // L: 8671
			boolean var12 = false; // L: 8672
			if (var1 == 0) { // L: 8673
				var8 = LoginType.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8674
				var8 = LoginType.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8675
				var8 = LoginType.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8676
				var8 = LoginType.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			ObjectComposition var14;
			if (var8 != 0L) { // L: 8677
				var13 = LoginType.scene.getObjectFlags(var0, var2, var3, var8); // L: 8678
				int var25 = class206.Entity_unpackID(var8); // L: 8679
				int var26 = var13 & 31; // L: 8680
				int var27 = var13 >> 6 & 3; // L: 8681
				var14 = MouseRecorder.getObjectDefinition(var25); // L: 8682
				if (var14 != null && var14.hasSound()) { // L: 8686
					int var17 = var14.sizeX; // L: 8687
					int var18 = var14.sizeY; // L: 8688
					if (var27 == 1 || var27 == 3) { // L: 8689
						var17 = var14.sizeY; // L: 8690
						var18 = var14.sizeX; // L: 8691
					}

					int var19 = (var17 + var2) * 128; // L: 8693
					int var20 = (var18 + var3) * 128; // L: 8694
					int var15 = var2 * 128; // L: 8695
					int var16 = var3 * 128; // L: 8696
					int var21 = var14.ambientSoundId; // L: 8697
					int var22 = var14.int7 * 16384; // L: 8698
					int var23 = var14.field2296 * 16384; // L: 8699
					if (var14.transforms != null) { // L: 8700
						ObjectComposition var24 = var14.transform(); // L: 8701
						if (var24 != null) { // L: 8702
							var21 = var24.ambientSoundId; // L: 8703
							var22 = var24.int7 * 16384; // L: 8704
							var23 = var24.field2296 * 16384; // L: 8705
						}
					}

					Object var10000 = null;

					for (ObjectSound var28 = (ObjectSound)objectSounds.last(); var28 != null; var28 = (ObjectSound)objectSounds.previous()) {
						if (var0 == var28.plane && var15 == var28.x * 16384 && var16 == var28.y * 16384 && var19 == var28.maxX * 16384 && var20 == var28.maxY * 16384 && var21 == var28.soundEffectId && var22 == var28.field846 && var23 == var28.field847) { // L: 8709
							if (var28.stream1 != null) { // L: 8710
								HealthBarUpdate.pcmStreamMixer.removeSubStream(var28.stream1); // L: 8711
								var28.stream1 = null; // L: 8712
							}

							if (var28.stream2 != null) { // L: 8714
								HealthBarUpdate.pcmStreamMixer.removeSubStream(var28.stream2); // L: 8715
								var28.stream2 = null; // L: 8716
							}

							var28.remove(); // L: 8718
							break; // L: 8719
						}

						var10000 = null; // L: 8708
					}
				}

				if (var1 == 0) { // L: 8724
					LoginType.scene.method4870(var0, var2, var3); // L: 8725
					if (var14.interactType != 0) { // L: 8726
						Client.collisionMaps[var0].method4358(var2, var3, var26, var27, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8728
					LoginType.scene.method4724(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8729
					LoginType.scene.removeGameObject(var0, var2, var3); // L: 8730
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8731
						return;
					}

					if (var14.interactType != 0) { // L: 8732
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var27, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8734
					LoginType.scene.method4819(var0, var2, var3); // L: 8735
					if (var14.interactType == 1) { // L: 8736
						Client.collisionMaps[var0].method4361(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8739
				var13 = var0; // L: 8740
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8741
					var13 = var0 + 1;
				}

				ServerPacket.method5935(var0, var13, var2, var3, var4, var5, var6, var7, LoginType.scene, Client.collisionMaps[var0]); // L: 8742
				var14 = MouseRecorder.getObjectDefinition(var4); // L: 8743
				if (var14 != null && var14.hasSound()) { // L: 8744
					class379.method7069(var13, var2, var3, var14, var5); // L: 8745
				}
			}
		}

	} // L: 8749

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method1921(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12420
		NPC.clientPreferences.method2541(var0); // L: 12421
	} // L: 12422
}
