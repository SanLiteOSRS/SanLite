import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fk")
public class class163 {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2091468897
	)
	int field1831;
	@ObfuscatedName("b")
	String field1832;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	UrlRequest field1834;
	@ObfuscatedName("g")
	String field1827;
	@ObfuscatedName("i")
	float[] field1828;
	@ObfuscatedName("o")
	ArrayList field1836;
	@ObfuscatedName("n")
	ArrayList field1837;
	@ObfuscatedName("k")
	ArrayList field1833;
	@ObfuscatedName("a")
	Map field1839;
	@ObfuscatedName("s")
	Map field1840;

	public class163() {
		this.field1831 = -1; // L: 24
		this.field1827 = null; // L: 27
		this.field1828 = new float[4];
		this.field1836 = new ArrayList(); // L: 29
		this.field1837 = new ArrayList(); // L: 30
		this.field1833 = new ArrayList(); // L: 31
		this.field1839 = new HashMap(); // L: 32
		this.field1840 = new HashMap(); // L: 33
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldl;I)Z",
		garbageValue = "-1909822883"
	)
	public boolean method3370(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3385(); // L: 42

				try {
					this.field1832 = var1; // L: 44
					this.field1834 = var2.request(new URL(this.field1832)); // L: 45
					this.field1831 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3385(); // L: 50
					this.field1831 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ldl;S)V",
		garbageValue = "19356"
	)
	public void method3371(UrlRequester var1) {
		switch(this.field1831) { // L: 57
		case 0:
			this.method3380(var1);
			break; // L: 64
		case 1:
			this.method3381(); // L: 59
			break;
		default:
			return; // L: 62
		}

	} // L: 67

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-917073960"
	)
	public int method3372() {
		return this.field1831; // L: 70
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1951981064"
	)
	public int method3373(String var1) {
		return this.field1839.containsKey(var1) ? (Integer)this.field1839.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1849655025"
	)
	public String method3374(String var1) {
		return (String)((String)(this.field1840.containsKey(var1) ? this.field1840.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "24"
	)
	public ArrayList method3383() {
		return this.field1837; // L: 82
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "22"
	)
	public ArrayList method3376() {
		return this.field1833; // L: 86
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method3377() {
		return this.field1827; // L: 90
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1542942466"
	)
	public ArrayList method3378() {
		return this.field1836; // L: 94
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2085605669"
	)
	void method3385() {
		this.field1834 = null; // L: 98
		this.field1827 = null; // L: 99
		this.field1828[0] = 0.0F; // L: 100
		this.field1828[1] = 0.0F; // L: 101
		this.field1828[2] = 1.0F; // L: 102
		this.field1828[3] = 1.0F; // L: 103
		this.field1836.clear(); // L: 104
		this.field1837.clear(); // L: 105
		this.field1833.clear(); // L: 106
		this.field1839.clear(); // L: 107
		this.field1840.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ldl;B)V",
		garbageValue = "-109"
	)
	void method3380(UrlRequester var1) {
		if (this.field1834 != null && this.field1834.isDone()) { // L: 112
			byte[] var2 = this.field1834.getResponse(); // L: 115
			if (var2 == null) { // L: 116
				this.method3385(); // L: 117
				this.field1831 = 100; // L: 118
			} else {
				JSONObject var3;
				try {
					class422 var4 = new class422(var2); // L: 123
					var3 = var4.method7917(); // L: 124
					var3 = var3.getJSONObject("message"); // L: 125
				} catch (Exception var9) { // L: 127
					this.method3385(); // L: 128
					this.field1831 = 102; // L: 129
					return; // L: 130
				}

				try {
					this.method3382(var3.getJSONArray("images"), var1); // L: 133
				} catch (Exception var8) { // L: 135
					this.field1837.clear(); // L: 136
				}

				try {
					this.method3413(var3.getJSONArray("labels")); // L: 139
				} catch (Exception var7) { // L: 141
					this.field1833.clear(); // L: 142
				}

				try {
					this.method3414(var3.getJSONObject("behaviour")); // L: 145
				} catch (Exception var6) { // L: 147
					this.field1827 = null; // L: 148
					this.field1828[0] = 0.0F; // L: 149
					this.field1828[1] = 0.0F; // L: 150
					this.field1828[2] = 1.0F; // L: 151
					this.field1828[3] = 1.0F; // L: 152
					this.field1836.clear(); // L: 153
				}

				try {
					this.method3396(var3.getJSONObject("meta")); // L: 156
				} catch (Exception var5) { // L: 158
					this.field1839.clear(); // L: 159
					this.field1840.clear(); // L: 160
				}

				this.field1831 = this.field1837.size() > 0 ? 1 : 2; // L: 162
				this.field1834 = null; // L: 163
			}
		}
	} // L: 113 119 164

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	void method3381() {
		Iterator var1 = this.field1837.iterator(); // L: 167

		class168 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1837.iterator(); // L: 175

				while (var1.hasNext()) {
					var2 = (class168)var1.next(); // L: 176
					if (var2.field1867 != null) { // L: 178
						byte[] var3 = var2.field1867.getResponse(); // L: 179
						if (var3 != null && var3.length > 0) { // L: 180
							this.field1831 = 2; // L: 181
							return; // L: 182
						}
					}
				}

				this.method3385(); // L: 187
				this.field1831 = 101; // L: 188
				return; // L: 189
			}

			var2 = (class168)var1.next(); // L: 168
		} while(var2.field1867 == null || var2.field1867.isDone()); // L: 170

	} // L: 171

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Ldl;I)V",
		garbageValue = "-1559555099"
	)
	void method3382(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 192
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 193
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 195
					class168 var5 = new class168(this); // L: 196
					var5.field1867 = var2.request(new URL(var4.getString("src"))); // L: 197
					var5.field1868 = Login.method2094(var4, "placement"); // L: 198
					this.field1837.add(var5); // L: 199
				} catch (MalformedURLException var6) { // L: 201
				}
			}

		}
	} // L: 203

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "68"
	)
	void method3413(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 206
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 207
				JSONObject var3 = var1.getJSONObject(var2); // L: 208
				class169 var4 = new class169(this); // L: 209
				var4.field1872 = var3.getString("text"); // L: 210
				String var7 = var3.getString("align_x"); // L: 213
				byte var6;
				if (var7.equals("centre")) { // L: 215
					var6 = 1; // L: 216
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 219
					var6 = 0; // L: 223
				} else {
					var6 = 2; // L: 220
				}

				var4.field1876 = var6; // L: 225
				var4.field1877 = class144.method3145(var3.getString("align_y")); // L: 226
				var4.field1875 = var3.getInt("font"); // L: 227
				var4.field1873 = Login.method2094(var3, "placement"); // L: 228
				this.field1833.add(var4); // L: 229
			}

		}
	} // L: 231

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-7"
	)
	void method3414(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 234
			this.field1828 = Login.method2094(var1, "clickbounds"); // L: 235
			this.field1827 = var1.getString("endpoint"); // L: 236
			String[] var2 = JSONObject.getNames(var1); // L: 237

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 238
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 239
					try {
						int var4 = var1.getInt(var2[var3]); // L: 241
						this.field1836.add(new class170(this, var2[var3], var4)); // L: 242
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 246
							if (var5.equals("true")) { // L: 247
								this.field1836.add(new class170(this, var2[var3], 1)); // L: 248
							} else if (var5.equals("false")) { // L: 250
								this.field1836.add(new class170(this, var2[var3], 0)); // L: 251
							} else {
								this.field1836.add(new class162(this, var2[var3], var5)); // L: 254
							}
						} catch (Exception var7) { // L: 257
						}
					}
				}
			}

		}
	} // L: 261

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;S)V",
		garbageValue = "16256"
	)
	void method3396(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 264

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 265
			try {
				int var4 = var1.getInt(var2[var3]); // L: 267
				this.field1839.put(var2[var3], var4); // L: 268
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 272
					if (var5.equals("true")) { // L: 273
						this.field1839.put(var2[var3], 1); // L: 274
					} else if (var5.equals("false")) { // L: 276
						this.field1839.put(var2[var3], 0); // L: 277
					} else {
						this.field1840.put(var2[var3], var5); // L: 280
					}
				} catch (Exception var7) { // L: 283
				}
			}
		}

	} // L: 286

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcp;",
		garbageValue = "1657766333"
	)
	static class87[] method3425() {
		return new class87[]{class87.field1110, class87.field1112, class87.field1113, class87.field1114, class87.field1118, class87.field1120}; // L: 17
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-175884700"
	)
	public static int method3416(int var0) {
		return class424.field4664[var0 & 16383]; // L: 28
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1919350476"
	)
	public static int method3422(int var0) {
		return (var0 & class462.field4896) - 1; // L: 26
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	static final int method3424() {
		if (StructComposition.clientPreferences.method2412()) { // L: 4921
			return class383.Client_plane;
		} else {
			int var0 = 3; // L: 4922
			if (class97.cameraPitch < 310) { // L: 4923
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 4926
					var1 = KeyHandler.oculusOrbFocalPointX >> 7; // L: 4927
					var2 = class14.oculusOrbFocalPointY >> 7; // L: 4928
				} else {
					var1 = class155.localPlayer.x >> 7; // L: 4931
					var2 = class155.localPlayer.y >> 7; // L: 4932
				}

				int var3 = class145.cameraX >> 7; // L: 4934
				int var4 = ClanChannel.cameraZ >> 7; // L: 4935
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 4936
					return class383.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 4937
					return class383.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) { // L: 4938
					var0 = class383.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 4940
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 4941
				}

				int var6;
				if (var2 > var4) { // L: 4943
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 4944
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 4945
					var7 = var6 * 65536 / var5; // L: 4946
					var8 = 32768; // L: 4947

					while (var1 != var3) { // L: 4948
						if (var3 < var1) { // L: 4949
							++var3;
						} else if (var3 > var1) { // L: 4950
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) { // L: 4951
							var0 = class383.Client_plane;
						}

						var8 += var7; // L: 4952
						if (var8 >= 65536) { // L: 4953
							var8 -= 65536; // L: 4954
							if (var4 < var2) { // L: 4955
								++var4;
							} else if (var4 > var2) { // L: 4956
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) { // L: 4957
								var0 = class383.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 4961
					var7 = var5 * 65536 / var6; // L: 4962
					var8 = 32768; // L: 4963

					while (var4 != var2) { // L: 4964
						if (var4 < var2) { // L: 4965
							++var4;
						} else if (var4 > var2) { // L: 4966
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) { // L: 4967
							var0 = class383.Client_plane;
						}

						var8 += var7; // L: 4968
						if (var8 >= 65536) { // L: 4969
							var8 -= 65536; // L: 4970
							if (var3 < var1) { // L: 4971
								++var3;
							} else if (var3 > var1) { // L: 4972
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class383.Client_plane][var3][var4] & 4) != 0) { // L: 4973
								var0 = class383.Client_plane;
							}
						}
					}
				}
			}

			if (class155.localPlayer.x >= 0 && class155.localPlayer.y >= 0 && class155.localPlayer.x < 13312 && class155.localPlayer.y < 13312) { // L: 4978
				if ((Tiles.Tiles_renderFlags[class383.Client_plane][class155.localPlayer.x >> 7][class155.localPlayer.y >> 7] & 4) != 0) { // L: 4979
					var0 = class383.Client_plane;
				}

				return var0;
			} else {
				return class383.Client_plane; // L: 4980
			}
		}
	}
}
