import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gq")
public class class170 {
	@ObfuscatedName("ja")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1852345439
	)
	int field1808;
	@ObfuscatedName("ap")
	String field1817;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	UrlRequest field1805;
	@ObfuscatedName("at")
	String field1811;
	@ObfuscatedName("ah")
	float[] field1812;
	@ObfuscatedName("ax")
	ArrayList field1813;
	@ObfuscatedName("aa")
	ArrayList field1804;
	@ObfuscatedName("au")
	ArrayList field1815;
	@ObfuscatedName("ae")
	Map field1816;
	@ObfuscatedName("ab")
	Map field1814;

	public class170() {
		this.field1808 = -1;
		this.field1811 = null;
		this.field1812 = new float[4];
		this.field1813 = new ArrayList();
		this.field1804 = new ArrayList();
		this.field1815 = new ArrayList();
		this.field1816 = new HashMap(); // L: 33
		this.field1814 = new HashMap();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;B)Z",
		garbageValue = "-55"
	)
	public boolean method3431(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3441(); // L: 43

				try {
					this.field1817 = var1; // L: 45
					this.field1805 = var2.request(new URL(this.field1817)); // L: 46
					this.field1808 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3441(); // L: 51
					this.field1808 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lej;B)V",
		garbageValue = "88"
	)
	public void method3472(UrlRequester var1) {
		switch(this.field1808) { // L: 58
		case 0:
			this.method3442(var1);
			break; // L: 65
		case 1:
			this.method3446(); // L: 60
			break;
		default:
			return; // L: 63
		}

	} // L: 68

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1160046533"
	)
	public int method3438() {
		return this.field1808; // L: 71
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "212756708"
	)
	public int method3434(String var1) {
		return this.field1816.containsKey(var1) ? (Integer)this.field1816.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "103576370"
	)
	public String method3435(String var1) {
		return (String)((String)(this.field1814.containsKey(var1) ? this.field1814.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "494222917"
	)
	public ArrayList method3436() {
		return this.field1804; // L: 83
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "35"
	)
	public ArrayList method3437() {
		return this.field1815; // L: 87
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "120"
	)
	public String method3479() {
		return this.field1811; // L: 91
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1926620523"
	)
	public float[] method3439() {
		return this.field1812; // L: 95
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "88"
	)
	public ArrayList method3487() {
		return this.field1813; // L: 99
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "500"
	)
	void method3441() {
		this.field1805 = null; // L: 103
		this.field1811 = null; // L: 104
		this.field1812[0] = 0.0F; // L: 105
		this.field1812[1] = 0.0F; // L: 106
		this.field1812[2] = 1.0F; // L: 107
		this.field1812[3] = 1.0F; // L: 108
		this.field1813.clear(); // L: 109
		this.field1804.clear(); // L: 110
		this.field1815.clear(); // L: 111
		this.field1816.clear(); // L: 112
		this.field1814.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lej;B)V",
		garbageValue = "0"
	)
	void method3442(UrlRequester var1) {
		if (this.field1805 != null && this.field1805.isDone()) { // L: 117
			byte[] var2 = this.field1805.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3441(); // L: 122
				this.field1808 = 100; // L: 123
			} else {
				try {
					this.method3448(new class463(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3441(); // L: 130
					this.field1808 = 102; // L: 131
					return; // L: 132
				}

				this.field1808 = this.field1804.size() > 0 ? 1 : 2; // L: 134
				this.field1805 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "706475225"
	)
	void method3446() {
		Iterator var1 = this.field1804.iterator(); // L: 139

		class176 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1804.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class176)var1.next(); // L: 148
					if (var2.field1853 != null) { // L: 150
						byte[] var3 = var2.field1853.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1808 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3441(); // L: 159
				this.field1808 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class176)var1.next(); // L: 140
		} while(var2.field1853 == null || var2.field1853.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lej;I)V",
		garbageValue = "-506183299"
	)
	void method3457(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class176 var5 = new class176(this); // L: 168
					var5.field1853 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1849 = class106.method2689(var4, "placement"); // L: 170
					this.field1804.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-86694133"
	)
	void method3490(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class177 var4 = new class177(this); // L: 181
				var4.field1861 = var3.getString("text"); // L: 182
				var4.field1859 = class27.method422(var3.getString("align_x")); // L: 183
				var4.field1860 = class27.method422(var3.getString("align_y")); // L: 184
				var4.field1855 = var3.getInt("font"); // L: 185
				var4.field1858 = class106.method2689(var3, "placement"); // L: 186
				this.field1815.add(var4); // L: 187
			}

		}
	} // L: 189

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;S)V",
		garbageValue = "-18886"
	)
	void method3440(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 192
			this.field1812 = class106.method2689(var1, "clickbounds"); // L: 193
			this.field1811 = var1.getString("endpoint"); // L: 194
			String[] var2 = JSONObject.getNames(var1); // L: 195

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 196
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 197
					try {
						int var4 = var1.getInt(var2[var3]); // L: 199
						this.field1813.add(new class178(this, var2[var3], var4)); // L: 200
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 204
							if (var5.equals("true")) { // L: 205
								this.field1813.add(new class178(this, var2[var3], 1)); // L: 206
							} else if (var5.equals("false")) { // L: 208
								this.field1813.add(new class178(this, var2[var3], 0)); // L: 209
							} else {
								this.field1813.add(new class169(this, var2[var3], var5)); // L: 212
							}
						} catch (Exception var7) { // L: 215
						}
					}
				}
			}

		}
	} // L: 219

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "357071457"
	)
	void method3447(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 222

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 223
			try {
				int var4 = var1.getInt(var2[var3]); // L: 225
				this.field1816.put(var2[var3], var4); // L: 226
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 230
					if (var5.equals("true")) { // L: 231
						this.field1816.put(var2[var3], 1); // L: 232
					} else if (var5.equals("false")) { // L: 234
						this.field1816.put(var2[var3], 0); // L: 235
					} else {
						this.field1814.put(var2[var3], var5); // L: 238
					}
				} catch (Exception var7) { // L: 241
				}
			}
		}

	} // L: 244

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lej;B)V",
		garbageValue = "28"
	)
	void method3448(class463 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8398(); // L: 249
			var3 = var3.getJSONObject("message"); // L: 250
		} catch (Exception var9) { // L: 252
			this.method3441(); // L: 253
			this.field1808 = 102; // L: 254
			return; // L: 255
		}

		try {
			this.method3457(var3.getJSONArray("images"), var2); // L: 258
		} catch (Exception var8) { // L: 260
			this.field1804.clear(); // L: 261
		}

		try {
			this.method3490(var3.getJSONArray("labels")); // L: 264
		} catch (Exception var7) { // L: 266
			this.field1815.clear(); // L: 267
		}

		try {
			this.method3440(var3.getJSONObject("behaviour")); // L: 270
		} catch (Exception var6) { // L: 272
			this.field1811 = null; // L: 273
			this.field1812[0] = 0.0F; // L: 274
			this.field1812[1] = 0.0F; // L: 275
			this.field1812[2] = 1.0F; // L: 276
			this.field1812[3] = 1.0F; // L: 277
			this.field1813.clear(); // L: 278
		}

		try {
			this.method3447(var3.getJSONObject("meta")); // L: 281
		} catch (Exception var5) { // L: 283
			this.field1816.clear(); // L: 284
			this.field1814.clear(); // L: 285
		}

	} // L: 287

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;B)Z",
		garbageValue = "6"
	)
	public boolean method3449(String var1, UrlRequester var2) {
		try {
			this.method3448(new class463(var1.getBytes()), var2); // L: 291
			this.field1808 = this.field1804.size() > 0 ? 1 : 2; // L: 292
		} catch (UnsupportedEncodingException var4) { // L: 294
			this.field1808 = 102; // L: 295
		}

		return this.field1808 < 100; // L: 297
	}

	@ObfuscatedName("aw")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class389.base37Table[(int)(var6 - var0 * 37L)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}
}
