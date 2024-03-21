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

@ObfuscatedName("it")
public class class221 {
	@ObfuscatedName("aw")
	String field2391;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -751552941
	)
	int field2383;
	@ObfuscatedName("ai")
	ArrayList field2384;
	@ObfuscatedName("ar")
	ArrayList field2385;
	@ObfuscatedName("as")
	ArrayList field2386;
	@ObfuscatedName("aa")
	String field2387;
	@ObfuscatedName("az")
	float[] field2382;
	@ObfuscatedName("ao")
	Map field2389;
	@ObfuscatedName("au")
	Map field2388;

	class221() {
		this.field2383 = 0; // L: 17
		this.field2384 = new ArrayList(); // L: 18
		this.field2385 = new ArrayList(); // L: 19
		this.field2386 = new ArrayList(); // L: 20
		this.field2387 = null; // L: 21
		this.field2382 = new float[4]; // L: 22
		this.field2389 = new HashMap(); // L: 23
		this.field2388 = new HashMap(); // L: 24
	} // L: 26

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "78"
	)
	String method4315() {
		return this.field2391; // L: 29
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-93251573"
	)
	int method4336() {
		return this.field2383; // L: 33
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-158880452"
	)
	void method4300() {
		this.field2387 = null; // L: 37
		this.field2382[0] = 0.0F; // L: 38
		this.field2382[1] = 0.0F; // L: 39
		this.field2382[2] = 1.0F; // L: 40
		this.field2382[3] = 1.0F; // L: 41
		this.field2384.clear(); // L: 42
		this.field2385.clear(); // L: 43
		this.field2386.clear(); // L: 44
		this.field2389.clear(); // L: 45
		this.field2388.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)Z",
		garbageValue = "952427396"
	)
	boolean method4304(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1; // L: 50
		if (var2 < 2) { // L: 51
			try {
				var4 = var4.getJSONObject("message"); // L: 53
			} catch (Exception var13) { // L: 55
				this.method4300(); // L: 56
				return false; // L: 57
			}

			try {
				this.method4339(var4.getJSONArray("images"), var3); // L: 60
			} catch (Exception var12) { // L: 62
				this.field2385.clear(); // L: 63
			}

			try {
				this.method4307(var4.getJSONArray("labels")); // L: 66
			} catch (Exception var11) { // L: 68
				this.field2386.clear(); // L: 69
			}
		} else {
			try {
				this.method4312(var4.getJSONObject("image"), var3); // L: 74
			} catch (Exception var10) { // L: 76
				this.field2385.clear(); // L: 77
			}

			try {
				this.method4308(var4.getJSONObject("label")); // L: 80
			} catch (Exception var9) { // L: 82
				this.field2386.clear(); // L: 83
			}
		}

		try {
			this.method4309(var4.getJSONObject("behaviour")); // L: 87
		} catch (Exception var8) { // L: 89
			this.field2387 = null; // L: 90
			this.field2382[0] = 0.0F; // L: 91
			this.field2382[1] = 0.0F; // L: 92
			this.field2382[2] = 1.0F; // L: 93
			this.field2382[3] = 1.0F; // L: 94
			this.field2384.clear(); // L: 95
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta"); // L: 98
			if (var5 != null) { // L: 99
				this.method4310(var4.getJSONObject("meta")); // L: 100
			}
		} catch (Exception var7) { // L: 103
			this.field2389.clear(); // L: 104
			this.field2388.clear(); // L: 105
		}

		if (var2 == 2) { // L: 107
			try {
				this.field2391 = var4.getString("id"); // L: 109
				this.field2383 = Integer.parseInt(var4.getString("priority")); // L: 110
			} catch (Exception var6) { // L: 112
			}
		}

		return true; // L: 114
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-293909434"
	)
	void method4339(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 118
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 119
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 121
					class211 var5 = new class211(this); // L: 122
					var5.field2311 = var2.request(new URL(var4.getString("src"))); // L: 123
					var5.field2309 = class136.method3139(var4, "placement"); // L: 124
					this.field2385.add(var5); // L: 125
				} catch (MalformedURLException var6) { // L: 127
				}
			}

		}
	} // L: 129

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lel;B)V",
		garbageValue = "62"
	)
	void method4312(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class211 var3 = new class211(this); // L: 133
			var3.field2311 = var2.request(new URL(var1.getString("src"))); // L: 134
			var3.field2309 = class136.method3139(var1, "placement"); // L: 135
			this.field2385.add(var3); // L: 136
		} catch (MalformedURLException var4) { // L: 138
		}

	} // L: 139

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-2032707420"
	)
	void method4307(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 142
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 143
				JSONObject var3 = var1.getJSONObject(var2); // L: 144
				class222 var4 = new class222(this); // L: 145
				var4.field2394 = var3.getString("text"); // L: 146
				var4.field2395 = class226.method4395(var3.getString("align_x")); // L: 147
				var4.field2396 = class226.method4395(var3.getString("align_y")); // L: 148
				var4.field2397 = var3.getInt("font"); // L: 149
				var4.field2399 = class136.method3139(var3, "placement"); // L: 150
				this.field2386.add(var4); // L: 151
			}

		}
	} // L: 153

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-105"
	)
	void method4308(JSONObject var1) throws JSONException {
		class222 var2 = new class222(this); // L: 156
		var2.field2394 = var1.optString("text"); // L: 157
		var2.field2395 = class226.method4395(var1.optString("align_x")); // L: 158
		var2.field2396 = class226.method4395(var1.optString("align_y")); // L: 159
		var2.field2397 = var1.optInt("font"); // L: 160
		var2.field2399 = class136.method3139(var1, "placement"); // L: 161
		this.field2386.add(var2); // L: 162
	} // L: 163

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1473148449"
	)
	void method4309(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 166
			this.field2382 = class136.method3139(var1, "clickbounds"); // L: 167
			this.field2387 = var1.getString("endpoint"); // L: 168
			String[] var2 = JSONObject.getNames(var1); // L: 169

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 170
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 171
					try {
						int var4 = var1.getInt(var2[var3]); // L: 173
						this.field2384.add(new class209(this, var2[var3], var4)); // L: 174
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 178
							if (var5.equals("true")) { // L: 179
								this.field2384.add(new class209(this, var2[var3], 1)); // L: 180
							} else if (var5.equals("false")) { // L: 182
								this.field2384.add(new class209(this, var2[var3], 0)); // L: 183
							} else {
								this.field2384.add(new class218(this, var2[var3], var5)); // L: 186
							}
						} catch (Exception var7) { // L: 189
						}
					}
				}
			}

		}
	} // L: 193

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "2100109315"
	)
	void method4310(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 196

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
			try {
				int var4 = var1.optInt(var2[var3]); // L: 199
				this.field2389.put(var2[var3], var4); // L: 200
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]); // L: 204
					if (var5.equals("true")) { // L: 205
						this.field2389.put(var2[var3], 1); // L: 206
					} else if (var5.equals("false")) { // L: 208
						this.field2389.put(var2[var3], 0); // L: 209
					} else {
						this.field2388.put(var2[var3], var5); // L: 212
					}
				} catch (Exception var7) { // L: 215
				}
			}
		}

	} // L: 218
}
