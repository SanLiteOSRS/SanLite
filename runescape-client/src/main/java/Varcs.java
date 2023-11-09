import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ac")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("aw")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ay")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ap")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 72068385225587433L
	)
	long field1401;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class342.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3721(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class342.archive2.method6714(15)) { // L: 50
			var2 = class342.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1487778934"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-402778182"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1782472472"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1845476829"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "170677161"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1778169806"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ltw;",
		garbageValue = "-2020702587"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class106.getPreferencesFile("2", class6.field15.name, var1); // L: 104
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1152430267"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += Player.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var23 = new Buffer(var2); // L: 125
			var23.writeByte(2); // L: 126
			var23.writeShort(var3); // L: 127
			Iterator var24 = this.map.entrySet().iterator(); // L: 128

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 129
				int var13 = (Integer)var12.getKey(); // L: 131
				if (this.intsPersistence[var13]) { // L: 132
					var23.writeShort(var13); // L: 133
					Object var8 = var12.getValue(); // L: 134
					class502 var9 = class502.method8891(var8.getClass()); // L: 135
					var23.writeByte(var9.field5030); // L: 136
					class502.method8892(var8, var23); // L: 137
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 141
		} catch (Exception var21) { // L: 143
		} finally {
			try {
				var1.close(); // L: 146
			} catch (Exception var20) { // L: 148
			}

		}

		this.unwrittenChanges = false; // L: 150
		this.field1401 = AttackOption.method2714(); // L: 151
	} // L: 152

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "519505655"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 155

		try {
			byte[] var2 = new byte[(int)var1.length()]; // L: 157

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 158 159 162
				var4 = var1.read(var2, var3, var2.length - var3); // L: 160
				if (var4 == -1) { // L: 161
					throw new EOFException();
				}
			}

			Buffer var14 = new Buffer(var2); // L: 164
			if (var14.array.length - var14.offset < 1) {
				return; // L: 165
			}

			int var15 = var14.readUnsignedByte(); // L: 166
			if (var15 < 0 || var15 > 2) {
				return; // L: 167
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) { // L: 168
				var16 = var14.readUnsignedShort(); // L: 169

				for (var7 = 0; var7 < var16; ++var7) { // L: 170
					var8 = var14.readUnsignedShort(); // L: 171
					var9 = var14.readUnsignedByte(); // L: 172
					class502 var10 = (class502)class93.findEnumerated(class502.method8908(), var9); // L: 173
					Object var11 = var10.method8895(var14); // L: 174
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 175
						this.map.put(var8, var11); // L: 176
					}
				}
			} else {
				var16 = var14.readUnsignedShort(); // L: 181

				for (var7 = 0; var7 < var16; ++var7) { // L: 182
					var8 = var14.readUnsignedShort(); // L: 183
					var9 = var14.readInt(); // L: 184
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 185
						this.map.put(var8, var9); // L: 186
					}
				}

				var7 = var14.readUnsignedShort(); // L: 189

				for (var8 = 0; var8 < var7; ++var8) { // L: 190
					var14.readUnsignedShort(); // L: 191
					var14.readStringCp1252NullTerminated(); // L: 192
				}
			}
		} catch (Exception var25) { // L: 196
		} finally {
			try {
				var1.close(); // L: 199
			} catch (Exception var24) { // L: 201
			}

		}

		this.unwrittenChanges = false; // L: 203
	} // L: 204

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1401 < AttackOption.method2714() - 60000L) { // L: 207
			this.write(); // L: 208
		}

	} // L: 210

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1748556745"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 213
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lns;",
		garbageValue = "1391911499"
	)
	public static class352[] method2785() {
		return new class352[]{class352.field4205, class352.field4204, class352.field4206, class352.field4207}; // L: 15
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "669992934"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class326.method6120(); // L: 12218

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12220
			if (var1.obj != null) { // L: 12221
				var1.set();
			}
		}

		int var4 = FriendSystem.VarpDefinition_get(var0).type; // L: 12224
		if (var4 != 0) { // L: 12225
			int var2 = Varps.Varps_main[var0]; // L: 12226
			if (var4 == 1) { // L: 12227
				if (var2 == 1) { // L: 12228
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12229
					((TextureProvider)Rasterizer3D.field2528.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12230
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12232
					ScriptFrame.clientPreferences.method2513(0.9D); // L: 12234
				}

				if (var2 == 2) { // L: 12236
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 12237
					((TextureProvider)Rasterizer3D.field2528.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 12238
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12240
					ScriptFrame.clientPreferences.method2513(0.8D); // L: 12242
				}

				if (var2 == 3) { // L: 12244
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 12245
					((TextureProvider)Rasterizer3D.field2528.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 12246
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12248
					ScriptFrame.clientPreferences.method2513(0.7D); // L: 12250
				}

				if (var2 == 4) { // L: 12252
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 12253
					((TextureProvider)Rasterizer3D.field2528.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 12254
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12256
					ScriptFrame.clientPreferences.method2513(0.6D); // L: 12258
				}
			}

			if (var4 == 3) { // L: 12261
				if (var2 == 0) { // L: 12262
					WorldMapIcon_0.method5479(255);
				}

				if (var2 == 1) { // L: 12263
					WorldMapIcon_0.method5479(192);
				}

				if (var2 == 2) { // L: 12264
					WorldMapIcon_0.method5479(128);
				}

				if (var2 == 3) { // L: 12265
					WorldMapIcon_0.method5479(64);
				}

				if (var2 == 4) { // L: 12266
					WorldMapIcon_0.method5479(0);
				}
			}

			if (var4 == 4) { // L: 12268
				if (var2 == 0) { // L: 12269
					VarpDefinition.method3688(127);
				}

				if (var2 == 1) { // L: 12270
					VarpDefinition.method3688(96);
				}

				if (var2 == 2) { // L: 12271
					VarpDefinition.method3688(64);
				}

				if (var2 == 3) { // L: 12272
					VarpDefinition.method3688(32);
				}

				if (var2 == 4) { // L: 12273
					VarpDefinition.method3688(0);
				}
			}

			if (var4 == 5) { // L: 12275
				Client.field642 = var2 == 1;
			}

			if (var4 == 6) { // L: 12276
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 12277
			}

			if (var4 == 10) { // L: 12278
				if (var2 == 0) { // L: 12279
					PacketWriter.method2871(127);
				}

				if (var2 == 1) { // L: 12280
					PacketWriter.method2871(96);
				}

				if (var2 == 2) { // L: 12281
					PacketWriter.method2871(64);
				}

				if (var2 == 3) { // L: 12282
					PacketWriter.method2871(32);
				}

				if (var2 == 4) { // L: 12283
					PacketWriter.method2871(0);
				}
			}

			if (var4 == 17) { // L: 12285
				Client.followerIndex = var2 & 65535; // L: 12286
			}

			AttackOption[] var3;
			if (var4 == 18) { // L: 12288
				var3 = new AttackOption[]{AttackOption.field1341, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1343}; // L: 12291
				Client.playerAttackOption = (AttackOption)class93.findEnumerated(var3, var2); // L: 12293
				if (Client.playerAttackOption == null) { // L: 12294
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 12296
				if (var2 == -1) { // L: 12297
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12298
				}
			}

			if (var4 == 22) { // L: 12300
				var3 = new AttackOption[]{AttackOption.field1341, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1343}; // L: 12303
				Client.npcAttackOption = (AttackOption)class93.findEnumerated(var3, var2); // L: 12305
				if (Client.npcAttackOption == null) { // L: 12306
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12308
}
