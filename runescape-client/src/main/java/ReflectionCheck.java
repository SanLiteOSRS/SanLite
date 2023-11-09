import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 827423307
	)
	static int field279;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1102112513
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1398282557
	)
	@Export("size")
	int size;
	@ObfuscatedName("s")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("z")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("j")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("i")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("n")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lel;",
		garbageValue = "-10"
	)
	static class134 method695(int var0) {
		class134[] var1 = new class134[]{class134.field1621, class134.field1607, class134.field1608, class134.field1609, class134.field1610, class134.field1617, class134.field1612, class134.field1611, class134.field1614}; // L: 108
		class134 var2 = (class134)class4.findEnumerated(var1, var0); // L: 110
		if (var2 == null) { // L: 111
			var2 = class134.field1614;
		}

		return var2; // L: 112
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1054258097"
	)
	static void method696(int var0) {
		if (var0 != Login.loginIndex) { // L: 1881
			Login.loginIndex = var0; // L: 1882
		}
	} // L: 1883

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Llm;",
		garbageValue = "1953973237"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2244
		if (JagexCache.JagexCache_dat2File != null) { // L: 2245
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class18.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class12.masterDisk, var0, var1, var2, var3, var4); // L: 2246
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "17"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class123.method3032(); // L: 12768

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12770
			if (var1.obj != null) { // L: 12771
				var1.set();
			}
		}

		int var3 = TaskHandler.VarpDefinition_get(var0).type; // L: 12774
		if (var3 != 0) { // L: 12775
			int var2 = Varps.Varps_main[var0]; // L: 12776
			if (var3 == 1) { // L: 12777
				if (var2 == 1) { // L: 12778
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12779
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12780
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12782
					PacketWriter.clientPreferences.method2583(0.9D); // L: 12784
				}

				if (var2 == 2) { // L: 12786
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 12787
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 12788
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12790
					PacketWriter.clientPreferences.method2583(0.8D); // L: 12792
				}

				if (var2 == 3) { // L: 12794
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 12795
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 12796
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12798
					PacketWriter.clientPreferences.method2583(0.7D); // L: 12800
				}

				if (var2 == 4) { // L: 12802
					Actor.method2440(0.6D);
				}
			}

			if (var3 == 3) { // L: 12804
				if (var2 == 0) { // L: 12805
					Player.method2369(255);
				}

				if (var2 == 1) { // L: 12806
					Player.method2369(192);
				}

				if (var2 == 2) { // L: 12807
					Player.method2369(128);
				}

				if (var2 == 3) { // L: 12808
					Player.method2369(64);
				}

				if (var2 == 4) { // L: 12809
					Player.method2369(0);
				}
			}

			if (var3 == 4) { // L: 12811
				if (var2 == 0) { // L: 12812
					class203.method4128(127);
				}

				if (var2 == 1) { // L: 12813
					class203.method4128(96);
				}

				if (var2 == 2) { // L: 12814
					class203.method4128(64);
				}

				if (var2 == 3) { // L: 12815
					class203.method4128(32);
				}

				if (var2 == 4) { // L: 12816
					class203.method4128(0);
				}
			}

			if (var3 == 5) { // L: 12818
				Client.field648 = var2 == 1;
			}

			if (var3 == 6) { // L: 12819
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 12820
				Client.field679 = var2;
			}

			if (var3 == 10) { // L: 12821
				if (var2 == 0) { // L: 12822
					NPC.method2678(127);
				}

				if (var2 == 1) { // L: 12823
					NPC.method2678(96);
				}

				if (var2 == 2) { // L: 12824
					NPC.method2678(64);
				}

				if (var2 == 3) { // L: 12825
					NPC.method2678(32);
				}

				if (var2 == 4) { // L: 12826
					NPC.method2678(0);
				}
			}

			if (var3 == 17) { // L: 12828
				Client.followerIndex = var2 & 65535; // L: 12829
			}

			if (var3 == 18) { // L: 12831
				Client.playerAttackOption = (AttackOption)class4.findEnumerated(WorldMapArea.method5012(), var2); // L: 12832
				if (Client.playerAttackOption == null) { // L: 12833
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 12835
				if (var2 == -1) { // L: 12836
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12837
				}
			}

			if (var3 == 22) { // L: 12839
				Client.npcAttackOption = (AttackOption)class4.findEnumerated(WorldMapArea.method5012(), var2); // L: 12840
				if (Client.npcAttackOption == null) { // L: 12841
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12843
}
