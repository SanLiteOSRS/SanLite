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

@ObfuscatedName("gi")
public class class169 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1691739993
	)
	int field1802;
	@ObfuscatedName("af")
	String field1803;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	UrlRequest field1801;
	@ObfuscatedName("aa")
	String field1805;
	@ObfuscatedName("aj")
	float[] field1806;
	@ObfuscatedName("ad")
	ArrayList field1799;
	@ObfuscatedName("ac")
	ArrayList field1812;
	@ObfuscatedName("ag")
	ArrayList field1809;
	@ObfuscatedName("ar")
	Map field1810;
	@ObfuscatedName("ah")
	Map field1811;

	public class169() {
		this.field1802 = -1; // L: 25
		this.field1805 = null; // L: 28
		this.field1806 = new float[4]; // L: 29
		this.field1799 = new ArrayList(); // L: 30
		this.field1812 = new ArrayList(); // L: 31
		this.field1809 = new ArrayList(); // L: 32
		this.field1810 = new HashMap(); // L: 33
		this.field1811 = new HashMap(); // L: 34
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;S)Z",
		garbageValue = "-28322"
	)
	public boolean method3403(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3413(); // L: 43

				try {
					this.field1803 = var1; // L: 45
					this.field1801 = var2.request(new URL(this.field1803)); // L: 46
					this.field1802 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3413(); // L: 51
					this.field1802 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)V",
		garbageValue = "53"
	)
	public void method3417(UrlRequester var1) {
		switch(this.field1802) { // L: 58
		case 0:
			this.method3429(var1); // L: 60
			break;
		case 1:
			this.method3415();
			break; // L: 65
		default:
			return; // L: 63
		}

	} // L: 68

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	public int method3405() {
		return this.field1802; // L: 71
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1206972356"
	)
	public int method3406(String var1) {
		return this.field1810.containsKey(var1) ? (Integer)this.field1810.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "22357853"
	)
	public String method3461(String var1) {
		return (String)((String)(this.field1811.containsKey(var1) ? this.field1811.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1883074438"
	)
	public ArrayList method3408() {
		return this.field1812; // L: 83
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1999285604"
	)
	public ArrayList method3409() {
		return this.field1809; // L: 87
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "19"
	)
	public String method3410() {
		return this.field1805; // L: 91
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "91"
	)
	public float[] method3411() {
		return this.field1806; // L: 95
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "580519271"
	)
	public ArrayList method3444() {
		return this.field1799; // L: 99
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1738234823"
	)
	void method3413() {
		this.field1801 = null; // L: 103
		this.field1805 = null; // L: 104
		this.field1806[0] = 0.0F; // L: 105
		this.field1806[1] = 0.0F; // L: 106
		this.field1806[2] = 1.0F; // L: 107
		this.field1806[3] = 1.0F; // L: 108
		this.field1799.clear(); // L: 109
		this.field1812.clear(); // L: 110
		this.field1809.clear(); // L: 111
		this.field1810.clear(); // L: 112
		this.field1811.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "659209236"
	)
	void method3429(UrlRequester var1) {
		if (this.field1801 != null && this.field1801.isDone()) { // L: 117
			byte[] var2 = this.field1801.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3413(); // L: 122
				this.field1802 = 100; // L: 123
			} else {
				try {
					this.method3420(new class450(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3413(); // L: 130
					this.field1802 = 102; // L: 131
					return; // L: 132
				}

				this.field1802 = this.field1812.size() > 0 ? 1 : 2; // L: 134
				this.field1801 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1645444432"
	)
	void method3415() {
		Iterator var1 = this.field1812.iterator(); // L: 139

		class175 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1812.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class175)var1.next(); // L: 148
					if (var2.field1844 != null) { // L: 150
						byte[] var3 = var2.field1844.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1802 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3413(); // L: 159
				this.field1802 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class175)var1.next(); // L: 140
		} while(var2.field1844 == null || var2.field1844.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lea;B)V",
		garbageValue = "-39"
	)
	void method3437(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class175 var5 = new class175(this);
					var5.field1844 = var2.request(new URL(var4.getString("src")));
					var5.field1841 = ParamComposition.method3829(var4, "placement"); // L: 170
					this.field1812.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	} // L: 175

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "-1"
	)
	void method3402(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class176 var4 = new class176(this); // L: 181
				var4.field1848 = var3.getString("text"); // L: 182
				String var7 = var3.getString("align_x"); // L: 185
				byte var6;
				if (var7.equals("centre")) { // L: 187
					var6 = 1; // L: 188
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 191
					var6 = 0; // L: 195
				} else {
					var6 = 2; // L: 192
				}

				var4.field1850 = var6; // L: 197
				String var10 = var3.getString("align_y"); // L: 200
				byte var9;
				if (var10.equals("centre")) { // L: 202
					var9 = 1; // L: 203
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 206
					var9 = 0; // L: 210
				} else {
					var9 = 2; // L: 207
				}

				var4.field1845 = var9; // L: 212
				var4.field1852 = var3.getInt("font"); // L: 213
				var4.field1849 = ParamComposition.method3829(var3, "placement"); // L: 214
				this.field1809.add(var4); // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "14"
	)
	void method3418(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 220
			this.field1806 = ParamComposition.method3829(var1, "clickbounds"); // L: 221
			this.field1805 = var1.getString("endpoint"); // L: 222
			String[] var2 = JSONObject.getNames(var1); // L: 223

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 224
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 225
					try {
						int var4 = var1.getInt(var2[var3]); // L: 227
						this.field1799.add(new class177(this, var2[var3], var4)); // L: 228
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 232
							if (var5.equals("true")) { // L: 233
								this.field1799.add(new class177(this, var2[var3], 1)); // L: 234
							} else if (var5.equals("false")) { // L: 236
								this.field1799.add(new class177(this, var2[var3], 0)); // L: 237
							} else {
								this.field1799.add(new class168(this, var2[var3], var5)); // L: 240
							}
						} catch (Exception var7) { // L: 243
						}
					}
				}
			}

		}
	} // L: 247

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-1"
	)
	void method3427(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 250

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 251
			try {
				int var4 = var1.getInt(var2[var3]); // L: 253
				this.field1810.put(var2[var3], var4); // L: 254
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 258
					if (var5.equals("true")) { // L: 259
						this.field1810.put(var2[var3], 1); // L: 260
					} else if (var5.equals("false")) { // L: 262
						this.field1810.put(var2[var3], 0); // L: 263
					} else {
						this.field1811.put(var2[var3], var5); // L: 266
					}
				} catch (Exception var7) { // L: 269
				}
			}
		}

	} // L: 272

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lea;B)V",
		garbageValue = "0"
	)
	void method3420(class450 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8238(); // L: 277
			var3 = var3.getJSONObject("message"); // L: 278
		} catch (Exception var9) { // L: 280
			this.method3413(); // L: 281
			this.field1802 = 102; // L: 282
			return; // L: 283
		}

		try {
			this.method3437(var3.getJSONArray("images"), var2); // L: 286
		} catch (Exception var8) { // L: 288
			this.field1812.clear(); // L: 289
		}

		try {
			this.method3402(var3.getJSONArray("labels")); // L: 292
		} catch (Exception var7) { // L: 294
			this.field1809.clear(); // L: 295
		}

		try {
			this.method3418(var3.getJSONObject("behaviour")); // L: 298
		} catch (Exception var6) { // L: 300
			this.field1805 = null; // L: 301
			this.field1806[0] = 0.0F; // L: 302
			this.field1806[1] = 0.0F; // L: 303
			this.field1806[2] = 1.0F; // L: 304
			this.field1806[3] = 1.0F; // L: 305
			this.field1799.clear(); // L: 306
		}

		try {
			this.method3427(var3.getJSONObject("meta")); // L: 309
		} catch (Exception var5) { // L: 311
			this.field1810.clear(); // L: 312
			this.field1811.clear(); // L: 313
		}

	} // L: 315

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)Z",
		garbageValue = "-220870941"
	)
	public boolean method3452(String var1, UrlRequester var2) {
		try {
			this.method3420(new class450(var1.getBytes()), var2); // L: 319
			this.field1802 = this.field1812.size() > 0 ? 1 : 2; // L: 320
		} catch (UnsupportedEncodingException var4) { // L: 322
			this.field1802 = 102; // L: 323
		}

		return this.field1802 < 100; // L: 325
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1578194323"
	)
	static boolean method3438(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 16
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "-1691717821"
	)
	public static int[] method3407(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) { // L: 168
			int[] var1 = new int[var0.length]; // L: 171

			for (int var2 = 0; var2 < var0.length; ++var2) { // L: 172
				if (var0[var2] < 0 || var0[var2] > class525.field5174.length) { // L: 173
					return null; // L: 174
				}

				var1[var2] = class525.field5174[var0[var2]]; // L: 176
			}

			return var1; // L: 178
		} else {
			return null; // L: 169
		}
	}
}
