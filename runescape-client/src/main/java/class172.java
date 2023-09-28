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

@ObfuscatedName("gr")
public class class172 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1751071891
	)
	int field1810;
	@ObfuscatedName("av")
	String field1813;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	UrlRequest field1811;
	@ObfuscatedName("aa")
	String field1819;
	@ObfuscatedName("ap")
	float[] field1814;
	@ObfuscatedName("ay")
	ArrayList field1815;
	@ObfuscatedName("as")
	ArrayList field1816;
	@ObfuscatedName("aj")
	ArrayList field1817;
	@ObfuscatedName("an")
	Map field1818;
	@ObfuscatedName("au")
	Map field1805;

	public class172() {
		this.field1810 = -1; // L: 25
		this.field1819 = null; // L: 28
		this.field1814 = new float[4]; // L: 29
		this.field1815 = new ArrayList(); // L: 30
		this.field1816 = new ArrayList(); // L: 31
		this.field1817 = new ArrayList(); // L: 32
		this.field1818 = new HashMap(); // L: 33
		this.field1805 = new HashMap(); // L: 34
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;I)Z",
		garbageValue = "2131230297"
	)
	public boolean method3431(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3441(); // L: 43

				try {
					this.field1813 = var1; // L: 45
					this.field1811 = var2.request(new URL(this.field1813)); // L: 46
					this.field1810 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3441(); // L: 51
					this.field1810 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1476947490"
	)
	public void method3432(UrlRequester var1) {
		switch(this.field1810) { // L: 58
		case 0:
			this.method3495(var1); // L: 62
			break;
		case 1:
			this.method3443();
			break;
		default:
			return; // L: 60
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1358158711"
	)
	public int method3465() {
		return this.field1810;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "778119532"
	)
	public int method3434(String var1) {
		return this.field1818.containsKey(var1) ? (Integer)this.field1818.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1794264749"
	)
	public String method3449(String var1) {
		return (String)((String)(this.field1805.containsKey(var1) ? this.field1805.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1636742003"
	)
	public ArrayList method3436() {
		return this.field1816; // L: 83
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1336792690"
	)
	public ArrayList method3437() {
		return this.field1817;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-5"
	)
	public String method3438() {
		return this.field1819; // L: 91
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "82"
	)
	public float[] method3468() {
		return this.field1814; // L: 95
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1672118960"
	)
	public ArrayList method3440() {
		return this.field1815; // L: 99
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3441() {
		this.field1811 = null; // L: 103
		this.field1819 = null;
		this.field1814[0] = 0.0F;
		this.field1814[1] = 0.0F;
		this.field1814[2] = 1.0F; // L: 107
		this.field1814[3] = 1.0F;
		this.field1815.clear(); // L: 109
		this.field1816.clear(); // L: 110
		this.field1817.clear(); // L: 111
		this.field1818.clear(); // L: 112
		this.field1805.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Len;S)V",
		garbageValue = "182"
	)
	void method3495(UrlRequester var1) {
		if (this.field1811 != null && this.field1811.isDone()) { // L: 117
			byte[] var2 = this.field1811.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3441(); // L: 122
				this.field1810 = 100; // L: 123
			} else {
				try {
					this.method3448(new class477(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3441(); // L: 130
					this.field1810 = 102; // L: 131
					return; // L: 132
				}

				this.field1810 = this.field1816.size() > 0 ? 1 : 2; // L: 134
				this.field1811 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	void method3443() {
		Iterator var1 = this.field1816.iterator(); // L: 139

		class178 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1816.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class178)var1.next(); // L: 148
					if (var2.field1856 != null) { // L: 150
						byte[] var3 = var2.field1856.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1810 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3441(); // L: 159
				this.field1810 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class178)var1.next(); // L: 140
		} while(var2.field1856 == null || var2.field1856.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Len;I)V",
		garbageValue = "-2004474628"
	)
	void method3444(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class178 var5 = new class178(this); // L: 168
					var5.field1856 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1855 = FloorUnderlayDefinition.method3882(var4, "placement"); // L: 170
					this.field1816.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "1577665850"
	)
	void method3442(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class179 var4 = new class179(this); // L: 181
				var4.field1858 = var3.getString("text"); // L: 182
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

				var4.field1863 = var9; // L: 212
				var4.field1864 = var3.getInt("font"); // L: 213
				var4.field1860 = FloorUnderlayDefinition.method3882(var3, "placement"); // L: 214
				this.field1817.add(var4); // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-11"
	)
	void method3445(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 220
			this.field1814 = FloorUnderlayDefinition.method3882(var1, "clickbounds"); // L: 221
			this.field1819 = var1.getString("endpoint"); // L: 222
			String[] var2 = JSONObject.getNames(var1); // L: 223

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 224
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 225
					try {
						int var4 = var1.getInt(var2[var3]); // L: 227
						this.field1815.add(new class180(this, var2[var3], var4)); // L: 228
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 232
							if (var5.equals("true")) { // L: 233
								this.field1815.add(new class180(this, var2[var3], 1)); // L: 234
							} else if (var5.equals("false")) { // L: 236
								this.field1815.add(new class180(this, var2[var3], 0)); // L: 237
							} else {
								this.field1815.add(new class171(this, var2[var3], var5)); // L: 240
							}
						} catch (Exception var7) { // L: 243
						}
					}
				}
			}

		}
	} // L: 247

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-451947529"
	)
	void method3435(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 250

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 251
			try {
				int var4 = var1.getInt(var2[var3]); // L: 253
				this.field1818.put(var2[var3], var4); // L: 254
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 258
					if (var5.equals("true")) { // L: 259
						this.field1818.put(var2[var3], 1); // L: 260
					} else if (var5.equals("false")) { // L: 262
						this.field1818.put(var2[var3], 0); // L: 263
					} else {
						this.field1805.put(var2[var3], var5); // L: 266
					}
				} catch (Exception var7) { // L: 269
				}
			}
		}

	} // L: 272

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Len;B)V",
		garbageValue = "0"
	)
	void method3448(class477 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8491(); // L: 277
			var3 = var3.getJSONObject("message"); // L: 278
		} catch (Exception var9) { // L: 280
			this.method3441(); // L: 281
			this.field1810 = 102; // L: 282
			return; // L: 283
		}

		try {
			this.method3444(var3.getJSONArray("images"), var2); // L: 286
		} catch (Exception var8) { // L: 288
			this.field1816.clear(); // L: 289
		}

		try {
			this.method3442(var3.getJSONArray("labels")); // L: 292
		} catch (Exception var7) { // L: 294
			this.field1817.clear(); // L: 295
		}

		try {
			this.method3445(var3.getJSONObject("behaviour")); // L: 298
		} catch (Exception var6) { // L: 300
			this.field1819 = null; // L: 301
			this.field1814[0] = 0.0F; // L: 302
			this.field1814[1] = 0.0F; // L: 303
			this.field1814[2] = 1.0F; // L: 304
			this.field1814[3] = 1.0F; // L: 305
			this.field1815.clear(); // L: 306
		}

		try {
			this.method3435(var3.getJSONObject("meta")); // L: 309
		} catch (Exception var5) { // L: 311
			this.field1818.clear(); // L: 312
			this.field1805.clear(); // L: 313
		}

	} // L: 315

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;I)Z",
		garbageValue = "16776960"
	)
	public boolean method3474(String var1, UrlRequester var2) {
		try {
			this.method3448(new class477(var1.getBytes()), var2); // L: 319
			this.field1810 = this.field1816.size() > 0 ? 1 : 2; // L: 320
		} catch (UnsupportedEncodingException var4) { // L: 322
			this.field1810 = 102; // L: 323
		}

		return this.field1810 < 100; // L: 325
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)Ljava/lang/String;",
		garbageValue = "100"
	)
	public static String method3430(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 63
			if (var2 > 32767) { // L: 64
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 65
			var0.offset += class349.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 66
			String var4 = class92.decodeStringCp1252(var3, 0, var2); // L: 67
			var1 = var4; // L: 68
		} catch (Exception var6) { // L: 70
			var1 = "Cabbage"; // L: 71
		}

		return var1; // L: 74
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-955507774"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 87
		if (var0 < 0 || var0 >= 65536) { // L: 88
			var0 >>>= 16; // L: 89
			var1 += 16; // L: 90
		}

		if (var0 >= 256) { // L: 92
			var0 >>>= 8; // L: 93
			var1 += 8; // L: 94
		}

		if (var0 >= 16) { // L: 96
			var0 >>>= 4; // L: 97
			var1 += 4; // L: 98
		}

		if (var0 >= 4) { // L: 100
			var0 >>>= 2; // L: 101
			var1 += 2; // L: 102
		}

		if (var0 >= 1) { // L: 104
			var0 >>>= 1; // L: 105
			++var1; // L: 106
		}

		return var0 + var1; // L: 108
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1926904038"
	)
	static final void method3496() {
		Client.field642 = Client.cycleCntr; // L: 12610
		PcmPlayer.field307 = true; // L: 12611
	} // L: 12612
}
