import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class23 extends class14 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1984998217
	)
	int field181;
	@ObfuscatedName("o")
	byte field177;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field181 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field181 = var1.readUnsignedShort();
		this.field177 = var1.readByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method151(this.field181, this.field177);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(S)[Lim;",
		garbageValue = "128"
	)
	static GameBuild[] method344() {
		return new GameBuild[]{GameBuild.RC, GameBuild.WIP, GameBuild.LIVE, GameBuild.BUILDLIVE};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1702727810"
	)
	public static String method346(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var3 = var0[var1];
			return var3 == null ? "null" : var3.toString();
		} else {
			int var8 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var8; ++var5) {
				CharSequence var6 = var0[var5];
				if (var6 == null) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var8; ++var10) {
				CharSequence var7 = var0[var10];
				if (var7 == null) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Lko;",
		garbageValue = "467891308"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Widget.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!class21.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				var1.groundActions = null;
				var1.inventoryActions = null;
				var1.shiftClickIndex = -1;
				var1.team = 0;
				if (var1.params != null) {
					boolean var3 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamDefinition var5 = UserComparator3.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var3 = true;
						}
					}

					if (!var3) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("o")
	static boolean method341(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1393325468"
	)
	static int method345() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field740;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "41"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class16.method259();
		WorldMapArea.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		PacketWriter.method2368(2);
		Client.currentTrackGroupId = -1;
		Client.field842 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				Huffman.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				Huffman.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		class20.updateGameState(10);
	}
}
