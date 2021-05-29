import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("b")
public class class7 extends class16 {
	@ObfuscatedName("v")
	String field64;
	@ObfuscatedName("n")
	byte field65;
	@ObfuscatedName("f")
	byte field66;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		this.field64 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field64 != null) {
			var1.readUnsignedByte();
			this.field65 = var1.readByte();
			this.field66 = var1.readByte();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(class3 var1) {
		var1.field31 = this.field64;
		if (this.field64 != null) {
			var1.field32 = this.field65;
			var1.field26 = this.field66;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Loh;",
		garbageValue = "-1133094232"
	)
	static SpritePixels method76(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1498995212"
	)
	static int method74(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = SpotAnimationDefinition.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					CollisionMap.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ObjectComposition.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class44.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					Interpreter.Interpreter_stringStackSize -= 2;
					--class44.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--Interpreter.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					ObjectComposition.clientPreferences.windowMode = var3;
					TileItem.savePreferences();
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		class265.method4848();
		class135.method2601();
		class24.method259();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		SceneTilePaint.method4259();
		SecureRandomCallable.method2055();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		HealthBarUpdate.method2197();
		VarpDefinition.VarpDefinition_cached.clear();
		GrandExchangeOfferOwnWorldComparator.field634.method6433();
		ViewportMouse.HitSplatDefinition_cachedSprites.method6433();
		UserComparator6.method2485();
		KeyHandler.method378();
		StructComposition.StructDefinition_cached.clear();
		FileSystem.method2548();
		WorldMapElement.Widget_cachedSprites.clear();
		ChatChannel.method2015();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		Widget.field3015.clear();
		Widget.archive0.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		NetCache.archive3.clearFiles();
		class27.archive4.clearFiles();
		class3.archive5.clearFiles();
		class32.field242.clearFiles();
		class247.archive7.clearFiles();
		UrlRequest.archive6.clearFiles();
		Decimator.archive9.clearFiles();
		GrandExchangeOfferAgeComparator.archive8.clearFiles();
		CollisionMap.field1903.clearFiles();
		SoundCache.archive10.clearFiles();
		WorldMapManager.archive11.clearFiles();
		UserComparator5.archive12.clearFiles();
		AbstractSocket.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class159.method3192(2);
		Client.currentTrackGroupId = -1;
		Client.field881 = false;
		WorldMapSprite.method3631();
		class12.updateGameState(10);
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Lcy;II)V",
		garbageValue = "-354829421"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1265 >= Client.cycle) {
			int var2 = Math.max(1, var0.field1265 - Client.cycle);
			int var3 = var0.field1278 * 128 + var0.field1239 * 64;
			int var4 = var0.field1280 * 128 + var0.field1239 * 64;
			var0.x += (var3 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1294 = 0;
			var0.orientation = var0.field1284;
		} else if (var0.field1283 >= Client.cycle) {
			class2.method21(var0);
		} else {
			InterfaceParent.method2083(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1265 = 0;
			var0.field1283 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1239 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1239 * 64;
			var0.method2171();
		}

		if (class93.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1265 = 0;
			var0.field1283 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1239 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1239 * 64;
			var0.method2171();
		}

		Strings.method4850(var0);
		class44.method449(var0);
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method68() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
			int var2 = Client.menuOpcodes[var0];
			boolean var1 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30;
			if (var1) {
				if (var0 < Client.menuOptionsCount - 1) {
					for (int var3 = var0; var3 < Client.menuOptionsCount - 1; ++var3) {
						Client.menuActions[var3] = Client.menuActions[var3 + 1];
						Client.menuTargets[var3] = Client.menuTargets[var3 + 1];
						Client.menuOpcodes[var3] = Client.menuOpcodes[var3 + 1];
						Client.menuIdentifiers[var3] = Client.menuIdentifiers[var3 + 1];
						Client.menuArguments1[var3] = Client.menuArguments1[var3 + 1];
						Client.menuArguments2[var3] = Client.menuArguments2[var3 + 1];
						Client.menuShiftClick[var3] = Client.menuShiftClick[var3 + 1];
					}
				}

				--var0;
				--Client.menuOptionsCount;
			}
		}

		class15.method196();
	}
}
