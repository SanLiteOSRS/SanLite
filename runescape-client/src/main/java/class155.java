import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ef")
public class class155 {
	@ObfuscatedName("ur")
	static List field1721;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 106059875
	)
	int field1711;
	@ObfuscatedName("a")
	String field1713;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	UrlRequest field1717;
	@ObfuscatedName("n")
	String field1710;
	@ObfuscatedName("x")
	float[] field1715;
	@ObfuscatedName("g")
	ArrayList field1716;
	@ObfuscatedName("p")
	ArrayList field1722;
	@ObfuscatedName("b")
	ArrayList field1718;
	@ObfuscatedName("l")
	Map field1719;
	@ObfuscatedName("y")
	Map field1720;

	public class155() {
		this.field1711 = -1; // L: 24
		this.field1710 = null; // L: 27
		this.field1715 = new float[4]; // L: 28
		this.field1716 = new ArrayList(); // L: 29
		this.field1722 = new ArrayList(); // L: 30
		this.field1718 = new ArrayList(); // L: 31
		this.field1719 = new HashMap(); // L: 32
		this.field1720 = new HashMap(); // L: 33
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcc;B)Z",
		garbageValue = "1"
	)
	public boolean method3176(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3218(); // L: 42

				try {
					this.field1713 = var1; // L: 44
					this.field1717 = var2.request(new URL(this.field1713)); // L: 45
					this.field1711 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3218(); // L: 50
					this.field1711 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lcc;B)V",
		garbageValue = "-121"
	)
	public void method3233(UrlRequester var1) {
		switch(this.field1711) { // L: 57
		case 0:
			this.method3237(var1); // L: 59
			break;
		case 1:
			this.method3188(); // L: 62
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	public int method3178() {
		return this.field1711;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-997357536"
	)
	public int method3225(String var1) {
		return this.field1719.containsKey(var1) ? (Integer)this.field1719.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1079707838"
	)
	public String method3179(String var1) {
		return (String)((String)(this.field1720.containsKey(var1) ? this.field1720.get(var1) : null));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2038386823"
	)
	public ArrayList method3181() {
		return this.field1722;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-913818294"
	)
	public ArrayList method3182() {
		return this.field1718;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-954998012"
	)
	public String method3219() {
		return this.field1710;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "98"
	)
	public float[] method3227() {
		return this.field1715; // L: 94
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-504682335"
	)
	public ArrayList method3185() {
		return this.field1716; // L: 98
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-885915410"
	)
	void method3218() {
		this.field1717 = null; // L: 102
		this.field1710 = null; // L: 103
		this.field1715[0] = 0.0F; // L: 104
		this.field1715[1] = 0.0F; // L: 105
		this.field1715[2] = 1.0F; // L: 106
		this.field1715[3] = 1.0F; // L: 107
		this.field1716.clear(); // L: 108
		this.field1722.clear(); // L: 109
		this.field1718.clear(); // L: 110
		this.field1719.clear(); // L: 111
		this.field1720.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcc;B)V",
		garbageValue = "74"
	)
	void method3237(UrlRequester var1) {
		if (this.field1717 != null && this.field1717.isDone()) { // L: 116
			byte[] var2 = this.field1717.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3218(); // L: 121
				this.field1711 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class400 var4 = new class400(var2); // L: 127
					var3 = var4.method7134(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3218(); // L: 132
					this.field1711 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3221(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1722.clear(); // L: 140
				}

				try {
					this.method3190(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1718.clear(); // L: 146
				}

				try {
					this.method3191(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1710 = null; // L: 152
					this.field1715[0] = 0.0F; // L: 153
					this.field1715[1] = 0.0F; // L: 154
					this.field1715[2] = 1.0F; // L: 155
					this.field1715[3] = 1.0F; // L: 156
					this.field1716.clear(); // L: 157
				}

				try {
					this.method3208(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1719.clear(); // L: 163
					this.field1720.clear(); // L: 164
				}

				this.field1711 = this.field1722.size() > 0 ? 1 : 2; // L: 166
				this.field1717 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-7390"
	)
	void method3188() {
		Iterator var1 = this.field1722.iterator(); // L: 171

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1722.iterator(); // L: 179

				while (var1.hasNext()) {
					var2 = (class160)var1.next(); // L: 180
					if (var2.field1755 != null) { // L: 182
						byte[] var3 = var2.field1755.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1711 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3218(); // L: 191
				this.field1711 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class160)var1.next(); // L: 172
		} while(var2.field1755 == null || var2.field1755.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lcc;I)V",
		garbageValue = "-2036481182"
	)
	void method3221(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class160 var5 = new class160(this); // L: 200
					var5.field1755 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1754 = UrlRequester.method2614(var4, "placement"); // L: 202
					this.field1722.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-245308124"
	)
	void method3190(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class161 var4 = new class161(this); // L: 213
				var4.field1763 = var3.getString("text"); // L: 214
				var4.field1760 = PacketWriter.method2599(var3.getString("align_x")); // L: 215
				var4.field1765 = PacketWriter.method2599(var3.getString("align_y")); // L: 216
				var4.field1766 = var3.getInt("font"); // L: 217
				var4.field1764 = UrlRequester.method2614(var3, "placement"); // L: 218
				this.field1718.add(var4); // L: 219
			}

		}
	} // L: 221

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "58"
	)
	void method3191(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 224
			this.field1715 = UrlRequester.method2614(var1, "clickbounds"); // L: 225
			this.field1710 = var1.getString("endpoint"); // L: 226
			String[] var2 = JSONObject.getNames(var1); // L: 227

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 228
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 229
					try {
						int var4 = var1.getInt(var2[var3]); // L: 231
						this.field1716.add(new class162(this, var2[var3], var4)); // L: 232
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 236
							if (var5.equals("true")) { // L: 237
								this.field1716.add(new class162(this, var2[var3], 1)); // L: 238
							} else if (var5.equals("false")) { // L: 240
								this.field1716.add(new class162(this, var2[var3], 0)); // L: 241
							} else {
								this.field1716.add(new class154(this, var2[var3], var5)); // L: 244
							}
						} catch (Exception var7) { // L: 247
						}
					}
				}
			}

		}
	} // L: 251

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "112"
	)
	void method3208(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 254

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 255
			try {
				int var4 = var1.getInt(var2[var3]); // L: 257
				this.field1719.put(var2[var3], var4); // L: 258
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 262
					if (var5.equals("true")) { // L: 263
						this.field1719.put(var2[var3], 1); // L: 264
					} else if (var5.equals("false")) { // L: 266
						this.field1719.put(var2[var3], 0); // L: 267
					} else {
						this.field1720.put(var2[var3], var5); // L: 270
					}
				} catch (Exception var7) { // L: 273
				}
			}
		}

	} // L: 276

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-786854648"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		WallObject.sortWorlds(class93.World_worlds, 0, class93.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-118039767"
	)
	static final void method3235(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					Tiles.field998[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	static final int method3238() {
		float var0 = 200.0F * ((float)class260.clientPreferences.method2323() - 0.5F); // L: 11806
		return 100 - Math.round(var0); // L: 11807
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1873513824"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class424.method7495(); // L: 11837

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11839
			if (var1.obj != null) { // L: 11840
				var1.set();
			}
		}

		int var4 = MouseRecorder.VarpDefinition_get(var0).type; // L: 11843
		if (var4 != 0) { // L: 11844
			int var2 = Varps.Varps_main[var0]; // L: 11845
			if (var4 == 1) { // L: 11846
				if (var2 == 1) { // L: 11847
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 11848
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 11849
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 11851
					class260.clientPreferences.method2322(0.9D); // L: 11853
				}

				if (var2 == 2) { // L: 11855
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 11856
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 11857
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 11859
					class260.clientPreferences.method2322(0.8D); // L: 11861
				}

				if (var2 == 3) { // L: 11863
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 11864
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 11865
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 11867
					class260.clientPreferences.method2322(0.7D); // L: 11869
				}

				if (var2 == 4) { // L: 11871
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 11872
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 11873
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 11875
					class260.clientPreferences.method2322(0.6D); // L: 11877
				}
			}

			if (var4 == 3) { // L: 11880
				if (var2 == 0) { // L: 11881
					class228.method4875(255);
				}

				if (var2 == 1) { // L: 11882
					class228.method4875(192);
				}

				if (var2 == 2) { // L: 11883
					class228.method4875(128);
				}

				if (var2 == 3) { // L: 11884
					class228.method4875(64);
				}

				if (var2 == 4) { // L: 11885
					class228.method4875(0);
				}
			}

			if (var4 == 4) { // L: 11887
				if (var2 == 0) { // L: 11888
					Player.method2248(127);
				}

				if (var2 == 1) { // L: 11889
					Player.method2248(96);
				}

				if (var2 == 2) { // L: 11890
					Player.method2248(64);
				}

				if (var2 == 3) { // L: 11891
					Player.method2248(32);
				}

				if (var2 == 4) { // L: 11892
					Player.method2248(0);
				}
			}

			if (var4 == 5) { // L: 11894
				Client.field604 = var2 == 1;
			}

			if (var4 == 6) { // L: 11895
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 11896
				Client.field662 = var2;
			}

			if (var4 == 10) { // L: 11897
				if (var2 == 0) { // L: 11898
					class136.method2949(127);
				}

				if (var2 == 1) { // L: 11899
					class136.method2949(96);
				}

				if (var2 == 2) { // L: 11900
					class136.method2949(64);
				}

				if (var2 == 3) { // L: 11901
					class136.method2949(32);
				}

				if (var2 == 4) { // L: 11902
					class136.method2949(0);
				}
			}

			if (var4 == 17) { // L: 11904
				Client.followerIndex = var2 & 65535; // L: 11905
			}

			AttackOption[] var3;
			if (var4 == 18) { // L: 11907
				var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1282, AttackOption.field1284, AttackOption.AttackOption_alwaysRightClick}; // L: 11910
				Client.playerAttackOption = (AttackOption)class271.findEnumerated(var3, var2); // L: 11912
				if (Client.playerAttackOption == null) { // L: 11913
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 11915
				if (var2 == -1) { // L: 11916
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11917
				}
			}

			if (var4 == 22) { // L: 11919
				var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1282, AttackOption.field1284, AttackOption.AttackOption_alwaysRightClick}; // L: 11922
				Client.npcAttackOption = (AttackOption)class271.findEnumerated(var3, var2); // L: 11924
				if (Client.npcAttackOption == null) { // L: 11925
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11927
}
