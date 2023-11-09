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

@ObfuscatedName("gs")
public class class167 {
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = -403952000
	)
	static int field1800;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1879184161
	)
	int field1788;
	@ObfuscatedName("ar")
	String field1789;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	UrlRequest field1790;
	@ObfuscatedName("ax")
	String field1791;
	@ObfuscatedName("as")
	float[] field1792;
	@ObfuscatedName("ay")
	ArrayList field1785;
	@ObfuscatedName("am")
	ArrayList field1794;
	@ObfuscatedName("az")
	ArrayList field1795;
	@ObfuscatedName("ae")
	Map field1786;
	@ObfuscatedName("au")
	Map field1797;

	public class167() {
		this.field1788 = -1; // L: 25
		this.field1791 = null; // L: 28
		this.field1792 = new float[4]; // L: 29
		this.field1785 = new ArrayList(); // L: 30
		this.field1794 = new ArrayList(); // L: 31
		this.field1795 = new ArrayList(); // L: 32
		this.field1786 = new HashMap(); // L: 33
		this.field1797 = new HashMap(); // L: 34
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;I)Z",
		garbageValue = "-817069381"
	)
	public boolean method3386(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3395(); // L: 43

				try {
					this.field1789 = var1; // L: 45
					this.field1790 = var2.request(new URL(this.field1789)); // L: 46
					this.field1788 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3395(); // L: 51
					this.field1788 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Leb;S)V",
		garbageValue = "-30326"
	)
	public void method3387(UrlRequester var1) {
		switch(this.field1788) { // L: 58
		case 0:
			this.method3428(var1); // L: 60
			break;
		case 1:
			this.method3419();
			break; // L: 65
		default:
			return; // L: 63
		}

	} // L: 68

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	public int method3398() {
		return this.field1788; // L: 71
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1932678065"
	)
	public int method3411(String var1) {
		return this.field1786.containsKey(var1) ? (Integer)this.field1786.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1530090364"
	)
	public String method3397(String var1) {
		return (String)((String)(this.field1797.containsKey(var1) ? this.field1797.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-3349953"
	)
	public ArrayList method3399() {
		return this.field1794; // L: 83
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-19"
	)
	public ArrayList method3392() {
		return this.field1795; // L: 87
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1167109503"
	)
	public String method3393() {
		return this.field1791; // L: 91
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-2042824"
	)
	public float[] method3402() {
		return this.field1792; // L: 95
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "7"
	)
	public ArrayList method3390() {
		return this.field1785; // L: 99
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	void method3395() {
		this.field1790 = null; // L: 103
		this.field1791 = null; // L: 104
		this.field1792[0] = 0.0F; // L: 105
		this.field1792[1] = 0.0F; // L: 106
		this.field1792[2] = 1.0F; // L: 107
		this.field1792[3] = 1.0F; // L: 108
		this.field1785.clear(); // L: 109
		this.field1794.clear(); // L: 110
		this.field1795.clear(); // L: 111
		this.field1786.clear(); // L: 112
		this.field1797.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "295942057"
	)
	void method3428(UrlRequester var1) {
		if (this.field1790 != null && this.field1790.isDone()) { // L: 117
			byte[] var2 = this.field1790.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3395(); // L: 122
				this.field1788 = 100; // L: 123
			} else {
				try {
					this.method3394(new class433(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3395(); // L: 130
					this.field1788 = 102; // L: 131
					return; // L: 132
				}

				this.field1788 = this.field1794.size() > 0 ? 1 : 2; // L: 134
				this.field1790 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	void method3419() {
		Iterator var1 = this.field1794.iterator(); // L: 139

		class173 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1794.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class173)var1.next(); // L: 148
					if (var2.field1830 != null) { // L: 150
						byte[] var3 = var2.field1830.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1788 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3395(); // L: 159
				this.field1788 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class173)var1.next(); // L: 140
		} while(var2.field1830 == null || var2.field1830.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Leb;I)V",
		garbageValue = "1778841749"
	)
	void method3413(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class173 var5 = new class173(this); // L: 168
					var5.field1830 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1829 = class260.method5238(var4, "placement"); // L: 170
					this.field1794.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-1527876041"
	)
	void method3401(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class174 var4 = new class174(this); // L: 181
				var4.field1836 = var3.getString("text"); // L: 182
				String var7 = var3.getString("align_x"); // L: 185
				byte var6;
				if (var7.equals("centre")) { // L: 187
					var6 = 1; // L: 188
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 191
					var6 = 0; // L: 195
				} else {
					var6 = 2; // L: 192
				}

				var4.field1837 = var6; // L: 197
				String var10 = var3.getString("align_y"); // L: 200
				byte var9;
				if (var10.equals("centre")) { // L: 202
					var9 = 1; // L: 203
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 206
					var9 = 0; // L: 210
				} else {
					var9 = 2; // L: 207
				}

				var4.field1834 = var9; // L: 212
				var4.field1839 = var3.getInt("font"); // L: 213
				var4.field1840 = class260.method5238(var3, "placement"); // L: 214
				this.field1795.add(var4); // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1169579643"
	)
	void method3403(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 220
			this.field1792 = class260.method5238(var1, "clickbounds"); // L: 221
			this.field1791 = var1.getString("endpoint"); // L: 222
			String[] var2 = JSONObject.getNames(var1); // L: 223

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 224
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 225
					try {
						int var4 = var1.getInt(var2[var3]); // L: 227
						this.field1785.add(new class175(this, var2[var3], var4)); // L: 228
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 232
							if (var5.equals("true")) { // L: 233
								this.field1785.add(new class175(this, var2[var3], 1)); // L: 234
							} else if (var5.equals("false")) { // L: 236
								this.field1785.add(new class175(this, var2[var3], 0)); // L: 237
							} else {
								this.field1785.add(new class166(this, var2[var3], var5)); // L: 240
							}
						} catch (Exception var7) { // L: 243
						}
					}
				}
			}

		}
	} // L: 247

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "7"
	)
	void method3410(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 250

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 251
			try {
				int var4 = var1.getInt(var2[var3]); // L: 253
				this.field1786.put(var2[var3], var4); // L: 254
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 258
					if (var5.equals("true")) { // L: 259
						this.field1786.put(var2[var3], 1); // L: 260
					} else if (var5.equals("false")) { // L: 262
						this.field1786.put(var2[var3], 0); // L: 263
					} else {
						this.field1797.put(var2[var3], var5); // L: 266
					}
				} catch (Exception var7) { // L: 269
				}
			}
		}

	} // L: 272

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Leb;B)V",
		garbageValue = "120"
	)
	void method3394(class433 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method7980(); // L: 277
			var3 = var3.getJSONObject("message"); // L: 278
		} catch (Exception var9) { // L: 280
			this.method3395(); // L: 281
			this.field1788 = 102; // L: 282
			return; // L: 283
		}

		try {
			this.method3413(var3.getJSONArray("images"), var2); // L: 286
		} catch (Exception var8) { // L: 288
			this.field1794.clear(); // L: 289
		}

		try {
			this.method3401(var3.getJSONArray("labels")); // L: 292
		} catch (Exception var7) { // L: 294
			this.field1795.clear(); // L: 295
		}

		try {
			this.method3403(var3.getJSONObject("behaviour")); // L: 298
		} catch (Exception var6) { // L: 300
			this.field1791 = null; // L: 301
			this.field1792[0] = 0.0F; // L: 302
			this.field1792[1] = 0.0F; // L: 303
			this.field1792[2] = 1.0F; // L: 304
			this.field1792[3] = 1.0F; // L: 305
			this.field1785.clear(); // L: 306
		}

		try {
			this.method3410(var3.getJSONObject("meta")); // L: 309
		} catch (Exception var5) { // L: 311
			this.field1786.clear(); // L: 312
			this.field1797.clear(); // L: 313
		}

	} // L: 315

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;B)Z",
		garbageValue = "3"
	)
	public boolean method3423(String var1, UrlRequester var2) {
		try {
			this.method3394(new class433(var1.getBytes()), var2); // L: 319
			this.field1788 = this.field1794.size() > 0 ? 1 : 2; // L: 320
		} catch (UnsupportedEncodingException var4) { // L: 322
			this.field1788 = 102; // L: 323
		}

		return this.field1788 < 100; // L: 325
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "560158880"
	)
	static final void method3445(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8708
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8709
				Client.field722[var4] = true;
			}
		}

	} // L: 8711
}
