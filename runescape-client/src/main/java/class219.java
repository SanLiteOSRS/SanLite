import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ih")
public class class219 {
	@ObfuscatedName("ap")
	String field2351;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1939781771
	)
	int field2352;
	@ObfuscatedName("aj")
	ArrayList field2353;
	@ObfuscatedName("aq")
	ArrayList field2354;
	@ObfuscatedName("ar")
	ArrayList field2357;
	@ObfuscatedName("ag")
	String field2356;
	@ObfuscatedName("ao")
	float[] field2358;
	@ObfuscatedName("ae")
	Map field2355;
	@ObfuscatedName("aa")
	Map field2359;

	class219() {
		this.field2352 = 0; // L: 17
		this.field2353 = new ArrayList(); // L: 18
		this.field2354 = new ArrayList(); // L: 19
		this.field2357 = new ArrayList(); // L: 20
		this.field2356 = null; // L: 21
		this.field2358 = new float[4]; // L: 22
		this.field2355 = new HashMap(); // L: 23
		this.field2359 = new HashMap(); // L: 24
	} // L: 26

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1590672843"
	)
	String method4316() {
		return this.field2351; // L: 29
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	int method4317() {
		return this.field2352; // L: 33
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method4346() {
		this.field2356 = null; // L: 37
		this.field2358[0] = 0.0F; // L: 38
		this.field2358[1] = 0.0F; // L: 39
		this.field2358[2] = 1.0F; // L: 40
		this.field2358[3] = 1.0F; // L: 41
		this.field2353.clear(); // L: 42
		this.field2354.clear(); // L: 43
		this.field2357.clear(); // L: 44
		this.field2355.clear(); // L: 45
		this.field2359.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeg;I)Z",
		garbageValue = "981839546"
	)
	boolean method4319(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1; // L: 50
		if (var2 < 2) { // L: 51
			try {
				var4 = var4.getJSONObject("message"); // L: 53
			} catch (Exception var13) { // L: 55
				this.method4346(); // L: 56
				return false; // L: 57
			}

			try {
				this.method4320(var4.getJSONArray("images"), var3); // L: 60
			} catch (Exception var12) { // L: 62
				this.field2354.clear(); // L: 63
			}

			try {
				this.method4322(var4.getJSONArray("labels")); // L: 66
			} catch (Exception var11) { // L: 68
				this.field2357.clear();
			}
		} else {
			try {
				this.method4344(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2354.clear();
			}

			try {
				this.method4323(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2357.clear();
			}
		}

		try {
			this.method4330(var4.getJSONObject("behaviour")); // L: 87
		} catch (Exception var8) { // L: 89
			this.field2356 = null;
			this.field2358[0] = 0.0F;
			this.field2358[1] = 0.0F;
			this.field2358[2] = 1.0F;
			this.field2358[3] = 1.0F;
			this.field2353.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta"); // L: 98
			if (var5 != null) { // L: 99
				this.method4325(var4.getJSONObject("meta")); // L: 100
			}
		} catch (Exception var7) { // L: 103
			this.field2355.clear(); // L: 104
			this.field2359.clear(); // L: 105
		}

		if (var2 == 2) { // L: 107
			try {
				this.field2351 = var4.getString("id"); // L: 109
				this.field2352 = Integer.parseInt(var4.getString("priority")); // L: 110
			} catch (Exception var6) { // L: 112
			}
		}

		return true; // L: 114
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Leg;I)V",
		garbageValue = "-1392468030"
	)
	void method4320(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 118
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 119
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 121
					class209 var5 = new class209(this); // L: 122
					var5.field2284 = var2.request(new URL(var4.getString("src"))); // L: 123
					var5.field2282 = SceneTilePaint.method5787(var4, "placement"); // L: 124
					this.field2354.add(var5); // L: 125
				} catch (MalformedURLException var6) { // L: 127
				}
			}

		}
	} // L: 129

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Leg;I)V",
		garbageValue = "-2104654392"
	)
	void method4344(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class209 var3 = new class209(this); // L: 133
			var3.field2284 = var2.request(new URL(var1.getString("src"))); // L: 134
			var3.field2282 = SceneTilePaint.method5787(var1, "placement"); // L: 135
			this.field2354.add(var3); // L: 136
		} catch (MalformedURLException var4) { // L: 138
		}

	} // L: 139

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-748641331"
	)
	void method4322(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 142
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 143
				JSONObject var3 = var1.getJSONObject(var2); // L: 144
				class220 var4 = new class220(this); // L: 145
				var4.field2363 = var3.getString("text"); // L: 146
				String var7 = var3.getString("align_x"); // L: 149
				byte var6;
				if (var7.equals("centre")) { // L: 151
					var6 = 1; // L: 152
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 155
					var6 = 0; // L: 159
				} else {
					var6 = 2; // L: 156
				}

				var4.field2369 = var6; // L: 161
				String var10 = var3.getString("align_y"); // L: 164
				byte var9;
				if (var10.equals("centre")) { // L: 166
					var9 = 1; // L: 167
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 170
					var9 = 0; // L: 174
				} else {
					var9 = 2; // L: 171
				}

				var4.field2366 = var9; // L: 176
				var4.field2368 = var3.getInt("font"); // L: 177
				var4.field2364 = SceneTilePaint.method5787(var3, "placement"); // L: 178
				this.field2357.add(var4); // L: 179
			}

		}
	} // L: 181

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1049491835"
	)
	void method4323(JSONObject var1) throws JSONException {
		class220 var2 = new class220(this); // L: 184
		var2.field2363 = var1.optString("text"); // L: 185
		String var5 = var1.optString("align_x"); // L: 188
		byte var4;
		if (var5.equals("centre")) { // L: 190
			var4 = 1; // L: 191
		} else if (!var5.equals("bottom") && !var5.equals("right")) { // L: 194
			var4 = 0; // L: 198
		} else {
			var4 = 2; // L: 195
		}

		var2.field2369 = var4; // L: 200
		String var8 = var1.optString("align_y"); // L: 203
		byte var7;
		if (var8.equals("centre")) { // L: 205
			var7 = 1; // L: 206
		} else if (!var8.equals("bottom") && !var8.equals("right")) { // L: 209
			var7 = 0; // L: 213
		} else {
			var7 = 2; // L: 210
		}

		var2.field2366 = var7; // L: 215
		var2.field2368 = var1.optInt("font"); // L: 216
		var2.field2364 = SceneTilePaint.method5787(var1, "placement"); // L: 217
		this.field2357.add(var2); // L: 218
	} // L: 219

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "307857906"
	)
	void method4330(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 222
			this.field2358 = SceneTilePaint.method5787(var1, "clickbounds"); // L: 223
			this.field2356 = var1.getString("endpoint"); // L: 224
			String[] var2 = JSONObject.getNames(var1); // L: 225

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 226
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 227
					try {
						int var4 = var1.getInt(var2[var3]); // L: 229
						this.field2353.add(new class207(this, var2[var3], var4)); // L: 230
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 234
							if (var5.equals("true")) { // L: 235
								this.field2353.add(new class207(this, var2[var3], 1)); // L: 236
							} else if (var5.equals("false")) { // L: 238
								this.field2353.add(new class207(this, var2[var3], 0)); // L: 239
							} else {
								this.field2353.add(new class216(this, var2[var3], var5)); // L: 242
							}
						} catch (Exception var7) { // L: 245
						}
					}
				}
			}

		}
	} // L: 249

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "84238420"
	)
	void method4325(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 252

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 253
			try {
				int var4 = var1.optInt(var2[var3]); // L: 255
				this.field2355.put(var2[var3], var4); // L: 256
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]); // L: 260
					if (var5.equals("true")) { // L: 261
						this.field2355.put(var2[var3], 1); // L: 262
					} else if (var5.equals("false")) { // L: 264
						this.field2355.put(var2[var3], 0); // L: 265
					} else {
						this.field2359.put(var2[var3], var5); // L: 268
					}
				} catch (Exception var7) { // L: 271
				}
			}
		}

	} // L: 274

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1304224005"
	)
	public static void method4339(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 69
			int var4 = (var3 + var2) / 2; // L: 70
			int var5 = var2; // L: 71
			int var6 = var0[var4]; // L: 72
			var0[var4] = var0[var3]; // L: 73
			var0[var3] = var6; // L: 74
			int var7 = var1[var4]; // L: 75
			var1[var4] = var1[var3]; // L: 76
			var1[var3] = var7; // L: 77
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 78

			for (int var9 = var2; var9 < var3; ++var9) { // L: 79
				if (var0[var9] < (var9 & var8) + var6) { // L: 80
					int var10 = var0[var9]; // L: 81
					var0[var9] = var0[var5]; // L: 82
					var0[var5] = var10; // L: 83
					int var11 = var1[var9]; // L: 84
					var1[var9] = var1[var5]; // L: 85
					var1[var5++] = var11; // L: 86
				}
			}

			var0[var3] = var0[var5]; // L: 90
			var0[var5] = var6; // L: 91
			var1[var3] = var1[var5]; // L: 92
			var1[var5] = var7; // L: 93
			method4339(var0, var1, var2, var5 - 1); // L: 94
			method4339(var0, var1, var5 + 1, var3); // L: 95
		}

	} // L: 97
}
