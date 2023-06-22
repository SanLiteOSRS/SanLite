import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ax")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ap")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ab")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ak")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1904305713
	)
	int field1264;
	@ObfuscatedName("af")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 84734445
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1341889513
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 684295281
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1471536841
	)
	int field1269;
	@ObfuscatedName("ac")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -206582189
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ar")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1269 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2431(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false;
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1269 = -1; // L: 27
		this.rememberedUsername = null; // L: 28
		this.windowMode = 1; // L: 29
		this.parameters = new LinkedHashMap(); // L: 30
		if (var1 != null && var1.array != null) { // L: 37
			int var2 = var1.readUnsignedByte(); // L: 41
			if (var2 >= 0 && var2 <= 10) { // L: 42
				if (var1.readUnsignedByte() == 1) { // L: 46
					this.roofsHidden = true; // L: 47
				}

				if (var2 > 1) { // L: 49
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 50
				}

				if (var2 > 3) { // L: 52
					this.windowMode = var1.readUnsignedByte(); // L: 53
				}

				if (var2 > 2) { // L: 55
					int var3 = var1.readUnsignedByte(); // L: 56

					for (int var4 = 0; var4 < var3; ++var4) { // L: 57
						int var5 = var1.readInt(); // L: 58
						int var6 = var1.readInt(); // L: 59
						this.parameters.put(var5, var6); // L: 60
					}
				}

				if (var2 > 4) { // L: 63
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 64
				}

				if (var2 > 5) { // L: 66
					this.hideUsername = var1.readBoolean(); // L: 67
				}

				if (var2 > 6) { // L: 69
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 70
					this.musicVolume = var1.readUnsignedByte(); // L: 71
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 72
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 73
				}

				if (var2 > 7) { // L: 75
					this.field1269 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1264 = var1.readInt(); // L: 82
				}
			} else {
				this.method2431(true); // L: 43
			}
		} else {
			this.method2431(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1462329422"
	)
	void method2431(boolean var1) {
	} // L: 88

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "-348625760"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(417, true); // L: 91
		var1.writeByte(10); // L: 92
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 93
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 94
		var1.writeByte(this.windowMode); // L: 95
		var1.writeByte(this.parameters.size()); // L: 96
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 97

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 98
			var1.writeInt((Integer)var3.getKey()); // L: 100
			var1.writeInt((Integer)var3.getValue()); // L: 101
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 104
		var1.writeBoolean(this.hideUsername); // L: 105
		var1.writeByte((int)(100.0D * this.brightness)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1269); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1264); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "88"
	)
	void method2489(boolean var1) {
		this.roofsHidden = var1; // L: 133
		class100.savePreferences(); // L: 134
	} // L: 135

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-159985790"
	)
	boolean method2434() {
		return this.roofsHidden; // L: 138
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2020795504"
	)
	void method2524(boolean var1) {
		this.hideUsername = var1; // L: 142
		class100.savePreferences(); // L: 143
	} // L: 144

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-241151903"
	)
	boolean method2472() {
		return this.hideUsername; // L: 147
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1777922060"
	)
	void method2436(boolean var1) {
		this.titleMusicDisabled = var1; // L: 151
		class100.savePreferences(); // L: 152
	} // L: 153

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "916898062"
	)
	boolean method2437() {
		return this.titleMusicDisabled; // L: 156
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-802422956"
	)
	void method2438(boolean var1) {
		this.displayFps = var1; // L: 160
		class100.savePreferences(); // L: 161
	} // L: 162

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1463973224"
	)
	void method2439() {
		this.method2438(!this.displayFps); // L: 165
	} // L: 166

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1058971500"
	)
	boolean method2448() {
		return this.displayFps; // L: 169
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	void method2452(int var1) {
		this.field1264 = var1; // L: 173
		class100.savePreferences(); // L: 174
	} // L: 175

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	int method2442() {
		return this.field1264; // L: 178
	}

	@ObfuscatedName("ac")
	void method2443(double var1) {
		this.brightness = var1; // L: 182
		class100.savePreferences(); // L: 183
	} // L: 184

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "2139719352"
	)
	double method2430() {
		return this.brightness; // L: 187
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-785495624"
	)
	void method2519(int var1) {
		this.musicVolume = var1; // L: 191
		class100.savePreferences(); // L: 192
	} // L: 193

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-114"
	)
	int method2488() {
		return this.musicVolume; // L: 196
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "119052956"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 200
		class100.savePreferences(); // L: 201
	} // L: 202

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "100000"
	)
	int method2445() {
		return this.soundEffectsVolume; // L: 205
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-530057745"
	)
	void method2449(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 209
		class100.savePreferences(); // L: 210
	} // L: 211

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1910006932"
	)
	int method2450() {
		return this.areaSoundEffectsVolume; // L: 214
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1306932180"
	)
	void method2432(String var1) {
		this.rememberedUsername = var1; // L: 218
		class100.savePreferences(); // L: 219
	} // L: 220

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "55347313"
	)
	String method2529() {
		return this.rememberedUsername; // L: 223
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-149482019"
	)
	void method2466(int var1) {
		this.field1269 = var1; // L: 227
		class100.savePreferences(); // L: 228
	} // L: 229

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1091864789"
	)
	int method2454() {
		return this.field1269; // L: 232
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1420446119"
	)
	void method2440(int var1) {
		this.windowMode = var1; // L: 236
		class100.savePreferences(); // L: 237
	} // L: 238

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1841437351"
	)
	int method2456() {
		return this.windowMode; // L: 241
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "678280572"
	)
	void method2457(String var1, int var2) {
		int var3 = this.method2460(var1); // L: 245
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 246
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 247
			var4.next(); // L: 248
			var4.remove(); // L: 249
		}

		this.parameters.put(var3, var2); // L: 251
		class100.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "57"
	)
	boolean method2484(String var1) {
		int var2 = this.method2460(var1); // L: 256
		return this.parameters.containsKey(var2); // L: 257
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1511870766"
	)
	int method2459(String var1) {
		int var2 = this.method2460(var1); // L: 261
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 262 263 265
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-463731062"
	)
	int method2460(String var1) {
		return class226.method4452(var1.toLowerCase()); // L: 269
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "894800838"
	)
	static final int method2435(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 21
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;I)V",
		garbageValue = "-2033054867"
	)
	static void method2433(Font var0, Font var1) {
		if (class16.worldSelectBackSprites == null) { // L: 1791
			class16.worldSelectBackSprites = CollisionMap.method4206(class180.archive8, "sl_back", "");
		}

		if (class134.worldSelectFlagSprites == null) { // L: 1792
			class134.worldSelectFlagSprites = WorldMapRectangle.method5460(class180.archive8, "sl_flags", "");
		}

		if (class1.worldSelectArrows == null) { // L: 1793
			class1.worldSelectArrows = WorldMapRectangle.method5460(class180.archive8, "sl_arrows", "");
		}

		if (class342.worldSelectStars == null) { // L: 1794
			class342.worldSelectStars = WorldMapRectangle.method5460(class180.archive8, "sl_stars", "");
		}

		if (class299.worldSelectLeftSprite == null) { // L: 1795
			class299.worldSelectLeftSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(class180.archive8, "leftarrow", "");
		}

		if (class128.worldSelectRightSprite == null) { // L: 1796
			class128.worldSelectRightSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(class180.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1797
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1798
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1799
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1800
		if (class342.worldSelectStars != null) { // L: 1801
			class342.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1802
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1803
			class342.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1804
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1805
		}

		int var4;
		int var5;
		if (class1.worldSelectArrows != null) { // L: 1807
			int var2 = Login.xPadding + 280; // L: 1808
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1809
				class1.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var2, 4); // L: 1810
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1811
				class1.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var2 + 15, 4); // L: 1812
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1); // L: 1813
			int var3 = Login.xPadding + 390; // L: 1814
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1815
				class1.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var3, 4); // L: 1816
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1817
				class1.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var3 + 15, 4); // L: 1818
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1); // L: 1819
			var4 = Login.xPadding + 500; // L: 1820
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1821
				class1.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var4, 4); // L: 1822
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1823
				class1.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1824
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1825
			var5 = Login.xPadding + 610; // L: 1826
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1827
				class1.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var5, 4); // L: 1828
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1829
				class1.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1830
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1831
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1833
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1834
		Login.hoveredWorldIndex = -1; // L: 1835
		if (class16.worldSelectBackSprites != null) { // L: 1836
			byte var23 = 88; // L: 1837
			byte var24 = 19; // L: 1838
			var4 = 765 / (var23 + 1) - 1; // L: 1839
			var5 = 480 / (var24 + 1); // L: 1840

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1842
				var7 = var4; // L: 1843
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1844
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1845
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1846
					--var5;
				}
			} while(var5 != var6 || var7 != var4); // L: 1847

			var6 = (765 - var4 * var23) / (var4 + 1); // L: 1849
			if (var6 > 5) { // L: 1850
				var6 = 5;
			}

			var7 = (480 - var24 * var5) / (var5 + 1); // L: 1851
			if (var7 > 5) { // L: 1852
				var7 = 5;
			}

			int var8 = (765 - var4 * var23 - var6 * (var4 - 1)) / 2; // L: 1853
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2; // L: 1854
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1855
			Login.worldSelectPagesCount = var10 - var4; // L: 1856
			if (class299.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1857
				class299.worldSelectLeftSprite.drawAt(8, WorldMapID.canvasHeight / 2 - class299.worldSelectLeftSprite.subHeight / 2); // L: 1858
			}

			if (class128.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1860
				class128.worldSelectRightSprite.drawAt(class448.canvasWidth - class128.worldSelectRightSprite.subWidth - 8, WorldMapID.canvasHeight / 2 - class128.worldSelectRightSprite.subHeight / 2); // L: 1861
			}

			int var11 = var9 + 23; // L: 1863
			int var12 = var8 + Login.xPadding; // L: 1864
			int var13 = 0; // L: 1865
			boolean var14 = false; // L: 1866
			int var15 = Login.worldSelectPage; // L: 1867

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1868 1869
				World var17 = World.World_worlds[var16]; // L: 1872
				boolean var18 = true; // L: 1873
				String var19 = Integer.toString(var17.population); // L: 1874
				if (var17.population == -1) { // L: 1875
					var19 = "OFF"; // L: 1876
					var18 = false; // L: 1877
				} else if (var17.population > 1980) { // L: 1879
					var19 = "FULL"; // L: 1880
					var18 = false; // L: 1881
				}

				class107 var20 = null; // L: 1883
				int var21 = 0; // L: 1884
				if (var17.isBeta()) { // L: 1885
					var20 = var17.isMembersOnly() ? class107.field1348 : class107.field1353; // L: 1886
				} else if (var17.isDeadman()) { // L: 1888
					var20 = var17.isMembersOnly() ? class107.field1362 : class107.field1361; // L: 1889
				} else if (var17.method1747()) { // L: 1891
					var21 = 16711680; // L: 1892
					var20 = var17.isMembersOnly() ? class107.field1357 : class107.field1351; // L: 1893
				} else if (var17.method1755()) { // L: 1895
					var20 = var17.isMembersOnly() ? class107.field1356 : class107.field1355; // L: 1896
				} else if (var17.isPvp()) { // L: 1898
					var20 = var17.isMembersOnly() ? class107.field1350 : class107.field1349; // L: 1899
				} else if (var17.method1756()) { // L: 1901
					var20 = var17.isMembersOnly() ? class107.field1358 : class107.field1352; // L: 1902
				} else if (var17.method1757()) { // L: 1904
					var20 = var17.isMembersOnly() ? class107.field1360 : class107.field1354; // L: 1905
				}

				if (var20 == null || var20.field1363 >= class16.worldSelectBackSprites.length) { // L: 1907
					var20 = var17.isMembersOnly() ? class107.field1347 : class107.field1359; // L: 1908
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var23 + var12 && MouseHandler.MouseHandler_y < var24 + var11 && var18) { // L: 1910
					Login.hoveredWorldIndex = var16; // L: 1911
					class16.worldSelectBackSprites[var20.field1363].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1912
					var14 = true; // L: 1913
				} else {
					class16.worldSelectBackSprites[var20.field1363].drawAt(var12, var11); // L: 1915
				}

				if (class134.worldSelectFlagSprites != null) { // L: 1916
					class134.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1); // L: 1917
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1); // L: 1918
				var11 = var11 + var7 + var24; // L: 1919
				++var13; // L: 1920
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1921
					var12 = var12 + var23 + var6; // L: 1922
					var13 = 0; // L: 1923
					++var15; // L: 1924
				}
			}

			if (var14) { // L: 1927
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1928
				int var22 = var1.ascent + 8; // L: 1929
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1930
				if (var25 + var22 > 480) { // L: 1931
					var25 = MouseHandler.MouseHandler_y - 25 - var22; // L: 1932
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120); // L: 1934
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0); // L: 1935
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1936
			}
		}

		WorldMapSectionType.rasterProvider.drawFull(0, 0); // L: 1939
	} // L: 1940

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-160449783"
	)
	static void method2541(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3735
			int var3 = var0 >> 8; // L: 3736
			int var4 = var0 >> 4 & 7; // L: 3737
			int var5 = var0 & 15; // L: 3738
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3739
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3740
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3741
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3742
			int var6 = (var1 - 64) / 128; // L: 3743
			int var7 = (var2 - 64) / 128; // L: 3744
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3745
			++Client.soundEffectCount; // L: 3746
		}
	} // L: 3747
}
