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

@ObfuscatedName("gf")
public class class170 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1468015305
	)
	int field1837;
	@ObfuscatedName("af")
	String field1838;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	UrlRequest field1839;
	@ObfuscatedName("aq")
	String field1840;
	@ObfuscatedName("al")
	float[] field1841;
	@ObfuscatedName("an")
	ArrayList field1836;
	@ObfuscatedName("ar")
	ArrayList field1844;
	@ObfuscatedName("ab")
	ArrayList field1834;
	@ObfuscatedName("ag")
	Map field1845;
	@ObfuscatedName("am")
	Map field1846;

	public class170() {
		this.field1837 = -1; // L: 25
		this.field1840 = null; // L: 28
		this.field1841 = new float[4]; // L: 29
		this.field1836 = new ArrayList(); // L: 30
		this.field1844 = new ArrayList(); // L: 31
		this.field1834 = new ArrayList(); // L: 32
		this.field1845 = new HashMap(); // L: 33
		this.field1846 = new HashMap(); // L: 34
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;I)Z",
		garbageValue = "-117070837"
	)
	public boolean method3365(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3375(); // L: 43

				try {
					this.field1838 = var1; // L: 45
					this.field1839 = var2.request(new URL(this.field1838)); // L: 46
					this.field1837 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3375(); // L: 51
					this.field1837 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V",
		garbageValue = "-1262385396"
	)
	public void method3413(UrlRequester var1) {
		switch(this.field1837) { // L: 58
		case 0:
			this.method3376(var1); // L: 60
			break;
		case 1:
			this.method3377();
			break; // L: 65
		default:
			return; // L: 63
		}

	} // L: 68

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1206059947"
	)
	public int method3367() {
		return this.field1837; // L: 71
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-63404292"
	)
	public int method3368(String var1) {
		return this.field1845.containsKey(var1) ? (Integer)this.field1845.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1647715363"
	)
	public String method3417(String var1) {
		return (String)((String)(this.field1846.containsKey(var1) ? this.field1846.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-87"
	)
	public ArrayList method3370() {
		return this.field1844; // L: 83
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "88"
	)
	public ArrayList method3418() {
		return this.field1834; // L: 87
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1756409477"
	)
	public String method3372() {
		return this.field1840; // L: 91
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-2115403959"
	)
	public float[] method3371() {
		return this.field1841; // L: 95
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-78"
	)
	public ArrayList method3374() {
		return this.field1836; // L: 99
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	void method3375() {
		this.field1839 = null; // L: 103
		this.field1840 = null; // L: 104
		this.field1841[0] = 0.0F; // L: 105
		this.field1841[1] = 0.0F; // L: 106
		this.field1841[2] = 1.0F; // L: 107
		this.field1841[3] = 1.0F; // L: 108
		this.field1836.clear(); // L: 109
		this.field1844.clear(); // L: 110
		this.field1834.clear(); // L: 111
		this.field1845.clear(); // L: 112
		this.field1846.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lev;B)V",
		garbageValue = "-76"
	)
	void method3376(UrlRequester var1) {
		if (this.field1839 != null && this.field1839.isDone()) { // L: 117
			byte[] var2 = this.field1839.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3375(); // L: 122
				this.field1837 = 100; // L: 123
			} else {
				try {
					this.method3382(new class462(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3375(); // L: 130
					this.field1837 = 102; // L: 131
					return; // L: 132
				}

				this.field1837 = this.field1844.size() > 0 ? 1 : 2; // L: 134
				this.field1839 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2026180069"
	)
	void method3377() {
		Iterator var1 = this.field1844.iterator(); // L: 139

		class176 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1844.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class176)var1.next(); // L: 148
					if (var2.field1879 != null) { // L: 150
						byte[] var3 = var2.field1879.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1837 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3375(); // L: 159
				this.field1837 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class176)var1.next(); // L: 140
		} while(var2.field1879 == null || var2.field1879.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lev;B)V",
		garbageValue = "-22"
	)
	void method3415(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class176 var5 = new class176(this); // L: 168
					var5.field1879 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1880 = UserComparator5.method2889(var4, "placement"); // L: 170
					this.field1844.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "205832282"
	)
	void method3379(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class177 var4 = new class177(this); // L: 181
				var4.field1892 = var3.getString("text"); // L: 182
				String var7 = var3.getString("align_x"); // L: 185
				byte var6;
				if (var7.equals("centre")) { // L: 187
					var6 = 1; // L: 188
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 191
					var6 = 0; // L: 195
				} else {
					var6 = 2; // L: 192
				}

				var4.field1886 = var6; // L: 197
				String var10 = var3.getString("align_y"); // L: 200
				byte var9;
				if (var10.equals("centre")) { // L: 202
					var9 = 1; // L: 203
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 206
					var9 = 0; // L: 210
				} else {
					var9 = 2; // L: 207
				}

				var4.field1887 = var9; // L: 212
				var4.field1884 = var3.getInt("font"); // L: 213
				var4.field1885 = UserComparator5.method2889(var3, "placement"); // L: 214
				this.field1834.add(var4); // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "3730991"
	)
	void method3397(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 220
			this.field1841 = UserComparator5.method2889(var1, "clickbounds"); // L: 221
			this.field1840 = var1.getString("endpoint"); // L: 222
			String[] var2 = JSONObject.getNames(var1); // L: 223

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 224
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 225
					try {
						int var4 = var1.getInt(var2[var3]); // L: 227
						this.field1836.add(new class178(this, var2[var3], var4)); // L: 228
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 232
							if (var5.equals("true")) { // L: 233
								this.field1836.add(new class178(this, var2[var3], 1)); // L: 234
							} else if (var5.equals("false")) { // L: 236
								this.field1836.add(new class178(this, var2[var3], 0)); // L: 237
							} else {
								this.field1836.add(new class169(this, var2[var3], var5)); // L: 240
							}
						} catch (Exception var7) { // L: 243
						}
					}
				}
			}

		}
	} // L: 247

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-60"
	)
	void method3439(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 250

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 251
			try {
				int var4 = var1.getInt(var2[var3]); // L: 253
				this.field1845.put(var2[var3], var4); // L: 254
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 258
					if (var5.equals("true")) { // L: 259
						this.field1845.put(var2[var3], 1); // L: 260
					} else if (var5.equals("false")) { // L: 262
						this.field1845.put(var2[var3], 0); // L: 263
					} else {
						this.field1846.put(var2[var3], var5); // L: 266
					}
				} catch (Exception var7) { // L: 269
				}
			}
		}

	} // L: 272

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lev;B)V",
		garbageValue = "80"
	)
	void method3382(class462 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8332(); // L: 277
			var3 = var3.getJSONObject("message"); // L: 278
		} catch (Exception var9) { // L: 280
			this.method3375(); // L: 281
			this.field1837 = 102; // L: 282
			return; // L: 283
		}

		try {
			this.method3415(var3.getJSONArray("images"), var2); // L: 286
		} catch (Exception var8) { // L: 288
			this.field1844.clear(); // L: 289
		}

		try {
			this.method3379(var3.getJSONArray("labels")); // L: 292
		} catch (Exception var7) { // L: 294
			this.field1834.clear(); // L: 295
		}

		try {
			this.method3397(var3.getJSONObject("behaviour")); // L: 298
		} catch (Exception var6) { // L: 300
			this.field1840 = null; // L: 301
			this.field1841[0] = 0.0F; // L: 302
			this.field1841[1] = 0.0F; // L: 303
			this.field1841[2] = 1.0F; // L: 304
			this.field1841[3] = 1.0F; // L: 305
			this.field1836.clear(); // L: 306
		}

		try {
			this.method3439(var3.getJSONObject("meta")); // L: 309
		} catch (Exception var5) { // L: 311
			this.field1845.clear(); // L: 312
			this.field1846.clear(); // L: 313
		}

	} // L: 315

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;I)Z",
		garbageValue = "1404178579"
	)
	public boolean method3383(String var1, UrlRequester var2) {
		try {
			this.method3382(new class462(var1.getBytes()), var2); // L: 319
			this.field1837 = this.field1844.size() > 0 ? 1 : 2; // L: 320
		} catch (UnsupportedEncodingException var4) { // L: 322
			this.field1837 = 102; // L: 323
		}

		return this.field1837 < 100; // L: 325
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1176704124"
	)
	static int method3441(int var0, Script var1, boolean var2) {
		return 2; // L: 5111
	}
}
