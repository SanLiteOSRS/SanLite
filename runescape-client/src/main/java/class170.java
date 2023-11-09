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

@ObfuscatedName("gu")
public class class170 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 766072141
	)
	int field1804;
	@ObfuscatedName("ag")
	String field1811;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	UrlRequest field1818;
	@ObfuscatedName("aw")
	String field1812;
	@ObfuscatedName("ae")
	float[] field1813;
	@ObfuscatedName("ah")
	ArrayList field1814;
	@ObfuscatedName("ap")
	ArrayList field1815;
	@ObfuscatedName("as")
	ArrayList field1816;
	@ObfuscatedName("am")
	Map field1817;
	@ObfuscatedName("ao")
	Map field1809;

	public class170() {
		this.field1804 = -1; // L: 25
		this.field1812 = null; // L: 28
		this.field1813 = new float[4]; // L: 29
		this.field1814 = new ArrayList(); // L: 30
		this.field1815 = new ArrayList(); // L: 31
		this.field1816 = new ArrayList(); // L: 32
		this.field1817 = new HashMap(); // L: 33
		this.field1809 = new HashMap(); // L: 34
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)Z",
		garbageValue = "-16"
	)
	public boolean method3365(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3375(); // L: 43

				try {
					this.field1811 = var1; // L: 45
					this.field1818 = var2.request(new URL(this.field1811)); // L: 46
					this.field1804 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3375(); // L: 51
					this.field1804 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)V",
		garbageValue = "-86"
	)
	public void method3371(UrlRequester var1) {
		switch(this.field1804) { // L: 58
		case 0:
			this.method3376(var1); // L: 63
			break; // L: 64
		case 1:
			this.method3397(); // L: 60
			break;
		default:
			return; // L: 66
		}

	} // L: 68

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1858851502"
	)
	public int method3427() {
		return this.field1804; // L: 71
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-77"
	)
	public int method3398(String var1) {
		return this.field1817.containsKey(var1) ? (Integer)this.field1817.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1704729568"
	)
	public String method3368(String var1) {
		return (String)((String)(this.field1809.containsKey(var1) ? this.field1809.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-20907607"
	)
	public ArrayList method3370() {
		return this.field1815; // L: 83
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1638848954"
	)
	public ArrayList method3390() {
		return this.field1816; // L: 87
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "114"
	)
	public String method3374() {
		return this.field1812; // L: 91
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1022545546"
	)
	public float[] method3373() {
		return this.field1813; // L: 95
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-78893377"
	)
	public ArrayList method3414() {
		return this.field1814; // L: 99
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method3375() {
		this.field1818 = null; // L: 103
		this.field1812 = null; // L: 104
		this.field1813[0] = 0.0F; // L: 105
		this.field1813[1] = 0.0F; // L: 106
		this.field1813[2] = 1.0F; // L: 107
		this.field1813[3] = 1.0F; // L: 108
		this.field1814.clear(); // L: 109
		this.field1815.clear(); // L: 110
		this.field1816.clear(); // L: 111
		this.field1817.clear(); // L: 112
		this.field1809.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)V",
		garbageValue = "11"
	)
	void method3376(UrlRequester var1) {
		if (this.field1818 != null && this.field1818.isDone()) { // L: 117
			byte[] var2 = this.field1818.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3375(); // L: 122
				this.field1804 = 100; // L: 123
			} else {
				try {
					this.method3381(new class450(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3375(); // L: 130
					this.field1804 = 102; // L: 131
					return; // L: 132
				}

				this.field1804 = this.field1815.size() > 0 ? 1 : 2; // L: 134
				this.field1818 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-54327507"
	)
	void method3397() {
		Iterator var1 = this.field1815.iterator(); // L: 139

		class176 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1815.iterator(); // L: 147

				while (var1.hasNext()) { // L: 158
					var2 = (class176)var1.next(); // L: 148
					if (var2.field1858 != null) { // L: 150
						byte[] var3 = var2.field1858.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1804 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3375(); // L: 159
				this.field1804 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class176)var1.next(); // L: 140
		} while(var2.field1858 == null || var2.field1858.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-2042461416"
	)
	void method3416(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class176 var5 = new class176(this); // L: 168
					var5.field1858 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1855 = class150.method3162(var4, "placement"); // L: 170
					this.field1815.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-815534075"
	)
	void method3378(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class177 var4 = new class177(this); // L: 181
				var4.field1859 = var3.getString("text"); // L: 182
				String var7 = var3.getString("align_x"); // L: 185
				byte var6;
				if (var7.equals("centre")) { // L: 187
					var6 = 1; // L: 188
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 191
					var6 = 0; // L: 195
				} else {
					var6 = 2; // L: 192
				}

				var4.field1862 = var6; // L: 197
				String var10 = var3.getString("align_y"); // L: 200
				byte var9;
				if (var10.equals("centre")) { // L: 202
					var9 = 1; // L: 203
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 206
					var9 = 0; // L: 210
				} else {
					var9 = 2; // L: 207
				}

				var4.field1864 = var9; // L: 212
				var4.field1866 = var3.getInt("font"); // L: 213
				var4.field1863 = class150.method3162(var3, "placement"); // L: 214
				this.field1816.add(var4); // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-41"
	)
	void method3364(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 220
			this.field1813 = class150.method3162(var1, "clickbounds"); // L: 221
			this.field1812 = var1.getString("endpoint"); // L: 222
			String[] var2 = JSONObject.getNames(var1); // L: 223

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 224
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 225
					try {
						int var4 = var1.getInt(var2[var3]); // L: 227
						this.field1814.add(new class178(this, var2[var3], var4)); // L: 228
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 232
							if (var5.equals("true")) { // L: 233
								this.field1814.add(new class178(this, var2[var3], 1)); // L: 234
							} else if (var5.equals("false")) { // L: 236
								this.field1814.add(new class178(this, var2[var3], 0)); // L: 237
							} else {
								this.field1814.add(new class169(this, var2[var3], var5)); // L: 240
							}
						} catch (Exception var7) { // L: 243
						}
					}
				}
			}

		}
	} // L: 247

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1224525908"
	)
	void method3401(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 250

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 251
			try {
				int var4 = var1.getInt(var2[var3]); // L: 253
				this.field1817.put(var2[var3], var4); // L: 254
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 258
					if (var5.equals("true")) { // L: 259
						this.field1817.put(var2[var3], 1); // L: 260
					} else if (var5.equals("false")) { // L: 262
						this.field1817.put(var2[var3], 0); // L: 263
					} else {
						this.field1809.put(var2[var3], var5); // L: 266
					}
				} catch (Exception var7) { // L: 269
				}
			}
		}

	} // L: 272

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lel;I)V",
		garbageValue = "2025253956"
	)
	void method3381(class450 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8304(); // L: 277
			var3 = var3.getJSONObject("message"); // L: 278
		} catch (Exception var9) { // L: 280
			this.method3375(); // L: 281
			this.field1804 = 102; // L: 282
			return; // L: 283
		}

		try {
			this.method3416(var3.getJSONArray("images"), var2); // L: 286
		} catch (Exception var8) { // L: 288
			this.field1815.clear(); // L: 289
		}

		try {
			this.method3378(var3.getJSONArray("labels")); // L: 292
		} catch (Exception var7) { // L: 294
			this.field1816.clear(); // L: 295
		}

		try {
			this.method3364(var3.getJSONObject("behaviour")); // L: 298
		} catch (Exception var6) { // L: 300
			this.field1812 = null; // L: 301
			this.field1813[0] = 0.0F; // L: 302
			this.field1813[1] = 0.0F; // L: 303
			this.field1813[2] = 1.0F; // L: 304
			this.field1813[3] = 1.0F; // L: 305
			this.field1814.clear(); // L: 306
		}

		try {
			this.method3401(var3.getJSONObject("meta")); // L: 309
		} catch (Exception var5) { // L: 311
			this.field1817.clear(); // L: 312
			this.field1809.clear(); // L: 313
		}

	} // L: 315

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "-100709880"
	)
	public boolean method3382(String var1, UrlRequester var2) {
		try {
			this.method3381(new class450(var1.getBytes()), var2); // L: 319
			this.field1804 = this.field1815.size() > 0 ? 1 : 2; // L: 320
		} catch (UnsupportedEncodingException var4) { // L: 322
			this.field1804 = 102; // L: 323
		}

		return this.field1804 < 100; // L: 325
	}
}
