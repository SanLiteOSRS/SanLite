import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gq")
public class class171 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1271705159
	)
	int field1825;
	@ObfuscatedName("az")
	String field1819;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	UrlRequest field1820;
	@ObfuscatedName("ao")
	String field1821;
	@ObfuscatedName("as")
	float[] field1829;
	@ObfuscatedName("am")
	ArrayList field1823;
	@ObfuscatedName("ag")
	ArrayList field1824;
	@ObfuscatedName("aa")
	ArrayList field1826;
	@ObfuscatedName("ar")
	Map field1822;
	@ObfuscatedName("ad")
	Map field1813;

	public class171() {
		this.field1825 = -1; // L: 25
		this.field1821 = null; // L: 28
		this.field1829 = new float[4]; // L: 29
		this.field1823 = new ArrayList(); // L: 30
		this.field1824 = new ArrayList(); // L: 31
		this.field1826 = new ArrayList(); // L: 32
		this.field1822 = new HashMap(); // L: 33
		this.field1813 = new HashMap(); // L: 34
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)Z",
		garbageValue = "2140501126"
	)
	public boolean method3488(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3541(); // L: 43

				try {
					this.field1819 = var1; // L: 45
					this.field1820 = var2.request(new URL(this.field1819)); // L: 46
					this.field1825 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3541(); // L: 51
					this.field1825 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-953440982"
	)
	public void method3489(UrlRequester var1) {
		switch(this.field1825) { // L: 58
		case 0:
			this.method3529(var1); // L: 60
			break;
		case 1:
			this.method3543(); // L: 63
			break; // L: 64
		default:
			return; // L: 66
		}

	} // L: 68

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method3490() {
		return this.field1825; // L: 71
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1551420801"
	)
	public int method3491(String var1) {
		return this.field1822.containsKey(var1) ? (Integer)this.field1822.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1031998388"
	)
	public String method3492(String var1) {
		return (String)((String)(this.field1813.containsKey(var1) ? this.field1813.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "43"
	)
	public ArrayList method3493() {
		return this.field1824; // L: 83
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1444536043"
	)
	public ArrayList method3522() {
		return this.field1826; // L: 87
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-94"
	)
	public String method3494() {
		return this.field1821; // L: 91
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1143999363"
	)
	public float[] method3496() {
		return this.field1829; // L: 95
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "21"
	)
	public ArrayList method3497() {
		return this.field1823; // L: 99
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "990029403"
	)
	void method3541() {
		this.field1820 = null; // L: 103
		this.field1821 = null; // L: 104
		this.field1829[0] = 0.0F; // L: 105
		this.field1829[1] = 0.0F; // L: 106
		this.field1829[2] = 1.0F; // L: 107
		this.field1829[3] = 1.0F; // L: 108
		this.field1823.clear(); // L: 109
		this.field1824.clear(); // L: 110
		this.field1826.clear(); // L: 111
		this.field1822.clear(); // L: 112
		this.field1813.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1907708020"
	)
	void method3529(UrlRequester var1) {
		if (this.field1820 != null && this.field1820.isDone()) { // L: 117
			byte[] var2 = this.field1820.getResponse();
			if (var2 == null) {
				this.method3541(); // L: 122
				this.field1825 = 100; // L: 123
			} else {
				try {
					this.method3505(new class462(var2), var1);
				} catch (UnsupportedEncodingException var4) {
					this.method3541(); // L: 130
					this.field1825 = 102;
					return;
				}

				this.field1825 = this.field1824.size() > 0 ? 1 : 2; // L: 134
				this.field1820 = null;
			}
		}
	} // L: 118

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	void method3543() {
		Iterator var1 = this.field1824.iterator();

		class177 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1824.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class177)var1.next(); // L: 148
					if (var2.field1861 != null) { // L: 150
						byte[] var3 = var2.field1861.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1825 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3541(); // L: 159
				this.field1825 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class177)var1.next(); // L: 140
		} while(var2.field1861 == null || var2.field1861.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lea;B)V",
		garbageValue = "27"
	)
	void method3544(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class177 var5 = new class177(this); // L: 168
					var5.field1861 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1860 = class163.method3411(var4, "placement"); // L: 170
					this.field1824.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "108370944"
	)
	void method3502(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class178 var4 = new class178(this); // L: 181
				var4.field1866 = var3.getString("text"); // L: 182
				var4.field1863 = class162.method3403(var3.getString("align_x")); // L: 183
				var4.field1870 = class162.method3403(var3.getString("align_y")); // L: 184
				var4.field1869 = var3.getInt("font"); // L: 185
				var4.field1867 = class163.method3411(var3, "placement"); // L: 186
				this.field1826.add(var4); // L: 187
			}

		}
	} // L: 189

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "515700731"
	)
	void method3503(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 192
			this.field1829 = class163.method3411(var1, "clickbounds"); // L: 193
			this.field1821 = var1.getString("endpoint"); // L: 194
			String[] var2 = JSONObject.getNames(var1); // L: 195

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 196
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 197
					try {
						int var4 = var1.getInt(var2[var3]); // L: 199
						this.field1823.add(new class179(this, var2[var3], var4)); // L: 200
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 204
							if (var5.equals("true")) { // L: 205
								this.field1823.add(new class179(this, var2[var3], 1)); // L: 206
							} else if (var5.equals("false")) { // L: 208
								this.field1823.add(new class179(this, var2[var3], 0)); // L: 209
							} else {
								this.field1823.add(new class170(this, var2[var3], var5)); // L: 212
							}
						} catch (Exception var7) { // L: 215
						}
					}
				}
			}

		}
	} // L: 219

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-54"
	)
	void method3504(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 222

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 223
			try {
				int var4 = var1.getInt(var2[var3]); // L: 225
				this.field1822.put(var2[var3], var4); // L: 226
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 230
					if (var5.equals("true")) { // L: 231
						this.field1822.put(var2[var3], 1); // L: 232
					} else if (var5.equals("false")) { // L: 234
						this.field1822.put(var2[var3], 0); // L: 235
					} else {
						this.field1813.put(var2[var3], var5); // L: 238
					}
				} catch (Exception var7) { // L: 241
				}
			}
		}

	} // L: 244

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lea;I)V",
		garbageValue = "-162041363"
	)
	void method3505(class462 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8353(); // L: 249
			var3 = var3.getJSONObject("message"); // L: 250
		} catch (Exception var9) { // L: 252
			this.method3541(); // L: 253
			this.field1825 = 102; // L: 254
			return; // L: 255
		}

		try {
			this.method3544(var3.getJSONArray("images"), var2); // L: 258
		} catch (Exception var8) { // L: 260
			this.field1824.clear(); // L: 261
		}

		try {
			this.method3502(var3.getJSONArray("labels")); // L: 264
		} catch (Exception var7) { // L: 266
			this.field1826.clear(); // L: 267
		}

		try {
			this.method3503(var3.getJSONObject("behaviour")); // L: 270
		} catch (Exception var6) { // L: 272
			this.field1821 = null; // L: 273
			this.field1829[0] = 0.0F; // L: 274
			this.field1829[1] = 0.0F; // L: 275
			this.field1829[2] = 1.0F; // L: 276
			this.field1829[3] = 1.0F; // L: 277
			this.field1823.clear(); // L: 278
		}

		try {
			this.method3504(var3.getJSONObject("meta")); // L: 281
		} catch (Exception var5) { // L: 283
			this.field1822.clear(); // L: 284
			this.field1813.clear(); // L: 285
		}

	} // L: 287

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;B)Z",
		garbageValue = "0"
	)
	public boolean method3506(String var1, UrlRequester var2) {
		try {
			this.method3505(new class462(var1.getBytes()), var2); // L: 291
			this.field1825 = this.field1824.size() > 0 ? 1 : 2; // L: 292
		} catch (UnsupportedEncodingException var4) { // L: 294
			this.field1825 = 102; // L: 295
		}

		return this.field1825 < 100; // L: 297
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;III)Lpj;",
		garbageValue = "733106012"
	)
	public static Font method3558(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 119
		boolean var4;
		if (var5 == null) { // L: 120
			var4 = false; // L: 121
		} else {
			GrandExchangeEvent.SpriteBuffer_decode(var5); // L: 124
			var4 = true; // L: 125
		}

		if (!var4) { // L: 127
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 129
			Font var8;
			if (var6 == null) { // L: 131
				var8 = null; // L: 132
			} else {
				Font var7 = new Font(var6, class527.SpriteBuffer_xOffsets, class527.SpriteBuffer_yOffsets, class496.SpriteBuffer_spriteWidths, BuddyRankComparator.SpriteBuffer_spriteHeights, class527.SpriteBuffer_spritePalette, class464.SpriteBuffer_pixels); // L: 135
				PlatformInfo.method8433(); // L: 136
				var8 = var7; // L: 137
			}

			return var8; // L: 139
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1679111379"
	)
	static int method3499(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2660
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2661
			return 1; // L: 2662
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2664
				Interpreter.Interpreter_intStackSize -= 2; // L: 2665
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2666
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2667
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.method8699(var3, var4); // L: 2668
				return 1; // L: 2669
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2671
				Interpreter.Interpreter_intStackSize -= 2; // L: 2672
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2673
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2674
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class308.ItemContainer_getCount(var3, var4); // L: 2675
				return 1; // L: 2676
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2678
				Interpreter.Interpreter_intStackSize -= 2; // L: 2679
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2680
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2681
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.method1196(var3, var4); // L: 2682
				return 1; // L: 2683
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2685
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2686
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarpDefinition.getInvDefinition(var3).size; // L: 2687
				return 1; // L: 2688
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2690
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2691
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2692
				return 1; // L: 2693
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2695
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2696
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2697
				return 1; // L: 2698
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2700
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2701
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2702
				return 1; // L: 2703
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2705
					var3 = BuddyRankComparator.Client_plane; // L: 2706
					var4 = class166.baseX * 64 + (class27.localPlayer.x >> 7); // L: 2707
					var5 = class9.baseY * 64 + (class27.localPlayer.y >> 7); // L: 2708
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2709
					return 1; // L: 2710
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2712
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2713
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2714
					return 1; // L: 2715
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2717
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2718
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2719
					return 1; // L: 2720
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2722
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2723
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2724
					return 1; // L: 2725
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2727
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2728
					return 1; // L: 2729
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2731
					Interpreter.Interpreter_intStackSize -= 2; // L: 2732
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2733
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2734
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.method8699(var3, var4); // L: 2735
					return 1; // L: 2736
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2738
					Interpreter.Interpreter_intStackSize -= 2; // L: 2739
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2740
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2741
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class308.ItemContainer_getCount(var3, var4); // L: 2742
					return 1; // L: 2743
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2745
					Interpreter.Interpreter_intStackSize -= 2; // L: 2746
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2747
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.method1196(var3, var4); // L: 2749
					return 1; // L: 2750
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2752
					if (Client.staffModLevel >= 2) { // L: 2753
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2754
					}

					return 1; // L: 2755
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2757
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2758
					return 1; // L: 2759
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2761
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2762
					return 1; // L: 2763
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2765
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field723 / 100; // L: 2766
					return 1; // L: 2767
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2769
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2770
					return 1; // L: 2771
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2773
					if (Client.playerMod) { // L: 2774
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2775
					}

					return 1; // L: 2776
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2778
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2782
					Interpreter.Interpreter_intStackSize -= 4; // L: 2783
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2784
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2785
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2786
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2787
					var3 += var4 << 14; // L: 2788
					var3 += var5 << 28; // L: 2789
					var3 += var6; // L: 2790
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2791
					return 1; // L: 2792
				} else if (var0 == 3326) { // L: 2794
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field513; // L: 2795
					return 1; // L: 2796
				} else if (var0 == 3327) { // L: 2798
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field567; // L: 2799
					return 1; // L: 2800
				} else if (var0 == 3331) { // L: 2802
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field723; // L: 2803
					return 1; // L: 2804
				} else {
					return 2; // L: 2806
				}
			}
		}
	}
}
