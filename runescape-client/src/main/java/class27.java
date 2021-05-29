import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class27 extends class14 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 2057684511
	)
	static int field231;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 718732187
	)
	int field227;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field227 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field227 = var1.readUnsignedShort();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method109(this.field227);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "-1597980436"
	)
	public static void method277(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1927970682"
	)
	static int method280(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					++Interpreter.Interpreter_stringStackSize;
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
						NPCComposition var4 = StructComposition.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					++class44.Interpreter_intStackSize;
					return 1;
				}
			} else {
				--class44.Interpreter_intStackSize;
				return 1;
			}
		} else {
			class44.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-43"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field881) {
			class124.midiPcmStream.clear();
			class232.musicPlayerStatus = 1;
			ModelData0.musicTrackArchive = null;
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && ObjectComposition.clientPreferences.musicVolume != 0 && !Client.field881) {
			Canvas.playMusicTrack(2, UrlRequest.archive6, var0, 0, ObjectComposition.clientPreferences.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-630332055"
	)
	static final void method283(int var0, int var1, int var2, int var3) {
		Client.field755 = 0;
		int var4 = VertexNormal.baseX * 64 + (class93.localPlayer.x >> 7);
		int var5 = SoundSystem.baseY * 64 + (class93.localPlayer.y >> 7);
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field755 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field755 = 1;
		}

		if (Client.field755 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field755 = 0;
		}

	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "([Lio;IIIZI)V",
		garbageValue = "2021358420"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				Clock.alignWidgetSize(var6, var2, var3, var4);
				class24.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class313.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
