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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ic")
public class class208 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -176004405
	)
	int field2255;
	@ObfuscatedName("az")
	String field2259;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field2257;
	@ObfuscatedName("av")
	String field2250;
	@ObfuscatedName("ax")
	float[] field2258;
	@ObfuscatedName("as")
	ArrayList field2256;
	@ObfuscatedName("ay")
	ArrayList field2261;
	@ObfuscatedName("ak")
	ArrayList field2266;
	@ObfuscatedName("aj")
	Map field2263;
	@ObfuscatedName("am")
	Map field2264;

	public class208() {
		this.field2255 = -1; // L: 25
		this.field2250 = null; // L: 28
		this.field2258 = new float[4]; // L: 29
		this.field2256 = new ArrayList(); // L: 30
		this.field2261 = new ArrayList(); // L: 31
		this.field2266 = new ArrayList(); // L: 32
		this.field2263 = new HashMap(); // L: 33
		this.field2264 = new HashMap(); // L: 34
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)Z",
		garbageValue = "-18"
	)
	public boolean method4161(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method4142(); // L: 43

				try {
					this.field2259 = var1; // L: 45
					this.field2257 = var2.request(new URL(this.field2259)); // L: 46
					this.field2255 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method4142(); // L: 51
					this.field2255 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "1589272882"
	)
	public void method4115(UrlRequester var1) {
		switch(this.field2255) { // L: 58
		case 0:
			this.method4116(var1);
			break; // L: 65
		case 1:
			this.method4134(); // L: 60
			break;
		default:
			return; // L: 63
		}

	} // L: 68

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method4124() {
		return this.field2255; // L: 71
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "256889728"
	)
	public int method4114(String var1) {
		return this.field2263.containsKey(var1) ? (Integer)this.field2263.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1206229207"
	)
	public String method4118(String var1) {
		return (String)((String)(this.field2264.containsKey(var1) ? this.field2264.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2021801100"
	)
	public ArrayList method4119() {
		return this.field2261; // L: 83
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2096187297"
	)
	public ArrayList method4120() {
		return this.field2266; // L: 87
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-944579598"
	)
	public String method4121() {
		return this.field2250; // L: 91
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "94"
	)
	public float[] method4183() {
		return this.field2258; // L: 95
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "523040657"
	)
	public ArrayList method4123() {
		return this.field2256; // L: 99
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "64156006"
	)
	void method4142() {
		this.field2257 = null; // L: 103
		this.field2250 = null; // L: 104
		this.field2258[0] = 0.0F; // L: 105
		this.field2258[1] = 0.0F; // L: 106
		this.field2258[2] = 1.0F; // L: 107
		this.field2258[3] = 1.0F; // L: 108
		this.field2256.clear(); // L: 109
		this.field2261.clear(); // L: 110
		this.field2266.clear(); // L: 111
		this.field2263.clear(); // L: 112
		this.field2264.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "357044570"
	)
	void method4116(UrlRequester var1) {
		if (this.field2257 != null && this.field2257.isDone()) { // L: 117
			byte[] var2 = this.field2257.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method4142(); // L: 122
				this.field2255 = 100; // L: 123
			} else {
				try {
					this.method4131(new class474(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method4142(); // L: 130
					this.field2255 = 102; // L: 131
					return; // L: 132
				}

				this.field2255 = this.field2261.size() > 0 ? 1 : 2; // L: 134
				this.field2257 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-841261467"
	)
	void method4134() {
		Iterator var1 = this.field2261.iterator(); // L: 139

		class214 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2261.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class214)var1.next(); // L: 148
					if (var2.field2303 != null) { // L: 150
						byte[] var3 = var2.field2303.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field2255 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method4142(); // L: 159
				this.field2255 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class214)var1.next(); // L: 140
		} while(var2.field2303 == null || var2.field2303.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-1649177141"
	)
	void method4147(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class214 var5 = new class214(this); // L: 168
					var5.field2303 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field2300 = class9.method84(var4, "placement"); // L: 170
					this.field2261.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "1"
	)
	void method4128(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class215 var4 = new class215(this); // L: 181
				var4.field2312 = var3.getString("text"); // L: 182
				var4.field2308 = class33.method494(var3.getString("align_x")); // L: 183
				var4.field2309 = class33.method494(var3.getString("align_y")); // L: 184
				var4.field2310 = var3.getInt("font"); // L: 185
				var4.field2306 = class9.method84(var3, "placement"); // L: 186
				this.field2266.add(var4); // L: 187
			}

		}
	} // L: 189

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1286553511"
	)
	void method4129(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 192
			this.field2258 = class9.method84(var1, "clickbounds"); // L: 193
			this.field2250 = var1.getString("endpoint"); // L: 194
			String[] var2 = JSONObject.getNames(var1); // L: 195

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 196
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 197
					try {
						int var4 = var1.getInt(var2[var3]); // L: 199
						this.field2256.add(new class216(this, var2[var3], var4)); // L: 200
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 204
							if (var5.equals("true")) { // L: 205
								this.field2256.add(new class216(this, var2[var3], 1)); // L: 206
							} else if (var5.equals("false")) { // L: 208
								this.field2256.add(new class216(this, var2[var3], 0)); // L: 209
							} else {
								this.field2256.add(new class207(this, var2[var3], var5)); // L: 212
							}
						} catch (Exception var7) { // L: 215
						}
					}
				}
			}

		}
	} // L: 219

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-85"
	)
	void method4130(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 222

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 223
			try {
				int var4 = var1.getInt(var2[var3]); // L: 225
				this.field2263.put(var2[var3], var4); // L: 226
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 230
					if (var5.equals("true")) { // L: 231
						this.field2263.put(var2[var3], 1); // L: 232
					} else if (var5.equals("false")) { // L: 234
						this.field2263.put(var2[var3], 0); // L: 235
					} else {
						this.field2264.put(var2[var3], var5); // L: 238
					}
				} catch (Exception var7) { // L: 241
				}
			}
		}

	} // L: 244

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lel;I)V",
		garbageValue = "1323384211"
	)
	void method4131(class474 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8573(); // L: 249
			var3 = var3.getJSONObject("message"); // L: 250
		} catch (Exception var9) { // L: 252
			this.method4142(); // L: 253
			this.field2255 = 102; // L: 254
			return; // L: 255
		}

		try {
			this.method4147(var3.getJSONArray("images"), var2); // L: 258
		} catch (Exception var8) { // L: 260
			this.field2261.clear(); // L: 261
		}

		try {
			this.method4128(var3.getJSONArray("labels")); // L: 264
		} catch (Exception var7) { // L: 266
			this.field2266.clear(); // L: 267
		}

		try {
			this.method4129(var3.getJSONObject("behaviour")); // L: 270
		} catch (Exception var6) { // L: 272
			this.field2250 = null; // L: 273
			this.field2258[0] = 0.0F; // L: 274
			this.field2258[1] = 0.0F; // L: 275
			this.field2258[2] = 1.0F; // L: 276
			this.field2258[3] = 1.0F; // L: 277
			this.field2256.clear(); // L: 278
		}

		try {
			this.method4130(var3.getJSONObject("meta")); // L: 281
		} catch (Exception var5) { // L: 283
			this.field2263.clear(); // L: 284
			this.field2264.clear(); // L: 285
		}

	} // L: 287

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "348701890"
	)
	public boolean method4132(String var1, UrlRequester var2) {
		try {
			this.method4131(new class474(var1.getBytes()), var2); // L: 291
			this.field2255 = this.field2261.size() > 0 ? 1 : 2; // L: 292
		} catch (UnsupportedEncodingException var4) { // L: 294
			this.field2255 = 102; // L: 295
		}

		return this.field2255 < 100; // L: 297
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1432052010"
	)
	public static void method4152() {
		class174.archive7.clear(); // L: 14
	} // L: 15
}
